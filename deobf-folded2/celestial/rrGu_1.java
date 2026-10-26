package celestial;

public class rrGu_1 implements Runnable {
   private final rrGc_1 id_class;

   public rrGu_1(rrGc_1 var1) {
      this.id_class = var1;
   }

   @Override
   public void run() {
      this.id_class.id_byte();
   }
}
