package interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Point;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;

public class AgregarAlumno extends JFrame {
	
	JPanel examenesClasicosPanel = new JPanel();
	JPanel examenesTestsPanel = new JPanel();
	JPanel trabajosPanel = new JPanel();
	
	JLabel examenesClasicosTitulo = new JLabel("Examenes clásicos");
	JLabel trabajosTitulo = new JLabel("Trabajos");
	JLabel primero = new JLabel("Primero ");
	JLabel segundo = new JLabel("Segundo ");
	JLabel tercero = new JLabel("Tercero ");
	
	JSpinner notaClasica1 = new JSpinner();
	JSpinner notaClasica2 = new JSpinner();
	JSpinner notaClasica3 = new JSpinner();
	
	JToggleButton trabajo1 = new JToggleButton();
	JToggleButton trabajo2 = new JToggleButton();
	JToggleButton trabajo3 = new JToggleButton();
	
	GridBagConstraints principal = new GridBagConstraints();
	GridBagConstraints gridBagClasicos = new GridBagConstraints();
	GridBagConstraints gridBagTests = new GridBagConstraints();
	GridBagConstraints gridBagTrabajos = new GridBagConstraints();
	
	String defaultFont = javax.swing.UIManager.getDefaults().getFont("Label.font").getName();
	
	public AgregarAlumno() {
	
		setLayout(new BorderLayout());
		agregarExamenesClasicos();
		agregarTrabajos();
		propiedadesVentana();
	}
	
	private void agregarExamenesClasicos() {
		
		propiedadesDefectoPaneles(examenesClasicosPanel);
		
		agregarEspaciadoGridBagLayout(10, 10, 10, 10, gridBagClasicos);
		
		examenesClasicosTitulo.setFont(new Font(defaultFont, Font.BOLD, 20));
		agregarElementoAlPanel(examenesClasicosTitulo, examenesClasicosPanel, gridBagClasicos, new Point(0,0));
		agregarElementoAlPanel(primero, examenesClasicosPanel, gridBagClasicos, new Point(0,1));
		agregarElementoAlPanel(notaClasica1, examenesClasicosPanel, gridBagClasicos, new Point(1,1));
		agregarElementoAlPanel(segundo, examenesClasicosPanel, gridBagClasicos, new Point(0,2));
		agregarElementoAlPanel(notaClasica2, examenesClasicosPanel, gridBagClasicos, new Point(1,2));
		agregarElementoAlPanel(tercero, examenesClasicosPanel, gridBagClasicos, new Point(0,3));
		agregarElementoAlPanel(notaClasica3, examenesClasicosPanel, gridBagClasicos, new Point(1,3));
		
		add(examenesClasicosPanel, BorderLayout.EAST);
		
	}
	
private void agregarTrabajos() {
		
		propiedadesDefectoPaneles(trabajosPanel);
		
		agregarEspaciadoGridBagLayout(10, 10, 10, 10, gridBagTrabajos);
		
		trabajosTitulo.setFont(new Font(defaultFont, Font.BOLD, 20));
		agregarElementoAlPanel(trabajosTitulo, trabajosPanel, gridBagTrabajos, new Point(0,0));
		agregarElementoAlPanel(primero, trabajosPanel, gridBagTrabajos, new Point(0,1));
		agregarElementoAlPanel(trabajo1, trabajosPanel, gridBagTrabajos, new Point(1,1));
		agregarElementoAlPanel(segundo, trabajosPanel, gridBagTrabajos, new Point(0,2));
		agregarElementoAlPanel(trabajo2, trabajosPanel, gridBagTrabajos, new Point(1,2));
		agregarElementoAlPanel(tercero, trabajosPanel, gridBagTrabajos, new Point(0,3));
		agregarElementoAlPanel(trabajo3, trabajosPanel, gridBagTrabajos, new Point(1,3));
		
		add(trabajosPanel, BorderLayout.WEST);
		
	}
	
	
	private void propiedadesDefectoPaneles(JPanel panel) {
		panel.setLayout(new GridBagLayout());
		panel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
		
	}
	
	/**
	 * 
	 * @param componente Componente swing que queremos agregar 
	 * @param panel Panel al que agregaremos el componente swing
	 * @param gbc GridBagConstraints al que le indicaremos las posiciones
	 * @param ubicacion Coordenadas en X e Y donde situaremos el componente dentro del panel
	 * 
	 */
	private void agregarElementoAlPanel(JComponent componente, JPanel panel, GridBagConstraints gbc, Point ubicacion) {
		
		gbc.gridx = ubicacion.x;
		gbc.gridy = ubicacion.y;
		panel.add(componente, gbc);
		
	}
	
	private void agregarEspaciadoGridBagLayout(int arriba, int derecha, int abajo, int izquierda, GridBagConstraints gbc) {
		gbc.insets = new Insets( arriba, derecha, abajo, izquierda);
	}
	
	private void propiedadesVentana() {
		setSize(new Dimension(600, 600));
		setLocationRelativeTo(null);
		setResizable(true);
		setVisible(true);
	}
	
	

}
