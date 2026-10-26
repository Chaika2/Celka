package celestial;

import java.util.Arrays;
import java.util.Comparator;

public enum rhJ_2 {
   FULL(0, "options.chat.visibility.full"),
   SYSTEM(1, "options.chat.visibility.system"),
   HIDDEN(2, "options.chat.visibility.hidden");

   private static final rhJ_2[] field_221255_d = Arrays.stream(values()).sorted(Comparator.comparingInt(rhJ_2::class_)).toArray(rhJ_2[]::new);
   private final int id;
   private final String resourceKey;

   private rhJ_2(int var3, String var4) {
      this.id = var3;
      this.resourceKey = var4;
   }

   public int class_() {
      return this.id;
   }

   public static rhJ_2 class_(int var0) {
      return field_221255_d[rfU_2.break_(var0, field_221255_d.length)];
   }

   public String break_() {
      return this.resourceKey;
   }
}
