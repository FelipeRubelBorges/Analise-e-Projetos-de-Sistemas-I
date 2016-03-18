package maqCafe;

public class CafeComCreme implements AcaoDispensador {

   @Override
   public void executar(Dispensador dispenser) {
      dispenser.cafeComCreme();
   }

}
