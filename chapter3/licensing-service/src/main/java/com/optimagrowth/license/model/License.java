package com.optimagrowth.license.model;

import javax.persistence.*;

import org.springframework.hateoas.RepresentationModel;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "license")
@Getter @Setter @ToString
public class License extends RepresentationModel<License> {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String licenseId;
	private String description;
	private String organizationId;
	private String productName;
	private String licenseType;

}