package celestial;

import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.UUID;

public final class rqV_2 {
   public static final Codec<UUID> class_ = Codec.INT_STREAM
      .comapFlatMap(var0 -> rqR_2.class_(var0, 4).map(rqV_2::class_), var0 -> Arrays.stream(class_(var0)));

   private static int[] class_(long var0, long var2) {
      return new int[]{(int)(var0 >> 32), (int)var0, (int)(var2 >> 32), (int)var2};
   }

   public static UUID class_(int[] var0) {
      return new UUID((long)var0[0] << 32 | (long)var0[1] & 4294967295L, (long)var0[2] << 32 | (long)var0[3] & 4294967295L);
   }

   public static int[] class_(UUID var0) {
      long var1 = var0.getMostSignificantBits();
      long var3 = var0.getLeastSignificantBits();
      return class_(var1, var3);
   }
}
