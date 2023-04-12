package com.example.demonewspringversion.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.UUID;

@Table(name = "category")
@Entity
@Getter
@Setter
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "UUID")
    @Column(nullable = false, columnDefinition = "binary(16)")
    private UUID id;

    @Column(unique = true, nullable = false)
    private String name;

    @Column(unique = true, nullable = false)
    private String code;

}
