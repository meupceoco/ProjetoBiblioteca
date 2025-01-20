package view;
import java.util.*;
import models.LivrosModel;


public class LivroView {
    
    Scanner scanner = new Scanner(System.in);

    public void cadastrarLivro(LivrosModel livro){
        System.out.println("Insira o titulo do livro: ");
        String titulo = scanner.nextLine();
        livro.setTitulo(titulo);
    }

    public int buscaID(){
        System.out.println("Digite o ID do livro: ");
        int id = scanner.nextInt();
        return id;
    }

    public String mudarNome(){
        System.out.println("Digite novo nome do Livro: ");
        String nome = scanner.nextLine();
        return nome;
    }

    public int apagarLivro(){
        System.out.println("Digite o ID do livro que deseja apagar: ");
        int id = scanner.nextInt();
        return id;
    }

    public void listarLivros(ArrayList<LivrosModel> livros){
        System.out.printf("%-15s %-15s%n", "ID", "Titulo");
        for(LivrosModel livro : livros){
            System.out.printf("%-15s %-15s%n", livro.getId(), livro.getTitulo());
        }
    }
}
