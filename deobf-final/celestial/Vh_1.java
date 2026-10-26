package celestial;

import java.util.Arrays;
import java.util.Comparator;

public enum Vh_1 {
   OFF(0, "options.ao.off"),
   MIN(1, "options.ao.min"),
   MAX(2, "options.ao.max");

   private static final Vh_1[] VALUES = Arrays.stream(values()).sorted(Comparator.comparingInt(Vh_1::class_)).toArray(Vh_1[]::new);
   private final int id;
   private final String resourceKey;

   private Vh_1(int var3, String var4) {
      this.id = var3;
      this.resourceKey = var4;
   }

   public int class_() {
      return this.id;
   }

   public static Vh_1 class_(int var0) {
      return VALUES[rfU_2.break_(var0, VALUES.length)];
   }

   public String break_() {
      return this.resourceKey;
   }
}
