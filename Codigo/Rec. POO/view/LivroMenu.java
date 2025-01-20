package view;

import controller.LivroController;
import java.util.Scanner;

public class LivroMenu {
    
    public void menuLivro(){

    Scanner scanner = new Scanner(System.in);
    LivroController livro = new LivroController();
    int opcao = 0;

        System.out.println("Escolha uma opção: ");
        
        while(opcao != 5){

        System.out.println("1 - Cadastrar Livro");
        System.out.println("2 - Editar Livro");
        System.out.println("3 - Deletar Livro");
        System.out.println("4 - Listar Livros");
        System.out.println("5 - Sair");
        
        opcao = scanner.nextInt();

        switch(opcao){
            case 1:
                
                livro.criar();
                System.out.println("Cadastrando Livro....");
                break;
            case 2:
                
                livro.ler();
                livro.editar();
                System.out.println("Editando Livro....");
                break;
            case 3:
                
                livro.remover();
                System.out.println("Deletando Livro....");
                break;
            case 4:
                System.out.println("Listando Livros....");
                livro.ler();
                System.out.println("");
                break;

            case 5:
                System.out.println("Sair");
                return;
            
            default:
                System.out.println("Opção inválida");
                break;
            }
        }
    }
}
