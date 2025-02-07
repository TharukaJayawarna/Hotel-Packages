package com.zerocode.hotelPackagesApi.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "package_images")
public class PackageImages {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String url;

    @ManyToOne
    @JoinColumn(name = "package_id")
    private Package packages;
}
