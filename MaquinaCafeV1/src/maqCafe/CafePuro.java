package maqCafe;

public class CafePuro implements AcaoDispensador {

   @Override
   public void executar(Dispensador dispenser) {
      dispenser.cafePuro();
   }

}
