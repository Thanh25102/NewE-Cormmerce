package com.buimanhthanh.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "role")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Basic
    @Column(name = "authority", nullable = false, length = 64)
    @NotNull(message = "{null.err}")
    private String authority;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    @NotNull(message = "{null.err}")
    private Integer id;
    @OneToMany(mappedBy = "roleById")
    private Collection<Account> accountByRoleId;

    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinTable(
            name = "permission",
            joinColumns = {
                    @JoinColumn(name = "role_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "access_id")
            }
    )
    private Set<Access> accesses = new HashSet<>();
}