package banco;
import java.sql.*;
import java.util.ArrayList;
import models.AlunoModel;
import view.AlunoView;
public class BancoAluno {

    // AlunoModel aluno = new AlunoModel();
    AlunoView view = new AlunoView();

    public void cadastroAluno(AlunoModel aluno){
        String sql = "INSERT INTO ALUNO (CPF, SENHA, NOME, SOBRENOME, MATRICULA) VALUES (?, ?, ?, ?, ?)";
        Connection conn = null;
    
        PreparedStatement ps;
           
        try {
            ps = Conector.getConexao(conn).prepareStatement(sql);
            ps.setString(3, aluno.getNome());
            ps.setString(4, aluno.getsobreNome());
            ps.setString(1, aluno.getCPF());
            ps.setString(2, aluno.getSenha());
            ps.setString(5, aluno.getMatricula());

            ps.execute();
            ps.close();

            System.out.println("Cadastro realizado com sucesso");
            
        } catch (Exception e) {
            System.out.println("Falha ao realizar o cadastro: " + e.getMessage());
        }} // Cadastrar Alunos

        public ArrayList<AlunoModel> listarAlunos(ArrayList<AlunoModel> alunos){

            String sql = "SELECT * FROM ALUNO";
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
                    String matricula = resultSet.getString(5);
                    
                    alunos.add(new AlunoModel (CPF, nome, sobreNome, matricula, senha));
                }

            } catch (Exception e) {
                System.out.println("Falha ao listar os alunos: " + e.getMessage());
            }
            return alunos;
        } // Listar Alunos

        public void atualizarSenha(){
            String sql = "UPDATE ALUNO SET SENHA = ? WHERE CPF = ?"; 
            Connection conn = null;

            PreparedStatement ps;

            try {
                ps = Conector.getConexao(conn).prepareStatement(sql);
                
                ps.setString(1, view.atualizarSenha());
                ps.setString(2, view.buscaCPF());
               
                ps.execute();
                ps.close();

                System.out.println("Atualização realizada com sucesso");

            } catch (Exception e) {
                System.out.println("Falha ao atualizar o aluno: " + e.getMessage());
            }
        } /*  Atualiza a senha, antes tava atualizando a matricula junto e de todos os alunos no banco (ops!) */

        public void deletarAluno(String CPF){
            String sql = "DELETE FROM ALUNO WHERE CPF = ?";
            Connection conn = null;

            PreparedStatement ps;

            try{
                ps = Conector.getConexao(conn).prepareStatement(sql);
                ps.setString(1, CPF);

                ps.execute();
                ps.close();
                                    // ele deleta o cpf!!!
                System.out.println("Aluno deletado com sucesso");

            } catch (Exception e) {
                System.out.println("Falha ao deletar o aluno: " + e.getMessage());
            }
        } // Deletar Aluno

}