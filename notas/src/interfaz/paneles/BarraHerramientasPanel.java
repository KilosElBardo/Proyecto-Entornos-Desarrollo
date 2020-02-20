package interfaz.paneles;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import interfaz.BarraHerramientas;
import interfaz.GestorPestanyas;

public class BarraHerramientasPanel extends JPanel {
	
	public BarraHerramientasPanel() {
		
		setLayout(new BorderLayout());
		BarraHerramientas barraHerramientas = new BarraHerramientas("Herramientas");
		add(barraHerramientas, BorderLayout.NORTH);
		GestorPestanyas gestorPestanyas = new GestorPestanyas();
		add(gestorPestanyas, BorderLayout.CENTER);
	}

}
