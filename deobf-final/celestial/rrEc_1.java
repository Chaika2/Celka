package celestial;

final class rrEc_1 extends rTQ<Runnable> {
   @Override
   protected boolean byte_(Runnable var1) {
      return true;
   }

   rrEc_1(rrEN var1, rYB var2) {
      super("Chunk source main thread executor for " + var2.E().class_());
      this.class_ = var1;
   }

   @Override
   protected boolean y() {
      return true;
   }

   @Override
   protected Runnable break_(Runnable var1) {
      return var1;
   }

   @Override
   protected void throws_(Runnable var1) {
      super.throws_(var1);
   }

   @Override
   protected Thread P() {
      return this.class_.case_;
   }

   @Override
   protected boolean k_() {
      if (this.class_.package_()) {
         return true;
      } else {
         this.class_.catch_.break_();
         return super.k_();
      }
   }
}
