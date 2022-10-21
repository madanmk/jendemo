package com.location.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.location.dto.updateLoc;
import com.location.entities.Location;
import com.location.service.LocationService;

@Controller
public class LocCont {
	@Autowired
	private LocationService ls;
	
	@RequestMapping("/location")
	public String showLocationPage() {
		return "saveLocation";
	}
	
	@RequestMapping("/saveloc")
	public String saveloc(@ModelAttribute("location") Location loc,ModelMap mp) {
		ls.saveloc(loc);
		mp.addAttribute("msg", "saved!!!");
		return "saveLocation";
	}
	
	@RequestMapping("/allloc")
	public String getAllLoc(ModelMap mp) {
	    List<Location>	loca=ls.getLoc();
	    mp.addAttribute("loct", loca); 
		return "searchResult";
		
	}
	
	@RequestMapping("/delete")
	public String deleteloc(@RequestParam("id") long id,ModelMap mp) {
		ls.deleteLocById(id);
		
		List<Location>	loca=ls.getLoc();
		    mp.addAttribute("loct", loca); 
			return "searchResult";
			}
	
	@RequestMapping("/update")
	public String updateloc(@RequestParam("id") long id,ModelMap mp) {
		Location loc=ls.getLocById(id);
		mp.addAttribute("loct", loc);
		return "updateLocationInfo";
	}
	
	@RequestMapping("updateLocData")
	public String updateLocData(updateLoc up,ModelMap mp) {
		Location loc=new Location();
		loc.setId(up.getId());
		loc.setName(up.getName());
		loc.setCode(up.getCode());
		loc.setType(up.getType());
	     ls.saveloc(loc);
		
		List<Location>	loca=ls.getLoc();
		    mp.addAttribute("loct", loca); 
			return "searchResult";
			}

}
