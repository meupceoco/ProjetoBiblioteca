package view;

import controller.ProfessorController;
import java.util.Scanner;

public class ProfessorMenu {
    public void menuProfessor() {
    
        EmprestimoMenu emprestimoMenu = new EmprestimoMenu();
        Scanner scanner = new Scanner(System.in);
        ProfessorController professor = new ProfessorController();
        int opcao = 0;

        System.out.println("Escolha uma opção: ");    

        while(opcao != 6){
       
        System.out.println("1 - Cadastrar Professor");
        System.out.println("2 - Editar Professor");
        System.out.println("3 - Listar Professor");
        System.out.println("4 - Deletar Professor");
        System.out.println("5 - Emprestimos");
        System.out.println("6 - Sair");

        opcao = scanner.nextInt();
        
        switch (opcao){
            case 1:
                professor.criar();

                break;
            case 2:
                professor.editar();

                break;
            case 3:
                professor.ler();
                System.out.println("");
                
                break;
            
            case 4:
                professor.remover();

                break;
        
            case 5:

                emprestimoMenu.menuEmprestimoProfessor();

            case 6:
                return;
            
            default:
                System.out.println("Opção inválida");
                break;
            }
        }
    }
}
