package br.unifei.imc;

import br.unifei.imc.processador.ProcessadorFrase;
import br.unifei.imc.processador.observadores.ContaPalavrasPares;

public class Main {
    public static void main(String[] args) {
        ProcessadorFrase processador = new ProcessadorFrase();
        processador.registrar(new ContaPalavrasPares());

        processador.processar("salve cri tusdo bem");
    }
}
