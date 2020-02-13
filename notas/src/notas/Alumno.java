package notas;

public class Alumno {
	static final int EXAMENES_CLASICOS = 3;
    static final int EXAMENES_TESTS = 2;
    static final int PREGUNTAS_TESTS = 50;
    static final double FALLO_RESTA = 1/3f;
    
    private double[] notasExamenesClasicos = new double[EXAMENES_CLASICOS];
    private double[] examenesTests = new double[EXAMENES_TESTS];
    
    
    public static String generarNombre() {
    	int num = (int) (Math.random()*4);
    	switch(num) {
    		case 0: 
    			return "Joe";
    		case 1: 
    			return "Bonnye";
    		case 2: 
    			return "Garfield";
    		case 3: 
    			return "Jerry";	
    		case 4: 
    			return "Woody";	
    	}
    	return "Lily";
    }
    
    
    public static String generarApellido() {
    	int num = (int) (Math.random()*5);
    	switch(num) {
    		case 0: 
    			return "Smith";
    		case 1: 
    			return "Jones";
    		case 2: 
    			return "Williams";
    		case 3: 
    			return "Brown";	
    		case 4: 
    			return "Evans";	
    	}
    	return "Lidell";
    }
    
}
