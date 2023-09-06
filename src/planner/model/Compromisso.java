package planner.model;

import planner.DAO.CompromissoDAO;

public class Compromisso {
    
    private String descricao, dia, hora;

    public Compromisso() {
    }

    public Compromisso(String descricao, String dia, String hora) {
        this.descricao = descricao;
        this.dia = dia;
        this.hora = hora;
    }

    public String getCompromisso() {
        return descricao;
    }

    public void setCompromisso(String compromisso) {
        this.descricao = compromisso;
    }
    
    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void cadastraCompromisso(Compromisso c1) {
//       CompromissoDAO cDAO = new CompromissoDAO();
//       return cDAO.cadastraCompromisso(c1);
        new CompromissoDAO().cadastraCompromisso(c1);
    }
    
    
}
