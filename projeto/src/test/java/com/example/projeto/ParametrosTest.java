package com.example.projeto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

    class ParametrosTest {

        @Test
        public void deveRetornarCpfUsuario() {
            Parametros.getInstance().setCpfUsuario("CPF Usuario 1");
            assertEquals("CPF Usuario 1", Parametros.getInstance().getCpfUsuario());
        }

        @Test
        public void deveRetornarSeDoador() {
            Parametros.getInstance().setUsuarioDoador("Usuario Doador 1");
            assertEquals("Usuario Doador 1", Parametros.getInstance().getUsuarioDoador());
        }

    }
