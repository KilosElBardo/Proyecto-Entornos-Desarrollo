package notas;
public class ExamenClasico {
	
    /**
     * @param Maxima la nota máxima que un Alumno puede tener en un examen clásico (0-10)
     * @param nota 
     */
	
	private final int NOTA_MAXIMA = 10;
	private double nota;
	
	public ExamenClasico () {
		generarNotaAleatoria();
	}
	
	public ExamenClasico (double nota) {
		this.nota = nota;
	}
	
	public double getNota() {
		return nota;
	}
	
	
	public void generarNotaAleatoria() {
	    nota  = (double) Math.round(Math.random() * NOTA_MAXIMA);
	}
	
	
}