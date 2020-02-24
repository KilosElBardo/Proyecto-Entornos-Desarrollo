package notas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CursoPrueba {

	static Curso cursoPrimero;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	 cursoPrimero = new Curso();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
	
		
		
		for(int i = 0; i < Curso.ALUMNOS_POR_CURSO; i++) {
			
			System.out.println("notas examen1 " + cursoPrimero.getAlumnos()[i].getExamenesClasicos()[1].getNota());
			System.out.println("notas finales " + cursoPrimero.getAlumnos()[i].getNotaFinal());
			System.out.println("Id del estudiante " + cursoPrimero.getAlumnos()[i].getIdEstudiante());
		}
		
    
	}
	
	

}

