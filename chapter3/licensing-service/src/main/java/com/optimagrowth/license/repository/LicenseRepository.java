package com.optimagrowth.license.repository;

import com.optimagrowth.license.model.License;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LicenseRepository extends JpaRepository<License, Integer> {
    void deleteByLicenseId(String licenseId);
    Optional<License> findByLicenseId(String licenseId);
}
