package com.optimagrowth.license;

import com.optimagrowth.license.repository.OrganizationRepository;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Transactional
public class OrganizationReportTest {

    @Autowired
    private OrganizationRepository organizationRepository;

    @Test
    void reportOrganizations() {
        organizationRepository.findAll().forEach(org -> {
            System.out.println("\nOrganization: " + org.getName());
            System.out.println("Category: " + org.getCategory());
            System.out.println("Established: " + org.getEstablishedDate());
            System.out.println("President: " + (org.getPresident() != null ? org.getPresident().getName() : "None"));
            System.out.println("Number of Members: " + org.getMembers().size());
        });
    }
}
