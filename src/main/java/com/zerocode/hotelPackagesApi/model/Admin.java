package com.zerocode.hotelPackagesApi.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "admins")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String profilePhotoUrl;
    private String email;
    private String username;
    private String password;

    @OneToMany(mappedBy = "admin",cascade = CascadeType.ALL)
    private List<Notification> notification;
}
