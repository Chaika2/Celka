package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public abstract class rDo_1 extends rUO<rUt_1> {
   public rDo_1(Codec<rUt_1> var1) {
      super(var1);
   }

   protected abstract boolean id_class(rRg_1 var1, Random var2, rfH_2 var3, xc_3 var4);

   public boolean id_class(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rUt_1 var5) {
      xc_3 var6 = rls_3.s.id_class(var3).id_continue();
      return this.id_class(var1, var3, var4, var6);
   }

   protected boolean id_break(rRg_1 var1, Random var2, rfH_2 var3, xc_3 var4) {
      rfH_2 var5 = var3.id_final();
      xc_3 var6 = var1.id_byte(var3);
      if ((var6.id_class(xu_3.id_try) || var6.id_class(rls_3.b)) && var1.id_byte(var5).id_class(xu_3.id_try)) {
         var1.id_class(var3, var4, 3);
         if (var2.nextFloat() < 0.25F) {
            var1.id_class(var5, rls_3.b.id_class(var2).id_continue(), 2);
         } else if (var2.nextFloat() < 0.05F) {
            var1.id_class(var5, xu_3.hr.id_continue().id_class(Wy_1.id_volatile, Integer.valueOf(var2.nextInt(4) + 1)), 2);
         }

         for (rpr_3 var8 : rpb_3.HORIZONTAL) {
            if (var2.nextFloat() < 0.2F) {
               rfH_2 var9 = var3.id_break(var8);
               if (var1.id_byte(var9).id_class(xu_3.id_try)) {
                  xc_3 var10 = rls_3.E.id_class(var2).id_continue().id_class(dd_3.id_final, var8);
                  var1.id_class(var9, var10, 2);
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }
}
