package br.unifei.imc.processador.observadores;

import br.unifei.imc.Observers.ObservadorPalavra;

public class ContaPalavrasPares implements ObservadorPalavra {
    private int numPalavra = 0;

    @Override
    public void atualizar(String text) {
        String[] words = text.split(" ");
        for(String word: words) {
            if (word.length() % 2 == 0) numPalavra += 1;
        }
    }

    @Override
    public int getNumPalavras() {
        return numPalavra;
    }
}
