package planner.controller;
import java.util.ArrayList;
import org.junit.Before;
import junit.framework.TestCase;
import org.junit.Test;
import planner.DAO.ExceptionMVC;
import planner.model.Compromisso;

public class TestControllerCompromisso extends TestCase{
    private ControllerCompromisso controller;

    @Before
    public void setUp() throws Exception{
        super.setUp();
        controller = new ControllerCompromisso();
    }
    @Test
    public void testCadadastraCompromisso() throws Exception {
        ControllerCompromisso controllerCompromisso = new ControllerCompromisso();
        String date = "16-09-202";
        String time = "19:0";
        String descricao = "Reuniao";

        boolean cadastro = controllerCompromisso.cadastraCompromisso(date, time, descricao);           
        assertTrue("O teste deveria ser cadastrado", cadastro);        
    }
    
    @Test
    public void testListaCompromisso() throws Exception {
        System.out.println("A lista esta aqui");
        ControllerCompromisso instance = new ControllerCompromisso();
//estou chamando o metodo compromisso da classe controllerCompromisso com o valor do codigo do usuario logado no momento 
        ArrayList<Compromisso> result = instance.listaCompromisso(1);
//e aqui verifica se a lista não está NULA
        assertNotNull(result);
//e aqui está verificando se a lista não está vazia no banco de dados 
        assertFalse(result.isEmpty());
//neste caso o teste FALHOU, porque eu deletei todos os compromissos do usuario 1 no banco!
    }
   
    @Test
    public void testExcluiCompromissoComCodZero() throws Exception{
       int codCompromisso = 0;
       try{
           boolean resultado = controller.excluirCompromisso(codCompromisso);
           assertFalse(resultado);                 
       } catch (ExceptionMVC e){
           fail("Exceção não esperada: " + e.getMessage());
       }
    }    
    
    @Test
    public void testExcluirCompromissoComCodigoNaoZero() {        
//aqui eu estou informado o codigo do compromisso que eu desejo excluir do banco de dados, tem que ser diferente de zero!
        int codCompromisso = 27; 
        try {
            boolean resultado = controller.excluirCompromisso(codCompromisso);
//se o codigo nao for zero, espera-se que o resultado seja true e o compromisso seja deletado!
            assertTrue(resultado); 
        } catch (ExceptionMVC e) {
            fail("Exceção não esperada: " + e.getMessage());
        }
    }
    
}

