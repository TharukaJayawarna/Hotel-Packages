package com.zerocode.hotelPackagesApi.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "package_types")
public class PackageType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "packageType",cascade = CascadeType.ALL)
    private List<Package> packages;

    @ManyToMany
    @JoinTable(name = "packagetype_facilities",
            joinColumns = @JoinColumn(name = "packagetype_id"),
            inverseJoinColumns = @JoinColumn(name = "facility_id")
    )
    private List<Facilities> facilities;
}
