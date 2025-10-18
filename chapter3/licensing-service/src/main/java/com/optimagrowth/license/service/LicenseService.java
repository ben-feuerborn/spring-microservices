package com.optimagrowth.license.service;

import java.util.Locale;
import java.util.Random;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.optimagrowth.license.model.License;
import com.optimagrowth.license.repository.LicenseRepository;

@Service
public class LicenseService {
	
	@Autowired
	LicenseRepository licenseRepository;

	@Autowired
	MessageSource messages;

	public License getLicense(String licenseId, String organizationId){
		License license = new License();
		license.setId(new Random().nextInt(1000));
		license.setLicenseId(licenseId);
		license.setOrganizationId(organizationId);
		license.setDescription("Software product");
		license.setProductName("Ostock");
		license.setLicenseType("full");

		return license;
	}

	@Transactional
	public String createLicense(License license, String organizationId, Locale locale){
		String responseMessage = null;
		if(!StringUtils.isEmpty(license)) {
			license.setOrganizationId(organizationId);
			licenseRepository.save(license); // persist license

			responseMessage = String.format(messages.getMessage("license.create.message",null,locale), license.toString());
		}

		return responseMessage;
	}

	@Transactional
	public String updateLicense(License license, String organizationId, Locale locale){
		String responseMessage = null;
		if(!StringUtils.isEmpty(license)) {
			license.setOrganizationId(organizationId);
			licenseRepository.save(license); // update existing license

			responseMessage = String.format(messages.getMessage("license.update.message", null, locale), license.toString());
		}

		return responseMessage;
	}

	@Transactional
	public String deleteLicense(String licenseId, String organizationId, Locale locale){
		licenseRepository.deleteByLicenseId(licenseId); // delete license
		
		String responseMessage = null;
		responseMessage = String.format(messages.getMessage("license.delete.message", null, locale),licenseId, organizationId);
		return responseMessage;
	}
}
