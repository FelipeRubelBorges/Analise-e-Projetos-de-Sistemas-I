package maqCafe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maquina {

	   private Dispensador dispenser;
	
	   private List<AcaoDispensador> acoes = new ArrayList<>();
	   private Map<String, AcaoDispensador> comandos = new HashMap<>();

	   public Maquina(Dispensador dispenser) {
	      this.dispenser = dispenser;
	      comandos.put("cafePuro", new CafePuro());
	      comandos.put("cafeComCreme", new CafeComCreme());
	      comandos.put("cafeComAcucar", new CafeComAcucar());
	      comandos.put("cafeComCremeAcucar", new CafeComCremeAcucar());
	      
	      comandos.put("moeda5Centavos", new Moeda5Centavos());
	      comandos.put("moeda10Centavos", new Moeda10Centavos());
	      comandos.put("moeda25Centavos", new Moeda25Centavos());
	      comandos.put("moeda50Centavos", new Moeda50Centavos());
	      comandos.put("moeda1Real", new Moeda1Real());
	      
	   }

	   public void preparar(String comando) {

	     // if (acoes.isEmpty()){
	     //    throw new RuntimeException();
	     // }
	     // else {
    	  if (comandos.containsKey(comando)) {
    	         acoes.add(comandos.get(comando));
	      } else {
	         throw new RuntimeException("Comando invalido");
	      }
	      //}
	   }

	   public boolean confirmar() {
	      return acoes.size() > 0;
	   }
}
