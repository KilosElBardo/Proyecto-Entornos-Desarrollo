package interfaz.paneles;

import java.awt.Color;
import java.awt.GridBagLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DatosAlumnoIndividual extends JPanel {
	
	JLabel imagenPerfil = new JLabel("");
	JLabel IdEstudianteInfo = new JLabel("ID Estudiante: ");
	JLabel IdEstudiante = new JLabel("");
	JLabel nombreApellidos = new JLabel("");
	JLabel edadInfo = new JLabel("Edad: ");
	JLabel edad = new JLabel();
	JLabel sexoInfo = new JLabel("Sexo: ");
	JLabel notaExamenClasico3 = new JLabel();
	GridBagLayout gbc = new GridBagLayout();
	
	
	
	public DatosAlumnoIndividual() {
		
	
		imagenPerfil.setIcon(new ImageIcon(getClass().getResource("/resources/balnco rubio.png")));
		add(imagenPerfil);
		
	}
	
	
	
	
	
}
