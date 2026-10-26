package celestial;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.IntStream;

public class rrSD extends rrsE_2<rrsG_2> {
   protected static final xc_3 class_ = xu_3.Ei.continue_();
   protected static final xc_3 break_ = xu_3.Pt.continue_();
   private static final xc_3 byte_ = xu_3.class_.continue_();
   private static final xc_3 protected_ = xu_3.char_.continue_();
   private static final xc_3 throws_ = xu_3.PT.continue_();
   private rKw_1 import_;
   private rKw_1 short_;
   private long default_;

   public rrSD(Codec<rrsG_2> var1) {
      super(var1);
   }

   public void class_(Random var1, roC_2 var2, rYG var3, int var4, int var5, int var6, double var7, xc_3 var9, xc_3 var10, int var11, long var12, rrsG_2 var14) {
      double var15 = 0.0;
      double var17 = 0.0;
      rfw_3 var19 = new rfw_3();
      float var20 = var3.class_(var19.class_(var4, 63, var5));
      double var21 = Math.min(Math.abs(var7), this.import_.class_((double)var4 * 0.1, (double)var5 * 0.1, false) * 15.0);
      if (var21 > 1.8) {
         double var23 = 0.09765625;
         double var25 = Math.abs(this.short_.class_((double)var4 * 0.09765625, (double)var5 * 0.09765625, false));
         var15 = var21 * var21 * 1.2;
         double var27 = Math.ceil(var25 * 40.0) + 14.0;
         if (var15 > var27) {
            var15 = var27;
         }

         if (var20 > 0.1F) {
            var15 -= 2.0;
         }

         if (var15 > 2.0) {
            var17 = (double)var11 - var15 - 7.0;
            var15 += (double)var11;
         } else {
            var15 = 0.0;
         }
      }

      int var38 = var4 & 15;
      int var24 = var5 & 15;
      rrSa_1 var39 = var3.throws_().throws_();
      xc_3 var26 = var39.break_();
      xc_3 var40 = var39.class_();
      xc_3 var28 = var26;
      xc_3 var29 = var40;
      int var30 = (int)(var7 / 3.0 + 3.0 + var1.nextDouble() * 0.25);
      int var31 = -1;
      int var32 = 0;
      int var33 = 2 + var1.nextInt(4);
      int var34 = var11 + 18 + var1.nextInt(10);

      for (int var35 = Math.max(var6, (int)var15 + 1); var35 >= 0; var35--) {
         var19.class_(var38, var35, var24);
         if (var2.byte_(var19).catch_() && var35 < (int)var15 && var1.nextDouble() > 0.01) {
            var2.class_(var19, class_, false);
         } else if (var2.byte_(var19).byte_() == QP.finally_ && var35 > (int)var17 && var35 < var11 && var17 != 0.0 && var1.nextDouble() > 0.15) {
            var2.class_(var19, class_, false);
         }

         xc_3 var36 = var2.byte_(var19);
         if (var36.catch_()) {
            var31 = -1;
         } else if (!var36.class_(var9.break_())) {
            if (var36.class_(xu_3.Ei) && var32 <= var33 && var35 > var34) {
               var2.class_(var19, break_, false);
               var32++;
            }
         } else if (var31 == -1) {
            if (var30 <= 0) {
               var29 = byte_;
               var28 = var9;
            } else if (var35 >= var11 - 4 && var35 <= var11 + 1) {
               var29 = var40;
               var28 = var26;
            }

            if (var35 < var11 && (var29 == null || var29.catch_())) {
               if (var3.class_(var19.class_(var4, var35, var5)) < 0.15F) {
                  var29 = throws_;
               } else {
                  var29 = var10;
               }
            }

            var31 = var30;
            if (var35 >= var11 - 1) {
               var2.class_(var19, var29, false);
            } else if (var35 < var11 - 7 - var30) {
               var29 = byte_;
               var28 = var9;
               var2.class_(var19, protected_, false);
            } else {
               var2.class_(var19, var28, false);
            }
         } else if (var31 > 0) {
            var31--;
            var2.class_(var19, var28, false);
            if (var31 == 0 && var28.class_(xu_3.throw_) && var30 > 1) {
               var31 = var1.nextInt(4) + Math.max(0, var35 - 63);
               var28 = var28.class_(xu_3.interface_) ? xu_3.GI.continue_() : xu_3.F.continue_();
            }
         }
      }
   }

   @Override
   public void class_(long var1) {
      if (this.default_ != var1 || this.import_ == null || this.short_ == null) {
         rqm_3 var3 = new rqm_3(var1);
         this.import_ = new rKw_1(var3, IntStream.rangeClosed(-3, 0));
         this.short_ = new rKw_1(var3, ImmutableList.of(0));
      }

      this.default_ = var1;
   }
}
