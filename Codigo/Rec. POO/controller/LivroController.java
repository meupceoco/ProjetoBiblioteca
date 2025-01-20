package controller;

import banco.BancoLivros;
import java.util.*;
import models.LivrosModel;
import view.LivroView;

public class LivroController implements ICrud {
    
    LivroView view = new LivroView();
    BancoLivros banco = new BancoLivros();
    LivrosModel model = new LivrosModel();

    @Override
    public void criar() {
        view.cadastrarLivro(model);
        banco.cadastroLivros(model);
    }

    @Override
    public void ler() {
        ArrayList<LivrosModel> livros = new ArrayList<>();
        banco.listarLivros(livros);
        view.listarLivros(livros);
    }

    @Override
    public void editar() {
       
        try {
            banco.atualizarNome();
        } catch (Exception e) {
            System.out.println("");
        }
    }

    @Override
    public void remover() {
        view.apagarLivro();
        banco.apagarLivro();
    }   
}
