package celestial;

import java.util.Arrays;
import java.util.Comparator;

public enum rxV_2 {
   SMALL_BALL(0, "small_ball"),
   LARGE_BALL(1, "large_ball"),
   STAR(2, "star"),
   CREEPER(3, "creeper"),
   BURST(4, "burst");

   private static final rxV_2[] VALUES = Arrays.stream(values()).sorted(Comparator.comparingInt(var0 -> var0.index)).toArray(rxV_2[]::new);
   private final int index;
   private final String shapeName;

   private rxV_2(int var3, String var4) {
      this.index = var3;
      this.shapeName = var4;
   }

   public static rxV_2 id_class(int var0) {
      return var0 >= 0 && var0 < VALUES.length ? VALUES[var0] : SMALL_BALL;
   }

   public int id_class() {
      return this.index;
   }

   public String id_break() {
      return this.shapeName;
   }
}
