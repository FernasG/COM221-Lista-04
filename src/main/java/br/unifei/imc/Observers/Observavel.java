package br.unifei.imc.Observers;

public interface Observavel {
    void registrar(ObservadorPalavra obs);
    void cancelar(ObservadorPalavra obs);
}
