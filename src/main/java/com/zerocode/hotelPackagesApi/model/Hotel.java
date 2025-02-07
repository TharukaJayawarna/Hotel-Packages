package com.zerocode.hotelPackagesApi.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "hotels")
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    private String hotelLogo;

    @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL)
    private List<HotelImages> hotelImages;

    private String password;
    private String email;
    private Address address;

    @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL)
    private List<HotelContactNumbers> contactNumbers;

    private byte superDealLimit;
    private byte boostPackageLimit;
    private boolean status;

    @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL)
    private List<Review> reviews;

    @OneToOne
    private Menu menu;

    @ManyToMany(mappedBy = "hotels", cascade = CascadeType.ALL)
    private List<Notification> notifications;

    @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL)
    private List<Package> packages;

    @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL)
    private List<BoostPackage> boostPackages;

    @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL)
    private List<SuperDeal> superDeals;
}
