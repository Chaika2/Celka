package celestial;

import java.util.Arrays;
import java.util.Comparator;

public enum rRO {
   PEACEFUL(0, "peaceful"),
   EASY(1, "easy"),
   NORMAL(2, "normal"),
   HARD(3, "hard");

   private static final rRO[] ID_MAPPING = Arrays.stream(values()).sorted(Comparator.comparingInt(rRO::class_)).toArray(rRO[]::new);
   private final int id;
   private final String translationKey;

   public String byte_() {
      return this.translationKey;
   }

   private rRO(int var3, String var4) {
      this.id = var3;
      this.translationKey = var4;
   }

   public int class_() {
      return this.id;
   }

   public static rRO class_(int var0) {
      return ID_MAPPING[var0 % ID_MAPPING.length];
   }

   public static rRO class_(String var0) {
      for (rRO var4 : values()) {
         if (var4.translationKey.equals(var0)) {
            return var4;
         }
      }

      return null;
   }

   public rgP_2 break_() {
      return new rgn_3("options.difficulty." + this.translationKey);
   }

   public rRO protected_() {
      return ID_MAPPING[(this.id + 1) % ID_MAPPING.length];
   }
}
