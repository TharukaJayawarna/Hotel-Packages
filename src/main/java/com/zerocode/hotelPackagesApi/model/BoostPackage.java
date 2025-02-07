package com.zerocode.hotelPackagesApi.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "boost_packages")
public class BoostPackage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate boostedDate;

    @ManyToOne
    private Hotel hotel;

    @OneToOne
    @JoinColumn(name = "package_id")
    private Package aPackage;
}
