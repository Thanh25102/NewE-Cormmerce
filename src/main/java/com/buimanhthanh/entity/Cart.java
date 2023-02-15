package com.buimanhthanh.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "cart")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cart {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    @NotNull(message = "{null.err}")
    private Integer id;
    @Basic
    @Column(name = "ammount", nullable = false)
    @NotNull(message = "{null.err}")
    private Integer ammount;

    @ManyToOne
    @JoinColumn(name = "username", referencedColumnName = "username", nullable = false)
    private Account accountByUsername;

    @OneToMany(mappedBy = "cartByCartId")
    private List<CartDetail> cartDetailsById = new ArrayList<>();
}