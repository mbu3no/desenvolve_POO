import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AutorTest {
    Autor autor = new Autor("Alan Turing", "Inglês");

    @Test
    public void testDadosAutor() {
        assertEquals("Alan Turing", autor.getNome());
        assertEquals("Inglês", autor.getNacionalidade());
    }
}
