package test;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import modelo.CategoriaEnum;
import modelo.Cliente;
import servicio.ClienteServicio;

public class ClienteServicioTest {

	ClienteServicio clienteServicio = new ClienteServicio();
	
	@Test
	public void agregarClienteTest(){
		
		List<Cliente>agregarClienteTest = clienteServicio.agregarCliente("17162856-5", "Iron", "Manjar", "1 a�o", 
				CategoriaEnum.ACTIVO);
		assertTrue(agregarClienteTest.size()>0);
	}
	
	@Test
	public void agregarClienteNullTest() {
		
		List<Cliente>agregarClienteNullTest = clienteServicio.agregarCliente(null, null, null, null, 
				CategoriaEnum.ACTIVO);
		Cliente clienteNull = clienteServicio.getListaClientes().get(0);
		String rutNull = clienteNull.getRunCliente();
		assertNull(rutNull, null);
		
	}

}
