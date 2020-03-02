package interfaz.paneles;



import javax.swing.table.DefaultTableModel;

import interfaz.GestorPestanyas;
import interfaz.Pestanya;


public class NotasClasicos extends Pestanya {
	
	public static DefaultTableModel modelClasico;

	public NotasClasicos(String[][] examenesClasicos, String[] columnas, GestorPestanyas gestorPestanyas) {
		
		super(examenesClasicos, columnas, gestorPestanyas);	
		modelClasico = model;

	}
	
	public static void agregarFilaClasica(String[] fila) {
		
		modelClasico.addRow(fila);
		//model.fireTableRowsInserted(row, row);
		
	}
	
}
