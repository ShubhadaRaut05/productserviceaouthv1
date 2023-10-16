package com.shubhada.productservice.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Product extends BaseModel{
    private String title;
    private double price;
    private String description;
   // @ManyToOne(fetch = FetchType.LAZY, ca)
    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
    private Category category;
    private String imageUrl;
}