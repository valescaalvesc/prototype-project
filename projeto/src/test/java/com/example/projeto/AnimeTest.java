package com.example.projeto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimeTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Anime anime = new Anime(123, "One Piece", new Localizacao("Osaka", 1), "Japão");

        Anime animeClone = anime.clone();
        animeClone.setRegistro(456);
        animeClone.setNomeAnime("Anime Clonado");
        animeClone.getLocalizacao().setCodigo(2);

        assertEquals("Anime{registro=123, nomeAnime='One Piece', localizacao=Localizacao{cidade='Osaka', codigo=1}, localLancamento='Japão'}", anime.toString());
        assertEquals("Anime{registro=123, nomeAnime='One Piece', localizacao=Localizacao{cidade='Osaka', codigo=1}, localLancamento='Japão'}", anime.toString());
    }
}
