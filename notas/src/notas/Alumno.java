
package notas;

/**
 * <h2> Alumno </h2>
 * Clase que representará un alumno del curso
 * 
 * @author David Quiles
 * @author Alejandro López
 * @version 1.0
 * @see https://github.com/KilosElBardo/Proyecto-Entornos-Desarrollo.git
*/

public class Alumno {
	/**
	 * Constante EXAMENES_CLASICOS 
	 * 
	 * Indica la cantidad máxima de examenes de tipo clásico que un alumno hará por curso
	 * 
	 */
	private static final int EXAMENES_CLASICOS = 3;
	/**
	 * Constante EXAMENES_TESTS
	 * 
	 * Indica la cantidad máxima de examenes de tipo clásico que un alumno hará por curso
	 * 
	 */
    private static final int EXAMENES_TESTS = 2;
    private static final int TRABAJOS = 3;
    private static final int PREGUNTAS_TESTS = 50;
    private static final double FALLO_RESTA = 1/3f;
    
    /**
	 * Variable nota final
	 * 
	 * Indica la nota final que será calculada al instanciar la clase por medio del constructor
	 * 
	 */
    private double notaFinal = 0;
    private String nombre;
    private String apellidos;
    private String imagen;
    private int edad;
    private int idEstudiante;
    private boolean isFemenino;
    private ExamenClasico[] ExamenesClasicos = new ExamenClasico[EXAMENES_CLASICOS];
    private ExamenTest[] ExamenesTests = new ExamenTest[EXAMENES_TESTS];
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
    	
    	int num = (int) (Math.random()*5);
    	switch(num) {
    		case 0:
    			imagen = "/resurces/moreno pelirrojo.png";
    			break;
    		case 1:
    			imagen = "/resurces/negro rubio.png";
    			break;
    		case 2:
    			imagen = "/resurces/balnco rubio.png";
    			break;
    		case 3:
    			imagen = "/resurces/moreno blanco.png";
    			break;
    		case 4:
    			imagen = "/resurces/rosado azul.png";
    			break;
    		
    	}
    	
    	
    }
    
    public void generarImagenFemenina() {
    	int num = (int) (Math.random()*5);
    	switch(num) {
    		case 0:
    			imagen = "/resources/morena blanco.png";
    			break;
    		case 1:
    			imagen = "/resources/clara blanco.png";
    			break;
    		case 2:
    			imagen = "/resources/clara morena.png";
    			break;
    		case 3:
    			imagen = "/resources/clara pelirroja.png";
    			break;
    		case 4:
    			imagen = "/resources/morena rubia.png";
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
    	
    	Curso.alumnosRegistrados ++;
    	
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
		return ExamenesClasicos;
	}



	public ExamenTest[] getExamenesTests() {
		return ExamenesTests;
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
