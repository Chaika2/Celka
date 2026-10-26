package celestial;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class rrsZ_2 extends rrsN_2 {
   public static final Codec<rrsZ_2> throws_ = RecordCodecBuilder.create(var0 -> class_(var0).apply(var0, rrsZ_2::new));

   public rrsZ_2(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   @Override
   protected rrsA_2<?> class_() {
      return rrsA_2.break_;
   }

   @Override
   public List<rrPY> class_(rKH var1, Random var2, int var3, rfH_2 var4, Set<rfH_2> var5, rfi_3 var6, rDv_1 var7) {
      class_(var1, var4.break_());
      ArrayList var8 = Lists.newArrayList();
      rpr_3 var9 = rpb_3.HORIZONTAL.class_(var2);
      int var10 = var3 - var2.nextInt(4) - 1;
      int var11 = 3 - var2.nextInt(3);
      rfw_3 var12 = new rfw_3();
      int var13 = var4.b_();
      int var14 = var4.d_();
      int var15 = 0;

      for (int var16 = 0; var16 < var3; var16++) {
         int var17 = var4.c_() + var16;
         if (var16 >= var10 && var11 > 0) {
            var13 += var9.implements_();
            var14 += var9.extends_();
            var11--;
         }

         if (class_(var1, var2, (rfH_2)var12.class_(var13, var17, var14), var5, var6, var7)) {
            var15 = var17 + 1;
         }
      }

      var8.add(new rrPY(new rfH_2(var13, var15, var14), 1, false));
      var13 = var4.b_();
      var14 = var4.d_();
      rpr_3 var24 = rpb_3.HORIZONTAL.class_(var2);
      if (var24 != var9) {
         int var25 = var10 - var2.nextInt(2) - 1;
         int var18 = 1 + var2.nextInt(3);
         var15 = 0;

         for (int var19 = var25; var19 < var3 && var18 > 0; var18--) {
            if (var19 >= 1) {
               int var20 = var4.c_() + var19;
               var13 += var24.implements_();
               var14 += var24.extends_();
               if (class_(var1, var2, (rfH_2)var12.class_(var13, var20, var14), var5, var6, var7)) {
                  var15 = var20 + 1;
               }
            }

            var19++;
         }

         if (var15 > 1) {
            var8.add(new rrPY(new rfH_2(var13, var15, var14), 0, false));
         }
      }

      return var8;
   }
}
