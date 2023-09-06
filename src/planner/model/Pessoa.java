package planner.model;

import planner.DAO.PessoaDAO;

public class Pessoa {
    
   private String usuario, senha;

    public Pessoa() {
    }

    public Pessoa(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

//    public Pessoa cadastraPessoa(Pessoa p) {
//       PessoaDAO pDAO = new PessoaDAO();
//       return pDAO.cadastraPessoa(p);
//    }
   
   
}
