package interfaz;

import javax.swing.JTabbedPane;

import interfaz.paneles.NotasClasicos;
import interfaz.paneles.NotasFinales;
import interfaz.paneles.NotasTests;
import interfaz.paneles.Trabajos;

public class GestorPestanyas extends JTabbedPane {
	
	public GestorPestanyas() {
		
		
		addTab("Nota Examenes Clásico", new NotasClasicos());
		addTab("Nota Examenes Test", new NotasTests());
		addTab("Trabajos", new Trabajos());
		addTab("Notas finales", new NotasFinales());
		
	}

}
