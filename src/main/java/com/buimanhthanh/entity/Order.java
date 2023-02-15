package com.buimanhthanh.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "order_")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic
    @Column(name = "order_status", nullable = false, length = 20)
    @NotNull(message = "{null.err}")
    private String orderStatus;
    @Basic
    @Column(name = "ammount", nullable = false)
    @NotNull(message = "{null.err}")
    private Integer ammount;
    @Basic
    @Column(name = "payment_method", nullable = false, length = 50)
    @NotNull(message = "{null.err}")
    @Length(max = 50, message = "{access.code.err}")
    private String paymentMethod;
    @Basic
    @Column(name = "create_time", nullable = false)
    @NotNull(message = "{null.err}")
    private Date createTime;

    @Basic
    @Column(name = "phone", nullable = true)
    private String phone;

    @Basic
    @Column(name = "shiping_address", nullable = true)
    private String shipingAddress;

    @Basic
    @Column(name = "city", nullable = true)
    private String city;

    @Basic
    @Column(name = "sum_money", nullable = true)
    private Double sumMoney;

    @ManyToOne
    @JoinColumn(name = "username", referencedColumnName = "username", nullable = false)
    @NotNull(message = "{null.err}")
    private Account accountByUsername;
    @ManyToOne
    @JoinColumn(name = "discount_code_id", referencedColumnName = "id")
    private DiscountCode discountCodeByDiscountCodeId;

    @OneToMany(mappedBy = "orderByOrderId", fetch = FetchType.LAZY)
    private List<OrderDetail> orderDetailsById = new ArrayList<>();
}