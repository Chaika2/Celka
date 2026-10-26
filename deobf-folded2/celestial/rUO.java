package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public abstract class rUO<FC extends rUv_1> {
   public static final rUO<rUt_1> id_break = id_class("no_op", new rUw_1(rUt_1.id_class));
   public static final rUO<rDv_1> id_byte = id_class("tree", new reS_2(rDv_1.id_class));
   public static final rUN<rDH> id_protected = id_class("flower", new rDa_1(rDH.id_class));
   public static final rUN<rDH> id_throws = id_class("no_bonemeal_flower", new rDa_1(rDH.id_class));
   public static final rUO<rDH> id_case = id_class("random_patch", new rUg_1(rDH.id_class));
   public static final rUO<rDT> id_catch = id_class("block_pile", new rDp_1(rDT.id_class));
   public static final rUO<rUH> id_private = id_class("spring_feature", new rer_3(rUH.id_class));
   public static final rUO<rUt_1> id_implements = id_class("chorus_plant", new rDj_1(rUt_1.id_class));
   public static final rUO<rUR> id_finally = id_class("emerald_ore", new rUY(rUR.id_class));
   public static final rUO<rUt_1> id_extends = id_class("void_start_platform", new reO_2(rUt_1.id_class));
   public static final rUO<rUt_1> id_native = id_class("desert_well", new rDi_1(rUt_1.id_class));
   public static final rUO<rUt_1> id_volatile = id_class("fossil", new rUc_1(rUt_1.id_class));
   public static final rUO<rDA> id_final = id_class("huge_red_mushroom", new rDn_1(rDA.id_class));
   public static final rUO<rDA> id_package = id_class("huge_brown_mushroom", new rDL(rDA.id_class));
   public static final rUO<rUt_1> id_int = id_class("ice_spike", new rUA(rUt_1.id_class));
   public static final rUO<rUt_1> id_new = id_class("glowstone_blob", new rUu_1(rUt_1.id_class));
   public static final rUO<rUt_1> id_continue = id_class("freeze_top_layer", new rUF(rUt_1.id_class));
   public static final rUO<rUt_1> id_super = id_class("vines", new reM_2(rUt_1.id_class));
   public static final rUO<rUt_1> id_this = id_class("monster_room", new rUr_1(rUt_1.id_class));
   public static final rUO<rUt_1> id_else = id_class("blue_ice", new rDI(rUt_1.id_class));
   public static final rUO<rDq_1> id_synchronized = id_class("iceberg", new rUn_1(rDq_1.id_class));
   public static final rUO<rDq_1> id_return = id_class("forest_rock", new rDl_1(rDq_1.id_class));
   public static final rUO<rUa_1> id_public = id_class("disk", new rUi_1(rUa_1.id_class));
   public static final rUO<rUa_1> id_goto = id_class("ice_patch", new rUL(rUa_1.id_class));
   public static final rUO<rDq_1> id_while = id_class("lake", new rUl_1(rDq_1.id_class));
   public static final rUO<rUf_1> id_try = id_class("ore", new rUI(rUf_1.id_class));
   public static final rUO<rUM> id_instanceof = id_class("end_spike", new rUE(rUM.id_class));
   public static final rUO<rUt_1> id_throw = id_class("end_island", new rUS(rUt_1.id_class));
   public static final rUO<rUP> id_interface = id_class("end_gateway", new rUB(rUP.id_class));
   public static final rUK id_char = id_class("seagrass", new rUK(rUV.id_class));
   public static final rUO<rUt_1> id_abstract = id_class("kelp", new rUC(rUt_1.id_class));
   public static final rUO<rUt_1> id_long = id_class("coral_tree", new rDD(rUt_1.id_class));
   public static final rUO<rUt_1> id_float = id_class("coral_mushroom", new rDK(rUt_1.id_class));
   public static final rUO<rUt_1> id_void = id_class("coral_claw", new rDY(rUt_1.id_class));
   public static final rUO<rUJ> id_static = id_class("sea_pickle", new rUD(rUJ.id_class));
   public static final rUO<rDt_1> id_import = id_class("simple_block", new rDw_1(rDt_1.id_class));
   public static final rUO<rUV> id_short = id_class("bamboo", new rDc_1(rUV.id_class));
   public static final rUO<rUm_1> id_default = id_class("huge_fungus", new rUZ(rUm_1.id_class));
   public static final rUO<rDT> id_const = id_class("nether_forest_vegetation", new rUq_1(rDT.id_class));
   public static final rUO<rUt_1> id_strictfp = id_class("weeping_vines", new reh_3(rUt_1.id_class));
   public static final rUO<rUt_1> id_boolean = id_class("twisting_vines", new res_3(rUt_1.id_class));
   public static final rUO<rDV> id_transient = id_class("basalt_columns", new rDu_1(rDV.id_class));
   public static final rUO<rDm_1> id_for = id_class("delta_feature", new reH_2(rDm_1.id_class));
   public static final rUO<rDC> id_double = id_class("netherrack_replace_blobs", new riP_2(rDC.id_class));
   public static final rUO<rUz_1> id_switch = id_class("fill_layer", new rUQ(rUz_1.id_class));
   public static final rDf_1 r = id_class("bonus_chest", new rDf_1(rUt_1.id_class));
   public static final rUO<rUt_1> P = id_class("basalt_pillar", new rDZ(rUt_1.id_class));
   public static final rUO<rUf_1> B = id_class("no_surface_ore", new rUT(rUf_1.id_class));
   public static final rUO<rUy_1> S = id_class("random_selector", new rUp_1(rUy_1.id_class));
   public static final rUO<rUU> s = id_class("simple_random_selector", new rUe_1(rUU.id_class));
   public static final rUO<reE_2> E = id_class("random_boolean_selector", new reG_2(reE_2.id_class));
   public static final rUO<rDe_1> G = id_class("decorated", new rDU(rDe_1.id_class));
   private final Codec<rDg_1<FC, rUO<FC>>> id_class;

   public rUO(Codec<FC> var1) {
      this.id_class = var1.fieldOf("config").xmap(var1x -> new rDg_1<>(this, var1x), var0 -> var0.id_case).codec();
   }

   public static boolean id_class(rKl_1 var0, rfH_2 var1) {
      return var0.id_class(var1, var0x -> id_break(var0x.id_break()));
   }

   private static <C extends rUv_1, F extends rUO<C>> F id_class(String var0, F var1) {
      return rVL.id_class(rVL.q, var0, (F)var1);
   }

   public Codec<rDg_1<FC, rUO<FC>>> id_class() {
      return this.id_class;
   }

   protected void id_class(rRY var1, rfH_2 var2, xc_3 var3) {
      var1.id_class(var2, var3, 3);
   }

   public abstract boolean id_class(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, FC var5);

   protected static boolean id_class(xd_3 var0) {
      return var0 == xu_3.id_break || var0 == xu_3.id_byte || var0 == xu_3.id_throws || var0 == xu_3.id_catch;
   }

   public static boolean id_break(xd_3 var0) {
      return var0 == xu_3.id_finally || var0 == xu_3.id_implements || var0 == xu_3.id_native || var0 == xu_3.id_extends || var0 == xu_3.Bi;
   }

   public rDg_1<FC, ?> id_break(FC var1) {
      return new rDg_1<>(this, (FC)var1);
   }

   public static boolean id_break(rKl_1 var0, rfH_2 var1) {
      return var0.id_class(var1, JC::id_catch);
   }
}
