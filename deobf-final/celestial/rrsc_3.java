package celestial;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class rrsc_3 extends rrsN_2 {
   public static final Codec<rrsc_3> throws_ = RecordCodecBuilder.create(var0 -> class_(var0).apply(var0, rrsc_3::new));

   public rrsc_3(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   @Override
   protected rrsA_2<?> class_() {
      return rrsA_2.throws_;
   }

   @Override
   public List<rrPY> class_(rKH var1, Random var2, int var3, rfH_2 var4, Set<rfH_2> var5, rfi_3 var6, rDv_1 var7) {
      ArrayList var8 = Lists.newArrayList();
      rfH_2 var9 = var4.break_();
      class_(var1, var9);
      class_(var1, var9.extends_());
      class_(var1, var9.protected_());
      class_(var1, var9.protected_().extends_());
      rpr_3 var10 = rpb_3.HORIZONTAL.class_(var2);
      int var11 = var3 - var2.nextInt(4);
      int var12 = 2 - var2.nextInt(3);
      int var13 = var4.b_();
      int var14 = var4.c_();
      int var15 = var4.d_();
      int var16 = var13;
      int var17 = var15;
      int var18 = var14 + var3 - 1;

      for (int var19 = 0; var19 < var3; var19++) {
         if (var19 >= var11 && var12 > 0) {
            var16 += var10.implements_();
            var17 += var10.extends_();
            var12--;
         }

         int var20 = var14 + var19;
         rfH_2 var21 = new rfH_2(var16, var20, var17);
         if (reS_2.protected_(var1, var21)) {
            class_(var1, var2, var21, var5, var6, var7);
            class_(var1, var2, var21.extends_(), var5, var6, var7);
            class_(var1, var2, var21.protected_(), var5, var6, var7);
            class_(var1, var2, var21.extends_().protected_(), var5, var6, var7);
         }
      }

      var8.add(new rrPY(new rfH_2(var16, var18, var17), 0, true));

      for (int var23 = -1; var23 <= 2; var23++) {
         for (int var24 = -1; var24 <= 2; var24++) {
            if ((var23 < 0 || var23 > 1 || var24 < 0 || var24 > 1) && var2.nextInt(3) <= 0) {
               int var25 = var2.nextInt(3) + 2;

               for (int var22 = 0; var22 < var25; var22++) {
                  class_(var1, var2, new rfH_2(var13 + var23, var18 - var22 - 1, var15 + var24), var5, var6, var7);
               }

               var8.add(new rrPY(new rfH_2(var16 + var23, var18, var17 + var24), 0, false));
            }
         }
      }

      return var8;
   }
}
