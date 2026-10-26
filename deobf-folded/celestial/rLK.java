package celestial;

public final class rLK {
   public static boolean id_byte(iB_2 var0) {
      return var0.id_break(rLD.id_volatile) || var0.id_break(rLD.id_throw);
   }

   public static boolean id_class(rLY var0) {
      if (var0.id_break() < 200) {
         return false;
      } else if (var0.id_class() == rLD.id_package) {
         return false;
      } else if (var0.id_class().id_throws() == rLo_1.HARMFUL) {
         return true;
      } else {
         return var0.id_class() == rLD.id_private ? true : var0.id_class() == rLD.id_instanceof;
      }
   }

   public static boolean id_class(iB_2 var0) {
      return var0.id_break(rLD.id_byte) || var0.id_break(rLD.id_throw);
   }

   public static String id_class(rLY var0, float var1) {
      if (var0.id_implements()) {
         return "**:**";
      } else {
         int var2 = rfU_2.id_protected((float)var0.id_break() * var1);
         return rql_3.id_class(var2);
      }
   }

   public static int id_break(iB_2 var0) {
      int var1 = 0;
      int var2 = 0;
      if (var0.id_break(rLD.id_byte)) {
         var1 = var0.id_byte(rLD.id_byte).id_byte();
      }

      if (var0.id_break(rLD.id_throw)) {
         var2 = var0.id_byte(rLD.id_throw).id_byte();
      }

      return Math.max(var1, var2);
   }
}
