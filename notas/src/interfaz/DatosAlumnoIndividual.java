/*
 * @version 1.0
 * @author David Quiles
 * @author Alejandro López
 */
package interfaz;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import notas.Alumno;

/**
 * Panel que mostrará los datos de un alumno en concreto.
 */
public class DatosAlumnoIndividual extends JPanel {
	
	/**  Label que mostrará la imagen de perfil. */
	JLabel imagenPerfil = new JLabel("");
	
	/** Label que mostrará el Id estudiante. */
	JLabel idEstudiante = new JLabel("");
	
	/** Label que mostrará los nombres y apellidos. */
	JLabel nombreApellidos = new JLabel("");
	
	/** Label que mostrará la edad. */
	JLabel edad = new JLabel();
	
	/** Label que mostrará el Id estudiante del alumno. */
	JLabel sexo = new JLabel("");
	
	/** El gbc en el que se indicará el layout del panel. */
	GridBagConstraints gbc = new GridBagConstraints();
	
	/**
	 * Agregará todos los elementos gráficos del panel.
	 */
	public DatosAlumnoIndividual() {
	
	nombreApellidos.setFont(new Font("Times New Roman", Font.BOLD, 40) );
	idEstudiante.setFont(new Font("Times New Roman", Font.PLAIN, 25) );
	edad.setFont(new Font("Times New Roman", Font.PLAIN, 25) );
	sexo.setFont(new Font("Times New Roman", Font.PLAIN, 25) );
		
    gbc.insets = new Insets(12,12,18,18);
	setLayout(new GridBagLayout());
	
	gbc.gridx = 0;
	gbc.gridy = 0;
	add(imagenPerfil, gbc);
		
	gbc.gridx = 0;
	gbc.gridy = 1;
	add(nombreApellidos, gbc);
		
	gbc.gridx = 0;
	gbc.gridy = 2;
	add(idEstudiante, gbc);
		
	gbc.gridx = 0;
	gbc.gridy = 3;
	add(edad, gbc);
		
	gbc.gridx = 0;
	gbc.gridy = 4;
	add(sexo, gbc);
		
		
	}
	
	/**
	 * Actualizará los elementos gráficos dependiendo del alumno que enviemos por parametro.
	 *
	 * @param alumno Alumno del que mostraremos los datos
	 */
	public void asignarTextoLabels(Alumno alumno) {
		
		imagenPerfil.setIcon(new ImageIcon(getClass().getResource(alumno.getImagen())));
		idEstudiante.setText("Id estudiante: " + String.valueOf(alumno.getIdEstudiante()));
		
		//Evitar efecto cambio de tamaño
		int longitud = alumno.getNombre().length() + alumno.getApellidos().length();
		System.out.println(longitud);
		nombreApellidos.setText(String.valueOf(alumno.getNombre() + " " + alumno.getApellidos()));
		edad.setText(String.valueOf("Edad: " + alumno.getEdad()));
		sexo.setText("Sexo: " + String.valueOf(alumno.getSexo()));
		
	}

}
