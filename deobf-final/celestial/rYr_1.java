package celestial;

public enum rYr_1 {
   EXTREMELY_HIGH(-3),
   VERY_HIGH(-2),
   HIGH(-1),
   NORMAL(0),
   LOW(1),
   VERY_LOW(2),
   EXTREMELY_LOW(3);

   private final int priority;

   private rYr_1(int var3) {
      this.priority = var3;
   }

   public static rYr_1 class_(int var0) {
      for (rYr_1 var4 : values()) {
         if (var4.priority == var0) {
            return var4;
         }
      }

      return var0 < EXTREMELY_HIGH.priority ? EXTREMELY_HIGH : EXTREMELY_LOW;
   }

   public int class_() {
      return this.priority;
   }
}
