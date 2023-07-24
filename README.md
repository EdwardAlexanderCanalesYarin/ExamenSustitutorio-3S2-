# ExamenSustitutorio-3S2-
Pregunta 1
Requisito 1: colocación de piezas 
Creo la clase TestColocacionDePiezas, luego:
- El primer test es llamado ColacarEnElTableroDeFormaInvalidaEnELEjeX (Prueba: límites del tablero I) donde se espera una excepcion en caso se coloca la pieza fuera del tablero en el eje X.
- El segundo test es llamado ColacarEnElTableroDeFormaInvalidaEnELEjeY (Prueba: límites del tablero II) donde se espera una excepcion en caso se coloca la pieza fuera del tablero en el eje Y.
- El tercer test es llamado ColacarEnElTableroDeFormaInvalidaEnUnaCasillaOcupada (Prueba: lugar ocupado) donde se espera una excepcion en caso se coloca la pieza en una casilla ocupada.

// CODIGO de la clase TestColocacionDePiezas
```
import org.example.TicTacToe;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

// Requisito 1: colocación de piezas
public class TestColocacionDePiezas {
    private TicTacToe ticTacToe;
    @Before
    public void setUp() throws Exception {
        ticTacToe = new TicTacToe();
    }
    // Prueba: límites del tablero I
    @Test
    public void ColacarEnElTableroDeFormaInvalidaEnELEjeX(){
        try {
            assertEquals("", ticTacToe.jugar(5,2), 0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    // Prueba: límites del tablero II
    @Test
    public void ColacarEnElTableroDeFormaInvalidaEnELEjeY(){
        try {
            assertEquals("", ticTacToe.jugar(2,5), 0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    // Prueba: lugar ocupado
    @Test
    public void ColacarEnElTableroDeFormaInvalidaEnUnaCasillaOcupada(){
        ticTacToe.HacerMovimiento(2,2);
        try {
            assertEquals("", ticTacToe.jugar(2,2), 0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
```
