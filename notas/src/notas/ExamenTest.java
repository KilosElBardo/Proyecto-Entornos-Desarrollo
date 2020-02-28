package notas;

public class ExamenTest {
	private final int PREGUNTAS_TOTALES = 50;
	private static final double FALLO_RESTA = 1/3f;
	private final int NOTA_MAXIMA = 10;
    
    private int aciertos = 0;
    private int fallos = 0;
    private int noContestadas = 0;
    private double nota = 0;
    
    
    public ExamenTest() {
    	
    	generarPuntuacion();
    	calcularNota();
    }
    
    public ExamenTest(int aciertos, int fallos, int noContestadas) {
    	this.aciertos = aciertos;
    	this.fallos = fallos;
    	this.noContestadas = noContestadas;
    	calcularNota();
    }
    
  
    public void generarAciertosAleatorios() {
        
    	aciertos = (int) (Math.random()*PREGUNTAS_TOTALES);
    }
    
    public void generarFallosAleatorios() {
    	
        fallos = (int) (Math.random()* (PREGUNTAS_TOTALES - aciertos));
    }
        
    public void generarPreguntasNoContestadas() {
    	
    	noContestadas = PREGUNTAS_TOTALES - (aciertos + fallos);
    }
    
    
    public void generarPuntuacion() {
    	
    	generarAciertosAleatorios();
    	generarFallosAleatorios();
    	generarPreguntasNoContestadas();
    }

    
    public void calcularNota () {
        double calcularFallos = 0, calcularAciertos = 0;
        
        if(aciertos + fallos + noContestadas == PREGUNTAS_TOTALES) {
            
        	calcularFallos = fallos * FALLO_RESTA;
            calcularAciertos = aciertos - calcularFallos;
            nota = (double) aciertos * NOTA_MAXIMA / PREGUNTAS_TOTALES;
            
        }else {
        	
            nota = 0;
            System.out.println("Error, problema con las preguntas totales del examen");
        }

    }
    
    public double getNota() {
    
    	return nota;
    }
    
    public int getAciertos() {
    	return aciertos;
    }
    
    public int getFallos() {
    	return fallos;
    }
    
    public int getSinContestar() {
    	return noContestadas;
    }
    
    public String toString() {
    	return String.valueOf(nota);
    }
}
