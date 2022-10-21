package com.location.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.location.entities.Location;
import com.location.repository.LocRep;

@Service
public class LocSerImpl implements LocationService {

	@Autowired
	private LocRep lr;
	
	@Override
	public void saveloc(Location loc) {
		lr.save(loc);

	}

	@Override
	public List<Location> getLoc() {
		List<Location> lo=lr.findAll();
		return lo;
	}

	@Override
	public void deleteLocById(long id) {
	     lr.deleteById(id);	
	}

	@Override
	public Location getLocById(long id) {
		Optional<Location> fi=lr.findById(id);
		Location location=fi.get();
		return location;
	}

}
