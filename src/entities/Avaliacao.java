package entities;

import java.time.LocalDate;

public class Avaliacao {
    private String nomeUsuario;
    private int nota;
    private String comentario;
    private LocalDate dataLancamento;

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        if(nota < 0 || nota > 10)
            throw new IllegalArgumentException("O valor da nota deve estar entre 0 e 10.");
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Avaliacao{" +
                "nomeUsuario='" + nomeUsuario + '\'' +
                ", nota=" + nota +
                ", comentario='" + comentario + '\'' +
                ", dataLancamento=" + dataLancamento +
                '}';
    }
}
