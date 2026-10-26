package celestial;

public class rLg_1 extends rLR {
   protected final double id_class;

   protected rLg_1(rLo_1 var1, int var2, double var3) {
      super(var1, var2);
      this.id_class = var3;
   }

   @Override
   public double id_class(int var1, ix_3 var2) {
      return this.id_class * (double)(var1 + 1);
   }
}
