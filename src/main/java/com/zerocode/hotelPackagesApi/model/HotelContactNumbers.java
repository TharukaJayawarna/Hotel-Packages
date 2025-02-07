package com.zerocode.hotelPackagesApi.model;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "hotel_contact_numbers")
public class HotelContactNumbers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String number;

    @ManyToOne
    private Hotel hotel;

}
