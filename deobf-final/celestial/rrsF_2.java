package celestial;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class rrsF_2 extends rrsv_3 {
   public static final Codec<rrsF_2> case_ = RecordCodecBuilder.create(var0 -> class_(var0).apply(var0, rrsF_2::new));

   public rrsF_2(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   @Override
   protected rrsA_2<?> class_() {
      return rrsA_2.protected_;
   }

   @Override
   public List<rrPY> class_(rKH var1, Random var2, int var3, rfH_2 var4, Set<rfH_2> var5, rfi_3 var6, rDv_1 var7) {
      ArrayList var8 = Lists.newArrayList();
      var8.addAll(super.class_(var1, var2, var3, var4, var5, var6, var7));

      for (int var9 = var3 - 2 - var2.nextInt(4); var9 > var3 / 2; var9 -= 2 + var2.nextInt(4)) {
         float var10 = var2.nextFloat() * (float) (Math.PI * 2);
         int var11 = 0;
         int var12 = 0;

         for (int var13 = 0; var13 < 5; var13++) {
            var11 = (int)(1.5F + rfU_2.break_(var10) * (float)var13);
            var12 = (int)(1.5F + rfU_2.class_(var10) * (float)var13);
            rfH_2 var14 = var4.break_(var11, var9 - 3 + var13 / 2, var12);
            class_(var1, var2, var14, var5, var6, var7);
         }

         var8.add(new rrPY(var4.break_(var11, var9, var12), -2, false));
      }

      return var8;
   }
}
