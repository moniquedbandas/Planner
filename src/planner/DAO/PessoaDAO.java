package planner.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import planner.model.Pessoa;

public class PessoaDAO {
    Connection connection;
    
    
    
    
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
    

