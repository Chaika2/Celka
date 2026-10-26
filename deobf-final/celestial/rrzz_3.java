package celestial;

public class rrzz_3 {
   public static rgP_2 byte_(ryO_2 var0) {
      if (var0 instanceof rpA_2) {
         return ((rpA_2)var0).rD();
      } else {
         return var0 instanceof rHO ? (rgP_2)rrxr_3.class_(var0, rrxr_3.GN) : null;
      }
   }

   public static boolean class_(ryO_2 var0, rgP_2 var1) {
      if (var0 instanceof rHD) {
         ((rHD)var0).class_(var1);
         return true;
      } else if (var0 instanceof rHb_1) {
         ((rHb_1)var0).class_(var1);
         return true;
      } else if (var0 instanceof rHH) {
         ((rHH)var0).class_(var1);
         return true;
      } else if (var0 instanceof rHO) {
         ((rHO)var0).class_(var1);
         return true;
      } else {
         return false;
      }
   }

   public static rgP_2 class_(rfH_2 var0) {
      ryO_2 var1 = rrWq_1.class_(var0);
      return var1 == null ? null : byte_(var1);
   }

   public static String class_(ryO_2 var0) {
      if (!(var0 instanceof rpA_2 var1)) {
         return null;
      } else {
         break_(var0);
         return !var1.Bk() ? null : var1.rD().break_();
      }
   }

   public static String class_(rRq_1 var0, rfH_2 var1) {
      ryO_2 var2 = var0.class_(var1);
      return class_(var2);
   }

   public static void break_(ryO_2 var0) {
      rfH_2 var1 = var0.char_();
      rgP_2 var2 = byte_(var0);
      if (var2 == null) {
         Object var3 = class_(var1);
         if (var3 == null) {
            var3 = new rgN_2("");
         }

         class_(var0, (rgP_2)var3);
      }
   }
}
