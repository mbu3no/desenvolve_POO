import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LivroTest {
    Autor autor = new Autor("Jess", "Brasileira");
    Livro livro1 = new Livro("Java Basico", autor, "tecnologia", true);
    Livro livro2 = new Livro("Java Avançado", autor, "tecnologia", false);

    @Test
    public void testGettersLivro() {
        assertEquals("Java Basico", livro1.getTitulo());
        assertEquals(autor, livro1.getAutor());
        assertEquals("tecnologia", livro1.getGenero());
    }

    @Test
    public void testDisponibilidade() {
        assertTrue(livro1.isDisponivel());
        assertFalse(livro2.isDisponivel());
    }
}
