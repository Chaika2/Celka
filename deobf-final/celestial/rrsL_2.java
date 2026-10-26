package celestial;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class rrsL_2 extends rrsN_2 {
   public static final Codec<rrsL_2> throws_ = RecordCodecBuilder.create(var0 -> class_(var0).apply(var0, rrsL_2::new));

   public rrsL_2(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   @Override
   protected rrsA_2<?> class_() {
      return rrsA_2.class_;
   }

   @Override
   public List<rrPY> class_(rKH var1, Random var2, int var3, rfH_2 var4, Set<rfH_2> var5, rfi_3 var6, rDv_1 var7) {
      class_(var1, var4.break_());

      for (int var8 = 0; var8 < var3; var8++) {
         class_(var1, var2, var4.break_(var8), var5, var6, var7);
      }

      return ImmutableList.of(new rrPY(var4.break_(var3), 0, false));
   }
}
