package com.location.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.location.entities.Location;

public interface LocRep extends JpaRepository<Location, Long> {

}
