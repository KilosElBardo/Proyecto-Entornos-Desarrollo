package interfaz.paneles;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.Iterator;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class NotasClasicos extends JPanel {

	String [] coulnes = {"col1","col2"};
	String [][] data = new String [4][2];
	
	JTextField jtf = new JTextField(40); 
	
	GridBagConstraints gbc = new GridBagConstraints();
	
	public NotasClasicos() {
		setLayout(new GridBagLayout());
		setBackground(new Color(21, 34, 147));
	 
		for (int i = 0; i < data.length; i++) {
			
			data[i][0] = "dato";
			data[i][1] = "dato";
			
		}
		
		/*DefaultTableModel modelo = new DefaultTableModel(null,arrayStrings);*/
		JTable tabla = new JTable (data, coulnes);
		tabla.setBackground(Color.white);
		tabla.setBorder(null);
		/*modelo.addRow(arrayStrings);
		/*tabla.setModel(modelo);
		modelo.setValueAt(0, 0, 34);*/
		setBackground(new Color(238,238,238));
		
		JScrollPane scrollpane = new JScrollPane(tabla);
		
		scrollpane.setBorder(null);
		scrollpane.setBackground(Color.white);
		gbc.gridx = 0;
		gbc.gridy = 0;
		add (jtf,gbc);
		gbc.gridy = 1;
		add (scrollpane, gbc);


		
	}
	
}
