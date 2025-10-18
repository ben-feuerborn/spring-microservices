package com.optimagrowth.license.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.optimagrowth.license.model.License;

public interface LicenseRepository extends JpaRepository<License, Integer> {
    Optional<License> findByLicenseIdAndOrganizationId(String licenseId, String organizationId);
}
