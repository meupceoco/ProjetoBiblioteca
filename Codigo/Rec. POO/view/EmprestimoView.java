package view;

import java.util.*;

public class EmprestimoView {
    
    public void emprestarAluno(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o Id do livro que deseja emprestar: ");
        scanner.nextInt();
        System.out.println("Digite seu CPF:");
        scanner.nextLine();
    }

    public void devolverAluno(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o Id do livro que deseja devolver: ");
        scanner.nextInt();
        System.out.println("Digite seu CPF:");
        scanner.nextLine();
    }

    public void emprestarProfessor(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o Id do livro que deseja emprestar: ");
        scanner.nextInt();
        System.out.println("Digite seu CPF:");
        scanner.nextLine();
    }

    public void devolverProfessor(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o Id do livro que deseja devolver: ");
        scanner.nextInt();
        System.out.println("Digite seu CPF:");
        scanner.nextLine();
    }
    
    public void listarEmprestimos(ArrayList<String> emprestimos){
        System.out.println("Livros emprestados: ");
        for(String emprestimo : emprestimos){
            System.out.println(emprestimo);
        }
    }
}
