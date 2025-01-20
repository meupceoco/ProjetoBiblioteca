package models;

public abstract class UsuarioModel{

    protected String CPF;
    protected String senha;
    protected String nome;
    protected String sobreNome;
    protected int nEmprestimos;

    public UsuarioModel(){
    } // Construtor

    public UsuarioModel (String CPF, String senha, String nome, String sobreNome, int nEmprestimos){
        this.CPF = CPF;
        this.senha = senha;
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.nEmprestimos = 0;
    }

    // Get/Set CPF
    public String getCPF(){
        return CPF; // getter CPF
    }

    public void setCPF (String CPF){
        this.CPF = CPF; //setter CPF
    }

    // Get/Set Senha
    public String getSenha(){
        return senha; // getter senha
    }

    public void setSenha(String senha){
        this.senha = senha; //setter senha
    }

    // Get/Set Nome
    public String getNome(){
        return nome; // getter nome
    }

    public void setNome(String nome){
        this.nome = nome; //setter nome
    }

    // Get/Set SobreNome
    public String getsobreNome(){
        return sobreNome; // getter nome
    }

    public void setsobreNome(String sobreNome){
        this.sobreNome = sobreNome; //setter nome
    }

    // Get/Set nEmprestimos

    public int getnEmprestimos(){
        return nEmprestimos; // getter nEmprestimos
    }

    public void setnEmprestimos(int nEmprestimos){
        this.nEmprestimos = nEmprestimos; //setter nEmprestimos
    }

}