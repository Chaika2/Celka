package celestial;

public class rrzB_2 implements Runnable {
   private ruS_2 class_;
   private Runnable break_;

   public rrzB_2(ruS_2 var1, Runnable var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   @Override
   public void run() {
      this.break_.run();
   }

   @Override
   public String toString() {
      return "PacketRunnable: " + this.class_;
   }

   public ruS_2 class_() {
      return this.class_;
   }
}
