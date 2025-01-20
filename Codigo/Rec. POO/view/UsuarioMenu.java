package view;
import java.util.Scanner;

public class UsuarioMenu {
    Scanner scanner = new Scanner(System.in);
    AlunoMenu alunoMenu = new AlunoMenu();
    ProfessorMenu professorMenu = new ProfessorMenu();
    LivroMenu livroMenu = new LivroMenu();
    
    public void menuPrincipal(String[] args) {
        System.out.println("Bem vindo ao sistema de cadastro de alunos");
        
        int opcao = 0;

        while(opcao != 3){
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Gerenciar Alunos");
            System.out.println("2 - Gerenciar Professores");
            System.out.println("3 - Gerenciar Livros");
            System.out.println("4 - Sair");
            opcao = scanner.nextInt();
            
        switch(opcao){
            case 1:
                alunoMenu.menuAluno();
                break;
            case 2:
                professorMenu.menuProfessor();
                break;
                
            case 3:
                livroMenu.menuLivro();
                break;    
                
            case 4:
                return;

            default:
                System.out.println("Opção inválida");
                break;
            }
        }
        
    }
 
}
