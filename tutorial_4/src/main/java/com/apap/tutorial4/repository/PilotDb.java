package com.apap.tutorial4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apap.tutorial4.model.PilotModel;

public interface PilotDb extends JpaRepository<PilotModel, Long> {
	PilotModel findByLicenseNumber(String licenseNumber);
}
