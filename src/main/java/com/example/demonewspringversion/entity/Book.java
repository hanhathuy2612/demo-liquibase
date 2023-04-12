package com.example.demonewspringversion.entity;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.UUID;

@Table(name = "book")
@Entity
@Getter
@Setter
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "UUID")
    @Column(nullable = false, columnDefinition = "binary(16)")
    private UUID id;

    private String name;

    private String fistName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false, unique = true)
    private String email;

    @ManyToOne
    @JoinColumn(name = "authors_id")
    private Author author;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
