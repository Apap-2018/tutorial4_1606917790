package com.apap.tutorial4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apap.tutorial4.model.FlightModel;

public interface FlightDb extends JpaRepository<FlightModel, Long> {
	FlightModel findById(long id);
	FlightModel findByFlightNumber(String flightNumber);
}
