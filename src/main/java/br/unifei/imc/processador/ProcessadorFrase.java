package br.unifei.imc.processador;

import br.unifei.imc.Observers.ObservadorPalavra;
import br.unifei.imc.Observers.Observavel;

import br.unifei.imc.processador.exception.SemProcessadoresException;
import lombok.Getter;
import java.util.ArrayList;
import java.util.List;

public class ProcessadorFrase implements Observavel {
    @Getter
    private List<ObservadorPalavra> observadores = new ArrayList<>();

    public void processar(String text) {
        if (this.observadores.isEmpty()) throw new SemProcessadoresException();
        observadores.forEach(obs -> obs.atualizar(text));
    }

    @Override
    public void registrar(ObservadorPalavra obs) {
        this.observadores.add(obs);
    }

    @Override
    public void cancelar(ObservadorPalavra obs) {
        this.observadores.remove(obs);
    }
}
