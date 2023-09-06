package planner.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import planner.model.Pessoa;

public class PessoaDAO {
    Connection connection;
    
    public void cadastraPessoa(Pessoa p) throws ExceptionMVC{
        String sql = "INSERT INTO pessoa (usuario, senha) VALUES (?,?)";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try {
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, p.getUsuario());
            pStatement.setString(2, p.getSenha());            
            pStatement.execute();
            
        } catch (Exception e) {
            throw new ExceptionMVC("Erro ao cadastrar usuario: "+ e);
        } finally {
            try{
                if(pStatement != null){
                    pStatement.close();
                } 
            }catch(SQLException e){
              throw new ExceptionMVC("Erro ao fechar statement: "+ e);
            } try {
                if(connection != null){
                    connection.close();
                }
            }catch(SQLException e){
               throw new ExceptionMVC("Erro ao fechar a conexao: "+ e);
            }
        }
    }
        
    public ResultSet autenticarPessoa(Pessoa p) {
        connection = new ConnectionMVC().getConnection();
        
        try{
            String sql = "SELECT * FROM pessoa WHERE usuario = ? and senha = ?";
            PreparedStatement pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, p.getUsuario());
            pStatement.setString(2, p.getSenha());
            
            ResultSet rs = pStatement.executeQuery();
            return rs;
            
        }catch(SQLException e){
            //throw new ExceptionMVC("Erro ao logar o usuario: "+ e);
            JOptionPane.showMessageDialog(null, "Usuario: " + e);
            return null;
        }
    }

 }
    

