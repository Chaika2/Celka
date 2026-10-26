package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rrSK extends rrSV {
   private static final xc_3 id_import = xu_3.sw.id_continue();
   private static final xc_3 id_short = xu_3.sI.id_continue();
   private static final xc_3 id_default = xu_3.Ee.id_continue();

   public rrSK(Codec<rrsG_2> var1) {
      super(var1);
   }

   @Override
   public void id_class(
      Random var1, roC_2 var2, rYG var3, int var4, int var5, int var6, double var7, xc_3 var9, xc_3 var10, int var11, long var12, rrsG_2 var14
   ) {
      double var15 = 0.0;
      double var17 = Math.min(Math.abs(var7), this.id_byte.id_class((double)var4 * 0.25, (double)var5 * 0.25, false) * 15.0);
      if (var17 > 0.0) {
         double var19 = 0.001953125;
         double var21 = Math.abs(this.id_protected.id_class((double)var4 * 0.001953125, (double)var5 * 0.001953125, false));
         var15 = var17 * var17 * 2.5;
         double var23 = Math.ceil(var21 * 50.0) + 14.0;
         if (var15 > var23) {
            var15 = var23;
         }

         var15 += 64.0;
      }

      int var35 = var4 & 15;
      int var20 = var5 & 15;
      xc_3 var36 = id_import;
      rrSa_1 var22 = var3.id_throws().id_throws();
      xc_3 var37 = var22.id_break();
      xc_3 var24 = var22.id_class();
      xc_3 var25 = var37;
      int var26 = (int)(var7 / 3.0 + 3.0 + var1.nextDouble() * 0.25);
      boolean var27 = Math.cos(var7 / 3.0 * Math.PI) > 0.0;
      int var28 = -1;
      boolean var29 = false;
      rfw_3 var30 = new rfw_3();

      for (int var31 = Math.max(var6, (int)var15 + 1); var31 >= 0; var31--) {
         var30.id_class(var35, var31, var20);
         if (var2.id_byte(var30).id_catch() && var31 < (int)var15) {
            var2.id_class(var30, var9, false);
         }

         xc_3 var32 = var2.id_byte(var30);
         if (var32.id_catch()) {
            var28 = -1;
         } else if (var32.id_class(var9.id_break())) {
            if (var28 == -1) {
               var29 = false;
               if (var26 <= 0) {
                  var36 = xu_3.id_class.id_continue();
                  var25 = var9;
               } else if (var31 >= var11 - 4 && var31 <= var11 + 1) {
                  var36 = id_import;
                  var25 = var37;
               }

               if (var31 < var11 && (var36 == null || var36.id_catch())) {
                  var36 = var10;
               }

               var28 = var26 + Math.max(0, var31 - var11);
               if (var31 >= var11 - 1) {
                  if (var31 <= var11 + 3 + var26) {
                     var2.id_class(var30, var24, false);
                     var29 = true;
                  } else {
                     xc_3 var33;
                     if (var31 < 64 || var31 > 127) {
                        var33 = id_short;
                     } else if (var27) {
                        var33 = id_default;
                     } else {
                        var33 = this.id_class(var4, var31, var5);
                     }

                     var2.id_class(var30, var33, false);
                  }
               } else {
                  var2.id_class(var30, var25, false);
                  xd_3 var38 = var25.id_break();
                  if (var38 == xu_3.sw
                     || var38 == xu_3.sI
                     || var38 == xu_3.sf
                     || var38 == xu_3.sj
                     || var38 == xu_3.sV
                     || var38 == xu_3.sg
                     || var38 == xu_3.sR
                     || var38 == xu_3.sY
                     || var38 == xu_3.so
                     || var38 == xu_3.sK
                     || var38 == xu_3.sD
                     || var38 == xu_3.sU
                     || var38 == xu_3.se
                     || var38 == xu_3.sa
                     || var38 == xu_3.si
                     || var38 == xu_3.Er) {
                     var2.id_class(var30, id_short, false);
                  }
               }
            } else if (var28 > 0) {
               var28--;
               if (var29) {
                  var2.id_class(var30, id_short, false);
               } else {
                  var2.id_class(var30, this.id_class(var4, var31, var5), false);
               }
            }
         }
      }
   }
}
