package com.zerocode.hotelPackagesApi.model;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
@Table(name = "hotel_images")
public class HotelImages {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String url;

    @ManyToOne
    private Hotel hotel;

}
