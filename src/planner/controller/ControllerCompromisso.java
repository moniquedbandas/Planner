package planner.controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import planner.DAO.CompromissoDAO;
import planner.DAO.ExceptionMVC;
import planner.model.Compromisso;
import planner.view.TelaAtividades;

public class ControllerCompromisso {
    private int codUsuarioLogado; 
    public ControllerCompromisso(int codUsuarioLogado) {
        this.codUsuarioLogado = codUsuarioLogado; 
    }
     public ControllerCompromisso(){        
    }
    public boolean cadastraCompromisso(String data, String hora, String descricao) throws ExceptionMVC{
        if(data != null && data.matches("\\d{2}-\\d{2}-\\d{4}") && hora != null && hora.matches("\\d{2}:\\d{2}") && descricao != null){
           try{
            Compromisso compromisso = new Compromisso(data, hora, descricao);
            compromisso.setCodUsuario(codUsuarioLogado);
            compromisso.cadastraCompromisso(compromisso);
            return true;
        }catch (ExceptionMVC e) {  
               System.out.println("erro" + e);
            return false;
        }
    }return false;      
}    
    public boolean cadastrarTabelaCompromisso(ArrayList<Compromisso> compromissos, int codUsuarioLogado) {
    try {
        CompromissoDAO cDAO = new CompromissoDAO();            
        for (Compromisso compromisso : compromissos) {
            compromisso.setCodUsuario(codUsuarioLogado);
            boolean sucesso = cadastraCompromisso(                    
                compromisso.getData(),
                compromisso.getHora(),
                compromisso.getDescricao()
            );
            if (!sucesso) {                    
                return false;
            }
        }
        return true;
    } catch (ExceptionMVC e) {
        JOptionPane.showMessageDialog(null, "Erro de cadastro no controller: " + e);
        return false;
    }
}
    public ArrayList<Compromisso> listaCompromisso(int codUsuarioLogado) throws ExceptionMVC {
    //System.out.println("Método listaCompromisso (controller) chamado com o código de usuário: " + codUsuarioLogado);
    try {
        CompromissoDAO cDAO = new CompromissoDAO();
        return cDAO.listaCompromisso(codUsuarioLogado);
    } catch (ExceptionMVC e) {
        JOptionPane.showMessageDialog(null,"Errinho: " + e);
        return new ArrayList<>(); // Retorne um valor vazio ou trate o erro de acordo com sua lógica
    }
}    
    public boolean editarCompromissos(int codCompromisso, String descricao, String data, String hora) throws ExceptionMVC{
        if(descricao != null && data != null && hora != null){
            Compromisso c1 = new Compromisso(descricao, data, hora);
            c1.setCodCompromisso(codCompromisso);
            c1.editarCompromissos(c1);
            return true;
        }
        return false;
    }
    public boolean excluirCompromisso(int codCompromisso) throws ExceptionMVC{
        if (codCompromisso==0){
            return false;
        } else {
            Compromisso c1 = new Compromisso();
            c1.setCodCompromisso(codCompromisso);
            c1.excluirCompromisso(c1);
            return true;
        }
    }
}