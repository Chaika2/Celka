package celestial;

import java.util.Objects;
import java.util.Optional;

public class rxW_2 extends rdb_3 {
   public rxW_2(rdO_2 var1) {
      super(var1);
   }

   public static void id_class(rRg_1 var0, rfH_2 var1, int var2) {
      if (var2 == 0) {
         var2 = 15;
      }

      xc_3 var3 = var0.id_byte(var1);
      if (!var3.id_catch()) {
         double var4 = 0.5;
         double var6;
         if (var3.id_class(xu_3.id_try)) {
            var2 *= 3;
            var6 = 1.0;
            var4 = 3.0;
         } else if (var3.id_implements(var0, var1)) {
            var1 = var1.id_final();
            var2 *= 3;
            var4 = 3.0;
            var6 = 1.0;
         } else {
            var6 = var3.id_finally(var0, var1).id_byte(rpB_2.Y);
         }

         var0.id_class(rLQ.id_char, (double)var1.b_() + 0.5, (double)var1.c_() + 0.5, (double)var1.d_() + 0.5, 0.0, 0.0, 0.0);

         for (int var8 = 0; var8 < var2; var8++) {
            double var9 = id_private.nextGaussian() * 0.02;
            double var11 = id_private.nextGaussian() * 0.02;
            double var13 = id_private.nextGaussian() * 0.02;
            double var15 = 0.5 - var4;
            double var17 = (double)var1.b_() + var15 + id_private.nextDouble() * var4 * 2.0;
            double var19 = (double)var1.c_() + id_private.nextDouble() * var6;
            double var21 = (double)var1.d_() + var15 + id_private.nextDouble() * var4 * 2.0;
            if (!var0.id_byte(new rfH_2(var17, var19, var21).id_break()).id_catch()) {
               var0.id_class(rLQ.id_char, var17, var19, var21, var9, var11, var13);
            }
         }
      }
   }

   public static boolean id_class(rdn_3 var0, rYB var1, rfH_2 var2, rpr_3 var3) {
      if (var1.id_byte(var2).id_class(xu_3.id_try) && var1.id_break(var2).id_throws() == 8) {
         if (!(var1 instanceof rrEm_1)) {
            return true;
         } else {
            label79:
            for (int var4 = 0; var4 < 128; var4++) {
               rfH_2 var5 = var2;
               xc_3 var6 = xu_3.rr.id_continue();

               for (int var7 = 0; var7 < var4 / 16; var7++) {
                  var5 = var5.id_break(id_private.nextInt(3) - 1, (id_private.nextInt(3) - 1) * id_private.nextInt(3) / 2, id_private.nextInt(3) - 1);
                  if (var1.id_byte(var5).id_new(var1, var5)) {
                     continue label79;
                  }
               }

               Optional var9 = var1.id_protected(var5);
               if (Objects.equals(var9, Optional.of(rYl_1.id_double)) || Objects.equals(var9, Optional.of(rYl_1.P))) {
                  if (var4 == 0 && var3 != null && var3.id_final().id_protected()) {
                     var6 = rls_3.E.id_class(var1.id_int).id_continue().id_class(dd_3.id_final, var3);
                  } else if (id_private.nextInt(4) == 0) {
                     var6 = rls_3.S.id_class(id_private).id_continue();
                  }
               }

               if (var6.id_break().id_class(rls_3.E)) {
                  for (int var8 = 0; !var6.id_class((rRR)var1, var5) && var8 < 4; var8++) {
                     var6 = var6.id_class(dd_3.id_final, rpb_3.HORIZONTAL.id_class(id_private));
                  }
               }

               if (var6.id_class((rRR)var1, var5)) {
                  xc_3 var10 = var1.id_byte(var5);
                  if (var10.id_class(xu_3.id_try) && var1.id_break(var5).id_throws() == 8) {
                     var1.id_class(var5, var6, 3);
                  } else if (var10.id_class(xu_3.rr) && id_private.nextInt(10) == 0) {
                     ((kX_2)xu_3.rr).id_class((rrEm_1)var1, id_private, var5, var10);
                  }
               }
            }

            var0.id_catch(1);
            return true;
         }
      } else {
         return false;
      }
   }

   public static boolean id_class(rdn_3 var0, rYB var1, rfH_2 var2) {
      xc_3 var3 = var1.id_byte(var2);
      if (var3.id_break() instanceof kX_2) {
         kX_2 var4 = (kX_2)var3.id_break();
         if (var4.id_class(var1, var2, var3, var1.id_continue)) {
            if (var1 instanceof rrEm_1) {
               if (var4.id_class(var1, var1.id_int, var2, var3)) {
                  var4.id_class((rrEm_1)var1, var1.id_int, var2, var3);
               }

               var0.id_catch(1);
            }

            return true;
         }
      }

      return false;
   }

   @Override
   public ryZ_2 id_class(rdH_2 var1) {
      rYB var2 = var1.id_int();
      rfH_2 var3 = var1.id_class();
      rfH_2 var4 = var3.id_break(var1.id_finally());
      if (id_class(var1.id_volatile(), var2, var3)) {
         if (!var2.id_continue) {
            var2.id_byte(2005, var3, 0);
         }

         return ryZ_2.id_class(var2.id_continue);
      } else {
         xc_3 var5 = var2.id_byte(var3);
         boolean var6 = var5.id_protected(var2, var3, var1.id_finally());
         if (var6 && id_class(var1.id_volatile(), var2, var4, var1.id_finally())) {
            if (!var2.id_continue) {
               var2.id_byte(2005, var4, 0);
            }

            return ryZ_2.id_class(var2.id_continue);
         } else {
            return ryZ_2.PASS;
         }
      }
   }
}
