package celestial;

import java.util.Arrays;
import java.util.Comparator;

public enum Vd_1 {
   OFF(0, "options.off"),
   FAST(1, "options.clouds.fast"),
   FANCY(2, "options.clouds.fancy");

   private static final Vd_1[] BY_ID = Arrays.stream(values()).sorted(Comparator.comparingInt(Vd_1::class_)).toArray(Vd_1[]::new);
   private final int id;
   private final String key;

   private Vd_1(int var3, String var4) {
      this.id = var3;
      this.key = var4;
   }

   public int class_() {
      return this.id;
   }

   public static Vd_1 class_(int var0) {
      return BY_ID[rfU_2.break_(var0, BY_ID.length)];
   }

   public String break_() {
      return this.key;
   }
}
