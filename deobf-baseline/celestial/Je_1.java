package celestial;

import java.util.Random;

public abstract class Je_1 extends JR implements kX_2 {
   public static final rCm_1 id_int = rCT.W;
   private final double id_new;

   protected Je_1(Jq_1 var1, rpr_3 var2, rjC_2 var3, boolean var4, double var5) {
      super(var1, var2, var3, var4);
      this.id_new = var5;
      this.id_extends(this.id_abstract.id_break().id_class(id_int, Integer.valueOf(0)));
   }

   @Override
   public xc_3 id_class(rRg_1 var1) {
      return this.id_continue().id_class(id_int, Integer.valueOf(var1.id_long().nextInt(25)));
   }

   @Override
   public boolean id_class(rRq_1 var1, rfH_2 var2, xc_3 var3, boolean var4) {
      return this.id_private(var1.id_byte(var2.id_break(this.id_volatile)));
   }

   @Override
   public void id_class(rrEm_1 var1, Random var2, rfH_2 var3, xc_3 var4) {
      rfH_2 var5 = var3.id_break(this.id_volatile);
      int var6 = Math.min(var4.id_byte(id_int) + 1, 25);
      int var7 = this.id_class(var2);

      for (int var8 = 0; var8 < var7 && this.id_private(var1.id_byte(var5)); var8++) {
         var1.id_break(var5, var4.id_class(id_int, Integer.valueOf(var6)));
         var5 = var5.id_break(this.id_volatile);
         var6 = Math.min(var6 + 1, 25);
      }
   }

   protected abstract int id_class(Random var1);

   @Override
   public boolean id_class(rYB var1, Random var2, rfH_2 var3, xc_3 var4) {
      return true;
   }

   @Override
   public void id_class(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (var1.id_byte(id_int) < 25 && var4.nextDouble() < this.id_new) {
         rfH_2 var5 = var3.id_break(this.id_volatile);
         if (this.id_private(var2.id_byte(var5))) {
            var2.id_break(var5, var1.id_class(id_int));
         }
      }
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (var2 == this.id_volatile.id_case() && !var1.id_class(var4, var5)) {
         var4.id_finally().id_class(var5, this, 1);
      }

      if (var2 != this.id_volatile || !var3.id_class(this) && !var3.id_class(this.id_break())) {
         if (this.id_final) {
            var4.id_extends().id_class(var5, rXG.id_byte, rXG.id_byte.id_class(var4));
         }

         return super.id_class(var1, var2, var3, var4, var5, var6);
      } else {
         return this.id_break().id_continue();
      }
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_int);
   }

   @Override
   protected Je_1 id_implements() {
      return this;
   }

   protected abstract boolean id_private(xc_3 var1);

   @Override
   public boolean a_(xc_3 var1) {
      return var1.id_byte(id_int) < 25;
   }
}
