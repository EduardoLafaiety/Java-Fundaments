package br.com.logica.projeto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AnalisadorDeNotasTest {

    @Test
    void deveCalcularAMediaDasNotas() {
        double[] notas = {8.0, 7.0, 9.0, 6.0};

        double media = AnalisadorDeNotas.calcularMedia(notas);

        assertEquals(7.5, media, 0.001);
    }

    @Test
    void deveEncontrarAMaiorEAMenorNota() {
        double[] notas = {8.0, 5.5, 9.5, 7.0};

        assertEquals(9.5, AnalisadorDeNotas.encontrarMaiorNota(notas));
        assertEquals(5.5, AnalisadorDeNotas.encontrarMenorNota(notas));
    }

    @Test
    void deveDefinirASituacaoDoEstudante() {
        assertEquals("APROVADO", AnalisadorDeNotas.definirSituacao(8.0));
        assertEquals("RECUPERAÇÃO", AnalisadorDeNotas.definirSituacao(6.0));
        assertEquals("REPROVADO", AnalisadorDeNotas.definirSituacao(4.0));
    }

    @Test
    void deveRecusarUmaListaVazia() {
        double[] notas = {};

        assertThrows(IllegalArgumentException.class,
                () -> AnalisadorDeNotas.calcularMedia(notas));
    }
}
