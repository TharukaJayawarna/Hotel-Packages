package com.zerocode.hotelPackagesApi.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "super_deals")
public class SuperDeal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double discountPercentage;
    private LocalDate startDate;
    private LocalDate endDate;
    private String adminApprovalStatus;

    @ManyToOne
    private Hotel hotel;

    @OneToOne
    @JoinColumn(name = "package_id")
    private Package aPackage;
}
