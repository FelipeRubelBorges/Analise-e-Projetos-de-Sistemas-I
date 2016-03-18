package maqCafe;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      DispensadorSimulacao dispensador = new DispensadorSimulacao();
	      Maquina maquinaCafe = new Maquina(dispensador);
	      
	      maquinaCafe.preparar("cafePuro");
	}

}
