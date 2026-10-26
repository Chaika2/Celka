package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

public enum rgD_2 {
   MAJOR_NEGATIVE("major_negative", -5, 100, 10, 10),
   MINOR_NEGATIVE("minor_negative", -1, 200, 20, 20),
   MINOR_POSITIVE("minor_positive", 1, 200, 1, 5),
   MAJOR_POSITIVE("major_positive", 5, 100, 0, 100),
   TRADING("trading", 1, 25, 2, 20);

   public final String id;
   public final int weight;
   public final int max;
   public final int decayPerDay;
   public final int decayPerTransfer;
   private static final Map<String, rgD_2> BY_ID = Stream.of(values()).collect(ImmutableMap.toImmutableMap(var0 -> var0.id, Function.identity()));

   private rgD_2(String var3, int var4, int var5, int var6, int var7) {
      this.id = var3;
      this.weight = var4;
      this.max = var5;
      this.decayPerDay = var6;
      this.decayPerTransfer = var7;
   }

   public static rgD_2 class_(String var0) {
      return BY_ID.get(var0);
   }
}
