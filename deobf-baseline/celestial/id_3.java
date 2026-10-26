package celestial;

public enum id_3 {
   ADDITION(0),
   MULTIPLY_BASE(1),
   MULTIPLY_TOTAL(2);

   private static final id_3[] VALUES = new id_3[]{ADDITION, MULTIPLY_BASE, MULTIPLY_TOTAL};
   private final int id;

   private id_3(int var3) {
      this.id = var3;
   }

   public int id_class() {
      return this.id;
   }

   public static id_3 id_class(int var0) {
      if (var0 >= 0 && var0 < VALUES.length) {
         return VALUES[var0];
      } else {
         throw new IllegalArgumentException("No operation with value " + var0);
      }
   }
}
