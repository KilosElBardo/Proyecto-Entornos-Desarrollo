package notas;

public class ExamenClasico {


    public static double calcularNotaTest (int aciertos, int fallos, int noContestadas) {
        double notaFinal = 0, calcularFallos = 0, calcularAciertos = 0;
        
        if((aciertos + fallos + noContestadas) == PREGUNTAS_TESTS) {
            
            calcularFallos = fallos * FALLO_RESTA;
            calcularAciertos = aciertos - calcularFallos;
            notaFinal = aciertos * 10 / 50;
            
        }else {
            return 0;
        }
        return notaFinal;
    }
    
    /**
     * 
     * @param notaMaxima la nota máxima que un Alumno puede tener en un examen clásico (0-10)
     * @return notasExamenesClasicosAlumno un array de notas de los exámenes clásicos de un Alumno
     */
    
    public double[] generarExamenesClasicos (int notaMaxima) {
        
        double[] notasExamenesClasicosAlumno = new double[EXAMENES_CLASICOS];
        
        for (int i = 0; i < notasExamenesClasicosAlumno.length; i++) {
            
            notasExamenesClasicosAlumno[i] = (double) Math.round(Math.random() * notaMaxima);
            
        }
        
        return notasExamenesClasicosAlumno;
    }
}
