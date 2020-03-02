package interfaz.paneles;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import interfaz.BarraHerramientas;
import interfaz.GestorPestanyas;
import notas.Curso;

public class Paneles extends JPanel {
	
	GestorPestanyas gestorPestanyas;
	Curso curso;
	
	public Paneles(Curso curso) {
		this.curso = curso;
		setLayout(new BorderLayout());
		BarraHerramientas barraHerramientas = new BarraHerramientas("Herramientas", curso);
		add(barraHerramientas, BorderLayout.NORTH);
		gestorPestanyas = new GestorPestanyas(curso);
		add(gestorPestanyas, BorderLayout.CENTER);
	}
	
	

}
