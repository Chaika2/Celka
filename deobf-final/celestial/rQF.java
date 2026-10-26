package celestial;

import java.util.function.Predicate;

public class rQF {
   public static final rWi_1 class_ = class_("inverted", new rQc_1());
   public static final rWi_1 break_ = class_("alternative", new rQb_1());
   public static final rWi_1 byte_ = class_("random_chance", new rQC());
   public static final rWi_1 protected_ = class_("random_chance_with_looting", new rQH());
   public static final rWi_1 throws_ = class_("entity_properties", new rQd_1());
   public static final rWi_1 case_ = class_("killed_by_player", new rQm_1());
   public static final rWi_1 catch_ = class_("entity_scores", new rQW());
   public static final rWi_1 private_ = class_("block_state_property", new rQh_1());
   public static final rWi_1 implements_ = class_("match_tool", new rQA());
   public static final rWi_1 finally_ = class_("table_bonus", new rQw_1());
   public static final rWi_1 extends_ = class_("survives_explosion", new rQT());
   public static final rWi_1 native_ = class_("damage_source_properties", new rQJ());
   public static final rWi_1 volatile_ = class_("location_check", new rQv_1());
   public static final rWi_1 final_ = class_("weather_check", new rQV());
   public static final rWi_1 package_ = class_("reference", new rQp_1());
   public static final rWi_1 int_ = class_("time_check", new rQf_1());

   private static rWi_1 class_(String var0, rWY<? extends rQz_1> var1) {
      return rVL.class_(rVL.c, new rqO_2(var0), new rWi_1(var1));
   }

   public static Object class_() {
      return rzy_3.class_(rVL.c, "condition", "condition", rQz_1::break_).class_();
   }

   public static <T> Predicate<T> class_(Predicate<T>[] var0) {
      switch (var0.length) {
         case 0:
            return var0x -> true;
         case 1:
            return var0[0];
         case 2:
            return var0[0].and(var0[1]);
         default:
            return var1 -> {
               for (Predicate var5 : var0) {
                  if (!var5.test(var1)) {
                     return false;
                  }
               }

               return true;
            };
      }
   }

   public static <T> Predicate<T> break_(Predicate<T>[] var0) {
      switch (var0.length) {
         case 0:
            return var0x -> false;
         case 1:
            return var0[0];
         case 2:
            return var0[0].or(var0[1]);
         default:
            return var1 -> {
               for (Predicate var5 : var0) {
                  if (var5.test(var1)) {
                     return true;
                  }
               }

               return false;
            };
      }
   }
}
