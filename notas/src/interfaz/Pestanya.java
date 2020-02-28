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
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

import interfaz.paneles.DatosAlumnoIndividual;
import notas.Curso;

public class Pestanya extends JPanel {
	
	//Para evitar que al cambiar de pestaña se cambie al primer usuario
	public static int idUsuarioSeleccionado = 1;
	
	protected JTable tabla;
	protected DatosAlumnoIndividual datosAlumnoIndividual;
	protected JScrollPane scrollTabla;
	protected String[][] datosTabla;
	protected String[] columnasTabla;
	
	public Pestanya(String[][] datosTabla, String[] columnasTabla, JTabbedPane gestorPestanyas) {
		
		setLayout(new BorderLayout());
		
		this.datosTabla = datosTabla;
		this.columnasTabla = columnasTabla;
		
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
	
	protected void mostrarInformacionUsuarioSeleccionado() {
		datosAlumnoIndividual.asignarTextoLabels(Curso.obtenerAlumnoPorID(idUsuarioSeleccionado));
		tabla.changeSelection(idUsuarioSeleccionado-1, 0, false, false);
	}
	
	protected void agregarTabla() {
		tabla = new JTable(datosTabla, columnasTabla);
		scrollTabla = new JScrollPane(tabla);
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
	        int ancho = 15; // Min width
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
