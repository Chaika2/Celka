package celestial;

import java.util.Locale;

enum rOY {
   KOB(0, 0),
   SUNSTREAK(0, 1),
   SNOOPER(0, 2),
   DASHER(0, 3),
   BRINELY(0, 4),
   SPOTTY(0, 5),
   FLOPPER(1, 0),
   STRIPEY(1, 1),
   GLITTER(1, 2),
   BLOCKFISH(1, 3),
   BETTY(1, 4),
   CLAYFISH(1, 5);

   private final int field_212552_m;
   private final int field_212553_n;
   private static final rOY[] field_212554_o = values();

   public String byte_() {
      return this.name().toLowerCase(Locale.ROOT);
   }

   private rOY(int var3, int var4) {
      this.field_212552_m = var3;
      this.field_212553_n = var4;
   }

   public int class_() {
      return this.field_212552_m;
   }

   public static String class_(int var0, int var1) {
      return field_212554_o[var1 + 6 * var0].byte_();
   }

   public int break_() {
      return this.field_212553_n;
   }
}
