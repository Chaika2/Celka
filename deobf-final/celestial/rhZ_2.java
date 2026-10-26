package celestial;

public enum rhZ_2 {
   DISALLOWED,
   ALLOWED,
   CREATIVE_ONLY;

   public static rhZ_2 class_(int var0) {
      if (var0 < 0 || var0 > values().length) {
         var0 = 0;
      }

      return values()[var0];
   }
}
