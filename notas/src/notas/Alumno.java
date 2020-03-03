
package notas;

/**
 * <h2> Alumno </h2>
 * Clase que representarï¿½ un alumno del curso
 * 
 * @author David Quiles
 * @author Alejandro López
 * @version 1.0
*/

public class Alumno {
	/**
	 * Constante EXAMENES_CLASICOS 
	 * 
	 * Indica la cantidad mï¿½xima de examenes de tipo clï¿½sico que un alumno harï¿½ por curso
	 * 
	 */
	public static final int EXAMENES_CLASICOS = 3;
	/**
	 * Constante EXAMENES_TESTS
	 * 
	 * Indica la cantidad mï¿½xima de examenes de tipo clï¿½sico que un alumno harï¿½ por curso
	 * 
	 */
    public static final int EXAMENES_TESTS = 2;
    public static final int TRABAJOS = 3;
    private static final int PREGUNTAS_TESTS = 50;
    private static final double FALLO_RESTA = 1/3f;
    
    /**
	 * Variable nota final
	 * 
	 * Indica la nota final que serï¿½ calculada al instanciar la clase por medio del constructor
	 * 
	 */
    private double notaFinal = 0;
    private String nombre;
    private String apellidos;
    private String imagen;
    private int edad;
    private int idEstudiante;
    private boolean isFemenino;
    private ExamenClasico[] examenesClasicos = new ExamenClasico[EXAMENES_CLASICOS];
    private ExamenTest[] examenesTests = new ExamenTest[EXAMENES_TESTS];
    private Trabajo[] trabajos = new Trabajo[TRABAJOS];
    
    
    public Alumno () {
    	
      	generarId();
    	generarSexo();
    	generarNombre();
    	generarApellido();
    	generarEdad();
    	generarImagen();
    	generarExamenesClasicos();
    	generarExamenesTest();
    	generarTrabajos();
    	
    }
    
    public Alumno(String nombre, String apellidos, int edad, boolean isFemenino, ExamenTest[] examenesTest, ExamenClasico[] examenesClasicos,  Trabajo[] trabajos) {
    	
    	generarId();
    	this.nombre = nombre;
    	this.apellidos = apellidos;
    	this.edad = edad;
    	this.isFemenino = isFemenino;
    	this.examenesTests = examenesTest;
    	this.examenesClasicos = examenesClasicos;
    	this.trabajos = trabajos;
    	generarImagen();
    	
    	
    }
    
    
    private void generarExamenesClasicos () {
    	
    	for (int i = 0; i < EXAMENES_CLASICOS; i++) {
    		
    		examenesClasicos[i] = new ExamenClasico();
			
		}
    	
    }
    
    private void generarExamenesTest () {
    	
    	for (int i = 0; i < EXAMENES_TESTS; i++) {
    		
    		examenesTests[i] = new ExamenTest();
			
		}
    	
    }
    
    
	private void generarTrabajos () {
	    	
    	for (int i = 0; i < TRABAJOS; i++) {
    		
    		trabajos[i] = new Trabajo();
			
		}
	    	
    }
    
    /**
     * Genera un nombre masculino
     */
    public void generarNombreMasculino() {
    	int num = (int) (Math.random()*13);

    	switch(num) {
    		case 0: 
    			nombre = "Hector";
    			break;
    		case 1: 
    			nombre = "David";
    			break;
    		case 2: 
    			nombre = "Raul";
    			break;
    		case 3: 
    			nombre = "Alejandro";
    			break;
    		case 4: 
    			nombre = "Pablo";
    			break;
    		case 5: 
    			nombre = "Alberto";
    			break;
    		case 6: 
    			nombre = "Ivan";
    			break;
    		case 7: 
    			nombre = "Jose";
    			break;
    		case 8: 
    			nombre = "Alexender";
    			break;
    		case 9: 
    			nombre = "MoisÃ©s";
    			break;
    		case 10: 
    			nombre = "Trajano";
    			break;
    		case 11: 
    			nombre = "Lucas";
    			break;
    		case 12: 
    			nombre = "Antonio";
    			break;
    	}
    	
    }
    
    /**
     * Genera un nombre femenino
     */
    public void generarNombreFemenino() {
    	int num = (int) (Math.random()*13);
    	switch(num) {
    		case 0:
    			nombre = "Lucia";
    			break;
    		case 1:
    			nombre = "Alicia";
    			break;
    		case 2:
    			nombre = "Maria";
    			break;
    		case 3:
    			nombre = "Aroa";
    			break;
    		case 4:
    			nombre = "Andrea";
    			break;
    		case 5:
    			nombre = "Cristina";
    			break;
    		case 6:
    			nombre = "Alejandra";
    			break;
    		case 7:
    			nombre = "Sara";
    			break;
    		case 8:
    			nombre = "Natalia";
    			break;
    		case 9:
    			nombre = "Isabel";
    			break;
    		case 10:
    			nombre = "Emma";
    			break;
    		case 11:
    			nombre = "Alicia";
    			break;
    		case 12:
    			nombre = "Aurora";
    			break;
    	}
    }
    
    private void generarImagen() {
		 if (isFemenino) {
			generarImagenFemenina();
		}else {
			generarImagenMasculina();
		}
	 }
    
    public void generarImagenMasculina() {
    	
    	int num = (int) (Math.random()*7);
    	switch(num) {
    		case 0:
    			imagen = "/resources/claro_blanco_hombre.png";
    			break;
    		case 1:
    			imagen = "/resources/claro_moreno_hombre.png";
    			break;
    		case 2:
    			imagen = "/resources/claro_pelirrojo_hombre.png";
    			break;
    		case 3:
    			imagen = "/resources/claro_rubio_hombre.png";
    			break;
    		case 4:
    			imagen = "/resources/negro_blanco_hombre.png";
    			break;
    		case 5:
    			imagen = "/resources/negro_pelirrojo_hombre.png";
    			break;
    		case 6:
    			imagen = "/resources/negro_rubio_hombre.png";
    			break;
    		
    	}
    	
    	
    }
    
    public void generarImagenFemenina() {
    	int num = (int) (Math.random()*7);
    	switch(num) {
    		case 0:
    			imagen = "/resources/clara_blanco_mujer.png";
    			break;
    		case 1:
    			imagen = "/resources/clara_pelirroja_mujer.png";
    			break;
    		case 2:
    			imagen = "/resources/clara_rubia_mujer.png";
    			break;
    		case 3:
    			imagen = "/resources/clara_morena_mujer.png";
    			break;
    		case 4:
    			imagen = "/resources/negro_blanco_mujer.png";
    			break;
    		case 5:
    			imagen = "/resources/negro_pelirrojo_mujer.png";
    			break;
    		case 6:
    			imagen = "/resources/negro_rubio_mujer.png";
    			break;
    		
    	}
    }
    
    public void generarNombre() {

    	if(isFemenino) {
    		
    		generarNombreFemenino();
    	}
    	else {
    		
    		generarNombreMasculino();
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
    
    
    private void generarId() {
    	
    	Curso.alumnosRegistrados++;
    	
    	idEstudiante = Curso.alumnosRegistrados;
    	
    	
    }
    
    
    
    private void generarEdad() {
    	
    	edad = (int) (Math.random() * 25 + 10);
    }
    
    
    private void generarSexo() {
    	
    	int numeroParaGenerar;
    	
    	numeroParaGenerar = (int) (Math.random()*3);
    	
    	if(numeroParaGenerar == 1) {
    		isFemenino = true;
    	}
    	else {
    		isFemenino = false;
    	}
    	
    }
    
    /**
     * 
     * @return Nos devuelve true si el alumno es una chica y false si es un chico
     */
    private boolean isFemenino() {
    	
    	if(isFemenino) {
    		return true;
    	}
    	else {
    		return false;
    	}
    	
    }
    
    public void setNotaFinal(double notaFinal) {
		this.notaFinal = notaFinal;
	}

	public double getNotaFinal() {
		return notaFinal;
	}

	public String getNombre() {
		return nombre;
	}

	public String getSexo() {
		return (isFemenino)?"Mujer":"Hombre";
	}

	public String getApellidos() {
		return apellidos;
	}

	public ExamenClasico[] getExamenesClasicos() {
		return examenesClasicos;
	}



	public ExamenTest[] getExamenesTests() {
		return examenesTests;
	}


	public Trabajo[] getTrabajos() {
		return trabajos;
	}

	public int getIdEstudiante() {
		return idEstudiante;
	}

	public static int getPreguntasTests() {
		return PREGUNTAS_TESTS;
	}

	public static double getFalloResta() {
		return FALLO_RESTA;
	}

	public int getEdad() {
		return edad;
	}

	public String getImagen() {
		return imagen;
	}

    
}
