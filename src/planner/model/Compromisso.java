package planner.model;

public class Compromisso {
    
    private String compromisso, dia, hora;

    public Compromisso() {
    }

    public Compromisso(String compromisso, String dia, String hora) {
        this.compromisso = compromisso;
        this.dia = dia;
        this.hora = hora;
    }

    public String getCompromisso() {
        return compromisso;
    }

    public void setCompromisso(String compromisso) {
        this.compromisso = compromisso;
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
    
    
}
