package celestial;

import java.util.Arrays;
import java.util.Comparator;

public enum VX {
   OFF(0, "options.off"),
   CROSSHAIR(1, "options.attack.crosshair"),
   HOTBAR(2, "options.attack.hotbar");

   private static final VX[] BY_ID = Arrays.stream(values()).sorted(Comparator.comparingInt(VX::id_class)).toArray(VX[]::new);
   private final int id;
   private final String resourceKey;

   private VX(int var3, String var4) {
      this.id = var3;
      this.resourceKey = var4;
   }

   public int id_class() {
      return this.id;
   }

   public static VX id_class(int var0) {
      return BY_ID[rfU_2.id_break(var0, BY_ID.length)];
   }

   public String id_break() {
      return this.resourceKey;
   }
}
