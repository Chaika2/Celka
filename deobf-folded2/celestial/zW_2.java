package celestial;

import java.util.Random;

public class zW_2 extends xd_3 {
   public static final rCm_1 id_volatile = rCT.k;
   protected static final rjC_2 id_final = xd_3.id_class(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   protected zW_2(Jq_1 var1) {
      super(var1);
      this.id_extends(this.id_abstract.id_break().id_class(id_volatile, Integer.valueOf(0)));
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_volatile);
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (!var1.id_class(var4, var5)) {
         var4.id_finally().id_class(var5, this, 1);
      }

      return super.id_class(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return id_final;
   }

   @Override
   public void id_class(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (var2.id_finally(var3.id_final())) {
         int var5 = 1;

         while (var2.id_byte(var3.id_catch(var5)).id_class(this)) {
            var5++;
         }

         if (var5 < 3) {
            int var6 = var1.id_byte(id_volatile);
            if (var6 == 15) {
               var2.id_break(var3.id_final(), this.id_continue());
               var2.id_class(var3, var1.id_class(id_volatile, Integer.valueOf(0)), 4);
            } else {
               var2.id_class(var3, var1.id_class(id_volatile, Integer.valueOf(var6 + 1)), 4);
            }
         }
      }
   }

   @Override
   public boolean id_class(xc_3 var1, rRR var2, rfH_2 var3) {
      xc_3 var4 = var2.id_byte(var3.id_break());
      if (var4.id_break() == this) {
         return true;
      } else {
         if (var4.id_class(xu_3.id_implements)
            || var4.id_class(xu_3.id_finally)
            || var4.id_class(xu_3.id_extends)
            || var4.id_class(xu_3.id_native)
            || var4.id_class(xu_3.id_throw)
            || var4.id_class(xu_3.id_interface)) {
            rfH_2 var5 = var3.id_break();

            for (rpr_3 var7 : rpb_3.HORIZONTAL) {
               xc_3 var8 = var2.id_byte(var5.id_break(var7));
               rXE var9 = var2.id_break(var5.id_break(var7));
               if (var9.id_class(rlG_2.id_break) || var8.id_class(xu_3.bj)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Override
   public void id_break(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (!var1.id_class(var2, var3)) {
         var2.id_break(var3, true);
      }
   }
}
