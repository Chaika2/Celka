package celestial;

import java.util.Comparator;
import java.util.Optional;

public class rRi_1 {
   private final rrEm_1 id_class;

   public rRi_1(rrEm_1 var1) {
      this.id_class = var1;
   }

   public Optional<rqT_2> id_class(rfH_2 var1, boolean var2) {
      rga_3 var3 = this.id_class.d();
      int var4 = var2 ? 16 : 128;
      var3.id_class(this.id_class, var1, var4);
      Optional var5 = var3.id_break(var0 -> var0 == rRP.id_synchronized, var1, var4, rRr_1.ANY)
         .sorted(Comparator.<rgU_2>comparingDouble(var1x -> var1x.id_throws().id_private(var1)).thenComparingInt(var0 -> var0.id_throws().c_()))
         .filter(var1x -> this.id_class.id_byte(var1x.id_throws()).id_break(rCT.id_char))
         .findFirst();
      return var5.map(var1x -> {
         rfH_2 var2x = var1x.id_throws();
         this.id_class.id_else().id_class(rrEl_1.id_case, new rfj_3(var2x), 3, var2x);
         xc_3 var3x = this.id_class.id_byte(var2x);
         return rqp_3.id_class(var2x, var3x.id_byte(rCT.id_char), 21, rpB_2.Y, 21, var2xx -> this.id_class.id_byte(var2xx) == var3x);
      });
   }

   public Optional<rqT_2> id_class(rfH_2 var1, rpB_2 var2) {
      rpr_3 var3 = rpr_3.id_class(rpG_2.POSITIVE, var2);
      double var4 = -1.0;
      rfH_2 var6 = null;
      double var7 = -1.0;
      rfH_2 var9 = null;
      roE_2 var10 = this.id_class.id_instanceof();
      int var11 = this.id_class.id_float() - 1;
      rfw_3 var12 = var1.id_new();

      for (rfw_3 var14 : rfH_2.id_class(var1, 16, rpr_3.EAST, rpr_3.SOUTH)) {
         int var15 = Math.min(var11, this.id_class.id_class(rKv_1.MOTION_BLOCKING, var14.b_(), var14.d_()));
         boolean var16 = true;
         if (var10.id_class(var14) && var10.id_class(var14.id_byte(var3, 1))) {
            var14.id_byte(var3.id_case(), 1);

            for (int var17 = var15; var17 >= 0; var17--) {
               var14.b_(var17);
               if (this.id_class.id_finally(var14)) {
                  int var18 = var17;

                  while (var17 > 0 && this.id_class.id_finally(var14.id_class(rpr_3.DOWN))) {
                     var17--;
                  }

                  if (var17 + 4 <= var11) {
                     int var19 = var18 - var17;
                     if (var19 <= 0 || var19 >= 3) {
                        var14.b_(var17);
                        if (this.id_class(var14, var12, var3, 0)) {
                           double var20 = var1.id_private(var14);
                           if (this.id_class(var14, var12, var3, -1) && this.id_class(var14, var12, var3, 1) && (var4 == -1.0 || var4 > var20)) {
                              var4 = var20;
                              var6 = var14.id_int();
                           }

                           if (var4 == -1.0 && (var7 == -1.0 || var7 > var20)) {
                              var7 = var20;
                              var9 = var14.id_int();
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      if (var4 == -1.0 && var7 != -1.0) {
         var6 = var9;
         var4 = var7;
      }

      if (var4 == -1.0) {
         var6 = new rfH_2(var1.b_(), rfU_2.id_class(var1.c_(), 70, this.id_class.id_float() - 10), var1.d_()).id_int();
         rpr_3 var22 = var3.id_catch();
         if (!var10.id_class(var6)) {
            return Optional.empty();
         }

         for (int var25 = -1; var25 < 2; var25++) {
            for (int var28 = 0; var28 < 2; var28++) {
               for (int var30 = -1; var30 < 3; var30++) {
                  xc_3 var31 = var30 < 0 ? xu_3.rg.id_continue() : xu_3.id_class.id_continue();
                  var12.id_class(
                     var6, var28 * var3.id_implements() + var25 * var22.id_implements(), var30, var28 * var3.id_extends() + var25 * var22.id_extends()
                  );
                  this.id_class.id_break(var12, var31);
               }
            }
         }
      }

      for (int var23 = -1; var23 < 3; var23++) {
         for (int var26 = -1; var26 < 4; var26++) {
            if (var23 == -1 || var23 == 2 || var26 == -1 || var26 == 3) {
               var12.id_class(var6, var23 * var3.id_implements(), var26, var23 * var3.id_extends());
               this.id_class.id_class(var12, xu_3.rg.id_continue(), 3);
            }
         }
      }

      xc_3 var24 = xu_3.Pi.id_continue().id_class(kT_2.id_volatile, var2);

      for (int var27 = 0; var27 < 2; var27++) {
         for (int var29 = 0; var29 < 3; var29++) {
            var12.id_class(var6, var27 * var3.id_implements(), var29, var27 * var3.id_extends());
            this.id_class.id_class(var12, var24, 18);
         }
      }

      return Optional.of(new rqT_2(var6.id_int(), 2, 3));
   }

   private boolean id_class(rfH_2 var1, rfw_3 var2, rpr_3 var3, int var4) {
      rpr_3 var5 = var3.id_catch();

      for (int var6 = -1; var6 < 3; var6++) {
         for (int var7 = -1; var7 < 4; var7++) {
            var2.id_class(var1, var3.id_implements() * var6 + var5.id_implements() * var4, var7, var3.id_extends() * var6 + var5.id_extends() * var4);
            if (var7 < 0 && !this.id_class.id_byte(var2).id_byte().id_break()) {
               return false;
            }

            if (var7 >= 0 && !this.id_class.id_finally(var2)) {
               return false;
            }
         }
      }

      return true;
   }
}
