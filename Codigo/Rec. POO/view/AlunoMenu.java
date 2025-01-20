package view;
import controller.AlunoController;
import java.util.Scanner;

public class AlunoMenu {
    
    public void menuAluno() {
    
        EmprestimoMenu emprestimoMenu = new EmprestimoMenu();
        Scanner scanner = new Scanner(System.in);
        AlunoController aluno = new AlunoController();
        int opcao = 0;

        System.out.println("Escolha uma opção: ");

        while(opcao != 6){
        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Cadastrar Usuario");
        System.out.println("2 - Editar Usuario");
        System.out.println("3 - Deletar Usuario");
        System.out.println("4 - Listar Usuarios");
        System.out.println("5 - Emprestimo");
        System.out.println("6 - Sair");
        opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Cadastrar Aluno");
                aluno.criar();

                break;
            case 2:
                System.out.println("Editar Aluno");
                aluno.editar();

                break;
            case 3:
                System.out.println("Deletar Aluno");
                aluno.remover();

                break;
            case 4:
                System.out.println("Ler");
                aluno.ler();
                System.out.println("");
                break;

            case 5:
                System.out.println("Emprestimo Aluno");
                emprestimoMenu.menuEmprestimoAluno();
                break;

            case 6:
                System.out.println("Emprestimo Professor");
                emprestimoMenu.menuEmprestimoProfessor();
                break;

            case 7:
                System.out.println("Sair");
                return;
            
            default:
                System.out.println("Opção inválida");
                break;
            }
        }   
    }

}
