package celestial;

import java.util.Random;

public class kZ_2 extends xd_3 {
   public static final rCm_1 id_volatile = rCT.N;
   public static final rCN id_final = rCT.id_synchronized;

   public kZ_2(Jq_1 var1) {
      super(var1);
      this.id_extends(this.id_abstract.id_break().id_class(id_volatile, Integer.valueOf(7)).id_class(id_final, Boolean.valueOf(false)));
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      int var7 = id_private(var3) + 1;
      if (var7 != 1 || var1.id_byte(id_volatile) != var7) {
         var4.id_finally().id_class(var5, this, 1);
      }

      return var1;
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, Random var4) {
      if (var2.id_while(var3.id_final()) && var4.nextInt(15) == 1) {
         rfH_2 var5 = var3.id_break();
         xc_3 var6 = var2.id_byte(var5);
         if (!var6.id_native() || !var6.id_protected(var2, var5, rpr_3.UP)) {
            double var7 = (double)var3.b_() + var4.nextDouble();
            double var9 = (double)var3.c_() - 0.05;
            double var11 = (double)var3.d_() + var4.nextDouble();
            var2.id_class(rLQ.id_volatile, var7, var9, var11, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_volatile, id_final);
   }

   @Override
   public xc_3 id_class(rxx_3 var1) {
      return id_class(this.id_continue().id_class(id_final, Boolean.valueOf(true)), var1.id_int(), var1.id_class());
   }

   private static xc_3 id_class(xc_3 var0, rRg_1 var1, rfH_2 var2) {
      int var3 = 7;
      rfw_3 var4 = new rfw_3();

      for (rpr_3 var8 : rpr_3.values()) {
         var4.id_class(var2, var8);
         var3 = Math.min(var3, id_private(var1.id_byte(var4)) + 1);
         if (var3 == 1) {
            break;
         }
      }

      return var0.id_class(id_volatile, Integer.valueOf(var3));
   }

   @Override
   public void id_class(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (!var1.id_byte(id_final) && var1.id_byte(id_volatile) == 7) {
         id_protected(var1, var2, var3);
         var2.id_class(var3, false);
      }
   }

   @Override
   public void id_break(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      var2.id_class(var3, id_class(var1, var2, var3), 3);
   }

   @Override
   public rjC_2 id_break(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return rjw_3.id_class();
   }

   @Override
   public int id_protected(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return 1;
   }

   private static int id_private(xc_3 var0) {
      if (rls_3.id_super.id_class(var0.id_break())) {
         return 0;
      } else {
         return var0.id_break() instanceof kZ_2 ? var0.id_byte(id_volatile) : 7;
      }
   }

   @Override
   public boolean a_(xc_3 var1) {
      return var1.id_byte(id_volatile) == 7 && !var1.id_byte(id_final);
   }
}
