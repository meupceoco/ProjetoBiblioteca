package controller;

import banco.BancoAluno;
import java.util.*;
import models.AlunoModel;
import view.AlunoView;


public class AlunoController implements ICrud{

    AlunoView view = new AlunoView();
    BancoAluno banco = new BancoAluno();
    AlunoModel model = new AlunoModel();

    @Override
    public void criar() {
        view.cadastrarAluno(model);
        banco.cadastroAluno(model);
    }

    @Override
    public void ler() {
        ArrayList<AlunoModel> alunos = new ArrayList<>();
        banco.listarAlunos(alunos);
        view.listarAlunos(alunos);
    }

    @Override
    public void editar() {
        
        try {
            banco.atualizarSenha();
        } catch (Exception e) {
            System.out.println("");
        }
    }

    @Override
    public void remover() {
        String CPF = view.apagarAluno();
        banco.deletarAluno(CPF);
    }
}
