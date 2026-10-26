package celestial;

import java.util.Arrays;
import java.util.Comparator;

public enum Vm_1 {
   ALL(0, "options.particles.all"),
   DECREASED(1, "options.particles.decreased"),
   MINIMAL(2, "options.particles.minimal");

   private static final Vm_1[] BY_ID = Arrays.stream(values()).sorted(Comparator.comparingInt(Vm_1::break_)).toArray(Vm_1[]::new);
   private final int id;
   private final String resourceKey;

   private Vm_1(int var3, String var4) {
      this.id = var3;
      this.resourceKey = var4;
   }

   public String class_() {
      return this.resourceKey;
   }

   public static Vm_1 class_(int var0) {
      return BY_ID[rfU_2.break_(var0, BY_ID.length)];
   }

   public int break_() {
      return this.id;
   }
}
