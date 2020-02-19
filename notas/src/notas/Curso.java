package notas;

public class Curso {

	
	private final double PORCENTAJE_PRIMER_EXAMEN = 10 / 100;
    private final double PORCENTAJE_SEGUNDO_EXAMEN = 20 /100;
    private final double PORCENTAJE_TERCER_EXAMEN = 20 / 100;
    private final double PORCENTAJE_CUARTO_EXAMEN = 25 / 100;
    private final double PORCENTAJE_QUINTO_EXAMEN = 25 / 100;
	static final int ALUMNOS_POR_CURSO = 30;
	double notaPrimerExamen, notaSegundoExamen, notaTercerExamen, notaCuartoExamen, notaQuintoExamen, notaFinal;   
	private Alumno [] alumnosCurso  = new Alumno [ALUMNOS_POR_CURSO];
	
	public Curso() {
		
		generarAlumnos();
		calcularNotasFinales();
		
	}
	
	public Alumno[] getAlumnos(){
		
		
		
		return alumnosCurso;
	}
	
	
	public void generarAlumnos() {
		
		
		
		for(int i = 0; i < Curso.ALUMNOS_POR_CURSO; i++) {
			
			alumnosCurso[i]= new Alumno();
			
		}
	}
	
	public void calcularNotasFinales() {
	
		for(int i = 0; i < ALUMNOS_POR_CURSO; i++) {
			
			
	    	
	    	if(Trabajo.haEntregadoTodosLosTrabajos(alumnosCurso[i].getTrabajos()) == false) {
	    		
	    		alumnosCurso[i].setNotaFinal(3);
	    		
	    	}else {
	    		
	    		notaPrimerExamen = alumnosCurso[i].getExamenesClasicos()[0].getNota() * PORCENTAJE_PRIMER_EXAMEN;
		    	notaSegundoExamen = alumnosCurso[i].getExamenesClasicos()[1].getNota() * PORCENTAJE_SEGUNDO_EXAMEN;
		    	notaTercerExamen = alumnosCurso[i].getExamenesClasicos()[2].getNota() * PORCENTAJE_TERCER_EXAMEN;
		    	notaCuartoExamen = alumnosCurso[i].getExamenesTests()[0].getNota() * PORCENTAJE_CUARTO_EXAMEN;
		    	notaQuintoExamen = alumnosCurso[i].getExamenesTests()[1].getNota() * PORCENTAJE_QUINTO_EXAMEN;
		    	
		    	notaFinal = notaPrimerExamen + notaSegundoExamen + notaTercerExamen + notaCuartoExamen + notaQuintoExamen;
		    	
		    	alumnosCurso[i].setNotaFinal(Math.round(notaFinal));

	    		
	    	}
	    	
		}
	
	
}
}
