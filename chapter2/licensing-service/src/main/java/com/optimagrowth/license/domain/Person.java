package com.optimagrowth.license.domain;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "person")
public class Person {
    // generated id for SQL table
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String major;
    private String dept;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;
    
    private String phone;
    private String email;

    // one person can be a member of multiple organizations
    @ManyToMany(mappedBy = "members")
    private Set<Organization> organizations = new HashSet<>();

    // one person can be president of at most one organization
    @OneToOne(mappedBy = "president")
    private Organization presidentOf;

    // constructors
    public Person() {
    }

    public Person(String name, String major, String dept, LocalDate dateOfBirth, String phone, String email) {
        this.name = name;
        this.major = major;
        this.dept = dept;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.email = email;
    }

    // getters and setters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Organization> getOrganizations() {
        return organizations;
    }

    public void setOrganizations(Set<Organization> organizations) {
        this.organizations = organizations;
    }

    public Organization getPresidentOf() {
        return presidentOf;
    }

    public void setPresidentOf(Organization presidentOf) {
        this.presidentOf = presidentOf;
    }
}
