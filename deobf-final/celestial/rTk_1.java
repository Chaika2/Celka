package celestial;

public final class rTk_1 implements Runnable {
   private final int class_;
   private final Runnable break_;

   public rTk_1(int var1, Runnable var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   @Override
   public void run() {
      this.break_.run();
   }

   public int class_() {
      return this.class_;
   }
}
