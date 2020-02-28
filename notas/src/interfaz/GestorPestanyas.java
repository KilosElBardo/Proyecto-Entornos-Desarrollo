package interfaz;

import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import interfaz.paneles.NotasClasicos;
import interfaz.paneles.NotasFinales;
import interfaz.paneles.NotasTests;
import interfaz.paneles.Trabajos;
import notas.Curso;

public class GestorPestanyas extends JTabbedPane {
	
	private Curso curso;
	
	public GestorPestanyas(Curso curso) {
		
		this.curso = curso;
		addTab("Nota Examenes Clasico", new NotasClasicos(generarExamenesClasicos(), getColumnasExamenesClasicos(), this));
		addTab("Nota Examenes Test", new NotasTests(generarExamenesTests(), getColumnasExamenesTests(), this));
		addTab("Trabajos", new Trabajos(generarTrabajos(), getColumnasTrabajos(), this));
		addTab("Notas finales", new NotasFinales());
		
		
		
	}
	
	private String[][] generarExamenesClasicos() {
		
		String[][] clasicos = new String[Curso.ALUMNOS_POR_CURSO][5];
		for (int i = 0; i < clasicos.length; i++) {
			clasicos[i][0] = curso.getAlumnos()[i].getNombre();
			clasicos[i][1] = curso.getAlumnos()[i].getApellidos();
			clasicos[i][2] = String.valueOf(curso.getAlumnos()[i].getExamenesClasicos()[0].getNota());
			clasicos[i][3] = String.valueOf(curso.getAlumnos()[i].getExamenesClasicos()[1].getNota());
			clasicos[i][4] = String.valueOf(curso.getAlumnos()[i].getExamenesClasicos()[2].getNota());
		}
		
		return clasicos;
		
	}

	private String[] getColumnasExamenesClasicos() {
		
		String[] columnas = {"Nombre", "Apellidos", "Examen 1", "Examen 2", "Examen 3"};
		
		return columnas;
	}
	
	private String[][] generarExamenesTests() {
		
		String[][] clasicos = new String[Curso.ALUMNOS_POR_CURSO][10];
		for (int i = 0; i < clasicos.length; i++) {
			clasicos[i][0] = curso.getAlumnos()[i].getNombre();
			clasicos[i][1] = curso.getAlumnos()[i].getApellidos();
			clasicos[i][2] = String.valueOf(curso.getAlumnos()[i].getExamenesTests()[0].getAciertos());
			clasicos[i][3] = String.valueOf(curso.getAlumnos()[i].getExamenesTests()[0].getFallos());
			clasicos[i][4] = String.valueOf(curso.getAlumnos()[i].getExamenesTests()[0].getSinContestar());
			clasicos[i][5] = String.valueOf(curso.getAlumnos()[i].getExamenesTests()[0].getNota());
			clasicos[i][6] = String.valueOf(curso.getAlumnos()[i].getExamenesTests()[1].getAciertos());
			clasicos[i][7] = String.valueOf(curso.getAlumnos()[i].getExamenesTests()[1].getFallos());
			clasicos[i][8] = String.valueOf(curso.getAlumnos()[i].getExamenesTests()[1].getSinContestar());
			clasicos[i][9] = String.valueOf(curso.getAlumnos()[i].getExamenesTests()[1].getNota());
		}
		
		return clasicos;
		
	}

	private String[] getColumnasExamenesTests() {
		
		String[] columnas = {"Nombre", "Apellidos", "A", "F", "SN" ,"Nota", "A", "F", "SN", "Nota"};
		
		return columnas;
	}
	
private String[][] generarTrabajos() {
		
		String[][] clasicos = new String[Curso.ALUMNOS_POR_CURSO][10];
		for (int i = 0; i < clasicos.length; i++) {
			clasicos[i][0] = curso.getAlumnos()[i].getNombre();
			clasicos[i][1] = curso.getAlumnos()[i].getApellidos();
			clasicos[i][2] = String.valueOf(curso.getAlumnos()[i].getTrabajos()[0].getTrabajo());
			clasicos[i][3] = String.valueOf(curso.getAlumnos()[i].getTrabajos()[1].getTrabajo());
			clasicos[i][4] = String.valueOf(curso.getAlumnos()[i].getTrabajos()[2].getTrabajo());
		}
		
		return clasicos;
		
	}

	private String[] getColumnasTrabajos() {
		
		String[] columnas = {"Nombre", "Apellidos", "Trabajo 1", "Trabajo 2", "Trabajo 3"};
		
		return columnas;
	}
}
