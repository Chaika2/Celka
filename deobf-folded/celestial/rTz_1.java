package celestial;

public abstract class rTz_1<R extends Runnable> extends rTQ<R> {
   private int id_class;

   public rTz_1(String var1) {
      super(var1);
   }

   @Override
   protected boolean y() {
      return this.rh() || super.y();
   }

   protected boolean rh() {
      return this.id_class != 0;
   }

   @Override
   protected void id_throws(R var1) {
      this.id_class++;

      try {
         super.id_throws((R)var1);
      } finally {
         this.id_class--;
      }
   }
}
