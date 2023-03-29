package JuegoPPT;

public static void main(String[] args) {
    PiedraPapelTijeras juego = new PiedraPapelTijeras("Jugador 1", "Jugador 2", 3);
    juego.iniciar();
    juego.jugar();
    juego.finalizar();
}
