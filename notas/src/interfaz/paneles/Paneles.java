package interfaz.paneles;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import interfaz.BarraHerramientas;
import interfaz.GestorPestanyas;
import notas.Curso;

public class Paneles extends JPanel {
	
	public Paneles(Curso curso) {
		
		setLayout(new BorderLayout());
		BarraHerramientas barraHerramientas = new BarraHerramientas("Herramientas");
		add(barraHerramientas, BorderLayout.NORTH);
		GestorPestanyas gestorPestanyas = new GestorPestanyas(curso);
		add(gestorPestanyas, BorderLayout.CENTER);
	}

}
