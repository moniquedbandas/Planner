package planner.controller;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class ControllerCompromissoTest {
       private ControllerCompromisso controller;

    @Before
    public void setUp() {
        controller = new ControllerCompromisso();
    }
    @Test
    public void testCadadastraCompromissos() throws Exception {
        // Arrange
        ControllerCompromisso controller = new ControllerCompromisso();
        String date = "16-09-2023";
        String time = "15:00";
        String descricao = "Reuniao";

        // Act
        boolean cadastro = controller.cadastraCompromisso(date, time, descricao);

        // Assert
        boolean cadastroEsperado = controller.cadastraCompromisso("15-09-2023", "14:00", "Reuniao");
        assertEquals(cadastroEsperado, cadastro);
        
//        boolean cadastro = controller.cadastraCompromisso("16-09-2023", "14:0", "Reuniao");
//        boolean cadastroEsperado = controller.cadastraCompromisso("15-09-2023", "14:00", "Reuniao");
//        
//        // Use assertEquals to check if the actual result matches the expected result.
//        //assertEquals(cadastroEsperado, cadastro);
//        if (cadastro==cadastroEsperado){
//            System.out.println("ok");
//        }else{
//            System.out.println("nao ok");
//        }
    }
}

