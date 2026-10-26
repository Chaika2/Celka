package celestial;

public class rrGe_1 {
   private static IJ id_class = null;

   public static xc_3 id_byte() {
      return xu_3.Pq.id_continue();
   }

   private static boolean id_class(rRq_1 var0, xc_3 var1, rfH_2 var2) {
      if (var1.id_implements(var0, var2)) {
         return false;
      } else {
         xd_3 var3 = var1.id_break();
         if (var3 == xu_3.Pt) {
            return false;
         } else if (!(var3 instanceof xF_2)
            || !(var3 instanceof du_3) && !(var3 instanceof dI_2) && !(var3 instanceof kp_3) && !(var3 instanceof WC) && !(var3 instanceof zc_3)) {
            if (var3 instanceof dp_3 || var3 instanceof dq_3 || var3 instanceof df_3 || var3 instanceof dV_2 || var3 instanceof zW_2 || var3 instanceof zw_3) {
               return true;
            } else if (var3 instanceof WQ) {
               return true;
            } else if (var3 instanceof zG_2) {
               return var1.id_byte(zG_2.id_final) == rCj_1.TOP;
            } else if (var3 instanceof Wg_1) {
               return var1.id_byte(Wg_1.id_volatile) == rCo_1.TOP;
            } else if (var3 instanceof Jt_1) {
               return var1.id_byte(Jt_1.q) != rCH.FLOOR;
            } else if (var3 instanceof kS_2) {
               return true;
            } else if (var3 instanceof kc_3) {
               return true;
            } else if (var3 instanceof kL_2) {
               return true;
            } else {
               return var3 instanceof zH_2 ? true : var3 instanceof zq_3;
            }
         } else {
            return true;
         }
      }
   }

   public static boolean id_class(rRp_1 var0, xc_3 var1, rfH_2 var2) {
      if (!(var0 instanceof rRq_1)) {
         return false;
      } else {
         return !id_class((rRq_1)var0, var1, var2) ? false : id_class(var0, var2);
      }
   }

   public static void id_class() {
      id_class = rrbb_3.X().id_synchronized().id_break().id_break(xu_3.Pq.id_continue());
   }

   private static boolean id_class(rRq_1 var0, rfH_2 var1) {
      xd_3 var2 = xu_3.Pq;
      if (var0.id_byte(var1.id_private()).id_break() == var2
         || var0.id_byte(var1.id_protected()).id_break() == var2
         || var0.id_byte(var1.id_byte()).id_break() == var2
         || var0.id_byte(var1.id_extends()).id_break() == var2) {
         xc_3 var3 = var0.id_byte(var1.id_break());
         if (var3.id_implements(var0, var1)) {
            return true;
         }

         xd_3 var4 = var3.id_break();
         if (var4 instanceof zG_2) {
            return var3.id_byte(zG_2.id_final) == rCj_1.TOP;
         }

         if (var4 instanceof Wg_1) {
            return var3.id_byte(Wg_1.id_volatile) == rCo_1.TOP;
         }
      }

      return false;
   }

   public static IJ id_break() {
      return id_class;
   }
}
