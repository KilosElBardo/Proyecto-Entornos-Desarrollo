package notas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AlumnoTest {

	static Alumno alumno;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		alumno = new Alumno();
		
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
		System.out.println(alumno.getNombre());
		System.out.println(alumno.getApellidos());
		
		for (int i = 0; i < 2; i++) {
			System.out.println(alumno.getExamenesTests()[i]);
		}
		
		for (int i = 0; i < 3; i++) {
			System.out.println(alumno.getTrabajos()[i]);
		}
		
	}

}
