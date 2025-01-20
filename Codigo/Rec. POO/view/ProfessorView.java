package view;
import java.util.*;
import models.ProfessorModel;

public class ProfessorView {

    Scanner scanner = new Scanner(System.in);

    public void cadastroProfessor(){}

    public void cadastroProfessor(ProfessorModel professor){
        System.out.println("Insira o nome do professor: ");
        String nome = scanner.nextLine();
        professor.setNome(nome);
    
        System.out.println("Insira o sobrenome do professor: ");
        String sobrenome = scanner.nextLine();
        professor.setsobreNome(sobrenome);

        System.out.println("Insira o CPF do professor: ");
        String CPF = scanner.nextLine();
        professor.setCPF(CPF); // chave primaria

        System.out.println("Insira sua senha: ");
        String senha = scanner.nextLine();
        professor.setSenha(senha);

        System.out.println("Insira o siape do professor: ");
        String siape = scanner.nextLine();
        professor.setSiape(siape);

    }

    public String buscaCPF(){
        System.out.println("Digite o CPF do professor: ");
        String CPF = scanner.nextLine();
        return CPF;
    }
    
    public String mudarSiape(){
        System.out.println("Digite o novo siape do professor: ");
        String siape = scanner.nextLine();
        return siape;

    }

    public String mudarSenha(){
        System.out.println("Digite a nova senha do professor: ");
        String senha = scanner.nextLine();
        return senha;
    }
    public String atualizarNome(){
        System.out.println("Digite o novo nome do professor: ");
        String novoNome = scanner.nextLine();
        return novoNome;
    }

    public String atualizarSobrenome(){
        System.out.println("Digite o novo sobrenome do professor: ");
        String novoSobrenome = scanner.nextLine();
        return novoSobrenome;
    }


    public String apagarProfessor(){
        System.out.println("Digite o CPF do professor que deseja apagar: ");
        String CPF = scanner.nextLine();
        return CPF;
    }

    public void listaProfessor(ArrayList<ProfessorModel> professores){
        System.out.printf("%-15s %-15s %-15s %-15s %-15s%n", "CPF", "Nome", "Sobrenome", "Siape", "Senha");
        for(ProfessorModel professor : professores){
            System.out.printf("%-15s %-15s %-15s %-15s %-15s%n", professor.getCPF(), professor.getNome(), professor.getsobreNome(), professor.getSiape(), professor.getSenha());
        }
    }

}
