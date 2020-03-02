package interfaz.paneles;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import interfaz.GestorPestanyas;
import interfaz.Pestanya;

public class NotasFinales extends Pestanya {
	
	public static DefaultTableModel modelFinales;
	
	public NotasFinales(String[][] trabajos, String[] columnas, GestorPestanyas gestorPestanyas) {
		
		super(trabajos, columnas, gestorPestanyas);
	
		modelFinales = model;

		}
	
	public static void agregarFilaFinales(String[] fila) {
		
		modelFinales.addRow(fila);
		
	}
	
	

}
