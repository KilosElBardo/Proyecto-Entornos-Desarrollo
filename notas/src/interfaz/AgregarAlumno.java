package interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

import notas.ExamenClasico;
import notas.ExamenTest;
import notas.Trabajo;

public class AgregarAlumno extends JFrame {
	
	JPanel examenesClasicosPanel = new JPanel();
	JPanel examenesTestsPanel = new JPanel();
	JPanel trabajosPanel = new JPanel();
	JPanel datosPersonalesPanel = new JPanel();
	
	JLabel examenesClasicosTitulo = new JLabel("Examenes clásicos");
	JLabel examenesTestsTitulo = new JLabel("Examenes tests");
	JLabel trabajosTitulo = new JLabel("Trabajos");
	JLabel examentTestTitulo1 = new JLabel("Examen test 1");
	JLabel examentTestTitulo2 = new JLabel("Examen test 2");
	JLabel datosPersonalesTitulo = new JLabel("Datos personales");
	JLabel primerTrabajoLabel = new JLabel("Primer trabajo: ");
	JLabel segundoTrabajoLabel = new JLabel("Segundo trabajo: ");
	JLabel tercerTrabajoLabel = new JLabel("Tercer trabajo: ");
	
	JSpinner notaClasica1 = new JSpinner();
	JSpinner notaClasica2 = new JSpinner();
	JSpinner notaClasica3 = new JSpinner();
	JSpinner diasRetrasoSpinner1 = new JSpinner();
	JSpinner diasRetrasoSpinner2 = new JSpinner();
	JSpinner diasRetrasoSpinner3 = new JSpinner();
	JSpinner aciertosTest1 = new JSpinner();
	JSpinner aciertosTest2 = new JSpinner();
	JSpinner fallosTest1 = new JSpinner();
	JSpinner fallosTest2 = new JSpinner();
	JSpinner noContestadasTest1 = new JSpinner();
	JSpinner noContestadasTest2 = new JSpinner();
	JSpinner edad = new JSpinner();
	
	JCheckBox trabajosCheckBox1 = new JCheckBox("Entregado");
	JCheckBox trabajosCheckBox2 = new JCheckBox("Entregado");
	JCheckBox trabajosCheckBox3 = new JCheckBox("Entregado");
	
	JSpinner[] diasRetraso = new JSpinner[3];
	
	GridBagConstraints principal = new GridBagConstraints();
	GridBagConstraints gridBagClasicos = new GridBagConstraints();
	GridBagConstraints gridBagTests = new GridBagConstraints();
	GridBagConstraints gridBagTrabajos = new GridBagConstraints();
	GridBagConstraints gridDatosPersonales = new GridBagConstraints();
	
	String defaultFont = javax.swing.UIManager.getDefaults().getFont("Label.font").getName();
	
	JTextField nombreTextField = new JTextField(20);
	JTextField apellidosTextField = new JTextField(20);
	
	JComboBox sexoComboBox = new JComboBox();
	
	JButton ingresarUsuarioBoton = new JButton("Ingresar");
	
	public AgregarAlumno() {
		
		setLayout(new GridLayout(2,2));
		agregarInterfazDatosPersonales();
		agregarInterfazExamenesClasicos();
		agregarInterfazTrabajos();
		agregarInterfazExamenesTests();
		propiedadesVentana();
	}
	
	private void agregarInterfazDatosPersonales() {
		
		propiedadesDefectoPaneles(datosPersonalesPanel);
		agregarEspaciadoGridBagLayout(10, 10, 10, 10, gridDatosPersonales);
		
		datosPersonalesTitulo.setFont(new Font(defaultFont, Font.BOLD, 20));
		agregarElementoAlPanel(datosPersonalesTitulo, datosPersonalesPanel, gridDatosPersonales, new Point(0,0));
		agregarElementoAlPanel(new JLabel("Nombre"), datosPersonalesPanel, gridDatosPersonales, new Point(0,1));
		agregarElementoAlPanel(nombreTextField, datosPersonalesPanel, gridDatosPersonales, new Point(1,1));
		
		agregarElementoAlPanel(new JLabel("Apellidos"), datosPersonalesPanel, gridDatosPersonales, new Point(0,2));
		agregarElementoAlPanel(apellidosTextField, datosPersonalesPanel, gridDatosPersonales, new Point(1,2));
		
		sexoComboBox.addItem("Hombre");
		sexoComboBox.addItem("Mujer");
		agregarElementoAlPanel(new JLabel("Sexo"), datosPersonalesPanel, gridDatosPersonales, new Point(0,3));
		agregarElementoAlPanel(sexoComboBox, datosPersonalesPanel, gridDatosPersonales, new Point(1,3));
		
		add(datosPersonalesPanel, BorderLayout.CENTER);
	}
	
	
	private void agregarInterfazExamenesTests() {
		
		//Propiedades del panel
		propiedadesDefectoPaneles(examenesTestsPanel);
		
		//Espaciado
		agregarEspaciadoGridBagLayout(10, 10, 10, 10, gridBagTests);
		
		//Agregar titulo
		cambiarTamanyoFuente(examenesTestsTitulo, 15);
		agregarElementoAlPanel(examenesTestsTitulo, examenesTestsPanel, gridBagTests, new Point(0,0));
		
		//Examen test 1, agregar componentes
		cambiarTamanyoFuente(examentTestTitulo1, 15);
		agregarElementoAlPanel(examentTestTitulo1, examenesTestsPanel, gridBagTests, new Point(0,1));
		agregarElementoAlPanel(new JLabel("Aciertos "), examenesTestsPanel, gridBagTests, new Point(0,2));
		agregarElementoAlPanel(aciertosTest1, examenesTestsPanel, gridBagTests, new Point(1,2));
		agregarElementoAlPanel(new JLabel("Fallos "), examenesTestsPanel, gridBagTests, new Point(0,3));
		agregarElementoAlPanel(fallosTest1, examenesTestsPanel, gridBagTests, new Point(1,3));
		agregarElementoAlPanel(new JLabel("Sin contestar"), examenesTestsPanel, gridBagTests, new Point(0,4));
		agregarElementoAlPanel(noContestadasTest1, examenesTestsPanel, gridBagTests, new Point(1,4));
		
		//Examen test2 2, agregar componentes
		cambiarTamanyoFuente(examentTestTitulo2, 15);
		agregarElementoAlPanel(examentTestTitulo2, examenesTestsPanel, gridBagTests, new Point(0,5));
		agregarElementoAlPanel(new JLabel("Aciertos "), examenesTestsPanel, gridBagTests, new Point(0,6));
		agregarElementoAlPanel(aciertosTest2, examenesTestsPanel, gridBagTests, new Point(1,6));
		agregarElementoAlPanel(new JLabel("Fallos "), examenesTestsPanel, gridBagTests, new Point(0,7));
		agregarElementoAlPanel(fallosTest2, examenesTestsPanel, gridBagTests, new Point(1,7));
		agregarElementoAlPanel(new JLabel("Sin contestar"), examenesTestsPanel, gridBagTests, new Point(0,8));
		agregarElementoAlPanel(noContestadasTest2, examenesTestsPanel, gridBagTests, new Point(1,8));
		
		add(examenesTestsPanel, BorderLayout.CENTER);
	}
	
	private void recogerTodosLosDatos() {
		
		
		recogerExamenesClasicos();
		recogerExamenesTest();
		recogerTrabajos();
		
	}
	
	private ExamenClasico[] recogerExamenesClasicos() {
		
		ExamenClasico[] examenesClasicos = new ExamenClasico[3]; 
		examenesClasicos[0] = new ExamenClasico((double) notaClasica1.getValue());
		examenesClasicos[1] = new ExamenClasico((double) notaClasica2.getValue());
		examenesClasicos[2] = new ExamenClasico((double) notaClasica3.getValue());
		return examenesClasicos;
		
	}
	
	private ExamenTest[] recogerExamenesTest() {
		
		ExamenTest[] examenesTests = new ExamenTest[2];
		examenesTests[0] = new ExamenTest((int) aciertosTest1.getValue(), (int) fallosTest1.getValue(), (int) noContestadasTest1.getValue());
		examenesTests[1] = new ExamenTest((int) aciertosTest2.getValue(), (int) fallosTest2.getValue(), (int) noContestadasTest2.getValue());
		return examenesTests;
		
	}
	
	private Trabajo[] recogerTrabajos() {
		
		Trabajo[] trabajos = new Trabajo[3];
		trabajos[0] = new Trabajo(trabajosCheckBox1.isSelected(), (int) diasRetrasoSpinner1.getValue());
		trabajos[2] = new Trabajo(trabajosCheckBox2.isSelected(), (int) diasRetrasoSpinner2.getValue());
		trabajos[3] = new Trabajo(trabajosCheckBox3.isSelected(), (int) diasRetrasoSpinner3.getValue());
		return trabajos;
		
	}
	
	private void cambiarTamanyoFuente(JComponent component, int tamanyo) {
		
		component.setFont(new Font(defaultFont, Font.BOLD, tamanyo));
	}
	
	private void agregarInterfazExamenesClasicos() {
		
		propiedadesDefectoPaneles(examenesClasicosPanel);
		
		agregarEspaciadoGridBagLayout(10, 10, 10, 10, gridBagClasicos);
		
		examenesClasicosTitulo.setFont(new Font(defaultFont, Font.BOLD, 20));
		agregarElementoAlPanel(examenesClasicosTitulo, examenesClasicosPanel, gridBagClasicos, new Point(0,0));
		agregarElementoAlPanel(primerTrabajoLabel, examenesClasicosPanel, gridBagClasicos, new Point(0,1));
		agregarElementoAlPanel(notaClasica1, examenesClasicosPanel, gridBagClasicos, new Point(1,1));
		agregarElementoAlPanel(segundoTrabajoLabel, examenesClasicosPanel, gridBagClasicos, new Point(0,2));
		agregarElementoAlPanel(notaClasica2, examenesClasicosPanel, gridBagClasicos, new Point(1,2));
		agregarElementoAlPanel(tercerTrabajoLabel, examenesClasicosPanel, gridBagClasicos, new Point(0,3));
		agregarElementoAlPanel(notaClasica3, examenesClasicosPanel, gridBagClasicos, new Point(1,3));
		
		add(examenesClasicosPanel, BorderLayout.EAST);
		
	}
	
	private void agregarInterfazTrabajos() {
		
		propiedadesDefectoPaneles(trabajosPanel);
		agregarEspaciadoGridBagLayout(10, 10, 10, 10, gridBagTrabajos);
		
		trabajosTitulo.setFont(new Font(defaultFont, Font.BOLD, 20));
		
		//Agregamos el titulo
		agregarElementoAlPanel(trabajosTitulo, trabajosPanel, gridBagTrabajos, new Point(0,0));
		
		//Agregamos el primer label junto con un checkbox de trabajos y un JSpinner para indicar los días de retraso
		agregarElementoAlPanel(new JLabel("Primer trabajo"), trabajosPanel, gridBagTrabajos, new Point(0,1));
		agregarElementoAlPanel(trabajosCheckBox1, trabajosPanel, gridBagTrabajos, new Point(1,1));
		agregarElementoAlPanel(diasRetrasoSpinner1, trabajosPanel, gridBagTrabajos, new Point(2,1));
		agregarElementoAlPanel(new JLabel("días de retraso"), trabajosPanel, gridBagTrabajos, new Point(3,1));
		
		agregarElementoAlPanel(new JLabel("Segundo trabajo"), trabajosPanel, gridBagTrabajos, new Point(0,2));
		agregarElementoAlPanel(trabajosCheckBox2, trabajosPanel, gridBagTrabajos, new Point(1,2));
		agregarElementoAlPanel(diasRetrasoSpinner2, trabajosPanel, gridBagTrabajos, new Point(2,2));
		agregarElementoAlPanel(new JLabel("días de retraso"), trabajosPanel, gridBagTrabajos, new Point(3,2));
	
		agregarElementoAlPanel(new JLabel("Segundo trabajo"), trabajosPanel, gridBagTrabajos, new Point(0,3));
		agregarElementoAlPanel(trabajosCheckBox3, trabajosPanel, gridBagTrabajos, new Point(1,3));
		agregarElementoAlPanel(diasRetrasoSpinner3, trabajosPanel, gridBagTrabajos, new Point(2,3));
		agregarElementoAlPanel(new JLabel("días de retraso"), trabajosPanel, gridBagTrabajos, new Point(3,3));
		
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
		setSize(new Dimension(900, 900));
		setLocationRelativeTo(null);
		setResizable(true);
		setVisible(true);
	}
	
	

}
