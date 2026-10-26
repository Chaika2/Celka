package celestial;

import java.util.Arrays;
import java.util.Comparator;

public enum rOe_1 {
   NONE(0),
   WHITE(1),
   WHITE_FIELD(2),
   WHITE_DOTS(3),
   BLACK_DOTS(4);

   private static final rOe_1[] VALUES = Arrays.stream(values()).sorted(Comparator.comparingInt(rOe_1::class_)).toArray(rOe_1[]::new);
   private final int id;

   private rOe_1(int var3) {
      this.id = var3;
   }

   public static rOe_1 class_(int var0) {
      return VALUES[var0 % VALUES.length];
   }

   public int class_() {
      return this.id;
   }
}
