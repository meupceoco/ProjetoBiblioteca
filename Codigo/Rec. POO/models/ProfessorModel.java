package models;

public class ProfessorModel extends UsuarioModel{

    protected String siape;

    public ProfessorModel(){} // Construtor

    public ProfessorModel(String siape, String CPF, String senha, String nome, String sobreNome){
        this.siape = siape;
        this.nEmprestimos = 5;
    }

    // Get/set Siape
    public String getSiape(){
        return siape;
    }

    public void setSiape(String siape){
        this.siape = siape;
    }

    
}
