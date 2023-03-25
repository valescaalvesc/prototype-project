package com.example.projeto;

public class Parametros {

    private Parametros() {};
    private static Parametros instance = new Parametros();
    public static Parametros getInstance() {
        return instance;
    }

    private String cpfUsuario;
    private String usuarioDoador;

    public String getCpfUsuario() {
        return cpfUsuario;
    }

    public void setCpfUsuario(String cpfUsuario) {
        this.cpfUsuario = cpfUsuario;
    }

    public String getUsuarioDoador() {
        return usuarioDoador;
    }

    public void setUsuarioDoador(String usuarioDoador) {
        this.usuarioDoador = usuarioDoador;
    }
}
