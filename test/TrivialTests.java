import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import smellytrivial.Game;

public class TrivialTests {
    @Test
    public void true_is_true(){
        Assertions.assertTrue(true);
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

    @Test
    public void un_jugador(){
        Game game = new Game();
        game.agregar("Maria");
        boolean jugador = game.esJugable();
    }

    @Test
    public void al_menos_dos_jugadores(){
        Game game = new Game();
        game.agregar("Maria");
        game.agregar("Juan");
        boolean jugador = game.esJugable();
        Assertions.assertEquals(true, jugador);
    }


}
