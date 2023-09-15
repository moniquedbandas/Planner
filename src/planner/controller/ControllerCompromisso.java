package planner.controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import planner.DAO.CompromissoDAO;
import planner.DAO.ExceptionMVC;
import planner.model.Compromisso;

public class ControllerCompromisso {

    public boolean cadastraCompromisso(String data, String hora, String descricao) throws ExceptionMVC{
        if(data != null && data.matches("\\d{2}-\\d{2}-\\d{4}") && hora != null && hora.matches("\\d{2}:\\d{2}") && descricao != null){
           try{
            Compromisso c1 = new Compromisso(data, hora, descricao);
            c1.cadastraCompromisso(c1);
            return true;
        }catch (ExceptionMVC e) {  
               System.out.println("erro" + e);
            return false;
        }
    }return false;      
}   
    
    public boolean cadastrarTabelaCompromisso(ArrayList<Compromisso> compromissos) {
        try {
            CompromissoDAO cDAO = new CompromissoDAO();            
            for (Compromisso compromisso : compromissos) {
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
            JOptionPane.showMessageDialog(null, "Erro: " + e);
            return false;
        }
    }

    public ArrayList<Compromisso> listaCompromisso() throws ExceptionMVC {
        return new Compromisso().listaCompromisso();
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