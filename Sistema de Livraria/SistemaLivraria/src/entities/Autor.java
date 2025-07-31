package entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Autor {
    private Integer idAutor;
    private String nomeAutor;
    private LocalDate dataNascimento;

    public Autor() {
    }

    public Autor(Integer idAutor, String nomeAutor, LocalDate dataNascimento) {
        this.idAutor = idAutor;
        this.nomeAutor = nomeAutor;
        this.dataNascimento = dataNascimento;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Integer getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(Integer idAutor) {
        this.idAutor = idAutor;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }
}
