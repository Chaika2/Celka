package celestial;

import java.util.function.BiFunction;

public class rNl_1 {
   public static final BiFunction<rdn_3, rzr_3, rdn_3> id_class = (var0, var1) -> var0;
   public static final rzx_3 id_break = id_class("set_count", new rNg_1());
   public static final rzx_3 id_byte = id_class("enchant_with_levels", new rNQ());
   public static final rzx_3 id_protected = id_class("enchant_randomly", new rNk_1());
   public static final rzx_3 id_throws = id_class("set_nbt", new rNa_1());
   public static final rzx_3 id_case = id_class("furnace_smelt", new rcE_2());
   public static final rzx_3 id_catch = id_class("looting_enchant", new rNp_1());
   public static final rzx_3 id_private = id_class("set_damage", new rNY());
   public static final rzx_3 id_implements = id_class("set_attributes", new rNw_1());
   public static final rzx_3 id_finally = id_class("set_name", new rcr_3());
   public static final rzx_3 id_extends = id_class("exploration_map", new rNu_1());
   public static final rzx_3 id_native = id_class("set_stew_effect", new rcS_2());
   public static final rzx_3 id_volatile = id_class("copy_name", new rNB());
   public static final rzx_3 id_final = id_class("set_contents", new rNj_1());
   public static final rzx_3 id_package = id_class("limit_count", new rNC());
   public static final rzx_3 id_int = id_class("apply_bonus", new rQU());
   public static final rzx_3 id_new = id_class("set_loot_table", new rNK());
   public static final rzx_3 id_continue = id_class("explosion_decay", new rNZ());
   public static final rzx_3 id_super = id_class("set_lore", new rNU());
   public static final rzx_3 id_this = id_class("fill_player_head", new rNF());
   public static final rzx_3 id_else = id_class("copy_nbt", new rNX());
   public static final rzx_3 id_synchronized = id_class("copy_state", new rNr_1());

   private static rzx_3 id_class(String var0, rWY<? extends rNL> var1) {
      return rVL.id_class(rVL.N, new rqO_2(var0), new rzx_3(var1));
   }

   public static BiFunction<rdn_3, rzr_3, rdn_3> id_class(BiFunction<rdn_3, rzr_3, rdn_3>[] var0) {
      switch (var0.length) {
         case 0:
            return id_class;
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

   public static Object id_class() {
      return rzy_3.id_class(rVL.N, "function", "function", rNL::id_break).id_class();
   }
}
