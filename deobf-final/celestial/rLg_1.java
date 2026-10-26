package celestial;

public class rLg_1 extends rLR {
   protected final double class_;

   protected rLg_1(rLo_1 var1, int var2, double var3) {
      super(var1, var2);
      this.class_ = var3;
   }

   @Override
   public double class_(int var1, ix_3 var2) {
      return this.class_ * (double)(var1 + 1);
   }
}
