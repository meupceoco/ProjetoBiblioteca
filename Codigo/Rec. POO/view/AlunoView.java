package view;
import java.util.*;
import models.AlunoModel;

public class AlunoView{
    public AlunoModel aluno = new AlunoModel();
    Scanner scanner = new Scanner(System.in);
    

    public void cadastroAluno(){}

    public void cadastrarAluno(AlunoModel aluno){ //esse metodo é void
        System.out.println("Insira o nome do aluno: ");
        String nome = scanner.nextLine();
        aluno.setNome(nome);
    
        System.out.println("Insira o sobrenome do aluno: ");
        String sobrenome = scanner.nextLine();
        aluno.setsobreNome(sobrenome);

        System.out.println("Insira o CPF do aluno: ");
        String CPF = scanner.nextLine();
        aluno.setCPF(CPF); // chave primaria

        System.out.println("Insira sua senha: ");
        String senha = scanner.nextLine();
        aluno.setSenha(senha);

        System.out.println("Insira a matricula do aluno: ");
        String matricula = scanner.nextLine();
        aluno.setMatricula(matricula);
    }

    public String buscaCPF(){ //mesma coisa
        
        System.out.println("Digite o CPF do aluno: ");
        String CPFBuscar = scanner.nextLine();
        return CPFBuscar;
    }

    public String atualizarSenha(){
        System.out.println("Digite a nova senha do aluno: ");
        String novaSenha = scanner.nextLine();
        return novaSenha;
    }
    
    public String atualizarNome(){
        System.out.println("Digite o novo nome do aluno: ");
        String novoNome = scanner.nextLine();
        return novoNome;
    }

    public String atualizarSobrenome(){
        System.out.println("Digite o novo sobrenome do aluno: ");
        String novoSobrenome = scanner.nextLine();
        return novoSobrenome;
    }

    public String apagarAluno(){
        System.out.println("Digite o CPF do aluno que deseja apagar: ");
        String CPF = scanner.nextLine();
        return CPF;
    }

    public void listarAlunos(ArrayList<AlunoModel> alunos){
        System.out.printf("%-15s %-15s %-15s %-15s %-15s%n", "CPF", "Nome", "Sobrenome", "Matricula", "Senha");
        for(AlunoModel aluno : alunos){
            System.out.printf("%-15s %-15s %-15s %-15s %-15s%n", aluno.getCPF(), aluno.getNome(), aluno.getsobreNome(), aluno.getMatricula(), aluno.getSenha());
        }
    }

}
