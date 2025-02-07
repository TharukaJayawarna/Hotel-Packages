package com.zerocode.hotelPackagesApi.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "packages")
public class Package {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private double price;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    @OneToMany(mappedBy = "packages",cascade = CascadeType.ALL)
    private List<PackageImages> packageImages;

    private boolean status;
    private String termsAndConditions;
    private int visitors;
    private GuestCount count;

    @ManyToOne
    private Menu menu;

    @ManyToOne
    private Hotel hotel;

    @OneToOne(mappedBy = "aPackage",cascade = CascadeType.ALL)
    private SuperDeal superDeal;

    @OneToOne(mappedBy = "aPackage",cascade = CascadeType.ALL)
    private BoostPackage boostPackage;

    @ManyToOne
    private PackageType packageType;
}
