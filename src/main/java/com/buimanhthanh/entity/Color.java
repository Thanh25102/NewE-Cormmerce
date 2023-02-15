package com.buimanhthanh.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "color")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Color {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic
    @Column(name = "name", nullable = false, length = 50)
    @NotNull(message = "{null.err}")
    @Length(max = 50, message = "{access.code.err}")
    private String name;
    @Basic
    @Column(name = "code", nullable = false, length = 50)
    @NotNull(message = "{null.err}")
    @Length(max = 50, message = "{access.code.err}")
    private String code;
    @Basic
    @Column(name = "description", nullable = true, length = 255)
    @Length(max = 255, message = "{access.description.err}")
    private String description;
    @OneToMany(mappedBy = "colorByColorId")
    private List<ProductDetail> productDetailsById = new ArrayList<>();
}