package examenSegundoTrimestre_jjdv;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;


public class CAJA_NEGRA_josejuanDonosoValle {
	
	/*Test de Caja Negra*/
	
	/*validaciones del nombre*/
	
	@Test
	void TestInstitutoNombreVacio() {
		String resultado = Instituto("", 200.6);
		assertEquals("Nombre vacio", resultado);
	}

	private String Instituto(String string, double d) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Test
	void TestInstitutoNombreNulo() {
		String resultado = Instituto(null, 200.6);
		assertEquals("Nombre vacio", resultado);
	}
	
	@Test
	void TestDepartamentoNombreVacio() {
		String resultado = Departamento("", 200.6);
		assertEquals("Nombre inválido", resultado);
	}
	
	private String Departamento(String string, double d) {
		// TODO Auto-generated method stub
		return null;
	}
 
	@Test
	void TestDepartamentoNombreIncorrecto() {
		String resultado = Departamento(2, 200.6);
		assertEquals("formato de nombre incorrecto", resultado);
	}

	private String Departamento(int i, double d) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/*validaciones de presupuesto*/
	
	@Test
	void TestInstitutoPresupuestoNegativo() {
		String resultado = Instituto("Monroy", -200);
		assertEquals("El presupuesto es negativo", resultado);
	}

	

}


