package celestial;

public class rrzc_3 {
   public static boolean byte_(rYB var0) {
      rqM_2 var1 = var0.E();
      return class_(var1) == 0;
   }

   public static int class_(rYB var0) {
      return var0 == null ? 0 : class_(var0.E());
   }

   public static int class_(rqM_2<rYB> var0) {
      if (var0 == rYB.protected_) {
         return -1;
      } else if (var0 == rYB.byte_) {
         return 0;
      } else {
         return var0 == rYB.throws_ ? 1 : 0;
      }
   }

   public static boolean break_(rYB var0) {
      return var0.E() == rYB.protected_;
   }

   public static boolean protected_(rYB var0) {
      return var0.E() == rYB.throws_;
   }
}
