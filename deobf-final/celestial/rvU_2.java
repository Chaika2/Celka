package celestial;

import java.util.EnumSet;
import java.util.Set;

public enum rvU_2 {
   X(0),
   Y(1),
   Z(2),
   Y_ROT(3),
   X_ROT(4);

   private final int bit;

   private rvU_2(int var3) {
      this.bit = var3;
   }

   public static int class_(Set<rvU_2> var0) {
      int var1 = 0;

      for (rvU_2 var3 : var0) {
         var1 |= var3.class_();
      }

      return var1;
   }

   public static Set<rvU_2> class_(int var0) {
      EnumSet var1 = EnumSet.noneOf(rvU_2.class);

      for (rvU_2 var5 : values()) {
         if (var5.break_(var0)) {
            var1.add(var5);
         }
      }

      return var1;
   }

   private int class_() {
      return 1 << this.bit;
   }

   private boolean break_(int var1) {
      return (var1 & this.class_()) == this.class_();
   }
}
