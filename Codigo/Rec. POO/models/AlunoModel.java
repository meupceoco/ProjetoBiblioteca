package models;

public class AlunoModel extends UsuarioModel{

    protected String matricula;
    
    public AlunoModel(){} // Construtor

    public AlunoModel(String matricula, String CPF, String senha, String nome, String sobreNome){
        this.matricula = matricula;
        this.nEmprestimos = 3;
    }

    // Get/Set Matricula
    
    public String getMatricula(){
        return matricula; // getter matricula
    }

    public void setMatricula(String matricula){
        this.matricula = matricula; //setter matricula
    }
}