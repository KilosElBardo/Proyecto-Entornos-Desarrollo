package interfaz.paneles;

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

public class DatosAlumnoIndividual extends JPanel {
	
	JLabel imagenPerfil = new JLabel("");
	JLabel idEstudianteInfo = new JLabel("");
	JLabel idEstudiante = new JLabel("");
	JLabel nombreApellidos = new JLabel("");
	JLabel edad = new JLabel();
	JLabel sexo = new JLabel("");
	GridBagConstraints gbc = new GridBagConstraints();
	
	
	
	
	
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
	
	public void asignarTextoLabel(Alumno alumno) {
		
		imagenPerfil.setIcon(new ImageIcon(getClass().getResource(alumno.getImagen())));
		idEstudiante.setText("Id estudiante: " + String.valueOf(alumno.getIdEstudiante()));
		nombreApellidos.setText(String.valueOf(alumno.getNombre() + " " + alumno.getApellidos()));
		edad.setText(String.valueOf("Edad: " + alumno.getEdad()));
		sexo.setText("Sexo: " + String.valueOf(alumno.getSexo()));
	
		
		
	}
	
	
	
	
	
}
