package entities;

import java.time.LocalDateTime;

public class Livro {
    private Integer idLivro;
    private String nomeLivro;
    private Autor autorLivro;
    private Boolean disponibilidadeLivro;
    private LocalDateTime dataCadastro;
    private LocalDateTime dataAtualizacao;

    public Livro(Integer idLivro, String nomeLivro, Autor autorLivro, Boolean disponibilidadeLivro, LocalDateTime dataCadastro, LocalDateTime dataAtualizacao) {
        this.idLivro = idLivro;
        this.nomeLivro = nomeLivro;
        this.autorLivro = autorLivro;
        this.disponibilidadeLivro = disponibilidadeLivro;
        this.dataCadastro = dataCadastro;
        this.dataAtualizacao = dataAtualizacao;
    }

    public Integer getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(Integer idLivro) {
        this.idLivro = idLivro;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public Autor getAutorLivro() {
        return autorLivro;
    }

    public void setAutorLivro(Autor autorLivro) {
        this.autorLivro = autorLivro;
    }

    public Boolean getDisponibilidadeLivro() {
        return disponibilidadeLivro;
    }

    public void setDisponibilidadeLivro(Boolean disponibilidadeLivro) {
        this.disponibilidadeLivro = disponibilidadeLivro;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public LocalDateTime getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(LocalDateTime dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }
}
