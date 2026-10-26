package celestial;

import java.util.Arrays;
import java.util.Comparator;

public enum VX {
   OFF(0, "options.off"),
   CROSSHAIR(1, "options.attack.crosshair"),
   HOTBAR(2, "options.attack.hotbar");

   private static final VX[] BY_ID = Arrays.stream(values()).sorted(Comparator.comparingInt(VX::class_)).toArray(VX[]::new);
   private final int id;
   private final String resourceKey;

   private VX(int var3, String var4) {
      this.id = var3;
      this.resourceKey = var4;
   }

   public int class_() {
      return this.id;
   }

   public static VX class_(int var0) {
      return BY_ID[rfU_2.break_(var0, BY_ID.length)];
   }

   public String break_() {
      return this.resourceKey;
   }
}
