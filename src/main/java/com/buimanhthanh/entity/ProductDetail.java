package com.buimanhthanh.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "product_detail", schema = "buimanhthanhecormmercespringmvc")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDetail {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic
    @Column(name = "quantity", nullable = false)
    private Integer quantity;
    @Basic
    @Column(name = "description", nullable = false, length = 255)
    private String description;
    @Basic
    @Column(name = "image", nullable = true, length = 255)
    private String image;
    @OneToMany(mappedBy = "productDetailByProductId", fetch = FetchType.LAZY)
    private Collection<CartDetail> cartDetailsById;
    @OneToMany(mappedBy = "productDetailByProductId", fetch = FetchType.LAZY)
    private List<OrderDetail> orderDetailsById = new ArrayList<>();
    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id", nullable = false)
    private Product productByProductId;
    @ManyToOne
    @JoinColumn(name = "size_id", referencedColumnName = "id", nullable = false)
    private Size sizeBySizeId;
    @ManyToOne
    @JoinColumn(name = "color_id", referencedColumnName = "id", nullable = false)
    private Color colorByColorId;
}