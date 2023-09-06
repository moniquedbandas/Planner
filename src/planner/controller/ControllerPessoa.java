package planner.controller;
import planner.model.Pessoa;
public class ControllerPessoa {
    
    public Pessoa cadastraPessoa(String usuario, String senha){
        if(usuario != null && senha != null){
            Pessoa p = new Pessoa(usuario, senha);
            return p.cadastraPessoa(p);
        }else{
            return null;
        }
    }
    
}
