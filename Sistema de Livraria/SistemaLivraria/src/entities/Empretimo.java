package entities;

public class Empretimo {
    private Livro livro;
    private String locador;

    public Empretimo() {
    }

    public Empretimo(Livro livro, String locador) {
        this.livro = livro;
        this.locador = locador;
    }

    @Override
    public String toString() {
        return String.format("[%d] %s, Locador: %s", livro.getIdLivro(), livro.getNomeLivro(), this.locador);
    }
}
