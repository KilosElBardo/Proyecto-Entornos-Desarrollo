package notas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AlumnoJUnit {

	static Alumno alumno;
	static ExamenClasico[] examenesClasicos = new ExamenClasico[3];
	static ExamenTest[] examenesTest = new ExamenTest[2];
	static Trabajo[] trabajos = new Trabajo[3];
	
	private static final double PORCENTAJE_PRIMER_EXAMEN_CLASICO = 10 / 100f;
    private static final double PORCENTAJE_SEGUNDO_EXAMEN_CLASICO = 20 /100f;
    private static final double PORCENTAJE_TERCER_EXAMEN_CLASICO = 20 / 100f;
    private static final double PORCENTAJE_PRIMER_EXAMEN_TEST = 25 / 100f;
    private static final double PORCENTAJE_SEGUNDO_EXAMEN_TEST = 25 / 100f;
    
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		examenesClasicos[0] = new ExamenClasico(6);
		examenesClasicos[1] = new ExamenClasico(8);
		examenesClasicos[2] = new ExamenClasico(6);
		examenesTest[0] = new ExamenTest(25,0, 25);
		examenesTest[1] = new ExamenTest(50,0, 0);
		trabajos[0] = new Trabajo(true, 3);
		trabajos[1] = new Trabajo(true, 6);
		trabajos[2] = new Trabajo(false, 0);
		alumno = new Alumno("David", "Quiles", 23, false, examenesTest, examenesClasicos, trabajos);
	
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
	void testNotaFinal() {
		
		double notaPrimerExamen, notaSegundoExamen, notaTercerExamen, notaCuartoExamen, notaQuintoExamen, notaFinal;   
		
		notaPrimerExamen = alumno.getExamenesClasicos()[0].getNota() * PORCENTAJE_PRIMER_EXAMEN_CLASICO;
    	notaSegundoExamen = alumno.getExamenesClasicos()[1].getNota() * PORCENTAJE_SEGUNDO_EXAMEN_CLASICO;
    	notaTercerExamen = alumno.getExamenesClasicos()[2].getNota() * PORCENTAJE_TERCER_EXAMEN_CLASICO;
    	notaCuartoExamen = alumno.getExamenesTests()[0].getNota() * PORCENTAJE_PRIMER_EXAMEN_TEST;
    	notaQuintoExamen = alumno.getExamenesTests()[1].getNota() * PORCENTAJE_SEGUNDO_EXAMEN_TEST;
    	
    	notaFinal = Math.round(notaPrimerExamen + notaSegundoExamen + notaTercerExamen + notaCuartoExamen + notaQuintoExamen);
		
    	assertEquals(notaFinal, 7);
		
	}
}
	
