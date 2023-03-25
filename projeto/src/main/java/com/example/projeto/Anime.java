package com.example.projeto;

public class Anime implements Cloneable{

    private int registro;
    private String nomeAnime;
    private Localizacao localizacao;
    private String localLancamento;

    public Anime(int registro, String nomeAnime, Localizacao localizacao, String localLancamento) {
        this.registro = registro;
        this.nomeAnime = nomeAnime;
        this.localizacao = localizacao;
        this.localLancamento = localLancamento;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public String getNomeAnime() {
        return nomeAnime;
    }

    public void setNomeAnime(String nomeAnime) {
        this.nomeAnime = nomeAnime;
    }

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }

    public String getLocalLancamento() {
        return localLancamento;
    }

    public void setLocalLancamento(String localLancamento) {
        this.localLancamento = localLancamento;
    }

    @Override
    public Anime clone() throws CloneNotSupportedException {
        Anime animeClone = (Anime) super.clone();
        animeClone.localizacao = (Localizacao) animeClone.localizacao.clone();
        return animeClone;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "registro=" + registro +
                ", nomeAnime='" + nomeAnime + '\'' +
                ", localizacao=" + localizacao +
                ", localLancamento='" + localLancamento + '\'' +
                '}';
    }
}
