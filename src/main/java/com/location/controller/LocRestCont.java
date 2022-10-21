package com.location.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.location.entities.Location;
import com.location.repository.LocRep;

@RestController
@RequestMapping("/locations")
public class LocRestCont {
    @Autowired
    private LocRep lr;
    
    @GetMapping
    public List<Location> getLoc(){
		List<Location> loc=lr.findAll();
    	return loc;
    	 }
    
    @DeleteMapping("/d/{id}")
    public void delLoc(@PathVariable("id") long id) {
    	lr.deleteById(id);
    	}
    
     @PostMapping
     public void saveLoc(@RequestBody Location loc) {
    	 lr.save(loc);
     }
     
     @PutMapping
     public void updLoc(@RequestBody Location loc) {
    	 lr.save(loc);
     }
    
}
