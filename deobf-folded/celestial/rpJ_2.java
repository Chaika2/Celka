package celestial;

import com.google.common.base.Predicates;
import java.util.function.Predicate;

public final class rpJ_2 {
   public static final Predicate<an_3> id_class = an_3::BM;
   public static final Predicate<iB_2> id_break = iB_2::BM;
   public static final Predicate<an_3> id_byte = var0 -> var0.BM() && !var0.BP() && !var0.Pm();
   public static final Predicate<an_3> id_protected = var0 -> var0 instanceof rXu_1 && var0.BM();
   public static final Predicate<an_3> id_throws = var0 -> !(var0 instanceof rhd_3) || !var0.id_native() && !((rhd_3)var0).id_implements();
   public static final Predicate<an_3> id_case = var0 -> !(var0 instanceof rhd_3)
         || !var0.id_native() && !((rhd_3)var0).id_implements() && ((rYB)var0.id_throws[7]).id_abstract() != rRO.PEACEFUL;
   public static final Predicate<an_3> id_catch = var0 -> !var0.id_native();
   public static final Predicate<an_3> id_private = var0 -> !(Boolean)var0.id_throws[38] && !var0.id_native() && var0.BM() && var0.rY();

   public static Predicate<an_3> id_class(double var0, double var2, double var4, double var6) {
      double var8 = var6 * var6;
      return var8x -> var8x != null && var8x.id_class(var0, var2, var4) <= var8;
   }

   public static Predicate<an_3> id_class(an_3 var0) {
      rnM_2 var1 = var0.BG();
      rnh_3 var2 = var1 == null ? rnh_3.ALWAYS : var1.id_extends();
      return (Predicate<an_3>)(var2 == rnh_3.NEVER
         ? Predicates.alwaysFalse()
         : id_catch.and(
            var3 -> {
               if (!var3.rG()) {
                  return false;
               } else if (!((rYB)var0.id_throws[7]).id_continue || var3 instanceof rhd_3 && ((rhd_3)var3).id_char()) {
                  rnM_2 var4 = var3.BG();
                  rnh_3 var5 = var4 == null ? rnh_3.ALWAYS : var4.id_extends();
                  if (var5 == rnh_3.NEVER) {
                     return false;
                  } else {
                     boolean var6 = var1 != null && var1.id_class(var4);
                     return (var2 == rnh_3.PUSH_OWN_TEAM || var5 == rnh_3.PUSH_OWN_TEAM) && var6
                        ? false
                        : var2 != rnh_3.PUSH_OTHER_TEAMS && var5 != rnh_3.PUSH_OTHER_TEAMS || var6;
                  }
               } else {
                  return false;
               }
            }
         ));
   }

   public static Predicate<an_3> id_break(an_3 var0) {
      return var1 -> {
         while (var1.Pm()) {
            var1 = var1.ra();
            if (var1 == var0) {
               return false;
            }
         }

         return true;
      };
   }
}
