package celestial;

import java.util.Arrays;
import java.util.Comparator;

public enum rOU {
   WHITE(0),
   CREAMY(1),
   CHESTNUT(2),
   BROWN(3),
   BLACK(4),
   GRAY(5),
   DARKBROWN(6);

   private static final rOU[] VALUES = Arrays.stream(values()).sorted(Comparator.comparingInt(rOU::id_class)).toArray(rOU[]::new);
   private final int id;

   private rOU(int var3) {
      this.id = var3;
   }

   public static rOU id_class(int var0) {
      return VALUES[var0 % VALUES.length];
   }

   public int id_class() {
      return this.id;
   }
}
