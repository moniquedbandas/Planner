package planner.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import planner.model.Compromisso;

public class CompromissoDAO {

    public void cadastraCompromisso(Compromisso c1) throws ExceptionMVC {
        String sql = "INSERT INTO compromisso (data, hora,descricao ) VALUES (?,?,?)";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try{
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, c1.getData());
            pStatement.setString(2, c1.getHora());
            pStatement.setString(3, c1.getDescricao());
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

    public ArrayList<Compromisso> listaCompromisso() throws ExceptionMVC{        
    String sql = "SELECT * FROM compromisso ORDER BY data ";
    //String sql = "SELECT * FROM compromisso WHERE codPessoa =? ORDER BY data ";
        Connection connection = null;
        PreparedStatement pStatement = null;
        ArrayList<Compromisso> compromissos = null;   
         
         try{
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            ResultSet rs = pStatement.executeQuery(sql);            
            if(rs!=null){
                  compromissos = new ArrayList<Compromisso>();
                  while(rs.next()){
                      Compromisso compromisso = new Compromisso();
                      compromisso.setCodCompromisso(rs.getInt("codCompromisso"));                                            
                      compromisso.setData(rs.getString("data"));
                      compromisso.setHora(rs.getString("hora"));  
                      compromisso.setDescricao(rs.getString("descricao")); 
                      compromissos.add(compromisso);                                         
                }
            }
         } catch(SQLException e){
            throw new ExceptionMVC("Erro ao consultar compromisso: "+ e);
        }finally{
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
        }return compromissos;
    }

    public void editarCompromissos(Compromisso c1) throws ExceptionMVC {
        String sql = "UPDATE compromisso SET data=?, hora=?, descricao=? WHERE codCompromisso =?";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try{
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);            
            pStatement.setString(1, c1.getData());
            pStatement.setString(2, c1.getHora());
            pStatement.setString(3, c1.getDescricao());
            pStatement.setInt(4, c1.getCodCompromisso());
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
