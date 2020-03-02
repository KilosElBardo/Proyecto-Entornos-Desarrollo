package interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Insets;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

import interfaz.paneles.DatosAlumnoIndividual;
import notas.Curso;

public class Pestanya extends JPanel {
	
	//Para evitar que al cambiar de pestaña se cambie al primer usuario
	public static int idUsuarioSeleccionado = 1;
	
	protected JTable tabla;
	protected DatosAlumnoIndividual datosAlumnoIndividual;
	public static JScrollPane scrollTabla;
	protected String[][] datosTabla;
	protected String[] columnasTabla;
	protected DefaultTableModel model;
	protected GestorPestanyas gestorPestanyas;
	
	public Pestanya(String[][] datosTabla, String[] columnasTabla, GestorPestanyas gestorPestanyas) {

		setLayout(new BorderLayout());
		
		this.datosTabla = datosTabla;
		this.columnasTabla = columnasTabla;
		this.gestorPestanyas = gestorPestanyas;
		
		actualizarTabla();

	
	}
	
	protected void mostrarInformacionUsuarioSeleccionado() {
		datosAlumnoIndividual.asignarTextoLabels(Curso.obtenerAlumnoPorID(idUsuarioSeleccionado));
		tabla.changeSelection(idUsuarioSeleccionado-1, 0, false, false);
	}
	
	public void actualizarTabla() {
		
		agregarTabla();
		ajustarColumnaTablaAlContenido(tabla);
		agregarMouseListenerTabla();
		agregarDatosAlumnoPanel();
		agregarBuscador();
		mostrarInformacionUsuarioSeleccionado();
		
		gestorPestanyas.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				mostrarInformacionUsuarioSeleccionado();
				
			}
			
		});
	}
	
	protected void agregarTabla() {
		
		model = new DefaultTableModel();
		tabla = new JTable(model);
	
		for (int i = 0; i < columnasTabla.length; i++) {
			model.addColumn(columnasTabla[i]);
		}
		for (int i = 0; i < datosTabla.length; i++) {
			model.addRow(datosTabla[i]);
		}
		scrollTabla = new JScrollPane(tabla);
		model.addTableModelListener(new TableModelListener() {
			
			@Override
			public void tableChanged(TableModelEvent e) {
				// TODO Auto-generated method stub
				tabla.updateUI();
				

			}
		});
		add(scrollTabla, BorderLayout.EAST);
	
	}
	
	
	
	protected void agregarMouseListenerTabla() {
		tabla.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
			
				int filaSeleccionada = tabla.getSelectedRow();
				datosAlumnoIndividual.asignarTextoLabels(Curso.obtenerAlumnoPorID(filaSeleccionada + 1));
				idUsuarioSeleccionado = filaSeleccionada + 1;

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
	}

	protected void agregarDatosAlumnoPanel() {
		datosAlumnoIndividual = new DatosAlumnoIndividual();
		//Padding del panel
		datosAlumnoIndividual.setBorder(new EmptyBorder(new Insets(40, 40, 40, 40)));
		add(datosAlumnoIndividual, BorderLayout.CENTER);
	}
	
	protected void agregarBuscador() {
		
	}
	
	public void ajustarColumnaTablaAlContenido(JTable table) {
		
	    final TableColumnModel modeloColumna = table.getColumnModel();
	    for (int columna = 0; columna < table.getColumnCount(); columna++) {
	        int ancho = 15;
	        for (int fila = 0; fila < table.getRowCount(); fila++) {
	            TableCellRenderer renderizar = table.getCellRenderer(fila, columna);
	            Component comp = table.prepareRenderer(renderizar, fila, columna);
	            ancho = Math.max(comp.getPreferredSize().width +1 , ancho);
	        }
	        if(ancho > 300)
	            ancho=300;
	        modeloColumna.getColumn(columna).setPreferredWidth(ancho);
	    }
	}
}
