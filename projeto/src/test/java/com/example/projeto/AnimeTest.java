package com.example.projeto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimeTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Anime anime = new Anime(123, "Aluno Original", new Localizacao("Osaka", 1), "Japão");

        Anime animeClone = anime.clone();
        animeClone.setRegistro(456);
        animeClone.setNomeAnime("Aluno Clonado");
        animeClone.getLocalizacao().setCodigo(2);

        assertEquals("Anime{matricula=123, nomeAnime='Aluno Original', localizacao=Localizacao{cidade='Osaka', codigo=1}, localLancamento='Juiz de Fora'}", anime.toString());
        assertEquals("Anime{matricula=456, nomeAnime='Aluno Clonado', localizacao=Localizacao{cidade='Osaka', codigo=2}, localLancamento='Juiz de Fora'}", anime.toString());
    }
}
