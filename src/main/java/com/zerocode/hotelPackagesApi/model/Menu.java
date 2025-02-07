package com.zerocode.hotelPackagesApi.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "menus")
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double breakfastPrice;
    private double lunchPrice;
    private double dinnerPrice;
}
