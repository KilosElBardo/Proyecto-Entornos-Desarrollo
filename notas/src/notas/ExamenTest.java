package notas;

public class ExamenTest {
private final int PREGUNTAS_TOTALES = 50;
    
    private int aciertos = 0;
    private int fallos = 0;
    private int noContestadas = 0;
    
    public void generarPuntuacion() {
        aciertos = generarAciertosAleatorios();
        fallos = generarFallosAleatorios(aciertos);
        noContestadas = PREGUNTAS_TOTALES - (aciertos + fallos) ;
    }    

    
    public int generarFallosAleatorios(int aciertos) {
        int fallos = (int) (Math.random()* PREGUNTAS_TOTALES - aciertos);
        return fallos;
    }
        
    public int generarAciertosAleatorios() {
        int aciertos = (int) (Math.random()*PREGUNTAS_TOTALES);
        return aciertos;
    }
}
