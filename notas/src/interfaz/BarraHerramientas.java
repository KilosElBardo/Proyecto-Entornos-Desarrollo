package interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JToolBar;

import notas.Alumno;
import notas.Curso;

public class BarraHerramientas extends JToolBar {

	private JButton agregarUsuarioBoton;
	private JButton eliminarUsuarioBoton;
	private JButton guardarUsuariosEnFicheroBoton;
	private Curso curso;
	
	public BarraHerramientas(String message, Curso curso) {
		
		this.curso = curso;
		agregarBotones();
		
		
	}
	
	private void agregarBotones() {
		agregarUsuarioBoton = new JButton("Agregar alumno");
		eliminarUsuarioBoton = new JButton("Eliminar alumno");
		guardarUsuariosEnFicheroBoton = new JButton("Exportar calificacion final");
		add(agregarUsuarioBoton);
		add(eliminarUsuarioBoton);
		add(guardarUsuariosEnFicheroBoton);
		eventoClickBotonAgregar();
		eventoClickBotonEliminar();
		eventoClickBotonGuardar();
	}
	
	private void eventoClickBotonAgregar() {
		
		agregarUsuarioBoton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				NuevoAlumno agregarAlumno = new NuevoAlumno(curso);
				
			}
			
		});
	}
	
	private void eventoClickBotonEliminar() {
		
		eliminarUsuarioBoton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Eliminar usuario");
				
			}
			
		});
	}
	
	private void eventoClickBotonGuardar() {
		
		guardarUsuariosEnFicheroBoton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				
				//int returnVal = fc.showDialog(this);
				/*JFileChooser fc = new JFileChooser();
				fc.showSaveDialog(this);*/
				iniciarSaveFileChooser();
				
			}
			
		});
	}
	
	
	JFileChooser fc;
	File file;
	
	private void iniciarSaveFileChooser() {
		fc = new JFileChooser();
		fc.showSaveDialog(this);
		file = fc.getSelectedFile();
		System.out.println(file.getAbsolutePath());
		escribirDatosEnFichero(file.getAbsolutePath(), Curso.alumnosCurso);
		
	}
	
	private void escribirDatosEnFichero(String ruta, Alumno[] alumnos) {
		
		try {
			PrintWriter printWriter = new PrintWriter(new FileOutputStream(ruta + ".txt"));
			for (int i = 0; i < Curso.ALUMNOS_CREADOS_AUTOMATICAMENTE_POR_CURSO; i++) {
				
				printWriter.print("ID " + alumnos[i].getIdEstudiante() + ", ");
				printWriter.print("Nombre " + alumnos[i].getNombre() + ", ");
				printWriter.print("Edad " + alumnos[i].getEdad() + ", ");
				printWriter.print("Nota final " + alumnos[i].getNotaFinal());
				printWriter.println();		
				
			}
			printWriter.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
