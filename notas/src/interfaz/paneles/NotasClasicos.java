package interfaz.paneles;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Iterator;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import interfaz.Pestanya;
import notas.Curso;

public class NotasClasicos extends Pestanya {

	
	public NotasClasicos(String[][] examenesClasicos, String[] columnas, JTabbedPane gestorPestanyas) {
		
		super(examenesClasicos, columnas, gestorPestanyas);		

	}
	
}
