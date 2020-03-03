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

import notas.Alumno;
import notas.Curso;
import notas.ExamenClasico;
import notas.ExamenTest;
import notas.Trabajo;

// TODO: Auto-generated Javadoc
/**
 * Class NuevoAlumno.
 */
/*
 * <h2> Nuevo alumno </h2>
 * Clase que representarï¿½ un alumno del curso
 * 
 * @version 1.0
 * @author David Quiles
 * @author Alejandro López
 */
public class NuevoAlumno extends JFrame {
	
	/** examenes clasicos panel. */
	JPanel examenesClasicosPanel = new JPanel();
	
	/** examenes tests panel. */
	JPanel examenesTestsPanel = new JPanel();
	
	/** trabajos panel. */
	JPanel trabajosPanel = new JPanel();
	
	/** datos personales panel. */
	JPanel datosPersonalesPanel = new JPanel();
	
	/** examenes clasicos titulo. */
	JLabel examenesClasicosTitulo = new JLabel("Examenes clásicos");
	
	/** examenes tests titulo. */
	JLabel examenesTestsTitulo = new JLabel("Examenes tests");
	
	/** trabajos titulo. */
	JLabel trabajosTitulo = new JLabel("Trabajos");
	
	/** exament test titulo 1. */
	JLabel examentTestTitulo1 = new JLabel("Examen test 1");
	
	/** exament test titulo 2. */
	JLabel examentTestTitulo2 = new JLabel("Examen test 2");
	
	/** datos personales titulo. */
	JLabel datosPersonalesTitulo = new JLabel("Datos personales");
	
	/** primer trabajo label. */
	JLabel primerTrabajoLabel = new JLabel("Primer trabajo: ");
	
	/** segundo trabajo label. */
	JLabel segundoTrabajoLabel = new JLabel("Segundo trabajo: ");
	
	/** tercer trabajo label. */
	JLabel tercerTrabajoLabel = new JLabel("Tercer trabajo: ");
	
	/** nota clasica 1. */
	JSpinner notaClasica1 = new JSpinner();
	
	/** nota clasica 2. */
	JSpinner notaClasica2 = new JSpinner();
	
	/** nota clasica 3. */
	JSpinner notaClasica3 = new JSpinner();
	
	/** dias retraso spinner 1. */
	JSpinner diasRetrasoSpinner1 = new JSpinner();
	
	/** dias retraso spinner 2. */
	JSpinner diasRetrasoSpinner2 = new JSpinner();
	
	/** dias retraso spinner 3. */
	JSpinner diasRetrasoSpinner3 = new JSpinner();
	
	/** aciertos test 1. */
	JSpinner aciertosTest1 = new JSpinner();
	
	/** aciertos test 2. */
	JSpinner aciertosTest2 = new JSpinner();
	
	/** fallos test 1. */
	JSpinner fallosTest1 = new JSpinner();
	
	/** fallos test 2. */
	JSpinner fallosTest2 = new JSpinner();
	
	/** no contestadas test 1. */
	JSpinner noContestadasTest1 = new JSpinner();
	
	/** no contestadas test 2. */
	JSpinner noContestadasTest2 = new JSpinner();
	
	/** edad. */
	JSpinner edad = new JSpinner();
	
	/** dias retraso. */
	JSpinner[] diasRetraso = new JSpinner[3];
	
	/** trabajos check box 1. */
	JCheckBox trabajosCheckBox1 = new JCheckBox("Entregado");
	
	/** trabajos check box 2. */
	JCheckBox trabajosCheckBox2 = new JCheckBox("Entregado");
	
	/** trabajos check box 3. */
	JCheckBox trabajosCheckBox3 = new JCheckBox("Entregado");
	
	/** principal. */
	GridBagConstraints principal = new GridBagConstraints();
	
	/** grid bag clasicos. */
	GridBagConstraints gridBagClasicos = new GridBagConstraints();
	
	/** grid bag tests. */
	GridBagConstraints gridBagTests = new GridBagConstraints();
	
	/** grid bag trabajos. */
	GridBagConstraints gridBagTrabajos = new GridBagConstraints();
	
	/** grid datos personales. */
	GridBagConstraints gridDatosPersonales = new GridBagConstraints();
	
	/** default font. */
	String defaultFont = javax.swing.UIManager.getDefaults().getFont("Label.font").getName();
	
	/** nombre text field. */
	JTextField nombreTextField = new JTextField(20);
	
	/** apellidos text field. */
	JTextField apellidosTextField = new JTextField(20);
	
	/** sexo combo box. */
	JComboBox sexoComboBox = new JComboBox();
	
	/** ingresar nuevo alumno boton. */
	JButton ingresarNuevoAlumnoBoton = new JButton("Ingresar");
	
	/** curso. */
	private Curso curso;
	
	/**
	 * Se encarga de crear la ventana, agregar la interfaz del formulario y agregar el evento de click al botón de ingresar alumno.
	 *
	 * @param curso Recibe el curso previamente creado para utilizar algunos de sus métodos como por ejemplo <b>agregarAlumnoACurso (Alumno alumno)</b>
	 */
	public NuevoAlumno(Curso curso) {
		
		this.curso = curso;
		setLayout(new GridLayout(2,2));
		agregarInterfazDatosPersonales();
		agregarInterfazExamenesClasicos();
		agregarInterfazTrabajos();
		agregarInterfazExamenesTests();
		propiedadesVentana();
		
		ingresarNuevoAlumnoBoton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
		
				agregarAlumno();
				setVisible(false);
			}
			
		});
	}
	
	/**
	 * Agrega la interfaz gráfica para que el usuario escriba los datos personales del nuevo alumno cómo el <b>nombre</b>, <b>apellidos</b>, <b>edad</b>.
	 */
	private void agregarInterfazDatosPersonales() {
		
		propiedadesDefectoPaneles(datosPersonalesPanel);
		agregarEspaciadoGridBagLayout(10, 10, 10, 10, gridDatosPersonales);
		
		datosPersonalesTitulo.setFont(new Font(defaultFont, Font.BOLD, 20));
		agregarElementoAlPanel(datosPersonalesTitulo, datosPersonalesPanel, gridDatosPersonales, new Point(0,0));
		agregarElementoAlPanel(new JLabel("Nombre"), datosPersonalesPanel, gridDatosPersonales, new Point(0,1));
		agregarElementoAlPanel(nombreTextField, datosPersonalesPanel, gridDatosPersonales, new Point(1,1));
		
		agregarElementoAlPanel(new JLabel("Apellidos"), datosPersonalesPanel, gridDatosPersonales, new Point(0,2));
		agregarElementoAlPanel(apellidosTextField, datosPersonalesPanel, gridDatosPersonales, new Point(1,2));
		
		agregarElementoAlPanel(new JLabel("Edad"), datosPersonalesPanel, gridDatosPersonales, new Point(0,3));
		agregarElementoAlPanel(edad, datosPersonalesPanel, gridDatosPersonales, new Point(1,3));
		
		sexoComboBox.addItem("Hombre");
		sexoComboBox.addItem("Mujer");
		agregarElementoAlPanel(new JLabel("Sexo"), datosPersonalesPanel, gridDatosPersonales, new Point(0,4));
		agregarElementoAlPanel(sexoComboBox, datosPersonalesPanel, gridDatosPersonales, new Point(1,4));
		
		agregarElementoAlPanel(ingresarNuevoAlumnoBoton, datosPersonalesPanel, gridDatosPersonales, new Point(0,5));
		
		add(datosPersonalesPanel, BorderLayout.CENTER);
	}
	
	/**
	 * Agrega la interfaz gráfica para que el usuario introduzca los datos de los examenes de tipo test.
	 */
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
		agregarElementoAlPanel(new JLabel("Recuerda la suma de aciertos más fallos más sin contestar debe ser " + 50), examenesTestsPanel, gridBagTests, new Point(0,9));
		
		add(examenesTestsPanel, BorderLayout.CENTER);
	}
	
	/**
	 * Agrega la interfaz gráfica para que el usuario introduzca los datos de los examenes de tipo clásico.
	 */
	private void agregarInterfazExamenesClasicos() {
		
		propiedadesDefectoPaneles(examenesClasicosPanel);
		
		agregarEspaciadoGridBagLayout(10, 10, 10, 10, gridBagClasicos);
		
		examenesClasicosTitulo.setFont(new Font(defaultFont, Font.BOLD, 20));
		agregarElementoAlPanel(examenesClasicosTitulo, examenesClasicosPanel, gridBagClasicos, new Point(0,0));
		agregarElementoAlPanel(new JLabel("Examen 1"), examenesClasicosPanel, gridBagClasicos, new Point(0,1));
		agregarElementoAlPanel(notaClasica1, examenesClasicosPanel, gridBagClasicos, new Point(1,1));
		agregarElementoAlPanel(new JLabel("Examen 2"), examenesClasicosPanel, gridBagClasicos, new Point(0,2));
		agregarElementoAlPanel(notaClasica2, examenesClasicosPanel, gridBagClasicos, new Point(1,2));
		agregarElementoAlPanel(new JLabel("Examen 3"), examenesClasicosPanel, gridBagClasicos, new Point(0,3));
		agregarElementoAlPanel(notaClasica3, examenesClasicosPanel, gridBagClasicos, new Point(1,3));
		
		add(examenesClasicosPanel, BorderLayout.EAST);
		
	}
	
	/**
	 * Agrega la interfaz gráfica para que el usuario introduzca los datos de los trabajos.
	 */
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
	
	/**
	 * Agregará un alumno al curso y nos lo incluirá en las tablas.
	 */
	private void agregarAlumno() {
		
		boolean isFemenino = (sexoComboBox.getSelectedItem().toString().equals("Mujer"))?true:false;
		Alumno newAlumno = new Alumno(nombreTextField.getText(), apellidosTextField.getText(), (int) edad.getValue(), isFemenino, recogerExamenesTest(), recogerExamenesClasicos(), recogerTrabajos());
		curso.agregarAlumnoACurso(newAlumno);
		agregarAlumnoATabla();

	}
	
	/**
	 * Agregará el alumno nuevo creado a la tabla de notas clásicas, tests y trabajos.
	 */
	private void agregarAlumnoATabla() {
		String[] informacionClasicos = curso.generarInformacionExamenesClasicos(Curso.alumnosRegistrados-1);
		String[] informacionTests = curso.generarInformacionExamenesTests(Curso.alumnosRegistrados-1);
		String[] informacionTrabajos = curso.generarInformacionTrabajos(Curso.alumnosRegistrados-1);
		String[] informacionFinales = curso.generarInformacionFinales(Curso.alumnosRegistrados-1);
		
		NotasClasicos.agregarFilaClasica(informacionClasicos);
		NotasTests.agregarFilaTest(informacionTests);
		Trabajos.agregarFilaTrabajo(informacionTrabajos);
		NotasFinales.agregarFilaFinales(informacionFinales);
	}
	
	/**
	 * Recogerá los examenes de tipo clásico del formulario y nos devolverá un array.
	 *
	 * @return Devuelve un array con los exámenes de tipo clásico para el nuevo usuario
	 */
	private ExamenClasico[] recogerExamenesClasicos() {
		
		ExamenClasico[] examenesClasicos = new ExamenClasico[3]; 

		examenesClasicos[0] = new ExamenClasico((int) notaClasica1.getValue());
		examenesClasicos[1] = new ExamenClasico((int) notaClasica2.getValue());
		examenesClasicos[2] = new ExamenClasico((int) notaClasica3.getValue());
		return examenesClasicos;
		
	}
	
	/**
	 * Recogerá los examenes de tipo test del formulario y nos devolverá un array.
	 *
	 * @return Devuelve un array con los exámenes de tipo test para el nuevo usuario
	 */
	private ExamenTest[] recogerExamenesTest() {
		
		ExamenTest[] examenesTests = new ExamenTest[2];
		examenesTests[0] = new ExamenTest((int) aciertosTest1.getValue(), (int) fallosTest1.getValue(), (int) noContestadasTest1.getValue());
		examenesTests[1] = new ExamenTest((int) aciertosTest2.getValue(), (int) fallosTest2.getValue(), (int) noContestadasTest2.getValue());
		return examenesTests;
		
	}
	
	/**
	 * Recogerá los trabajos del formulario y nos devolverá un array.
	 *
	 * @return Devuelve array con los trabajoss para el nuevo usuario
	 */
	private Trabajo[] recogerTrabajos() {
		
		Trabajo[] trabajos = new Trabajo[3];
		trabajos[0] = new Trabajo(trabajosCheckBox1.isSelected(), (int) diasRetrasoSpinner1.getValue());
		trabajos[1] = new Trabajo(trabajosCheckBox2.isSelected(), (int) diasRetrasoSpinner2.getValue());
		trabajos[2] = new Trabajo(trabajosCheckBox3.isSelected(), (int) diasRetrasoSpinner3.getValue());
		return trabajos;
		
	}
	
	/**
	 * Permite cambiar el tamaño de la fuente de un componente gráfico.
	 *
	 * @param component Componente al que afectaremos
	 * @param tamanyo Nuevo tamaño de la fuente
	 */
	private void cambiarTamanyoFuente(JComponent component, int tamanyo) {
		
		component.setFont(new Font(defaultFont, Font.BOLD, tamanyo));
	}
	
	/**
	 * Establecerá las propiedades que tendrá por defecto cada panel creado en esta ventana.
	 *
	 * @param panel Panel al que afectará
	 */
	private void propiedadesDefectoPaneles(JPanel panel) {
		panel.setLayout(new GridBagLayout());
		panel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
		
	}
	
	/**
	 * Agregar elemento al panel.
	 *
	 * @param componente Componente swing que queremos agregar
	 * @param panel Panel al que agregaremos el componente swing
	 * @param gbc GridBagConstraints al que le indicaremos las posiciones
	 * @param ubicacion Coordenadas en X e Y donde situaremos el componente dentro del panel
	 */
	private void agregarElementoAlPanel(JComponent componente, JPanel panel, GridBagConstraints gbc, Point ubicacion) {
		
		gbc.gridx = ubicacion.x;
		gbc.gridy = ubicacion.y;
		panel.add(componente, gbc);
		
	}
	
	/**
	 * Permite agregar espaciado entre los componentes de la interfaz gráfica.
	 *
	 * @param arriba Espacio arriba
	 * @param derecha Espacio derecha
	 * @param abajo Espacio abajo
	 * @param izquierda Espacio izquierda
	 * @param gbc GridBagConstraints al que agregará el espacio
	 */
	private void agregarEspaciadoGridBagLayout(int arriba, int derecha, int abajo, int izquierda, GridBagConstraints gbc) {
		gbc.insets = new Insets( arriba, derecha, abajo, izquierda);
	}
	
	/**
	 * Establece las propiedades de la ventana NuevoAlumno.
	 */
	private void propiedadesVentana() {
		setSize(new Dimension(1100, 900));
		setLocationRelativeTo(null);
		setResizable(true);
		setVisible(true);
	}
	
}
