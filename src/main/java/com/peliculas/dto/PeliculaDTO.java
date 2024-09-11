package com.peliculas.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PeliculaDTO {

    private Integer peliculaId;

    @NotBlank(message = "Por favor introduce un título para la película")
    private String titulo;

    @NotBlank(message = "Por favor introduce un director para la película")
    private String director;

    @NotBlank(message = "Por favor introduce un estudio para la película")
    private String estudio;

    private Set<String> reparto;

    private Integer anioLanzamiento;

    @NotBlank(message = "Por favor introduce un poster para la película")
    private String poster;

    @NotBlank(message = "Por favor introduce un poster para la película")
    private String posterUrl;
}
