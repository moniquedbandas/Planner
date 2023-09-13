package planner.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.fail;
import org.junit.Before;
import org.junit.Test;
import planner.model.Compromisso;

public class CompromissoDAOTest {
    CompromissoDAO cDAO = new CompromissoDAO();
    public CompromissoDAOTest() {
    }    
    @Test
    public void testListaCompromisso() throws Exception {
        System.out.println("listaCompromisso");
           CompromissoDAO instance = new CompromissoDAO();
           // Chame o método listaCompromisso
           ArrayList<Compromisso> result = instance.listaCompromisso();
           // Verifique se a lista não é nula
           assertNotNull(result);
           // Verifique se a lista não está vazia
           assertFalse(result.isEmpty());
    }      
    @Before
    public void setUp() {
        // Inicialize o seu DAO aqui, por exemplo:
        cDAO = new CompromissoDAO();
    }
    @Test
    public void testCadastraCompromissoCerto() throws Exception {
        System.out.println("Teste de cadastro de compromisso com valores corretos");
        // Criar compromisso com valores certinhos
        Compromisso compromisso = new Compromisso();
        compromisso.setData("15-09-2023");
        compromisso.setHora("15:0");
        compromisso.setDescricao("");   

        try {
            //Chamando o método cadastraCompromisso
            cDAO.cadastraCompromisso(compromisso);
        } catch (ExceptionMVC e) {
            // Se lançar a exceção, o teste falha
            fail("O método lançou uma exceção inesperada: " + e.getMessage());
        }
    }
    
    @Test
    public void testCadastraCompromissoComValoresInvalidos() throws ExceptionMVC {
        System.out.println("Teste de cadastro de compromisso com valores inválidos");

        // Crie um objeto Compromisso com valores inválidos
        Compromisso compromisso = new Compromisso();
        compromisso.setData("15-09-202");
        compromisso.setHora("15:0");
        compromisso.setDescricao("");

        try {
            // Chame o método cadastraCompromisso
            cDAO.cadastraCompromisso(compromisso);

            // Se o método não lançar uma exceção, o teste falha
           fail("Esperava-se que uma exceção do tipo ExceptionMVC fosse lançada, mas não foi.");
        } catch (ExceptionMVC e) {
            // Se o método lançar uma exceção, o teste passa
            // Você pode adicionar verificações adicionais se necessário
        }
    }
}

