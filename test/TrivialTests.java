import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import smellytrivial.Game;

public class TrivialTests {
    @Test
    public void true_is_true(){
        Assertions.assertTrue(false);
    }

    @Test
    public void crear_Game(){
        Game trivial = new Game();
    }

    @Test
    public void si_al_principio_saco_un_1_voy_a_casilla_1(){
        Game jugador = new Game();
        jugador.agregar("Maria");
        jugador.agregar("Juan");
        jugador.tirarDado(1);
        String expected = "La nueva posición de Maria es 1";
        String actual = jugador.nuevaPosicionJugador();
        Assertions.assertEquals(expected,actual);
    }
}
