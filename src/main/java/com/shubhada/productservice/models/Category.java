package com.shubhada.productservice.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.List;

@Setter
@Getter
@Entity
public class Category extends BaseModel {
    private String name;
    private String description;
    @OneToMany(fetch = FetchType.EAGER,mappedBy = "category", cascade = {CascadeType.REMOVE})
    @Fetch(FetchMode.JOIN)
    @BatchSize(size = 1)
    private List<Product> products;
}
