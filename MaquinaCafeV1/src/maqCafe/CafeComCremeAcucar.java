package maqCafe;

public class CafeComCremeAcucar implements AcaoDispensador {

   @Override
   public void executar(Dispensador dispenser) {
      dispenser.cafeComCremeAcucar();
   }

}
