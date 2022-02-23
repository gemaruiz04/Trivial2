import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import smellytrivial.Game;

public class TrivialTests {

    @Test
    public void crear_Game() {
        Game trivial = new Game();
    }

    @Test
    public void si_al_principio_saco_un_1_voy_a_casilla_1() {
        Game jugador = new Game();
        jugador.agregar("Maria");
        jugador.agregar("Juan");
        jugador.tirarDado(1);
        String expected = "La nueva posición de Maria es 1";
        String actual = jugador.nuevaPosicionJugador();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void un_jugador() {
        Game game = new Game();
        game.agregar("Maria");
        boolean jugador = game.esJugable();
        Assertions.assertEquals(false, jugador);
    }

    @Test
    public void al_menos_dos_jugadores() {
        Game game = new Game();
        game.agregar("Maria");
        game.agregar("Juan");
        boolean jugador = game.esJugable();
        Assertions.assertEquals(true, jugador);
    }

    @Test
    public void mas_seis_jugadores() throws ArrayIndexOutOfBoundsException {
        try {
            Game player = new Game();
            player.agregar("Maria");
            player.agregar("Jose");
            player.agregar("Sara");
            player.agregar("Juan");
            player.agregar("Laura");
            player.agregar("Mario");
            player.agregar("Carla");
            boolean players = player.esJugable();
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void seis_jugadores() {
        Game player = new Game();
        player.agregar("Maria");
        player.agregar("Jose");
        player.agregar("Sara");
        player.agregar("Juan");
        player.agregar("Laura");
        player.agregar("Mario");
        boolean players = player.esJugable();
        Assertions.assertEquals(true, players);
    }

    @Test
    public void sale_de_carcel(){
        Game game = new Game();
        game.agregar("Maria");
        game.agregar("Jose");
        game.tirarDado(3);
        game.respuestaIncorrecta();
        game.tirarDado(2);
        game.fueRespuestaCorrecta();
        game.tirarDado(3);
        game.fueRespuestaCorrecta();
        game.tirarDado(2);
        game.respuestaIncorrecta();
        game.tirarDado(2);
        game.fueRespuestaCorrecta();
        game.tirarDado(3);
        game.fueRespuestaCorrecta();
        Assertions.assertEquals(true,game.fueRespuestaCorrecta());
    }
}
