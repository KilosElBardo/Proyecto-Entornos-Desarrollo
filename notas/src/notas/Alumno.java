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
    	int num = (int) (Math.random()*13);

    	switch(num) {
    		case 0: 
    			nombre = "Hector";
    			break;
    		case 1: 
    			nombre = "Alicia";
    			break;
    		case 2: 
    			nombre = "David";
    			break;
    		case 3: 
    			nombre = "Alejandro";
    			break;
    		case 4: 
    			nombre = "Raul";
    			break;
    		case 5: 
    			nombre = "Pablo";
    			break;
    		case 6: 
    			nombre = "Ivan";
    			break;
    		case 7: 
    			nombre = "Jose";
    			break;
    		case 8: 
    			nombre = "Alejandra";
    			break;
    		case 9: 
    			nombre = "Esther";
    			break;
    		case 10: 
    			nombre = "Andrea";
    			break;
    		case 11: 
    			nombre = "Cristina";
    			break;
    		case 12: 
    			nombre = "Enrique";
    			break;
    	}
    	
    }
    
    
    public void generarApellido() {
    	int num = (int) (Math.random()*13);
    	switch(num) {
    		case 0: 
    			apellidos = "Conesa";
    			break;
    		case 1: 
    			apellidos = "Quiles";
    			break;
    		case 2: 
    			apellidos = "Lopez";
    			break;
    		case 3: 
    			apellidos = "Nunez";
    			break;
    		case 4: 
    			apellidos = "Garcia";
    			break;
    		case 5: 
    			apellidos = "Garci";
    			break;
    		case 6: 
    			apellidos = "Aranz";
    			break;
    		case 7: 
    			apellidos = "Ruiz";
    			break;
    		case 8: 
    			apellidos = "Martinez";
    			break;
    		case 9: 
    			apellidos = "Martin";
    			break;
    		case 10: 
    			apellidos = "Rabano";
    			break;
    		case 11: 
    			apellidos = "Porta";
    			break;
    		case 12: 
    			apellidos = "Dominguez";
    			break;
    	}
  
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
