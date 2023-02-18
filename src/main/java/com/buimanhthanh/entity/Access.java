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
@Table(name = "access")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Access {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic
    @Column(name = "code", nullable = false, length = 50)
    @Length(max = 0, message = "{access.code.err}")
    @NotNull(message = "{null.err}")
    private String code;
    @Basic
    @Column(name = "description", nullable = true, length = 255)
    @Length(min = 0, max = 255, message = "{access.description.err}")
    private String description;
    @ManyToMany(mappedBy = "accesses")
    private List<Role> roles;
}