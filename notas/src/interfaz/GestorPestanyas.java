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
	private NotasClasicos notasClasicos;
	private NotasTests notasTests;
	private Trabajos trabajos;
	private NotasFinales notasFinales;
	
	public GestorPestanyas(Curso curso) {
	
		this.curso = curso;
		
		notasClasicos =  new NotasClasicos(curso.generarInformacionExamenesClasicos(), curso.getColumnasExamenesClasicos(), this);
		notasTests = new NotasTests(curso.generarInformacionExamenesTests(), curso.getColumnasExamenesTests(), this);
		trabajos = new Trabajos(curso.generarInformacionTrabajos(), curso.getColumnasTrabajos(), this);
		notasFinales = new NotasFinales(curso.generarInformacionFinales(), curso.getColumnasFinales(), this);
		
		addTab("Nota Examenes Clasico", notasClasicos);
		addTab("Nota Examenes Test", notasTests);
		addTab("Trabajos", trabajos);
		addTab("Notas finales", notasFinales);
		
	}
	
	
}
