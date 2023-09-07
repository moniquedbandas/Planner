package planner.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import planner.model.Compromisso;

public class CompromissoDAO {

//    public Compromisso cadastraCompromisso(Compromisso c1) {
//        return c1;
//    }
//    public void cadastraCompromisso(Compromisso c1) {
//        
//    }
    public void cadastraCompromisso(Compromisso c1) throws ExceptionMVC {
        String sql = "INSERT INTO compromisso (descricao, data, hora ) VALUE (?,?,?)";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try{
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, c1.getCompromisso());
            pStatement.setString(2, c1.getData());
            pStatement.setString(3, c1.getHora());
            pStatement.execute();
            
        } catch(SQLException e){
            throw new ExceptionMVC("Erro ao cadastrar compromissos: "+ e);
        } finally{            
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

       
}
