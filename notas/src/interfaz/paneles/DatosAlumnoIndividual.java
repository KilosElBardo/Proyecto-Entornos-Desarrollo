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
	JLabel idEstudianteInfo = new JLabel("ID Estudiante: ");
	JLabel idEstudiante = new JLabel("");
	JLabel nombreApellidos = new JLabel("");
	JLabel edadInfo = new JLabel("Edad: ");
	JLabel edad = new JLabel();
	JLabel sexoInfo = new JLabel("Sexo: ");
	JLabel sexo = new JLabel("Sexo: ");
	GridBagConstraints gbc = new GridBagConstraints();
	
	
	
	
	
	public DatosAlumnoIndividual() {
	
	nombreApellidos.setFont(new Font("Century Gothic", Font.BOLD, 30) );
	idEstudiante.setFont(new Font("Century Gothic", Font.BOLD, 30) );
	edad.setFont(new Font("Century Gothic", Font.BOLD, 30) );
	sexo.setFont(new Font("Century Gothic", Font.BOLD, 30) );
		
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
		add (idEstudianteInfo, gbc);
		
	gbc.gridx = 1;
	gbc.gridy = 2;
		add(idEstudiante, gbc);
		
	gbc.gridx = 0;
	gbc.gridy = 3;
		add(edadInfo, gbc);
		
	gbc.gridx = 1;
	gbc.gridy = 3;
		add(edad, gbc);
		
	gbc.gridx = 0;
	gbc.gridy = 4;
		add(sexoInfo, gbc);
		
	gbc.gridx = 1;
	gbc.gridy = 4;
		add(sexo, gbc);
		
		
	}
	
	public void asignarTextoLabel(Alumno alumno) {
		
		imagenPerfil.setIcon(new ImageIcon(getClass().getResource(alumno.getImagen())));
		nombreApellidos.setText(String.valueOf(alumno.getNombre() + " " + alumno.getApellidos()));
		edad.setText(String.valueOf(alumno.getEdad()));
		idEstudiante.setText(String.valueOf(alumno.getIdEstudiante()));
		sexo.setText(String.valueOf(alumno.getSexo()));
	
		
		
	}
	
	
	
	
	
}
