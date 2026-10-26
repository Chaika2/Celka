package celestial;

public class rrzc_3 {
   public static boolean id_byte(rYB var0) {
      rqM_2 var1 = var0.E();
      return id_class(var1) == 0;
   }

   public static int id_class(rYB var0) {
      return var0 == null ? 0 : id_class(var0.E());
   }

   public static int id_class(rqM_2<rYB> var0) {
      if (var0 == rYB.id_protected) {
         return -1;
      } else if (var0 == rYB.id_byte) {
         return 0;
      } else {
         return var0 == rYB.id_throws ? 1 : 0;
      }
   }

   public static boolean id_break(rYB var0) {
      return var0.E() == rYB.id_protected;
   }

   public static boolean id_protected(rYB var0) {
      return var0.E() == rYB.id_throws;
   }
}
