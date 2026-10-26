package celestial;

import java.util.Comparator;
import java.util.Optional;

public class rRi_1 {
   private final rrEm_1 class_;

   public rRi_1(rrEm_1 var1) {
      this.class_ = var1;
   }

   public Optional<rqT_2> class_(rfH_2 var1, boolean var2) {
      rga_3 var3 = this.class_.d();
      int var4 = var2 ? 16 : 128;
      var3.class_(this.class_, var1, var4);
      Optional var5 = var3.break_(var0 -> var0 == rRP.synchronized_, var1, var4, rRr_1.ANY)
         .sorted(Comparator.<rgU_2>comparingDouble(var1x -> var1x.throws_().private_(var1)).thenComparingInt(var0 -> var0.throws_().c_()))
         .filter(var1x -> this.class_.byte_(var1x.throws_()).break_(rCT.char_))
         .findFirst();
      return var5.map(var1x -> {
         rfH_2 var2x = var1x.throws_();
         this.class_.else_().class_(rrEl_1.case_, new rfj_3(var2x), 3, var2x);
         xc_3 var3x = this.class_.byte_(var2x);
         return rqp_3.class_(var2x, var3x.byte_(rCT.char_), 21, rpB_2.Y, 21, var2xx -> this.class_.byte_(var2xx) == var3x);
      });
   }

   public Optional<rqT_2> class_(rfH_2 var1, rpB_2 var2) {
      rpr_3 var3 = rpr_3.class_(rpG_2.POSITIVE, var2);
      double var4 = -1.0;
      rfH_2 var6 = null;
      double var7 = -1.0;
      rfH_2 var9 = null;
      roE_2 var10 = this.class_.instanceof_();
      int var11 = this.class_.float_() - 1;
      rfw_3 var12 = var1.new_();

      for (rfw_3 var14 : rfH_2.class_(var1, 16, rpr_3.EAST, rpr_3.SOUTH)) {
         int var15 = Math.min(var11, this.class_.class_(rKv_1.MOTION_BLOCKING, var14.b_(), var14.d_()));
         boolean var16 = true;
         if (var10.class_(var14) && var10.class_(var14.byte_(var3, 1))) {
            var14.byte_(var3.case_(), 1);

            for (int var17 = var15; var17 >= 0; var17--) {
               var14.b_(var17);
               if (this.class_.finally_(var14)) {
                  int var18 = var17;

                  while (var17 > 0 && this.class_.finally_(var14.class_(rpr_3.DOWN))) {
                     var17--;
                  }

                  if (var17 + 4 <= var11) {
                     int var19 = var18 - var17;
                     if (var19 <= 0 || var19 >= 3) {
                        var14.b_(var17);
                        if (this.class_(var14, var12, var3, 0)) {
                           double var20 = var1.private_(var14);
                           if (this.class_(var14, var12, var3, -1) && this.class_(var14, var12, var3, 1) && (var4 == -1.0 || var4 > var20)) {
                              var4 = var20;
                              var6 = var14.int_();
                           }

                           if (var4 == -1.0 && (var7 == -1.0 || var7 > var20)) {
                              var7 = var20;
                              var9 = var14.int_();
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
         var6 = new rfH_2(var1.b_(), rfU_2.class_(var1.c_(), 70, this.class_.float_() - 10), var1.d_()).int_();
         rpr_3 var22 = var3.catch_();
         if (!var10.class_(var6)) {
            return Optional.empty();
         }

         for (int var25 = -1; var25 < 2; var25++) {
            for (int var28 = 0; var28 < 2; var28++) {
               for (int var30 = -1; var30 < 3; var30++) {
                  xc_3 var31 = var30 < 0 ? xu_3.rg.continue_() : xu_3.class_.continue_();
                  var12.class_(var6, var28 * var3.implements_() + var25 * var22.implements_(), var30, var28 * var3.extends_() + var25 * var22.extends_());
                  this.class_.break_(var12, var31);
               }
            }
         }
      }

      for (int var23 = -1; var23 < 3; var23++) {
         for (int var26 = -1; var26 < 4; var26++) {
            if (var23 == -1 || var23 == 2 || var26 == -1 || var26 == 3) {
               var12.class_(var6, var23 * var3.implements_(), var26, var23 * var3.extends_());
               this.class_.class_(var12, xu_3.rg.continue_(), 3);
            }
         }
      }

      xc_3 var24 = xu_3.Pi.continue_().class_(kT_2.volatile_, var2);

      for (int var27 = 0; var27 < 2; var27++) {
         for (int var29 = 0; var29 < 3; var29++) {
            var12.class_(var6, var27 * var3.implements_(), var29, var27 * var3.extends_());
            this.class_.class_(var12, var24, 18);
         }
      }

      return Optional.of(new rqT_2(var6.int_(), 2, 3));
   }

   private boolean class_(rfH_2 var1, rfw_3 var2, rpr_3 var3, int var4) {
      rpr_3 var5 = var3.catch_();

      for (int var6 = -1; var6 < 3; var6++) {
         for (int var7 = -1; var7 < 4; var7++) {
            var2.class_(var1, var3.implements_() * var6 + var5.implements_() * var4, var7, var3.extends_() * var6 + var5.extends_() * var4);
            if (var7 < 0 && !this.class_.byte_(var2).byte_().break_()) {
               return false;
            }

            if (var7 >= 0 && !this.class_.finally_(var2)) {
               return false;
            }
         }
      }

      return true;
   }
}
