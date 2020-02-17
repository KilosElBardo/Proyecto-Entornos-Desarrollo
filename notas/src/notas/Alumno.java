package notas;

public class Alumno {
	private static final int EXAMENES_CLASICOS = 3;
    private static final int EXAMENES_TESTS = 2;
    private static final int TRABAJOS = 3;
    private static final int PREGUNTAS_TESTS = 50;
    private static final double FALLO_RESTA = 1/3f;
    
    private double notaFinal = 0;
    private String nombre;
    private String apellidos;
    private ExamenClasico[] ExamenesClasicos = new ExamenClasico[EXAMENES_CLASICOS];
    private ExamenTest[] ExamenesTests = new ExamenTest[EXAMENES_TESTS];
    private Trabajo[] trabajos = new Trabajo[TRABAJOS];
    
    
    public Alumno () {
    	
    	generarNombre();
    	generarApellido();
    	generarExamenesClasicos();
    	generarExamenesTest();
    	generarTrabajos();
    	calcularNotaFinal();
    	
    }
    
    private void generarExamenesClasicos () {
    	
    	for (int i = 0; i < EXAMENES_CLASICOS; i++) {
    		
    		ExamenesClasicos[i] = new ExamenClasico();
			
		}
    	
    }
    
    private void generarExamenesTest () {
    	
    	for (int i = 0; i < EXAMENES_TESTS; i++) {
    		
    		ExamenesTests[i] = new ExamenTest();
			
		}
    	
    }
    
    
	private void generarTrabajos () {
	    	
    	for (int i = 0; i < TRABAJOS; i++) {
    		
    		trabajos[i] = new Trabajo();
			
		}
	    	
    }
    
    public void generarNombre() {
    	int num = (int) (Math.random()*4);
    	switch(num) {
    		case 0: 
    			nombre = "Joe";
    		case 1: 
    			nombre = "Bonnye";
    		case 2: 
    			nombre = "Garfield";
    		case 3: 
    			nombre = "Jerry";	
    		case 4: 
    			nombre = "Woody";	
    	}
    	nombre = "Lily";
    }
    
    
    public void generarApellido() {
    	int num = (int) (Math.random()*5);
    	switch(num) {
    		case 0: 
    			apellidos = "Smith";
    		case 1: 
    			apellidos = "Jones";
    		case 2: 
    			apellidos = "Williams";
    		case 3: 
    			apellidos = "Brown";	
    		case 4: 
    			apellidos = "Evans";	
    	}
    	apellidos = "Lidell";
    }
    
    private void calcularNotaFinal() {
    	
    }

	public double getNotaFinal() {
		return notaFinal;
	}

	public void setNotaFinal(double notaFinal) {
		this.notaFinal = notaFinal;
	}

	public String getNombre() {
		return nombre;
	}


	public String getApellidos() {
		return apellidos;
	}

	public ExamenClasico[] getExamenesClasicos() {
		return ExamenesClasicos;
	}



	public ExamenTest[] getExamenesTests() {
		return ExamenesTests;
	}


	public Trabajo[] getTrabajos() {
		return trabajos;
	}

    
}
