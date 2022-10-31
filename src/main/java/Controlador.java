public class Controlador {

    /*
    Clase controlador
    Controla el flujo del programa desde un alto nivel de abstracción
    Su función es disminuir el nivel de acceso de los métodos de la clase Juego
     */

    private final Juego juego;

    public Controlador() {
        this.juego = new Juego();
    }

    public void empezarJuego() {
        juego.lanzarDados();
        juego.mostrarDados();
        juego.mostrarGanador();
    }
}
