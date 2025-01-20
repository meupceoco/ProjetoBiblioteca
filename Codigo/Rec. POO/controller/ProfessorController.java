package controller;

import java.util.*;
import models.ProfessorModel;
import view.ProfessorView;
import banco.BancoProfessor;

public class ProfessorController implements ICrud {

    ProfessorView view = new ProfessorView();
    BancoProfessor banco = new BancoProfessor();

    @Override
    public void criar(){
        ProfessorModel model = new ProfessorModel();
        view.cadastroProfessor(model);
        banco.cadastroProfessor(model);

    }

    @Override
    public void ler(){
        ArrayList<ProfessorModel> professores = new ArrayList<>();
        banco.listarProfessores(professores);
        view.listaProfessor(professores);
    }

    @Override
    public void editar(){
  
        try {
            banco.atualizarProfessor();
        } catch (Exception e) {
            System.out.println("");
        }
    }

    @Override
    public void remover(){
        String CPF = view.apagarProfessor();
        banco.deletarProfessor(CPF);
    }
}
