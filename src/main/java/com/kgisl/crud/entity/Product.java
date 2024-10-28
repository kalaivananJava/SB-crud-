package com.kgisl.crud.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // for getters and setters
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="Product_table")
public class Product {
    @Id
    @GeneratedValue//for auto_increment
    private int id;
    String name;
    int quantity;
    double price;



}
