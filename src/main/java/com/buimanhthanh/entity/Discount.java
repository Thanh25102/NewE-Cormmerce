package com.buimanhthanh.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "discount")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Discount {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic
    @Column(name = "sale_percent", nullable = false)
    @NotNull(message = "{null.err}")
    private Integer salePercent;
    @Basic
    @Column(name = "start_day", nullable = false)
    private Date startDay;
    @Basic
    @Column(name = "end_day", nullable = false)
    @NotNull(message = "{null.err}")
    private Date endDay;
    @Basic
    @Column(name = "description", nullable = true, length = 255)
    @Length(max = 255, message = "{access.description.err}")
    private String description;
    @OneToMany(mappedBy = "discountByDiscountId", fetch = FetchType.LAZY)
    private Set<Product> productsById;
}