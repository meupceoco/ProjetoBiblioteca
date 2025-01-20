package banco;
import java.sql.*;
import java.util.Scanner;
import view.AlunoView;
import view.LivroView;
import view.ProfessorView;


public class BancoEmprestimo{
    AlunoView view = new AlunoView();
    ProfessorView viewProfessor = new ProfessorView();
    LivroView viewLivro = new LivroView();
    Scanner scanner = new Scanner(System.in);
    
    public void emprestimoAluno(){
        String sql = "INSERT INTO EMPRESTIMOS (idlivro, cpfpessoa) VALUES (?, ?)";
        Connection conn = null;

        PreparedStatement ps;

        try {
            ps = Conector.getConexao(conn).prepareStatement(sql);
            ps.setInt(1, viewLivro.buscaID());
            ps.setString(2, view.buscaCPF());
            

            ps.execute();
            ps.close();

            System.out.println("Empréstimo realizado com sucesso");
            
        } catch (Exception e) {
            System.out.println("Falha ao realizar o empréstimo: " + e.getMessage());
        }
    }

    public void emprestimoProfessor(){
        String sql = "INSERT INTO EMPRESTIMOS (idlivro, cpfprofessor) VALUES (?, ?)";
        Connection conn = null;

        PreparedStatement ps;

        try {
            ps = Conector.getConexao(conn).prepareStatement(sql);
            ps.setInt(1, viewLivro.buscaID());
            ps.setString(2, viewProfessor.buscaCPF());
            
            ps.execute();
            ps.close();

            System.out.println("Empréstimo realizado com sucesso");
            
        } catch (Exception e) {
            System.out.println("Falha ao realizar o empréstimo: " + e.getMessage());
        }
    }

    public void devolucaoAluno(){
        String sql = "DELETE FROM EMPRESTIMOS WHERE idlivro = ? AND cpfpessoa = ?";
        Connection conn = null;

        PreparedStatement ps;

        try {
            ps = Conector.getConexao(conn).prepareStatement(sql);
            ps.setInt(1, viewLivro.buscaID());
            ps.setString(2, view.buscaCPF());
            

            ps.execute();
            ps.close();

            System.out.println("Devolução realizada com sucesso");
            
        } catch (Exception e) {
            System.out.println("Falha ao realizar a devolução: " + e.getMessage());
        }
    }

    public void devolucaoProfessor(){
        String sql = "DELETE FROM EMPRESTIMOS WHERE idlivro = ? AND cpfprofessor = ?";
        Connection conn = null;

        PreparedStatement ps;

        try {
            ps = Conector.getConexao(conn).prepareStatement(sql);
            ps.setInt(1, viewLivro.buscaID());
            ps.setString(2, view.buscaCPF());
            

            ps.execute();
            ps.close();

            System.out.println("Devolução realizada com sucesso");
            
        } catch (Exception e) {
            System.out.println("Falha ao realizar a devolução: " + e.getMessage());
        }
    }
            public void listarEmprestimos(){
            String sql = "SELECT * FROM EMPRESTIMOS";
            Connection conn = null;

            PreparedStatement ps;
            ResultSet rs;
            
            try {
                ps = Conector.getConexao(conn).prepareStatement(sql);
                rs = ps.executeQuery();
                
                while(rs.next()){
                    System.out.println("ID: " + rs.getInt("idlivro"));
                    
                    if(rs.getString("cpfpessoa") != null){
                        System.out.println("CPF: " + rs.getString("cpfpessoa"));
                    } else {
                        System.out.println("CPF: " + rs.getString("cpfprofessor"));
                    }
                    System.out.println("");
                }
                
                ps.close();
                rs.close();
                
            } catch (Exception e) {
                System.out.println("Falha ao listar empréstimos: " + e.getMessage());
            }
}}
