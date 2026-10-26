package celestial;

public class rrzz_3 {
   public static rgP_2 id_byte(ryO_2 var0) {
      if (var0 instanceof rpA_2) {
         return ((rpA_2)var0).rD();
      } else {
         return var0 instanceof rHO ? (rgP_2)rrxr_3.id_class(var0, rrxr_3.GN) : null;
      }
   }

   public static boolean id_class(ryO_2 var0, rgP_2 var1) {
      if (var0 instanceof rHD) {
         ((rHD)var0).id_class(var1);
         return true;
      } else if (var0 instanceof rHb_1) {
         ((rHb_1)var0).id_class(var1);
         return true;
      } else if (var0 instanceof rHH) {
         ((rHH)var0).id_class(var1);
         return true;
      } else if (var0 instanceof rHO) {
         ((rHO)var0).id_class(var1);
         return true;
      } else {
         return false;
      }
   }

   public static rgP_2 id_class(rfH_2 var0) {
      ryO_2 var1 = rrWq_1.id_class(var0);
      return var1 == null ? null : id_byte(var1);
   }

   public static String id_class(ryO_2 var0) {
      if (!(var0 instanceof rpA_2 var1)) {
         return null;
      } else {
         id_break(var0);
         return !var1.Bk() ? null : var1.rD().id_break();
      }
   }

   public static String id_class(rRq_1 var0, rfH_2 var1) {
      ryO_2 var2 = var0.id_class(var1);
      return id_class(var2);
   }

   public static void id_break(ryO_2 var0) {
      rfH_2 var1 = var0.id_char();
      rgP_2 var2 = id_byte(var0);
      if (var2 == null) {
         Object var3 = id_class(var1);
         if (var3 == null) {
            var3 = new rgN_2("");
         }

         id_class(var0, (rgP_2)var3);
      }
   }
}
