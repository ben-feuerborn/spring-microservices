package com.optimagrowth.license.domain;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "organization")
public class Organization {
    // generated value for SQL table
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    
    @Enumerated(EnumType.STRING)
    private Category category;
    
    private LocalDate establishedDate;

    // an organization has many members
    @ManyToMany
    @JoinTable(
        name = "organization_members",
        joinColumns = @JoinColumn(name = "organization_id"),
        inverseJoinColumns = @JoinColumn(name = "person_id")
    )
    private Set<Person> members = new HashSet<>();

    // an organization has one president
    @OneToOne
    @JoinColumn(name = "president_id")
    private Person president;

    // constructors
    public Organization() {}

    public Organization(String name, Category category, LocalDate establishedDate) {
        this.name = name;
        this.category = category;
        this.establishedDate = establishedDate;
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public LocalDate getEstablishedDate() {
        return establishedDate;
    }

    public void setEstablishedDate(LocalDate establishedDate) {
        this.establishedDate = establishedDate;
    }

    public Set<Person> getMembers() {
        return members;
    }

    public void setMembers(Set<Person> members) {
        this.members = members;
    }

    public Person getPresident() {
        return president;
    }

    public void setPresident(Person president) {
        this.president = president;
    }
}
