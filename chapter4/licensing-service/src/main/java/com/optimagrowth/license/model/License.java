package com.optimagrowth.license.model;

import jakarta.persistence.*;

import org.springframework.hateoas.RepresentationModel;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "licenses")
@Getter @Setter @ToString
public class License extends RepresentationModel<License> {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(nullable = false, unique = true)
	private String licenseId;

	@Column(nullable = false)
	private String organizationId;

	private String description;
	private String productName;
	private String licenseType;

}