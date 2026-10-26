package celestial;

import java.util.Random;

public abstract class Qz_1 extends QZ {
   public static boolean id_class(xc_3 var0, rRq_1 var1, rfH_2 var2, int var3, int var4) {
      xd_3 var5 = var0.id_break();
      return var5 == var1.id_byte(var2.id_break(var3, 0, var4)).id_break()
         && var5 == var1.id_byte(var2.id_break(var3 + 1, 0, var4)).id_break()
         && var5 == var1.id_byte(var2.id_break(var3, 0, var4 + 1)).id_break()
         && var5 == var1.id_byte(var2.id_break(var3 + 1, 0, var4 + 1)).id_break();
   }

   public boolean id_class(rrEm_1 var1, rKd_1 var2, rfH_2 var3, xc_3 var4, Random var5, int var6, int var7) {
      rDg_1 var8 = this.id_class(var5);
      if (var8 == null) {
         return false;
      } else {
         ((rDv_1)var8.id_case).id_class();
         xc_3 var9 = xu_3.id_class.id_continue();
         var1.id_class(var3.id_break(var6, 0, var7), var9, 4);
         var1.id_class(var3.id_break(var6 + 1, 0, var7), var9, 4);
         var1.id_class(var3.id_break(var6, 0, var7 + 1), var9, 4);
         var1.id_class(var3.id_break(var6 + 1, 0, var7 + 1), var9, 4);
         if (var8.id_class(var1, var2, var5, var3.id_break(var6, 0, var7))) {
            return true;
         } else {
            var1.id_class(var3.id_break(var6, 0, var7), var4, 4);
            var1.id_class(var3.id_break(var6 + 1, 0, var7), var4, 4);
            var1.id_class(var3.id_break(var6, 0, var7 + 1), var4, 4);
            var1.id_class(var3.id_break(var6 + 1, 0, var7 + 1), var4, 4);
            return false;
         }
      }
   }

   protected abstract rDg_1<rDv_1, ?> id_class(Random var1);

   @Override
   public boolean id_class(rrEm_1 var1, rKd_1 var2, rfH_2 var3, xc_3 var4, Random var5) {
      for (int var6 = 0; var6 >= -1; var6--) {
         for (int var7 = 0; var7 >= -1; var7--) {
            if (id_class(var4, var1, var3, var6, var7)) {
               return this.id_class(var1, var2, var3, var4, var5, var6, var7);
            }
         }
      }

      return super.id_class(var1, var2, var3, var4, var5);
   }
}
