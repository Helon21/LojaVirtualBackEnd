package com.example.backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name="product")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String shortDescription;

    private String detailedDescription;

    private Double costValue;

    private Double sellingCost;

    private Date creationDate;

    private Date updateDate;

}
