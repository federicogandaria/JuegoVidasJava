package JuegoVidas;

import java.util.Objects;

public class Juego {


    private Integer vidas;
    private final Integer vidasInicial;
    private static Integer record;

    public Juego(Integer vidas){
        this.vidasInicial=vidas;
        this.vidas=vidas;
        record=0;
    }



    public void muestraVidasRestantes(){

        System.out.println("Las vidas restantes son de: "+vidas.toString());
    }
    public void quitaVida() {
        vidas--;
        System.out.println("Has perdido una vida :(");
        if (vidas<=0) {
            System.out.println("Juego terminado");
        }
    }
    public void reiniciarPartida(){
        this.vidas=this.vidasInicial;
    }
    public void actualizaRecord(){
        if (Objects.equals(vidas, record)) System.out.println("Alcanzaste el record.");
        else if (vidas>record) {
            record=vidas;
            System.out.println("Nuevo record, este es de "+record+" vidas.");
        }
    }

}

