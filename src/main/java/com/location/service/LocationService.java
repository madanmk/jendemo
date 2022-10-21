package com.location.service;

import java.util.List;

import com.location.entities.Location;

public interface LocationService {
    public void saveloc(Location loc);

	public List<Location> getLoc();

	public void deleteLocById(long id);

	public Location getLocById(long id);
}
