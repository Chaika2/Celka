package celestial;

import com.google.common.base.Predicates;
import java.util.function.Predicate;

public final class rpJ_2 {
   public static final Predicate<an_3> class_ = an_3::BM;
   public static final Predicate<iB_2> break_ = iB_2::BM;
   public static final Predicate<an_3> byte_ = var0 -> var0.BM() && !var0.BP() && !var0.Pm();
   public static final Predicate<an_3> protected_ = var0 -> var0 instanceof rXu_1 && var0.BM();
   public static final Predicate<an_3> throws_ = var0 -> !(var0 instanceof rhd_3) || !var0.native_() && !((rhd_3)var0).implements_();
   public static final Predicate<an_3> case_ = var0 -> !(var0 instanceof rhd_3)
         || !var0.native_() && !((rhd_3)var0).implements_() && ((rYB)var0.throws_[7]).abstract_() != rRO.PEACEFUL;
   public static final Predicate<an_3> catch_ = var0 -> !var0.native_();
   public static final Predicate<an_3> private_ = var0 -> !(Boolean)var0.throws_[38] && !var0.native_() && var0.BM() && var0.rY();

   public static Predicate<an_3> class_(double var0, double var2, double var4, double var6) {
      double var8 = var6 * var6;
      return var8x -> var8x != null && var8x.class_(var0, var2, var4) <= var8;
   }

   public static Predicate<an_3> class_(an_3 var0) {
      rnM_2 var1 = var0.BG();
      rnh_3 var2 = var1 == null ? rnh_3.ALWAYS : var1.extends_();
      return (Predicate<an_3>)(var2 == rnh_3.NEVER
         ? Predicates.alwaysFalse()
         : catch_.and(
            var3 -> {
               if (!var3.rG()) {
                  return false;
               } else if (!((rYB)var0.throws_[7]).continue_ || var3 instanceof rhd_3 && ((rhd_3)var3).char_()) {
                  rnM_2 var4 = var3.BG();
                  rnh_3 var5 = var4 == null ? rnh_3.ALWAYS : var4.extends_();
                  if (var5 == rnh_3.NEVER) {
                     return false;
                  } else {
                     boolean var6 = var1 != null && var1.class_(var4);
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

   public static Predicate<an_3> break_(an_3 var0) {
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
