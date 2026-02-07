import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UsuarioTest {
    Usuario usuario = new Usuario("Gabriel", 21);

    @Test
    public void testDadosUsuario() {
        assertEquals("Gabriel", usuario.getNome());
        assertEquals(21, usuario.getIdade());
    }
}
