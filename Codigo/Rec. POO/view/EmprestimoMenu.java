package view;
import controller.EmprestimoController;
import java.util.Scanner;
public class EmprestimoMenu {
    
    public void menuEmprestimoAluno(){
        EmprestimoController emprestimo = new EmprestimoController();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bem vindo ao sistema de empréstimos");
        
        int opcao = 0;

        while(opcao != 4){

        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Emprestar livro");
        System.out.println("2 - Devolver livro");
        System.out.println("3 - Listar Emprestimos");
        System.out.println("4 - Sair");
        
        opcao = scanner.nextInt();
        
        switch (opcao){
            case 1:
                
                emprestimo.emprestarAluno();
                System.out.println("Realizando Empréstimo....");
                break;

            case 2:
                
                emprestimo.devolverAluno();
                System.out.println("Realizando Devolução....");
                break;

            case 3:

                emprestimo.listarEmprestimos();
                System.out.println("Listando....");
                break;

            case 4:
                System.out.println("Saindo....");
                return;
            default:
                System.out.println("Opção inválida");
                break;
            }
        }
    }

    public void menuEmprestimoProfessor(){
        EmprestimoController emprestimo = new EmprestimoController();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bem vindo ao sistema de empréstimos");
        
        int opcao = 0;

        while(opcao != 4){
        
        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Emprestar livro");
        System.out.println("2 - Devolver livro");
        System.out.println("3 - Listar Emprestimos");
        System.out.println("4 - Sair");
        
            opcao = scanner.nextInt();
        
        switch (opcao){
            case 1:
                System.out.println("Realizando Empréstimo....");
                emprestimo.emprestarAluno();
                break;
            case 2:
                System.out.println("Realizando Devolução....");
                emprestimo.devolverAluno();
                break;
            
            case 3:
                System.out.println("Listando....");
                emprestimo.listarEmprestimos();
                break;
            
            case 4:
                System.out.println("Saindo....");
                return;
            
            default:
                System.out.println("Opção inválida");
                break;
            }
        }   
    }
}