import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MainTest {

    @ParameterizedTest
    @CsvSource(value = {
            "14325678, A, true",
            "54444444, B, true",
            "12345678, C, false",
            "13333331, D, true",
            "22222122, E, false",
            "5453545, F, false",   // Error: Menos de 8 numeros
            "21343244, G, false", // Error: Más de 8 numeros
            "abcdef17, H, false",  // Error: Contiene letras
            "13, D, false"         // Error: Demasiado corto
    })
    void testComprobarDNI(String dni, char letra, boolean esperado) {
        assertEquals(esperado, Main.comprobarDNI(dni, letra));
    }

    @ParameterizedTest
    @CsvSource({
            "87654321, A",
            "22222222, B",
            "88888888, C",
            "55555555, D",
            "11111111, E"
    })
    void testCalcularLetraDNI(String dni, char letraEsperada) {
        assertEquals(letraEsperada, Main.calcularLetraDNI(dni));
    }
}

