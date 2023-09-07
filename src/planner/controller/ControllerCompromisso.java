package planner.controller;

import java.util.ArrayList;
import planner.DAO.CompromissoDAO;
import planner.model.Compromisso;

public class ControllerCompromisso {
    
//    public boolean cadastraCompromisso(String descricao, String data, String hora) throws Exception{
//        if(descricao != null && data != null && hora != null){
//            Compromisso c1 = new Compromisso(descricao, data, hora);
//            return c1.cadastraCompromisso(c1);
//        }else{
//        return null;
//        }
//    }
    public boolean cadastraCompromisso(String descricao, String data, String hora) throws Exception{
        if(descricao != null && data != null && hora != null){
            Compromisso c1 = new Compromisso(descricao, data, hora);
            c1.cadastraCompromisso(c1);
            return true;
    }
        return false;      
    }
    
    public boolean cadastrarTabelaCompromisso(ArrayList<Compromisso> compromissos) {
        try {
            CompromissoDAO cDAO = new CompromissoDAO();            
            for (Compromisso compromisso : compromissos) {
                boolean sucesso = cadastraCompromisso(
                    compromisso.getCompromisso(),
                    compromisso.getData(),
                    compromisso.getHora()
                );
                if (!sucesso) {                    
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            
            return false;
        }
    }

}