package controller;

import banco.BancoEmprestimo;
import view.EmprestimoView;

public class EmprestimoController {
    

    EmprestimoView viewEmprestimo = new EmprestimoView();
    BancoEmprestimo bancoEmprestimo = new BancoEmprestimo();

    public void emprestarAluno(){
        viewEmprestimo.emprestarAluno();
        bancoEmprestimo.emprestimoAluno();
    }

    public void devolverAluno(){
        viewEmprestimo.devolverAluno();
        bancoEmprestimo.devolucaoAluno();
    }

    public void emprestarProfessor(){
        viewEmprestimo.emprestarAluno();
        bancoEmprestimo.emprestimoAluno();
    }

    public void devolverProfessor(){
        viewEmprestimo.devolverProfessor();
        bancoEmprestimo.devolucaoProfessor();
    }

    public void listarEmprestimos(){
        
        try {
            bancoEmprestimo.listarEmprestimos();
        } catch (Exception e) {
            System.out.println("");
        }
    }
}
