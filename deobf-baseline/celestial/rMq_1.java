package celestial;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public enum rMq_1 {
   NORMAL(0, "normal", false),
   LAZY(1, "lazy", false),
   WORRIED(2, "worried", false),
   PLAYFUL(3, "playful", false),
   BROWN(4, "brown", true),
   WEAK(5, "weak", true),
   AGGRESSIVE(6, "aggressive", false);

   private static final rMq_1[] field_221109_h = Arrays.stream(values()).sorted(Comparator.comparingInt(rMq_1::id_class)).toArray(rMq_1[]::new);
   private final int index;
   private final String name;
   private final boolean field_221112_k;

   public boolean id_byte() {
      return this.field_221112_k;
   }

   private rMq_1(int var3, String var4, boolean var5) {
      this.index = var3;
      this.name = var4;
      this.field_221112_k = var5;
   }

   public static rMq_1 id_class(int var0) {
      if (var0 < 0 || var0 >= field_221109_h.length) {
         var0 = 0;
      }

      return field_221109_h[var0];
   }

   public static rMq_1 id_class(Random var0) {
      int var1 = var0.nextInt(16);
      if (var1 == 0) {
         return LAZY;
      } else if (var1 == 1) {
         return WORRIED;
      } else if (var1 == 2) {
         return PLAYFUL;
      } else if (var1 == 4) {
         return AGGRESSIVE;
      } else if (var1 < 9) {
         return WEAK;
      } else {
         return var1 < 11 ? BROWN : NORMAL;
      }
   }

   static rMq_1 id_class(rMq_1 var0, rMq_1 var1) {
      if (var0.id_byte()) {
         return var0 == var1 ? var0 : NORMAL;
      } else {
         return var0;
      }
   }

   public int id_class() {
      return this.index;
   }

   public static rMq_1 id_class(String var0) {
      for (rMq_1 var4 : values()) {
         if (var4.name.equals(var0)) {
            return var4;
         }
      }

      return NORMAL;
   }

   public String id_break() {
      return this.name;
   }
}
