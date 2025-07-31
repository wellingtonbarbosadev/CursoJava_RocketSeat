package entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();
    private List<Autor> autores = new ArrayList<>();
    private List<Empretimo> empretimos = new ArrayList<>();


    public Biblioteca() {
        livros.add(new Livro(1001, "Dom Quixote", new Autor(1, "Miguel de Cervantes", LocalDate.of(1547, 9, 29)), true, LocalDateTime.now(), LocalDateTime.now()));
        livros.add(new Livro(1002, "Orgulho e Preconceito", new Autor(2, "Jane Austen", LocalDate.of(1775, 12, 16)), true, LocalDateTime.now(), LocalDateTime.now()));
        livros.add(new Livro(1003, "O Grande Gatsby", new Autor(3, "F. Scott Fitzgerald", LocalDate.of(1896, 9, 24)), true, LocalDateTime.now(), LocalDateTime.now()));
        livros.add(new Livro(1004, "O Sol é Para Todos", new Autor(4, "Harper Lee", LocalDate.of(1926, 4, 28)), true, LocalDateTime.now(), LocalDateTime.now()));
        livros.add(new Livro(1005, "Harry Potter e a Pedra Filosofal", new Autor(5, "J. K. Rowling", LocalDate.of(1965, 7, 31)), true, LocalDateTime.now(), LocalDateTime.now()));
        livros.add(new Livro(1006, "1984", new Autor(6, "George Orwell", LocalDate.of(1903, 6, 25)), true, LocalDateTime.now(), LocalDateTime.now()));
        livros.add(new Livro(1007, "A Metamorfose", new Autor(7, "Franz Kafka", LocalDate.of(1883, 7, 3)), true, LocalDateTime.now(), LocalDateTime.now()));
        livros.add(new Livro(1008, "O Pequeno Príncipe", new Autor(8, "Antoine de Saint-Exupéry", LocalDate.of(1900, 6, 29)), true, LocalDateTime.now(), LocalDateTime.now()));
        livros.add(new Livro(1009, "Ulisses", new Autor(9, "James Joyce", LocalDate.of(1882, 2, 2)), true, LocalDateTime.now(), LocalDateTime.now()));
        livros.add(new Livro(1010, "Cem Anos de Solidão", new Autor(10, "Gabriel García Márquez", LocalDate.of(1927, 3, 6)), true, LocalDateTime.now(), LocalDateTime.now()));
        livros.add(new Livro(1011, "Admirável Mundo Novo", new Autor(11, "Aldous Huxley", LocalDate.of(1894, 7, 26)), true, LocalDateTime.now(), LocalDateTime.now()));
        livros.add(new Livro(1012, "O Processo", new Autor(12, "Franz Kafka", LocalDate.of(1883, 7, 3)), true, LocalDateTime.now(), LocalDateTime.now()));
    }


    public Boolean livroExiste(Integer idLivro) {
        boolean livroExiste = false;
        for (Livro livro : livros) {
            if (livro.getIdLivro().equals(idLivro)) {
                livroExiste = true;
                break;
            }
        }
        return livroExiste;
    }

    public Boolean livroDisponivel(Integer idLivro) {
        boolean livroDisponivel = false;
        for (Livro livro : livros) {
            // livro.setDisponibilidadeLivro(false);
            if (livro.getIdLivro().equals(idLivro) && livro.getDisponibilidadeLivro() == true){
                return true;
            }
        }
        return false;
    }

    public String listarLivros (){
        StringBuilder sb = new StringBuilder();
        for (Livro livro : livros) {
            if (livro.getDisponibilidadeLivro()) {
                sb.append(String.format("[%d] %s", livro.getIdLivro(), livro.getNomeLivro()));
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public Boolean realizarEmprestimo(Integer idLivro, String locador) {
        for (Livro livro : livros) {
            if (livro.getIdLivro().equals(idLivro)) {
                livro.setDisponibilidadeLivro(false);
                empretimos.add(new Empretimo(livro, locador));
                return true;
            }
        }
        return false;
    }

    public void listarEmprestimos() {
        for (Empretimo empretimo : empretimos) {
            System.out.println(empretimo);
        }
    }
}
