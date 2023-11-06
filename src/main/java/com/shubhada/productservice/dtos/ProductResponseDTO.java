package com.shubhada.productservice.dtos;


import com.shubhada.productservice.models.Category;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductResponseDTO {
    private Long id;
    private String title;
    private double price;
    private String category;
    private  String description;
    private String image;

}
