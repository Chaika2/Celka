package celestial;

public abstract class rTz_1<R extends Runnable> extends rTQ<R> {
   private int class_;

   public rTz_1(String var1) {
      super(var1);
   }

   @Override
   protected boolean y() {
      return this.rh() || super.y();
   }

   protected boolean rh() {
      return this.class_ != 0;
   }

   @Override
   protected void throws_(R var1) {
      this.class_++;

      try {
         super.throws_((R)var1);
      } finally {
         this.class_--;
      }
   }
}
