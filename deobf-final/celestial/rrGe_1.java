package celestial;

public class rrGe_1 {
   private static IJ class_ = null;

   public static xc_3 byte_() {
      return xu_3.Pq.continue_();
   }

   private static boolean class_(rRq_1 var0, xc_3 var1, rfH_2 var2) {
      if (var1.implements_(var0, var2)) {
         return false;
      } else {
         xd_3 var3 = var1.break_();
         if (var3 == xu_3.Pt) {
            return false;
         } else if (!(var3 instanceof xF_2)
            || !(var3 instanceof du_3) && !(var3 instanceof dI_2) && !(var3 instanceof kp_3) && !(var3 instanceof WC) && !(var3 instanceof zc_3)) {
            if (var3 instanceof dp_3 || var3 instanceof dq_3 || var3 instanceof df_3 || var3 instanceof dV_2 || var3 instanceof zW_2 || var3 instanceof zw_3) {
               return true;
            } else if (var3 instanceof WQ) {
               return true;
            } else if (var3 instanceof zG_2) {
               return var1.byte_(zG_2.final_) == rCj_1.TOP;
            } else if (var3 instanceof Wg_1) {
               return var1.byte_(Wg_1.volatile_) == rCo_1.TOP;
            } else if (var3 instanceof Jt_1) {
               return var1.byte_(Jt_1.q) != rCH.FLOOR;
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

   public static boolean class_(rRp_1 var0, xc_3 var1, rfH_2 var2) {
      if (!(var0 instanceof rRq_1)) {
         return false;
      } else {
         return !class_((rRq_1)var0, var1, var2) ? false : class_(var0, var2);
      }
   }

   public static void class_() {
      class_ = rrbb_3.X().synchronized_().break_().break_(xu_3.Pq.continue_());
   }

   private static boolean class_(rRq_1 var0, rfH_2 var1) {
      xd_3 var2 = xu_3.Pq;
      if (var0.byte_(var1.private_()).break_() == var2
         || var0.byte_(var1.protected_()).break_() == var2
         || var0.byte_(var1.byte_()).break_() == var2
         || var0.byte_(var1.extends_()).break_() == var2) {
         xc_3 var3 = var0.byte_(var1.break_());
         if (var3.implements_(var0, var1)) {
            return true;
         }

         xd_3 var4 = var3.break_();
         if (var4 instanceof zG_2) {
            return var3.byte_(zG_2.final_) == rCj_1.TOP;
         }

         if (var4 instanceof Wg_1) {
            return var3.byte_(Wg_1.volatile_) == rCo_1.TOP;
         }
      }

      return false;
   }

   public static IJ break_() {
      return class_;
   }
}
