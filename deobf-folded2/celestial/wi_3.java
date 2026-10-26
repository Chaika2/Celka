package celestial;

public enum wi_3 {
   FRONT("front"),
   SIDE("side");

   private final String name;

   private wi_3(String var3) {
      this.name = var3;
   }

   public static wi_3 id_class(String var0) {
      for (wi_3 var4 : values()) {
         if (var4.name.equals(var0)) {
            return var4;
         }
      }

      throw new IllegalArgumentException("Invalid gui light: " + var0);
   }

   public boolean id_class() {
      return this == SIDE;
   }
}
