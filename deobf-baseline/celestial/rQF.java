package celestial;

import java.util.function.Predicate;

public class rQF {
   public static final rWi_1 id_class = id_class("inverted", new rQc_1());
   public static final rWi_1 id_break = id_class("alternative", new rQb_1());
   public static final rWi_1 id_byte = id_class("random_chance", new rQC());
   public static final rWi_1 id_protected = id_class("random_chance_with_looting", new rQH());
   public static final rWi_1 id_throws = id_class("entity_properties", new rQd_1());
   public static final rWi_1 id_case = id_class("killed_by_player", new rQm_1());
   public static final rWi_1 id_catch = id_class("entity_scores", new rQW());
   public static final rWi_1 id_private = id_class("block_state_property", new rQh_1());
   public static final rWi_1 id_implements = id_class("match_tool", new rQA());
   public static final rWi_1 id_finally = id_class("table_bonus", new rQw_1());
   public static final rWi_1 id_extends = id_class("survives_explosion", new rQT());
   public static final rWi_1 id_native = id_class("damage_source_properties", new rQJ());
   public static final rWi_1 id_volatile = id_class("location_check", new rQv_1());
   public static final rWi_1 id_final = id_class("weather_check", new rQV());
   public static final rWi_1 id_package = id_class("reference", new rQp_1());
   public static final rWi_1 id_int = id_class("time_check", new rQf_1());

   private static rWi_1 id_class(String var0, rWY<? extends rQz_1> var1) {
      return rVL.id_class(rVL.c, new rqO_2(var0), new rWi_1(var1));
   }

   public static Object id_class() {
      return rzy_3.id_class(rVL.c, "condition", "condition", rQz_1::id_break).id_class();
   }

   public static <T> Predicate<T> id_class(Predicate<T>[] var0) {
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

   public static <T> Predicate<T> id_break(Predicate<T>[] var0) {
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
