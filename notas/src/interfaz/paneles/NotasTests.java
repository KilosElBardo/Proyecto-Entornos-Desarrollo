package interfaz.paneles;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.table.DefaultTableModel;

import interfaz.GestorPestanyas;
import interfaz.Pestanya;

public class NotasTests extends Pestanya {
	
	public static DefaultTableModel modelTest;

	public NotasTests(String[][] examenesTests, String[] columnas, GestorPestanyas gestorPestanyas) {
			
		super(examenesTests, columnas, gestorPestanyas);
		
		modelTest = model;

	}
	
	public static void agregarFilaTest(String[] fila) {
		
		modelTest.addRow(fila);
		//model.fireTableRowsInserted(row, row);

	}
}
