package interfaz.paneles;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.table.DefaultTableModel;

import interfaz.GestorPestanyas;
import interfaz.Pestanya;

public class Trabajos extends Pestanya {

	public static DefaultTableModel modelTrabajo;
	public Trabajos(String[][] trabajos, String[] columnas, GestorPestanyas gestorPestanyas) {
		
		super(trabajos, columnas, gestorPestanyas);
		
		modelTrabajo = model;

	}
	
	public static void agregarFilaTrabajo(String[] fila) {
		
		modelTrabajo.addRow(fila);
		//model.fireTableRowsInserted(row, row);
		
	}

}
