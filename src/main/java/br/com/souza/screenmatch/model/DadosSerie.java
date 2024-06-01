package br.com.souza.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


//Ignora o que vc não encontrar
@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias("Title") String titulo,
                         @JsonAlias("totalSeasons") Integer totalTemporadas,
                         @JsonAlias("imdbRating") String avaliacao) {
}
