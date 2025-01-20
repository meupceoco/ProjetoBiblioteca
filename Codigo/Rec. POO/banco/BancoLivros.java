package banco;

import java.sql.*;
import java.util.*;
import models.LivrosModel;
import view.LivroView;

public class BancoLivros { // Perfeito.
    
    LivrosModel model = new LivrosModel();
    LivroView view = new LivroView();

    public void cadastroLivros(LivrosModel livros){
        String sql = "INSERT INTO LIVROS (NOME) VALUES (?)";
        Connection conn = null;

        PreparedStatement ps;

        try {
            ps = Conector.getConexao(conn).prepareStatement(sql);
            ps.setString(1, livros.getTitulo());

            ps.execute();
            ps.close();

            System.out.println("Cadastro realizado com sucesso");
            
        } catch (Exception e) {
            System.out.println("Falha ao realizar o cadastro: " + e.getMessage());
        }
    }

    public ArrayList<LivrosModel> listarLivros(ArrayList<LivrosModel> livros){

        String sql = "SELECT * FROM LIVROS";
        Connection conn = null;

        PreparedStatement ps;

        try {
            ps = Conector.getConexao(conn).prepareStatement(sql);

            ResultSet resultSet = ps.executeQuery();
            
            while(resultSet.next()){
                Integer id = resultSet.getInt(1);
                String titulo = resultSet.getString(2);
                
                livros.add(new LivrosModel (id, titulo));
            }

        } catch (Exception e) {
            System.out.println("Falha ao listar os livros: " + e.getMessage());
        }
        return livros;
    }

    public void atualizarNome(){
        String sql = "UPDATE LIVROS SET NOME = ? WHERE ID = ?";
        Connection conn = null;

        PreparedStatement ps;

        try {
            ps = Conector.getConexao(conn).prepareStatement(sql);
            ps.setString(1, view.mudarNome());
            ps.setInt(2, view.buscaID());

            ps.execute();
            ps.close();

            System.out.println("Nome atualizado com sucesso");
            
        } catch (Exception e) {
            System.out.println("Falha ao atualizar o nome: " + e.getMessage());
        }
    }

    public void apagarLivro(){
        String sql = "DELETE FROM LIVROS WHERE ID = ?";
        Connection conn = null;

        PreparedStatement ps;

        try {
            ps = Conector.getConexao(conn).prepareStatement(sql);
            ps.setInt(1, view.buscaID());

            ps.execute();
            ps.close();

            System.out.println("Livro apagado com sucesso");
            
        } catch (Exception e) {
            System.out.println("Falha ao apagar o livro: " + e.getMessage());
        }
    }
}