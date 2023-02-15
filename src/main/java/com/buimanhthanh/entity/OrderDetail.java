package com.buimanhthanh.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "order_detail", schema = "buimanhthanhecormmercespringmvc")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetail {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic
    @Column(name = "price", nullable = false, precision = 0)
    @NotNull(message = "{null.err}")
    private Double price;
    @Basic
    @Column(name = "quantity", nullable = false)
    @NotNull(message = "{null.err}")
    private Integer quantity;
    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id", nullable = false)
    @NotNull(message = "{null.err}")
    private ProductDetail productDetailByProductId;
    @ManyToOne
    @JoinColumn(name = "order_id", referencedColumnName = "id", nullable = false)
    @NotNull(message = "{null.err}")
    private Order orderByOrderId;
}