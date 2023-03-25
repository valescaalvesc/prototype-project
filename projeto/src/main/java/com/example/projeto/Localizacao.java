package com.example.projeto;

public class Localizacao implements Cloneable {

    private String cidade;
    private Integer codigo;

    public Localizacao(String cidade, Integer codigo) {
        super();
        this.cidade = cidade;
        this.codigo = codigo;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Localizacao{" +
                "cidade='" + cidade + '\'' +
                ", codigo=" + codigo +
                '}';
    }
}
