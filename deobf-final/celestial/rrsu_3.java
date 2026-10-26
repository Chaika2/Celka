package celestial;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Set;

public class rrsu_3 extends rrsN_2 {
   public static final Codec<rrsu_3> throws_ = RecordCodecBuilder.create(var0 -> class_(var0).apply(var0, rrsu_3::new));

   public rrsu_3(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   @Override
   protected rrsA_2<?> class_() {
      return rrsA_2.case_;
   }

   private boolean class_(int var1, int var2) {
      return (double)var2 >= (double)var1 * 0.2;
   }

   private void class_(rKH var1, Random var2, int var3, rfH_2 var4, List<rrsm_3> var5, Set<rfH_2> var6, rfi_3 var7, rDv_1 var8) {
      for (rrsm_3 var10 : var5) {
         int var11 = var10.class_();
         rfH_2 var12 = new rfH_2(var4.b_(), var11, var4.d_());
         if (!var12.equals(var10.class_.class_()) && this.class_(var3, var11 - var4.c_())) {
            this.class_(var1, var2, var12, var10.class_.class_(), true, var6, var7, var8);
         }
      }
   }

   private rpB_2 class_(rfH_2 var1, rfH_2 var2) {
      rpB_2 var3 = rpB_2.Y;
      int var4 = Math.abs(var2.b_() - var1.b_());
      int var5 = Math.abs(var2.d_() - var1.d_());
      int var6 = Math.max(var4, var5);
      if (var6 > 0) {
         if (var4 == var6) {
            var3 = rpB_2.X;
         } else {
            var3 = rpB_2.Z;
         }
      }

      return var3;
   }

   @Override
   public List<rrPY> class_(rKH var1, Random var2, int var3, rfH_2 var4, Set<rfH_2> var5, rfi_3 var6, rDv_1 var7) {
      byte var8 = 5;
      int var9 = var3 + 2;
      int var10 = rfU_2.byte_((double)var9 * 0.618);
      if (!var7.throws_) {
         class_(var1, var4.break_());
      }

      double var11 = 1.0;
      int var13 = Math.min(1, rfU_2.byte_(1.382 + Math.pow(1.0 * (double)var9 / 13.0, 2.0)));
      int var14 = var4.c_() + var10;
      int var15 = var9 - 5;
      ArrayList var16 = Lists.newArrayList();
      var16.add(new rrsm_3(var4.break_(var15), var14));

      for (; var15 >= 0; var15--) {
         float var17 = this.break_(var9, var15);
         if (!(var17 < 0.0F)) {
            for (int var18 = 0; var18 < var13; var18++) {
               double var19 = 1.0;
               double var21 = 1.0 * (double)var17 * ((double)var2.nextFloat() + 0.328);
               double var23 = (double)(var2.nextFloat() * 2.0F) * Math.PI;
               double var25 = var21 * Math.sin(var23) + 0.5;
               double var27 = var21 * Math.cos(var23) + 0.5;
               rfH_2 var29 = var4.byte_(var25, (double)(var15 - 1), var27);
               rfH_2 var30 = var29.break_(5);
               if (this.class_(var1, var2, var29, var30, false, var5, var6, var7)) {
                  int var31 = var4.b_() - var29.b_();
                  int var32 = var4.d_() - var29.d_();
                  double var33 = (double)var29.c_() - Math.sqrt((double)(var31 * var31 + var32 * var32)) * 0.381;
                  int var35 = var33 > (double)var14 ? var14 : (int)var33;
                  rfH_2 var36 = new rfH_2(var4.b_(), var35, var4.d_());
                  if (this.class_(var1, var2, var36, var29, false, var5, var6, var7)) {
                     var16.add(new rrsm_3(var29, var36.c_()));
                  }
               }
            }
         }
      }

      this.class_(var1, var2, var4, var4.break_(var10), true, var5, var6, var7);
      this.class_(var1, var2, var9, var4, var16, var5, var6, var7);
      ArrayList var37 = Lists.newArrayList();

      for (rrsm_3 var39 : var16) {
         if (this.class_(var9, var39.class_() - var4.c_())) {
            var37.add(var39.class_);
         }
      }

      return var37;
   }

   private boolean class_(rKH var1, Random var2, rfH_2 var3, rfH_2 var4, boolean var5, Set<rfH_2> var6, rfi_3 var7, rDv_1 var8) {
      if (!var5 && Objects.equals(var3, var4)) {
         return true;
      } else {
         rfH_2 var9 = var4.break_(-var3.b_(), -var3.c_(), -var3.d_());
         int var10 = this.class_(var9);
         float var11 = (float)var9.b_() / (float)var10;
         float var12 = (float)var9.c_() / (float)var10;
         float var13 = (float)var9.d_() / (float)var10;

         for (int var14 = 0; var14 <= var10; var14++) {
            rfH_2 var15 = var3.byte_((double)(0.5F + (float)var14 * var11), (double)(0.5F + (float)var14 * var12), (double)(0.5F + (float)var14 * var13));
            if (var5) {
               class_(var1, var15, var8.break_.class_(var2, var15).class_(WL.new_, this.class_(var3, var15)), var7);
               var6.add(var15.int_());
            } else if (!reS_2.byte_(var1, var15)) {
               return false;
            }
         }

         return true;
      }
   }

   private int class_(rfH_2 var1) {
      int var2 = rfU_2.class_(var1.b_());
      int var3 = rfU_2.class_(var1.c_());
      int var4 = rfU_2.class_(var1.d_());
      return Math.max(var2, Math.max(var3, var4));
   }

   private float break_(int var1, int var2) {
      if ((float)var2 < (float)var1 * 0.3F) {
         return -1.0F;
      } else {
         float var3 = (float)var1 / 2.0F;
         float var4 = var3 - (float)var2;
         float var5 = rfU_2.byte_(var3 * var3 - var4 * var4);
         if (var4 == 0.0F) {
            var5 = var3;
         } else if (Math.abs(var4) >= var3) {
            return 0.0F;
         }

         return var5 * 0.5F;
      }
   }
}
