package planner.controller;

import java.util.ArrayList;
import planner.DAO.ExceptionMVC;
import planner.model.Compromisso;

public class TestControllerCompr {
    private static void testCadastraCompromisso() throws ExceptionMVC {
        ControllerCompromisso controllerCompromisso = new ControllerCompromisso();
//declaro as variáveis corretas conforme está feito no meu controller
//agora declaro as variaveis de forma errada para ver se vai ocorrer o cadastro
        String date = "16-09-203";
        String time = "19:0";
        String descricao = "Reuniao";
//crio uma variavel boolean para me dizer se o cadastro foi realizado com sucesso conforme minhas formatações feitas no controller
        boolean cadastro = controllerCompromisso.cadastraCompromisso(date, time, descricao);           
        System.out.println("Compromisso cadastrado com sucesso? " + cadastro);
    }
    
    private static void testListaCompromisso() throws ExceptionMVC{
       ControllerCompromisso controllerCompromisso = new ControllerCompromisso();
//aqui estou chamando o metodo da classe compromisso já com o codigo do usuario que está logado 
       ArrayList<Compromisso> compromissos = controllerCompromisso.listaCompromisso(1);
//depois fiz um if/else para ver se o tamanho da lista for diferente de zero, ou seja, se ela nao esta vazia, se nao estiver vazia
//vai mostrar o texto que fiz no print e o numero de compromissos salvos no banco!
//se a lista estiver vazia, vai aparecer a mensagem lista vazia.
       if(compromissos.size() != 0){
           System.out.println("A lista do usuario 1 esta aqui e a quantidade de compromissos é essa: --> " + compromissos.size()); 
       }else {
           System.out.println("Lista vazia!!!!");
       }     
    }
    
    private static void testExcluiCompromisso() throws ExceptionMVC{
        ControllerCompromisso controllerCompromisso = new ControllerCompromisso();
//informo o codigo de compromisso que desejo excluir, diferente de zero nesse caso   
//se eu colocar zero, ele vai mostrar o resultado como false
        int codCompromisso = 29 ;
//crio uma variavel boolean para me dizer se o resultado do meu metodo excluircompromisso é verdadeiro ou falso        
        boolean resultado = controllerCompromisso.excluirCompromisso(codCompromisso);
        System.out.println("Compromisso " + codCompromisso + " deletado com sucesso? Sim(true) ou Nao(false)? " + resultado);
    }
    
    public static void main(String[] args) throws ExceptionMVC {
            testCadastraCompromisso();
            //testListaCompromisso();
            //testExcluiCompromisso();
    }

    
}
