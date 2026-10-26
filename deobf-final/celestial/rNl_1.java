package celestial;

import java.util.function.BiFunction;

public class rNl_1 {
   public static final BiFunction<rdn_3, rzr_3, rdn_3> class_ = (var0, var1) -> var0;
   public static final rzx_3 break_ = class_("set_count", new rNg_1());
   public static final rzx_3 byte_ = class_("enchant_with_levels", new rNQ());
   public static final rzx_3 protected_ = class_("enchant_randomly", new rNk_1());
   public static final rzx_3 throws_ = class_("set_nbt", new rNa_1());
   public static final rzx_3 case_ = class_("furnace_smelt", new rcE_2());
   public static final rzx_3 catch_ = class_("looting_enchant", new rNp_1());
   public static final rzx_3 private_ = class_("set_damage", new rNY());
   public static final rzx_3 implements_ = class_("set_attributes", new rNw_1());
   public static final rzx_3 finally_ = class_("set_name", new rcr_3());
   public static final rzx_3 extends_ = class_("exploration_map", new rNu_1());
   public static final rzx_3 native_ = class_("set_stew_effect", new rcS_2());
   public static final rzx_3 volatile_ = class_("copy_name", new rNB());
   public static final rzx_3 final_ = class_("set_contents", new rNj_1());
   public static final rzx_3 package_ = class_("limit_count", new rNC());
   public static final rzx_3 int_ = class_("apply_bonus", new rQU());
   public static final rzx_3 new_ = class_("set_loot_table", new rNK());
   public static final rzx_3 continue_ = class_("explosion_decay", new rNZ());
   public static final rzx_3 super_ = class_("set_lore", new rNU());
   public static final rzx_3 this_ = class_("fill_player_head", new rNF());
   public static final rzx_3 else_ = class_("copy_nbt", new rNX());
   public static final rzx_3 synchronized_ = class_("copy_state", new rNr_1());

   private static rzx_3 class_(String var0, rWY<? extends rNL> var1) {
      return rVL.class_(rVL.N, new rqO_2(var0), new rzx_3(var1));
   }

   public static BiFunction<rdn_3, rzr_3, rdn_3> class_(BiFunction<rdn_3, rzr_3, rdn_3>[] var0) {
      switch (var0.length) {
         case 0:
            return class_;
         case 1:
            return var0[0];
         case 2:
            BiFunction var1 = var0[0];
            BiFunction var2 = var0[1];
            return (var2x, var3) -> (rdn_3)var2.apply((rdn_3)var1.apply(var2x, var3), var3);
         default:
            return (var1x, var2x) -> {
               for (BiFunction var6 : var0) {
                  var1x = (rdn_3)var6.apply(var1x, var2x);
               }

               return var1x;
            };
      }
   }

   public static Object class_() {
      return rzy_3.class_(rVL.N, "function", "function", rNL::break_).class_();
   }
}
