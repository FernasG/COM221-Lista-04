package br.unifei.imc.processador.observadores;

import br.unifei.imc.Observers.ObservadorPalavra;

public class ContaTodasPalavras implements ObservadorPalavra {
    private int numPalavra = 0;
    @Override
    public void atualizar(String text) {
        String[] words = text.split(" ");
        numPalavra = words.length;
    }

    @Override
    public int getNumPalavras() {
        return numPalavra;
    }
}
