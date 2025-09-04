import java.time.LocalDate;

public class Jogo {
    //Atributos/Propriedades/Campos
    String titulo;
    String plataforma;
    LocalDate dataLancamento;

    @Override
    public String toString() {
        return "Jogo{" +
                "titulo='" + titulo + '\'' +
                ", plataforma='" + plataforma + '\'' +
                ", dataLancamento=" + dataLancamento +
                '}';
    }
}
