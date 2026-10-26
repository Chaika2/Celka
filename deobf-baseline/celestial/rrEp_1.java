package celestial;

import java.util.List;
import java.util.Random;

public class rrEp_1 implements rrEq_1 {
   private int id_class;

   private int id_class(rfH_2 var1, rrEm_1 var2) {
      rbf_3 var3 = aI_2.id_private.id_class(var2);
      if (var3 == null) {
         return 0;
      } else {
         var3.id_class(var2, var2.id_throws(var1), iO_2.NATURAL, (aU_2)null, (rcd_3)null);
         var3.id_class(var1, 0.0F, 0.0F);
         var2.id_class(var3);
         return 1;
      }
   }

   private int id_class(rrEm_1 var1, rfH_2 var2) {
      byte var3 = 48;
      if (var1.d().id_class(rRP.id_continue.id_break(), var2, 48, rRr_1.IS_OCCUPIED) > 4L) {
         List var4 = var1.id_class(rbf_3.class, new rfl_3(var2).id_byte(48.0, 8.0, 48.0));
         if (var4.size() < 5) {
            return this.id_class(var2, var1);
         }
      }

      return 0;
   }

   @Override
   public int id_class(rrEm_1 var1, boolean var2, boolean var3) {
      if (var3 && var1.B().id_break(rRu_1.id_protected)) {
         this.id_class--;
         if (this.id_class > 0) {
            return 0;
         } else {
            this.id_class = 1200;
            rhN_2 var4 = var1.id_this();
            if (var4 == null) {
               return 0;
            } else {
               Random var5 = var1.id_int;
               int var6 = (8 + var5.nextInt(24)) * (var5.nextBoolean() ? -1 : 1);
               int var7 = (8 + var5.nextInt(24)) * (var5.nextBoolean() ? -1 : 1);
               rfH_2 var8 = var4.Bs().id_break(var6, 0, var7);
               if (!var1.id_class(var8.b_() - 10, var8.c_() - 10, var8.d_() - 10, var8.b_() + 10, var8.c_() + 10, var8.d_() + 10)) {
                  return 0;
               } else {
                  if (rrEj_1.id_class(aw_3.ON_GROUND, var1, var8, aI_2.id_private)) {
                     if (var1.id_byte(var8, 2)) {
                        return this.id_class(var1, var8);
                     }

                     if (var1.id_protected().id_class(var8, true, rrrZ.id_finally).id_throws()) {
                        return this.id_break(var1, var8);
                     }
                  }

                  return 0;
               }
            }
         }
      } else {
         return 0;
      }
   }

   private int id_break(rrEm_1 var1, rfH_2 var2) {
      byte var3 = 16;
      List var4 = var1.id_class(rbf_3.class, new rfl_3(var2).id_byte(16.0, 8.0, 16.0));
      return var4.size() < 1 ? this.id_class(var2, var1) : 0;
   }
}
