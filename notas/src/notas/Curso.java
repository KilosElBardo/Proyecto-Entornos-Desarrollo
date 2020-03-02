package notas;

import interfaz.GestorPestanyas;

/**
 * <h2>Su funci�n principal ser� la de almacenar alumnos para poder accederlos de manera sencilla</h2>
 * <p>Almacenar� en un array de <b>Alumnos</b> todos los alumnos pertenecientes al curso</p>
 * 
 * @author David Quiles
 * @author Alejandro L�pez
 * @version 1.0
 *
 */

public class Curso {

	
	private final double PORCENTAJE_PRIMER_EXAMEN = 10 / 100f;
    private final double PORCENTAJE_SEGUNDO_EXAMEN = 20 /100f;
    private final double PORCENTAJE_TERCER_EXAMEN = 20 / 100f;
    private final double PORCENTAJE_CUARTO_EXAMEN = 25 / 100f;
    private final double PORCENTAJE_QUINTO_EXAMEN = 25 / 100f;
	public static final int ALUMNOS_CREADOS_AUTOMATICAMENTE_POR_CURSO = 120;
	public static final int ALUMNOS_MAXIMOS_POR_CURSO = 140;
	public static int alumnosRegistrados = 0;
	double notaPrimerExamen, notaSegundoExamen, notaTercerExamen, notaCuartoExamen, notaQuintoExamen, notaFinal;   
	public static Alumno [] alumnosCurso  = new Alumno [ALUMNOS_MAXIMOS_POR_CURSO];
	
	public Curso() {
		
		generarAlumnos();
		calcularNotasFinales();
		
	}
	/**
	 * 
	 * @return Devuelve un array con <b>Alumnos</b>
	 */
	public Alumno[] getAlumnos(){
		
		return alumnosCurso;
	}
	
	public void agregarAlumnoACurso (Alumno alumno) {
		
		alumnosCurso[alumnosRegistrados-1] = alumno;
		
	}
	
	public void generarAlumnos() {
		
		for(int i = 0; i <= ALUMNOS_CREADOS_AUTOMATICAMENTE_POR_CURSO; i++) {
			
			alumnosCurso[i]= new Alumno();
			System.out.println(i);
		}
		
		
	}
	
	/**
	 * Calculamos la nota final para cada alumno del curso
	 */
	public void calcularNotasFinales() {
	
		for(int i = 0; i < alumnosRegistrados; i++) {
	    	
	    	if(Trabajo.haEntregadoTodosLosTrabajos(alumnosCurso[i].getTrabajos())) {
	    		notaPrimerExamen = alumnosCurso[i].getExamenesClasicos()[0].getNota() * PORCENTAJE_PRIMER_EXAMEN;
		    	notaSegundoExamen = alumnosCurso[i].getExamenesClasicos()[1].getNota() * PORCENTAJE_SEGUNDO_EXAMEN;
		    	notaTercerExamen = alumnosCurso[i].getExamenesClasicos()[2].getNota() * PORCENTAJE_TERCER_EXAMEN;
		    	notaCuartoExamen = alumnosCurso[i].getExamenesTests()[0].getNota() * PORCENTAJE_CUARTO_EXAMEN;
		    	notaQuintoExamen = alumnosCurso[i].getExamenesTests()[1].getNota() * PORCENTAJE_QUINTO_EXAMEN;
		    	
		    	notaFinal = Math.round(notaPrimerExamen + notaSegundoExamen + notaTercerExamen + notaCuartoExamen + notaQuintoExamen);
		    	alumnosCurso[i].setNotaFinal(notaFinal);
	    		
	    	}else {
	    		
	    		alumnosCurso[i].setNotaFinal(3);
	    		
	    	}
	    	
		}
	
	}
	
	public double getMediaAlumnoExamenesClasicos(int posicionAlumno) {
		
		double primerExamen = alumnosCurso[posicionAlumno].getExamenesClasicos()[0].getNota();
		double segundoExamen = alumnosCurso[posicionAlumno].getExamenesClasicos()[1].getNota();
		double tercerExamen = alumnosCurso[posicionAlumno].getExamenesClasicos()[2].getNota();
		double media = Math.round((primerExamen + segundoExamen + tercerExamen) / Alumno.EXAMENES_CLASICOS);
		
		return media;
		
	}
	
	public double getMediaAlumnoExamenesTests(int posicionAlumno) {
		
		double primerExamen = alumnosCurso[posicionAlumno].getExamenesTests()[0].getNota();
		double segundoExamen = alumnosCurso[posicionAlumno].getExamenesTests()[1].getNota();
		double media = Math.round((primerExamen + segundoExamen) / Alumno.EXAMENES_TESTS);
		
		return media;
		
	}
	
	public String[][] generarInformacionExamenesClasicos() {
		
		String[][] clasicos = new String[Curso.alumnosRegistrados][5];
		for (int i = 0; i < clasicos.length; i++) {
			clasicos[i][0] = alumnosCurso[i].getNombre();
			clasicos[i][1] = alumnosCurso[i].getApellidos();
			clasicos[i][2] = String.valueOf(alumnosCurso[i].getExamenesClasicos()[0].getNota());
			clasicos[i][3] = String.valueOf(alumnosCurso[i].getExamenesClasicos()[1].getNota());
			clasicos[i][4] = String.valueOf(alumnosCurso[i].getExamenesClasicos()[2].getNota());
		}
		
		return clasicos;
		
	}

	public String[] generarInformacionExamenesClasicos(int posicionAlumno) {
	
		String[] clasicos = new String[5];
		
		clasicos[0] = alumnosCurso[posicionAlumno].getNombre();
		clasicos[1] = alumnosCurso[posicionAlumno].getApellidos();
		clasicos[2] = String.valueOf(alumnosCurso[posicionAlumno].getExamenesClasicos()[0].getNota());
		clasicos[3] = String.valueOf(alumnosCurso[posicionAlumno].getExamenesClasicos()[1].getNota());
		clasicos[4] = String.valueOf(alumnosCurso[posicionAlumno].getExamenesClasicos()[2].getNota());
		
		return clasicos;
		
}


	public String[] getColumnasExamenesClasicos() {
		
		String[] columnas = {"Nombre", "Apellidos", "Examen 1", "Examen 2", "Examen 3"};
		
		return columnas;
	}
	
	public String[][] generarInformacionExamenesTests() {
		
		String[][] clasicos = new String[Curso.alumnosRegistrados][10];
		for (int i = 0; i < clasicos.length; i++) {
			clasicos[i][0] = alumnosCurso[i].getNombre();
			clasicos[i][1] = alumnosCurso[i].getApellidos();
			clasicos[i][2] = String.valueOf(alumnosCurso[i].getExamenesTests()[0].getAciertos());
			clasicos[i][3] = String.valueOf(alumnosCurso[i].getExamenesTests()[0].getFallos());
			clasicos[i][4] = String.valueOf(alumnosCurso[i].getExamenesTests()[0].getSinContestar());
			clasicos[i][5] = String.valueOf(alumnosCurso[i].getExamenesTests()[0].getNota());
			clasicos[i][6] = String.valueOf(alumnosCurso[i].getExamenesTests()[1].getAciertos());
			clasicos[i][7] = String.valueOf(alumnosCurso[i].getExamenesTests()[1].getFallos());
			clasicos[i][8] = String.valueOf(alumnosCurso[i].getExamenesTests()[1].getSinContestar());
			clasicos[i][9] = String.valueOf(alumnosCurso[i].getExamenesTests()[1].getNota());
		}
		
		return clasicos;
		
	}
	
	public String[] generarInformacionExamenesTests(int posicionAlumno) {
		
		String[] tests = new String[10];
	
		tests[0] = alumnosCurso[posicionAlumno].getNombre();
		tests[1] = alumnosCurso[posicionAlumno].getApellidos();
		tests[2] = String.valueOf(alumnosCurso[posicionAlumno].getExamenesTests()[0].getAciertos());
		tests[3] = String.valueOf(alumnosCurso[posicionAlumno].getExamenesTests()[0].getFallos());
		tests[4] = String.valueOf(alumnosCurso[posicionAlumno].getExamenesTests()[0].getSinContestar());
		tests[5] = String.valueOf(alumnosCurso[posicionAlumno].getExamenesTests()[0].getNota());
		tests[6] = String.valueOf(alumnosCurso[posicionAlumno].getExamenesTests()[1].getAciertos());
		tests[7] = String.valueOf(alumnosCurso[posicionAlumno].getExamenesTests()[1].getFallos());
		tests[8] = String.valueOf(alumnosCurso[posicionAlumno].getExamenesTests()[1].getSinContestar());
		tests[9] = String.valueOf(alumnosCurso[posicionAlumno].getExamenesTests()[1].getNota());
		
		return tests;
		
	}

	public String[] getColumnasExamenesTests() {
		
		String[] columnas = {"Nombre", "Apellidos", "A", "F", "SN" ,"Nota", "A", "F", "SN", "Nota"};
		
		return columnas;
	}
	
	public String[][] generarInformacionTrabajos() {
		
		String[][] trabajos = new String[Curso.alumnosRegistrados][10];
		for (int i = 0; i < trabajos.length; i++) {
			trabajos[i][0] = alumnosCurso[i].getNombre();
			trabajos[i][1] = alumnosCurso[i].getApellidos();
			trabajos[i][2] = String.valueOf(alumnosCurso[i].getTrabajos()[0].getTrabajo());
			trabajos[i][3] = String.valueOf(alumnosCurso[i].getTrabajos()[1].getTrabajo());
			trabajos[i][4] = String.valueOf(alumnosCurso[i].getTrabajos()[2].getTrabajo());
		}
		
		return trabajos;
		
	}
	
	public String[] generarInformacionTrabajos(int posicionAlumno) {
		
		String[] trabajos = new String[10];
	
			trabajos[0] = alumnosCurso[posicionAlumno].getNombre();
			trabajos[1] = alumnosCurso[posicionAlumno].getApellidos();
			trabajos[2] = String.valueOf(alumnosCurso[posicionAlumno].getTrabajos()[0].getTrabajo());
			trabajos[3] = String.valueOf(alumnosCurso[posicionAlumno].getTrabajos()[1].getTrabajo());
			trabajos[4] = String.valueOf(alumnosCurso[posicionAlumno].getTrabajos()[2].getTrabajo());
		
		return trabajos;
		
	}

	public String[] getColumnasTrabajos() {
		
		String[] columnas = {"Nombre", "Apellidos", "Trabajo 1", "Trabajo 2", "Trabajo 3"};
		
		return columnas;
	}
	
	public String[][] generarInformacionFinales() {
		
		String[][] finales = new String[Curso.alumnosRegistrados][6];
		for (int i = 0; i < finales.length; i++) {
			finales[i][0] = alumnosCurso[i].getNombre();
			finales[i][1] = alumnosCurso[i].getApellidos();
			finales[i][2] = String.valueOf(getMediaAlumnoExamenesClasicos(i) + "          ");
			finales[i][3] = String.valueOf(getMediaAlumnoExamenesTests(i));
			finales[i][4] = String.valueOf(Trabajo.haEntregadoTodosLosTrabajos(alumnosCurso[i].getTrabajos()));
			finales[i][5] = String.valueOf(alumnosCurso[i].getNotaFinal());
		}
		
		return finales;
		
	}
	
	public String[] generarInformacionFinales(int posicionAlumno) {
		
		String[] finales = new String[6];
	
		finales[0] = alumnosCurso[posicionAlumno].getNombre();
		finales[1] = alumnosCurso[posicionAlumno].getApellidos();
		finales[2] = String.valueOf(getMediaAlumnoExamenesClasicos(posicionAlumno) + "          ");
		finales[3] = String.valueOf(getMediaAlumnoExamenesTests(posicionAlumno));
		finales[4] = String.valueOf(Trabajo.haEntregadoTodosLosTrabajos(alumnosCurso[posicionAlumno].getTrabajos()));
		finales[5] = String.valueOf(alumnosCurso[posicionAlumno].getNotaFinal());
		
		return finales;
		
	}

	public String[] getColumnasFinales() {
		
		String[] columnas = {"Nombre", "Apellidos", "AVG Clasicos", "AVG Tests","Trabajos", "Final"};
		
		return columnas;
	}
	
	
	public static Alumno obtenerAlumnoPorID(int id) {
    	for (Alumno alumno : alumnosCurso) {
			if(alumno.getIdEstudiante()==id) {
				return alumno;
			}
		}
    	return null;
    }
}
