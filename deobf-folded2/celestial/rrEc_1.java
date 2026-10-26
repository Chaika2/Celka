package celestial;

final class rrEc_1 extends rTQ<Runnable> {
   @Override
   protected boolean id_byte(Runnable var1) {
      return true;
   }

   rrEc_1(rrEN var1, rYB var2) {
      super("Chunk source main thread executor for " + var2.E().id_class());
      this.id_class = var1;
   }

   @Override
   protected boolean y() {
      return true;
   }

   @Override
   protected Runnable id_break(Runnable var1) {
      return var1;
   }

   @Override
   protected void id_throws(Runnable var1) {
      super.id_throws(var1);
   }

   @Override
   protected Thread P() {
      return this.id_class.id_case;
   }

   @Override
   protected boolean k_() {
      if (this.id_class.id_package()) {
         return true;
      } else {
         this.id_class.id_catch.id_break();
         return super.k_();
      }
   }
}
