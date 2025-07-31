package application;

import entities.Biblioteca;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        Biblioteca biblioteca = new Biblioteca();

        while (true) {
            System.out.println();
            System.out.print("Gostaria de ver os livros disponíveis? (s/n) ");
            char op = sc.next().charAt(0);
            sc.nextLine();

            if (op == 's') {
                System.out.println(biblioteca.listarLivros());

                System.out.print("Digite o ID do livro desejado: ");
                Integer idLivro = sc.nextInt();
                sc.nextLine();

                if (biblioteca.livroExiste(idLivro)) {
                    if (biblioteca.livroDisponivel(idLivro)) {
                        System.out.print("");
                    } else {
                        System.out.println("Este livro esta indisponivel.");
                        continue;
                    }
                }
                else {
                    System.out.println("Este ID não pertence a um livro existente.");
                    continue;
                }

                System.out.print("Qual o seu nome? ");
                String nome = sc.nextLine();

                if (biblioteca.realizarEmprestimo(idLivro, nome)) {
                    System.out.println("Empréstimo realizado.");
                }
                else {
                    System.err.println("Problema ao realizar o empréstimo.");
                }

            } else {
                System.out.println("Fim da aplicação");
                System.out.println("Lista de livros locados:");
                biblioteca.listarEmprestimos();
                break;
            }
        }
    }
}
