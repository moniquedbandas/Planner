package planner.model;

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
//       CompromissoDAO cDAO = new CompromissoDAO();
//       return cDAO.cadastraCompromisso(c1);
        new CompromissoDAO().cadastraCompromisso(c1);        
    }
    
    
}
