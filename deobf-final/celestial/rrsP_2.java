package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.IntStream;

public class rrsP_2 extends rrsE_2<rrsG_2> {
   private static final xc_3 byte_ = xu_3.hb.continue_();
   private static final xc_3 protected_ = xu_3.char_.continue_();
   private static final xc_3 throws_ = xu_3.PY.continue_();
   protected long class_;
   protected rKt_1 break_;

   public rrsP_2(Codec<rrsG_2> var1) {
      super(var1);
   }

   public void class_(Random var1, roC_2 var2, rYG var3, int var4, int var5, int var6, double var7, xc_3 var9, xc_3 var10, int var11, long var12, rrsG_2 var14) {
      int var15 = var11;
      int var16 = var4 & 15;
      int var17 = var5 & 15;
      double var18 = 0.03125;
      boolean var20 = this.break_.class_((double)var4 * 0.03125, (double)var5 * 0.03125, 0.0) * 75.0 + var1.nextDouble() > 0.0;
      boolean var21 = this.break_.class_((double)var4 * 0.03125, 109.0, (double)var5 * 0.03125) * 75.0 + var1.nextDouble() > 0.0;
      int var22 = (int)(var7 / 3.0 + 3.0 + var1.nextDouble() * 0.25);
      rfw_3 var23 = new rfw_3();
      int var24 = -1;
      xc_3 var25 = var14.class_();
      xc_3 var26 = var14.break_();

      for (int var27 = 127; var27 >= 0; var27--) {
         var23.class_(var16, var27, var17);
         xc_3 var28 = var2.byte_(var23);
         if (var28.catch_()) {
            var24 = -1;
         } else if (var28.class_(var9.break_())) {
            if (var24 == -1) {
               boolean var29 = false;
               if (var22 <= 0) {
                  var29 = true;
                  var26 = var14.break_();
               } else if (var27 >= var15 - 4 && var27 <= var15 + 1) {
                  var25 = var14.class_();
                  var26 = var14.break_();
                  if (var21) {
                     var25 = protected_;
                     var26 = var14.break_();
                  }

                  if (var20) {
                     var25 = throws_;
                     var26 = throws_;
                  }
               }

               if (var27 < var15 && var29) {
                  var25 = var10;
               }

               var24 = var22;
               if (var27 >= var15 - 1) {
                  var2.class_(var23, var25, false);
               } else {
                  var2.class_(var23, var26, false);
               }
            } else if (var24 > 0) {
               var24--;
               var2.class_(var23, var26, false);
            }
         }
      }
   }

   @Override
   public void class_(long var1) {
      if (this.class_ != var1 || this.break_ == null) {
         this.break_ = new rKt_1(new rqm_3(var1), IntStream.rangeClosed(-3, 0));
      }

      this.class_ = var1;
   }
}
