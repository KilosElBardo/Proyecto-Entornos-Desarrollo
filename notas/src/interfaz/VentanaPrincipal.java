
/*
 * Colores --> Rojo 196, 72, 29
 */

package interfaz;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

import interfaz.paneles.Paneles;
import notas.Curso;

public class VentanaPrincipal extends JFrame implements Runnable {
	
	private Thread hilo;
	private Curso curso;
	private Paneles paneles;
	
	public VentanaPrincipal() {
		hilo = new Thread(this);
		hilo.start();
	}
	
	private void propiedadesVentana() {
		setSize(new Dimension(1100, 1000));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(true);
		setVisible(true);
	}
	
	private void establecerIconoVentana() {
		
	}
	
	private void agregarPaneles() {
		
		paneles = new Paneles(curso);
		this.getContentPane().add(paneles);
	}
	
	

	@Override
	public void run() {
		
		establecerIconoVentana();
		generarCurso();
		agregarPaneles();
		propiedadesVentana();
		
		
		
	}
	
	private void generarCurso() {
		
		curso = new Curso();
	}
	
}
