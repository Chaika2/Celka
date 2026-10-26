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

   public static int id_class(Set<rvU_2> var0) {
      int var1 = 0;

      for (rvU_2 var3 : var0) {
         var1 |= var3.id_class();
      }

      return var1;
   }

   public static Set<rvU_2> id_class(int var0) {
      EnumSet var1 = EnumSet.noneOf(rvU_2.class);

      for (rvU_2 var5 : values()) {
         if (var5.id_break(var0)) {
            var1.add(var5);
         }
      }

      return var1;
   }

   private int id_class() {
      return 1 << this.bit;
   }

   private boolean id_break(int var1) {
      return (var1 & this.id_class()) == this.id_class();
   }
}
