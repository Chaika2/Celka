package celestial;

public class rTN implements Runnable {
   private final int id_class;
   private final Runnable id_break;

   public rTN(int var1, Runnable var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   @Override
   public void run() {
      this.id_break.run();
   }

   public int id_class() {
      return this.id_class;
   }
}
