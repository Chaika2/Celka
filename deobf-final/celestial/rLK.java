package celestial;

public final class rLK {
   public static boolean byte_(iB_2 var0) {
      return var0.break_(rLD.volatile_) || var0.break_(rLD.throw_);
   }

   public static boolean class_(rLY var0) {
      if (var0.break_() < 200) {
         return false;
      } else if (var0.class_() == rLD.package_) {
         return false;
      } else if (var0.class_().throws_() == rLo_1.HARMFUL) {
         return true;
      } else {
         return var0.class_() == rLD.private_ ? true : var0.class_() == rLD.instanceof_;
      }
   }

   public static boolean class_(iB_2 var0) {
      return var0.break_(rLD.byte_) || var0.break_(rLD.throw_);
   }

   public static String class_(rLY var0, float var1) {
      if (var0.implements_()) {
         return "**:**";
      } else {
         int var2 = rfU_2.protected_((float)var0.break_() * var1);
         return rql_3.class_(var2);
      }
   }

   public static int break_(iB_2 var0) {
      int var1 = 0;
      int var2 = 0;
      if (var0.break_(rLD.byte_)) {
         var1 = var0.byte_(rLD.byte_).byte_();
      }

      if (var0.break_(rLD.throw_)) {
         var2 = var0.byte_(rLD.throw_).byte_();
      }

      return Math.max(var1, var2);
   }
}
