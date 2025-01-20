package models;
public class LivrosModel {
    
    protected Integer id;
    protected String titulo;
    
    public LivrosModel(){} // Construtor

    public LivrosModel(Integer id, String titulo){
        this.id = id;
        this.titulo = titulo;
    }

    // Get/Set Id
    
    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    // Get/Set Titulo

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    /* Get/Set Data de Emprestimo

    public LocalDate getDataEmprestimo(){
        return dataEmprestimo;
    }
    
    public void setDataEmprestimo(LocalDate dataEmprestimo){
        this.dataEmprestimo = dataEmprestimo;
    }

    // Get/Set Data de Devolucao

    public LocalDate getDataDevolucao(){
        return dataDevolucao;
    }

    public void setdataDevolucao(LocalDate dataDevolucao){
        this.dataDevolucao = dataDevolucao;
    } */
}
