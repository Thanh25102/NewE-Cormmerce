package com.buimanhthanh.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import java.util.ArrayList;
import java.util.List;

@Entity
@DynamicUpdate
@Table(name = "product")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Basic
    @Column(name = "name", nullable = false, length = 55)
    private String name;

    @Basic
    @Column(name = "price", nullable = false, precision = 0)
    private Double price;

    @Basic
    @Column(name = "description", nullable = true, length = 255)
    private String description;

    @Basic
    @Column(name = "thumbnail", nullable = true, length = 55)
    private String thumbnail;

    @Basic
    @Column(name = "represent", nullable = true, length = 255)
    private String represent;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", referencedColumnName = "id", nullable = false)
    private Category categoryByCategoryId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "discount_id", referencedColumnName = "id")
    private Discount discountByDiscountId;

    @OneToMany(mappedBy = "productByProductId", fetch = FetchType.LAZY, cascade = {
            CascadeType.REMOVE
    })
    private List<ProductDetail> productDetailsById;
}