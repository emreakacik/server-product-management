package com.sha.serverproductmanagement.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @Column(name="name")
    private  String name;
    @Column(name="price")
    private  Double price;
    @Column(name = "explanation")
    private  String explanation;
}
