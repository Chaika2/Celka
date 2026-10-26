package celestial;

public class rrzB_2 implements Runnable {
   private ruS_2 id_class;
   private Runnable id_break;

   public rrzB_2(ruS_2 var1, Runnable var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   @Override
   public void run() {
      this.id_break.run();
   }

   @Override
   public String toString() {
      return "PacketRunnable: " + this.id_class;
   }

   public ruS_2 id_class() {
      return this.id_class;
   }
}
