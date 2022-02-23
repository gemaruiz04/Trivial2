# Trivial2

## Problema 0

Extraemos el codigo duplicado a un único método "nuevaPosicionJugador",
al que llamamos desde ambos sitios

Creamos test unitario "si_al_principio_saco_un_1_voy_a_casilla_1"

## Problema 1

Modificamos el método esJugable para que limite el numero de jugadores a dos y lo comprobamos primero con un test que añada un jugador (un_jugador) y después otro test con más de un jugador (al_menos_dos_jugadores)

## Problema 2

Modificamos de nuevo el método esJugable para limitar el máximo de jugadores a seis, comprobandolo a su vez con los tests llamados mas_seis_jugadores y seis_jugadores. Para arreglar el bug, se debe sumar una posicion y un jugador al array además de añadir en el test la excepcion ArrayIndexOutOfBoundsException

## Problema 3

Se modifica el metodo fueRespuestaCorrecta para hacer que el array que permite al jugador salir de la carcel sea true en el momento que acierte una respuesta.
Además se debe modificar el tamaño del array para comprobar si el jugador sale de la carcel (enCasillaCastigo[cuantosJugadores()-1] = false).
Después se comprueba con el test llamado sale_de_carcel.

## Problema 4


## Problema 5

Se refactoriza el método tirarDado para eliminar el código sobrante creando a su vez un nuevo método llamado pasa_siguiente_jugador (que incluye dicho código extraido)

## Problema 6

Se refactoriza el método fueRespuestaCorrecta extrayendo código duplicado y creando un nuevo método (llamado respuestaCorrecta)

