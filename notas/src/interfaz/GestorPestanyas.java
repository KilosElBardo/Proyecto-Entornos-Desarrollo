package interfaz;

import javax.swing.JTabbedPane;

import interfaz.paneles.NotasClasicos;
import interfaz.paneles.NotasFinales;
import interfaz.paneles.NotasTests;
import interfaz.paneles.Trabajos;
import notas.Curso;

public class GestorPestanyas extends JTabbedPane {
	
	private Curso curso;
	
	public GestorPestanyas(Curso curso) {
		
		this.curso = curso;
		addTab("Nota Examenes Clasico", new NotasClasicos(generarExamenesClasicos()));
		addTab("Nota Examenes Test", new NotasTests());
		addTab("Trabajos", new Trabajos());
		addTab("Notas finales", new NotasFinales());
		
		
	}
	
	private String[][] generarExamenesClasicos() {
		
		String[][] clasicos = new String[30][5];
		for (int i = 0; i < clasicos.length; i++) {
			clasicos[i][0] = curso.getAlumnos()[i].getNombre();
			clasicos[i][1] = curso.getAlumnos()[i].getApellidos();
			clasicos[i][2] = String.valueOf(curso.getAlumnos()[i].getExamenesClasicos()[0].getNota());
			clasicos[i][3] = String.valueOf(curso.getAlumnos()[i].getExamenesClasicos()[1].getNota());
			clasicos[i][4] = String.valueOf(curso.getAlumnos()[i].getExamenesClasicos()[2].getNota());
		}
		
		return clasicos;
		
	}

}
