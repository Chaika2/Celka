package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rrsO_2 extends rrSV {
   private static final xc_3 import_ = xu_3.sw.continue_();
   private static final xc_3 short_ = xu_3.sI.continue_();
   private static final xc_3 default_ = xu_3.Ee.continue_();

   public rrsO_2(Codec<rrsG_2> var1) {
      super(var1);
   }

   @Override
   public void class_(Random var1, roC_2 var2, rYG var3, int var4, int var5, int var6, double var7, xc_3 var9, xc_3 var10, int var11, long var12, rrsG_2 var14) {
      int var15 = var4 & 15;
      int var16 = var5 & 15;
      xc_3 var17 = import_;
      rrSa_1 var18 = var3.throws_().throws_();
      xc_3 var19 = var18.break_();
      xc_3 var20 = var18.class_();
      xc_3 var21 = var19;
      int var22 = (int)(var7 / 3.0 + 3.0 + var1.nextDouble() * 0.25);
      boolean var23 = Math.cos(var7 / 3.0 * Math.PI) > 0.0;
      int var24 = -1;
      boolean var25 = false;
      int var26 = 0;
      rfw_3 var27 = new rfw_3();

      for (int var28 = var6; var28 >= 0; var28--) {
         if (var26 < 15) {
            var27.class_(var15, var28, var16);
            xc_3 var29 = var2.byte_(var27);
            if (var29.catch_()) {
               var24 = -1;
            } else if (var29.class_(var9.break_())) {
               if (var24 == -1) {
                  var25 = false;
                  if (var22 <= 0) {
                     var17 = xu_3.class_.continue_();
                     var21 = var9;
                  } else if (var28 >= var11 - 4 && var28 <= var11 + 1) {
                     var17 = import_;
                     var21 = var19;
                  }

                  if (var28 < var11 && (var17 == null || var17.catch_())) {
                     var17 = var10;
                  }

                  var24 = var22 + Math.max(0, var28 - var11);
                  if (var28 < var11 - 1) {
                     var2.class_(var27, var21, false);
                     if (var21 == import_) {
                        var2.class_(var27, short_, false);
                     }
                  } else if (var28 > 86 + var22 * 2) {
                     if (var23) {
                        var2.class_(var27, xu_3.extends_.continue_(), false);
                     } else {
                        var2.class_(var27, xu_3.implements_.continue_(), false);
                     }
                  } else if (var28 <= var11 + 3 + var22) {
                     var2.class_(var27, var20, false);
                     var25 = true;
                  } else {
                     xc_3 var30;
                     if (var28 < 64 || var28 > 127) {
                        var30 = short_;
                     } else if (var23) {
                        var30 = default_;
                     } else {
                        var30 = this.class_(var4, var28, var5);
                     }

                     var2.class_(var27, var30, false);
                  }
               } else if (var24 > 0) {
                  var24--;
                  if (var25) {
                     var2.class_(var27, short_, false);
                  } else {
                     var2.class_(var27, this.class_(var4, var28, var5), false);
                  }
               }

               var26++;
            }
         }
      }
   }
}
