package interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JToolBar;

public class BarraHerramientas extends JToolBar {

	private JButton agregarUsuarioBoton;
	private JButton eliminarUsuarioBoton;
	
	public BarraHerramientas(String message) {
		super(message);
		agregarBotones();
		
	}
	
	private void agregarBotones() {
		agregarUsuarioBoton = new JButton("Agregar alumno");
		eliminarUsuarioBoton = new JButton("Eliminar alumno");
		add(agregarUsuarioBoton);
		add(eliminarUsuarioBoton);
		eventoClickBotonAgregar();
		eventoClickBotonEliminar();
	}
	
	private void eventoClickBotonAgregar() {
		
		agregarUsuarioBoton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Agregar usuario");
				
			}
			
		});
	}
	
	private void eventoClickBotonEliminar() {
		
		eliminarUsuarioBoton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Eliminar usuario");
				
			}
			
		});
	}
}
