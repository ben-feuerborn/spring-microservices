package com.optimagrowth.license.repository;

import com.optimagrowth.license.domain.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationRepository  extends JpaRepository<Organization, Long> {

}
