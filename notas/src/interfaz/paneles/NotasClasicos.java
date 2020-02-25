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
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class NotasClasicos extends JPanel {

	String [] coulnes = {"Nombre","Apellidos", "Clasico 1", "Clasico 2", "Clasico 3"};
	
	
	JTextField jtf = new JTextField(40); 
	
	GridBagConstraints gbc = new GridBagConstraints();
	DatosAlumnoIndividual datosAlumnoIndividual = new DatosAlumnoIndividual();
	
	
	
	public NotasClasicos(String[][] examenesClasicos) {
		
		datosAlumnoIndividual.setBackground(Color.white);
		
		setLayout(new BorderLayout());
		

		
		/*DefaultTableModel modelo = new DefaultTableModel(null,arrayStrings);*/
		JTable tabla = new JTable (examenesClasicos, coulnes);
		tabla.setBackground(Color.white);
		tabla.setBorder(null);
		
		
		/*modelo.addRow(arrayStrings);
		/*tabla.setModel(modelo);
		modelo.setValueAt(0, 0, 34);*/
	
		
		JScrollPane scrollpane = new JScrollPane(tabla);


		/*gbc.gridx = 0;
		gbc.gridy = 0;
		add (jtf,gbc);
		gbc.gridy = 1;
		gbc.gridwidth = 2;*/
		
		add (jtf, BorderLayout.NORTH);
		add(datosAlumnoIndividual, BorderLayout.CENTER);
		add (scrollpane, BorderLayout.LINE_END);
		
		

		tabla.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				int seleccionado = tabla.getSelectedRow();
				System.out.println(examenesClasicos[seleccionado][0]);
				
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
	
}
