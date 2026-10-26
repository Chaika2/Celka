package celestial;

import java.util.Random;

public class xL_2 extends xd_3 {
   public static final rCm_1 id_volatile = rCT.k;
   protected static final rjC_2 id_final = xd_3.id_class(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   protected static final rjC_2 id_package = xd_3.id_class(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   protected xL_2(Jq_1 var1) {
      super(var1);
      this.id_extends(this.id_abstract.id_break().id_class(id_volatile, Integer.valueOf(0)));
   }

   @Override
   public boolean id_class(xc_3 var1, rRR var2, rfH_2 var3) {
      for (rpr_3 var5 : rpb_3.HORIZONTAL) {
         xc_3 var6 = var2.id_byte(var3.id_break(var5));
         QP var7 = var6.id_byte();
         if (var7.id_break() || var2.id_break(var3.id_break(var5)).id_class(rlG_2.id_byte)) {
            return false;
         }
      }

      xc_3 var8 = var2.id_byte(var3.id_break());
      return (var8.id_class(xu_3.Pw) || var8.id_class(xu_3.id_throw) || var8.id_class(xu_3.id_interface))
         && !var2.id_byte(var3.id_final()).id_byte().id_class();
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, an_3 var4) {
      var4.id_break(rye_3.id_finally, 1.0F);
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_volatile);
   }

   @Override
   public boolean id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return false;
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (!var1.id_class(var4, var5)) {
         var4.id_finally().id_class(var5, this, 1);
      }

      return super.id_class(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void id_class(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      rfH_2 var5 = var3.id_final();
      if (var2.id_finally(var5)) {
         int var6 = 1;

         while (var2.id_byte(var3.id_catch(var6)).id_class(this)) {
            var6++;
         }

         if (var6 < 3) {
            int var7 = var1.id_byte(id_volatile);
            if (var7 == 15) {
               var2.id_break(var5, this.id_continue());
               xc_3 var8 = var1.id_class(id_volatile, Integer.valueOf(0));
               var2.id_class(var3, var8, 4);
               var8.id_class(var2, var5, this, var3, false);
            } else {
               var2.id_class(var3, var1.id_class(id_volatile, Integer.valueOf(var7 + 1)), 4);
            }
         }
      }
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return id_package;
   }

   @Override
   public void id_break(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (!var1.id_class(var2, var3)) {
         var2.id_break(var3, true);
      }
   }

   @Override
   public rjC_2 id_break(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return id_final;
   }
}
