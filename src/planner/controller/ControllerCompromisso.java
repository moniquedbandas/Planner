package planner.controller;

import planner.model.Compromisso;

public class ControllerCompromisso {
    
//    public Compromisso cadastraCompromisso(String descricao, String data, String hora){
//        if(descricao != null && data != null && hora != null){
//            Compromisso c1 = new Compromisso(descricao, data, hora);
//            return c1.cadastraCompromisso(c1);
//        }else{
//        return null;
//        }
//    }
    public boolean cadastraCompromisso(String descricao, String data, String hora){
        if(descricao != null && data != null && hora != null){
            Compromisso c1 = new Compromisso(descricao, data, hora);
            c1.cadastraCompromisso(c1);
            return true;
    }
        return false;      
    }
}