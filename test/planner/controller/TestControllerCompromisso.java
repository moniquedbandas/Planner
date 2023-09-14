package planner.controller;
import java.util.ArrayList;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertNotNull;
import org.junit.Before;
import static junit.framework.Assert.assertTrue;
import junit.framework.TestCase;
import org.junit.Test;
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
        // Arrange
        ControllerCompromisso controllerCompromisso = new ControllerCompromisso();
        String date = "16-09-2023";
        String time = "19:00";
        String descricao = "Reuniao";
        // Act
        boolean cadastro = controllerCompromisso.cadastraCompromisso(date, time, descricao);
        // Assert
        //boolean cadastroEsperado = controllerCompromisso.cadastraCompromisso("15-09-2023", "14:00", "Reuniao");
        //assertSame(cadastroEsperado, cadastro);  
        assertTrue("O teste deve ser cadastrado", cadastro);
        
    }
//    @Test
//    public void testListaCompromisso() throws Exception {
//        System.out.println("A lista esta aqui");
//           ControllerCompromisso instance = new ControllerCompromisso();
//           // Chame o método listaCompromisso
//           ArrayList<Compromisso> result = instance.listaCompromisso();
//           // Verifica se a lista não é nula
//           assertNotNull(result);
//           // Verifica se a lista não está vazia
//           assertFalse(result.isEmpty());
//    }    
}

