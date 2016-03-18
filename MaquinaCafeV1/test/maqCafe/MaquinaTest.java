package maqCafe;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;


public class MaquinaTest {

	   private DispensadorSimulacao dispensador;
	   private Maquina maquinaCafe;
	
	   @Before
	   public void setup() {
	      dispensador = new DispensadorSimulacao();
	      maquinaCafe = new Maquina(dispensador);
	   }
	
	   @Test
	   public void opcao1() {
	      maquinaCafe.preparar("cafePuro");

	      assertTrue(maquinaCafe.confirmar());
	   }
	   
	   @Test
	   public void opcao2() {
	      maquinaCafe.preparar("cafeComAcucar");

	      assertTrue(maquinaCafe.confirmar());
	   }
	   
	   @Test
	   public void opcao3() {
	      maquinaCafe.preparar("cafeComCreme");

	      assertTrue(maquinaCafe.confirmar());
	   }
	   
	   @Test
	   public void opcao4() {
	      maquinaCafe.preparar("cafeComCremeAcucar");

	      assertTrue(maquinaCafe.confirmar());
	   }
			  
	   @Test
	   public void moeda1() {
	      maquinaCafe.preparar("moeda5Centavos");

	      assertTrue(maquinaCafe.confirmar());
	   }
	   
	   @Test
	   public void moeda2() {
	      maquinaCafe.preparar("moeda10Centavos");

	      assertTrue(maquinaCafe.confirmar());
	   }
	   
	   @Test
	   public void moeda3() {
	      maquinaCafe.preparar("moeda25Centavos");

	      assertTrue(maquinaCafe.confirmar());
	   }
	   
}
