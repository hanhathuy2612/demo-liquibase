package com.example.demonewspringversion.entity;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Table(name = "authors")
@Entity
@Getter
@Setter
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "UUID")
    @Column(nullable = false, columnDefinition = "binary(16)")
    private UUID id;

    private String name;

    @OneToMany(mappedBy = "author")
    @Builder.Default
    private Set<Book> books = new HashSet<>();
}
