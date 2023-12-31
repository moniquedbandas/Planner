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
            String sql = "SELECT codUsuario FROM pessoa WHERE usuario = ? and senha = ?";
            PreparedStatement pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, p.getUsuario());
            pStatement.setString(2, p.getSenha());
            
            ResultSet rs = pStatement.executeQuery();
            return rs;
            
        }catch(SQLException e){            
            JOptionPane.showMessageDialog(null, "Erro ao logar o usuario: " + e);
            return null;
        }
    }
    
    public int obterCodigoDoUsuario(String usuario) throws SQLException, ExceptionMVC {
    int codigoUsuario = -1; //caso o usuário não seja encontrado
    Connection connection = null;
    PreparedStatement pStatement = null;
    
    try {
        connection = new ConnectionMVC().getConnection();
        String sql = "SELECT codUsuario FROM pessoa WHERE usuario=?";
        pStatement = connection.prepareStatement(sql);
        pStatement.setString(1, usuario);
        ResultSet rs = pStatement.executeQuery();

        if (rs.next()) {
            codigoUsuario = rs.getInt("codUsuario");
        }
    }catch (SQLException e) {
            throw new ExceptionMVC("Erro ao obter codigo do usuario: "+ e);
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
    return codigoUsuario;
    }
 }
    

