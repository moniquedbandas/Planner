
import java.sql.Connection;
import planner.DAO.CompromissoDAO;
import planner.DAO.ConnectionMVC;
import planner.model.Compromisso;

//package planner.testes;
//import org.junit.Before;
//import org.junit.Test;
//import java.util.ArrayList;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//import planner.controller.ControllerCompromisso;
//import planner.model.Compromisso;
//
//public class ControllerCompromissoTest {
//    private ControllerCompromisso controller;
//
//    @Before
//    public void setUp() {
//        controller = new ControllerCompromisso();
//    }
//
//    @Test
//    public void testEditarCompromissos() throws Exception {
//        // Crie um compromisso de teste
//        String data = "2023-09-15";
//        String hora = "14:00";
//        String descricao = "Reunião";
//        boolean sucessoCadastro = controller.cadastraCompromisso(data, hora, descricao);
//        assertTrue(sucessoCadastro);
//
//        // Edite o compromisso
//        int codCompromisso = 1; // Supondo que o primeiro compromisso tenha o código 1
//        String novaDescricao = "Treinamento";
//        String novaData = "2023-09-16";
//        String novaHora = "15:00";
//        boolean sucessoEdicao = controller.editarCompromissos(codCompromisso, novaDescricao, novaData, novaHora);
//        assertTrue(sucessoEdicao);
//
//        // Obtenha o compromisso atualizado
//        ArrayList<Compromisso> compromissos = controller.listaCompromisso();
//        Compromisso compromissoAtualizado = compromissos.get(0); // Supondo que seja o primeiro compromisso
//
//        // Verifique se os dados foram atualizados corretamente
//        assertEquals(novaDescricao, compromissoAtualizado.getDescricao());
//        assertEquals(novaData, compromissoAtualizado.getData());
//        assertEquals(novaHora, compromissoAtualizado.getHora());
//    }
//}

public class CompromissoTeste{
    public static void main(String[] args) {
        testListaCompromisso();
    }

    private static void testListaCompromisso() {
        CompromissoDAO cDAO = new CompromissoDAO();
        
        try {
           Connection connection = new ConnectionMVC().getConnection();
           
        } catch (Exception e) {
        }
    }

  
}
