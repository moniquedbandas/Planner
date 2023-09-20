package planner.controller;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import planner.DAO.ExceptionMVC;
import planner.DAO.PessoaDAO;
import planner.model.Pessoa;
import planner.view.TelaAtividades;

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
            if (rs.next() ) {
                int codUsuario= rs.getInt("codUsuario");
                TelaAtividades telaAtiv = new TelaAtividades(codUsuario);
                telaAtiv.login(codUsuario);                             
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao autenticar usuário: " + e);
            return false;
        }
      
    }
    public boolean cadastraPessoa(String usuario, String senha) throws ExceptionMVC, SQLException {
        if(usuario != null && senha != null){
            int codigoUsuario = obterCodigoDoUsuario(usuario);
            Pessoa p = new Pessoa(usuario, senha);
            p.setCodUsuario(codigoUsuario);
            p.cadastraPessoa(p);
            return true;
        }
        return false;
    }
    public int obterCodigoDoUsuario(String usuario) throws ExceptionMVC, SQLException {
    // Chame o método no DAO para obter o código do usuário
    PessoaDAO pDAO = new PessoaDAO(); // Substitua 'PessoaDAO' pelo nome do seu DAO real
    int codigoUsuario = pDAO.obterCodigoDoUsuario(usuario);
    return codigoUsuario;
    }
    
}
