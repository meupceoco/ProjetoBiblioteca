package banco;
import java.sql.*;
import java.util.*;
import models.ProfessorModel;
import view.ProfessorView;

public class BancoProfessor {
    
    ProfessorView view = new ProfessorView();

    public void cadastroProfessor(ProfessorModel Professor){

        String sql = "INSERT INTO Professor (CPF, SENHA, NOME, SOBRENOME, SIAPE) VALUES (?, ?, ?, ?, ?)";
        Connection conn = null;
        
        PreparedStatement ps;

        try {
            ps = Conector.getConexao(conn).prepareStatement(sql);
            ps.setString(3, Professor.getNome());
            ps.setString(4, Professor.getsobreNome());
            ps.setString(1, Professor.getCPF());
            ps.setString(2, Professor.getSenha());
            ps.setString(5, Professor.getSiape());

            ps.execute();
            ps.close();

            System.out.println("Cadastro realizado com sucesso");
            
        } catch (Exception e) {
            System.out.println("Falha ao realizar o cadastro: " + e.getMessage());
        }
    }
    
    public ArrayList<ProfessorModel> listarProfessores(ArrayList<ProfessorModel> Professores){

        String sql = "SELECT * FROM Professor";
        Connection conn = null;

        PreparedStatement ps;

        try {
            ps = Conector.getConexao(conn).prepareStatement(sql);

            ResultSet resultSet = ps.executeQuery();

            while(resultSet.next()){
                String nome = resultSet.getString(3);
                String sobreNome = resultSet.getString(4);
                String CPF = resultSet.getString(1);
                String senha = resultSet.getString(2);
                String siape = resultSet.getString(5);

                Professores.add(new ProfessorModel(nome, sobreNome, CPF, senha, siape));
            }

        } catch (Exception e) {
            System.out.println("Falha ao listar os Professores: " + e.getMessage());
        }
        return Professores;
    }

    public void atualizarProfessor(){
        String sql = "UPDATE Professor SET senha = ?, nome = ?, sobrenome = ?, siape = ? WHERE CPF = ?";
        Connection conn = null;

        PreparedStatement ps;

        try {
            ps = Conector.getConexao(conn).prepareStatement(sql);
            
            ps.setString(1, view.mudarSenha());
            ps.setString(2, view.atualizarNome());
            ps.setString(3, view.atualizarSobrenome());
            ps.setString(4, view.mudarSiape());
            ps.setString(5, view.buscaCPF());

            ps.execute();
            ps.close();

            System.out.println("Senha atualizada com sucesso");

        } catch (Exception e) {
            System.out.println("Falha ao atualizar a senha: " + e.getMessage());
        } //Mesma coisa da versão de aluno, provavelmente um id teria sido melhor mas é daquele jeitão
    }

    public void deletarProfessor(String CPF){
        String sql = "DELETE FROM Professor WHERE CPF = ?";
        Connection conn = null;

        PreparedStatement ps;

        try {
            ps = Conector.getConexao(conn).prepareStatement(sql);
            ps.setString(1, CPF);

            ps.execute();
            ps.close();

            System.out.println("Professor deletado com sucesso");

        } catch (Exception e) {
            System.out.println("Falha ao deletar o professor: " + e.getMessage());
        }
    }

    

}
