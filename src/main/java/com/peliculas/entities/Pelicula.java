package com.peliculas.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer peliculaId;

    @Column(nullable = false, length = 200)
    @NotBlank(message = "Por favor introduce un título para la película")
    private String titulo;

    @Column(nullable = false)
    @NotBlank(message = "Por favor introduce un director para la película")
    private String director;

    @Column(nullable = false)
    @NotBlank(message = "Por favor introduce un estudio para la película")
    private String estudio;

    @ElementCollection
    @CollectionTable(name = "reparto_pelicula")
    private Set<String> reparto;

    @Column(nullable = false)
    @NotBlank(message = "Por favor introduce un año de lanzamiento para la película")
    private Integer anioLanzamiento;

    @Column(nullable = false)
    @NotBlank(message = "Por favor introduce un poster para la película")
    private String poster;
}
