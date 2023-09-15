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
    public void testCadadastraCompromissos() throws Exception {
        ControllerCompromisso controllerCompromisso = new ControllerCompromisso();
        String date = "16-09-2023";
        String time = "19:00";
        String descricao = "Reuniao";

        boolean cadastro = controllerCompromisso.cadastraCompromisso(date, time, descricao);           
        assertTrue("O teste deve ser cadastrado", cadastro);
        
    }
    @Test
    public void testListaCompromisso() throws Exception {
        System.out.println("A lista esta aqui");
           ControllerCompromisso instance = new ControllerCompromisso();
           // Chame o método listaCompromisso
           ArrayList<Compromisso> result = instance.listaCompromisso();
           // Verifica se a lista não é nula
           assertNotNull(result);
           // Verifica se a lista não está vazia
           assertFalse(result.isEmpty());
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
        int codCompromisso = 0; // Substitua 1 pelo código que deseja testar
        try {
            boolean resultado = controller.excluirCompromisso(codCompromisso);
            assertTrue(resultado); // Espera-se que o resultado seja verdadeiro quando o código não for zero
        } catch (ExceptionMVC e) {
            fail("Exceção não esperada: " + e.getMessage());
        }
    }
    
}

