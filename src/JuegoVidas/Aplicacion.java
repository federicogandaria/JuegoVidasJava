package JuegoVidas;

public class Aplicacion {
    public static void main(String[] args) {
        Juego juego1 = new Juego(5);
        //Mostramos vidas iniciales: 5 de nuestro primer juego
        juego1.muestraVidasRestantes();
        //Le restamos 1 vida a las 5
        juego1.quitaVida();
        //Imprimimos en pantalla las vidas restantes para asi verificar la resta de una vida
        juego1.muestraVidasRestantes();
        //Reiniciamos las vidas a su valor original
        juego1.reiniciarPartida();
        //Mostramos vidas iniciales para confirmar el reinicio
        System.out.println("---- Se reinicio el juego ----");

        System.out.println("Juego 1: ");
        juego1.muestraVidasRestantes();

        //Creamos juego 2 con 6 vidas
        Juego juego2 = new Juego(6);
        System.out.println("Juego 2");
       //Las mostramos para confirmar
        juego2.muestraVidasRestantes();
        //Le quitamos 2 para dejarlo en 4 vidas y sea menor a las vidas totales que tiene juego1
        juego2.quitaVida();
        juego2.quitaVida();
        //Mostramos las vidas restantes de juego 1
        System.out.println("Juego 1:");
        juego1.muestraVidasRestantes();

        //Vemos los record de juego 1 con total de 5 vidas
        juego1.actualizaRecord();
        //No vemos el record de juego 2,ya que tiene un total de 4 vidas, al restarle 2 a las vidas iníciales de 6
        juego2.actualizaRecord();

        //Creamos juego 3 con más vidas del record de 5
        Juego juego3 = new Juego(7);
        System.out.println("Juego 3:");
        juego3.muestraVidasRestantes();
        //Mostramos el nuevo record al ser superior que el de juego1
        juego3.actualizaRecord();

        //Le quitamos la unica vida que tiene para comprobar que la funcion de terminar juego funciona
        Juego juego4 = new Juego(1);
        System.out.println("Juego 4:");
        juego4.muestraVidasRestantes();
        juego4.quitaVida();

    }
}
