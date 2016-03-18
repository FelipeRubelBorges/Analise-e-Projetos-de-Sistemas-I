package maqCafe;

public class CafeComAcucar implements AcaoDispensador {

   @Override
   public void executar(Dispensador dispenser) {
      dispenser.cafeComAcucar();
   }

}
