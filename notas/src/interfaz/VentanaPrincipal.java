package interfaz;

import java.awt.Dimension;

import javax.swing.JFrame;

import interfaz.paneles.BarraHerramientasPanel;

public class VentanaPrincipal extends JFrame implements Runnable {
	
	private Thread hilo;
	
	public VentanaPrincipal() {
		hilo = new Thread(this);
		hilo.start();
	}
	
	private void propiedadesVentana() {
		setSize(new Dimension(1000, 1000));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
	
		setResizable(false);
		setVisible(true);
	}
	
	private void establecerIconoVentana() {
		
	}
	
	private void agregarBarraHerramientas() {
		BarraHerramientasPanel barraHerramientas = new BarraHerramientasPanel();
		this.getContentPane().add(barraHerramientas);
	}

	@Override
	public void run() {
		
		establecerIconoVentana();
		agregarBarraHerramientas();
		propiedadesVentana();
	}
	
}
