package planner.model;

import java.util.ArrayList;
import planner.DAO.CompromissoDAO;

public class Compromisso {
    
    private String descricao, data, hora;

    public Compromisso() {
    }

    public Compromisso(String descricao, String data, String hora) {
        this.descricao = descricao;
        this.data = data;
        this.hora = hora;
    }

    public String getCompromisso() {
        return descricao;
    }
    public void setCompromisso(String compromisso) {
        this.descricao = compromisso;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }

    public void cadastraCompromisso(Compromisso c1) throws Exception{
        new CompromissoDAO().cadastraCompromisso(c1);        
    }
    public ArrayList<Compromisso> listaCompromisso() throws Exception{
       return new CompromissoDAO().listaCompromisso();
    }

    public void editarCompromissos(Compromisso c1) throws Exception{
        new CompromissoDAO().editarCompromissos(c1);
    }

    
    
    
    
}
