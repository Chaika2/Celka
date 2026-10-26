package celestial;

import java.util.Locale;

enum rrEB {
   ONGOING,
   VICTORY,
   LOSS,
   STOPPED;

   private static final rrEB[] VALUES = values();

   static rrEB id_class(String var0) {
      for (rrEB var4 : VALUES) {
         if (var0.equalsIgnoreCase(var4.name())) {
            return var4;
         }
      }

      return ONGOING;
   }

   public String id_class() {
      return this.name().toLowerCase(Locale.ROOT);
   }
}
