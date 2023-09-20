package planner.model;

import java.util.ArrayList;
import planner.DAO.CompromissoDAO;
import planner.DAO.ExceptionMVC;

public class Compromisso {
    private int codUsuarioLogado;
    private String descricao, data, hora;
    private int codCompromisso;
    private int codUsuario;

    public Compromisso() {
    }

    public Compromisso(String data, String hora,String descricao) {
        this.descricao = descricao;
        this.data = data;
        this.hora = hora;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getCodCompromisso() {
        return codCompromisso;
    }
    public void setCodCompromisso(int codCompromisso) {
        this.codCompromisso = codCompromisso;
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
    
    public void setCodUsuario(int codUsuarioLogado) {   
        this.codUsuario = codUsuarioLogado;
    }
    public int getCodUsuario() {
        return codUsuario;
    }

    public void cadastraCompromisso(Compromisso compromisso) throws ExceptionMVC{
        new CompromissoDAO().cadastraCompromisso(compromisso);        
    }
    public ArrayList<Compromisso> listaCompromisso(int codUsuario) throws ExceptionMVC{
        System.out.println("o valor do codigo no model: " + codUsuarioLogado);
        return new CompromissoDAO().listaCompromisso(codUsuario);
    }

    public void editarCompromissos(Compromisso c1) throws ExceptionMVC{
        new CompromissoDAO().editarCompromissos(c1);
    }

    public void excluirCompromisso(Compromisso c1) throws ExceptionMVC {
        new CompromissoDAO().excluirCompromisso(c1);
    }
}
