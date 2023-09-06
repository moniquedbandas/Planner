package planner.controller;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import planner.DAO.PessoaDAO;
import planner.model.Pessoa;

public class ControllerPessoa {
    
    private PessoaDAO pDAO;
    
    public ControllerPessoa(){
        pDAO = new PessoaDAO();
    }
    public boolean autenticaPessoa(String usuario, String senha){
        Pessoa p = new Pessoa();
        p.setUsuario(usuario);
        p.setSenha(senha);
        
        ResultSet rs = pDAO.autenticarPessoa(p);
         try {
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao autenticar usuário: " + e);
            return false;
        }
        
    }
//    public Pessoa cadastraPessoa(String usuario, String senha){
//        if(usuario != null && senha != null){
//            Pessoa p = new Pessoa(usuario, senha);
//            return p.cadastraPessoa(p);
//        }else{
//            return null;
//        }
//    }
    
}
