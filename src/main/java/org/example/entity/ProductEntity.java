package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "product")
@Table(name = "product")
public class ProductEntity {
    @Id
    private String productId;
    private String productName;
    private String category;
    private int size;
    private int qty;
    private double price;
    private String supplierID;
}
