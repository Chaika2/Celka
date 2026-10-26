package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public abstract class rUO<FC extends rUv_1> {
   public static final rUO<rUt_1> break_ = class_("no_op", new rUw_1(rUt_1.class_));
   public static final rUO<rDv_1> byte_ = class_("tree", new reS_2(rDv_1.class_));
   public static final rUN<rDH> protected_ = class_("flower", new rDa_1(rDH.class_));
   public static final rUN<rDH> throws_ = class_("no_bonemeal_flower", new rDa_1(rDH.class_));
   public static final rUO<rDH> case_ = class_("random_patch", new rUg_1(rDH.class_));
   public static final rUO<rDT> catch_ = class_("block_pile", new rDp_1(rDT.class_));
   public static final rUO<rUH> private_ = class_("spring_feature", new rer_3(rUH.class_));
   public static final rUO<rUt_1> implements_ = class_("chorus_plant", new rDj_1(rUt_1.class_));
   public static final rUO<rUR> finally_ = class_("emerald_ore", new rUY(rUR.class_));
   public static final rUO<rUt_1> extends_ = class_("void_start_platform", new reO_2(rUt_1.class_));
   public static final rUO<rUt_1> native_ = class_("desert_well", new rDi_1(rUt_1.class_));
   public static final rUO<rUt_1> volatile_ = class_("fossil", new rUc_1(rUt_1.class_));
   public static final rUO<rDA> final_ = class_("huge_red_mushroom", new rDn_1(rDA.class_));
   public static final rUO<rDA> package_ = class_("huge_brown_mushroom", new rDL(rDA.class_));
   public static final rUO<rUt_1> int_ = class_("ice_spike", new rUA(rUt_1.class_));
   public static final rUO<rUt_1> new_ = class_("glowstone_blob", new rUu_1(rUt_1.class_));
   public static final rUO<rUt_1> continue_ = class_("freeze_top_layer", new rUF(rUt_1.class_));
   public static final rUO<rUt_1> super_ = class_("vines", new reM_2(rUt_1.class_));
   public static final rUO<rUt_1> this_ = class_("monster_room", new rUr_1(rUt_1.class_));
   public static final rUO<rUt_1> else_ = class_("blue_ice", new rDI(rUt_1.class_));
   public static final rUO<rDq_1> synchronized_ = class_("iceberg", new rUn_1(rDq_1.class_));
   public static final rUO<rDq_1> return_ = class_("forest_rock", new rDl_1(rDq_1.class_));
   public static final rUO<rUa_1> public_ = class_("disk", new rUi_1(rUa_1.class_));
   public static final rUO<rUa_1> goto_ = class_("ice_patch", new rUL(rUa_1.class_));
   public static final rUO<rDq_1> while_ = class_("lake", new rUl_1(rDq_1.class_));
   public static final rUO<rUf_1> try_ = class_("ore", new rUI(rUf_1.class_));
   public static final rUO<rUM> instanceof_ = class_("end_spike", new rUE(rUM.class_));
   public static final rUO<rUt_1> throw_ = class_("end_island", new rUS(rUt_1.class_));
   public static final rUO<rUP> interface_ = class_("end_gateway", new rUB(rUP.class_));
   public static final rUK char_ = class_("seagrass", new rUK(rUV.class_));
   public static final rUO<rUt_1> abstract_ = class_("kelp", new rUC(rUt_1.class_));
   public static final rUO<rUt_1> long_ = class_("coral_tree", new rDD(rUt_1.class_));
   public static final rUO<rUt_1> float_ = class_("coral_mushroom", new rDK(rUt_1.class_));
   public static final rUO<rUt_1> void_ = class_("coral_claw", new rDY(rUt_1.class_));
   public static final rUO<rUJ> static_ = class_("sea_pickle", new rUD(rUJ.class_));
   public static final rUO<rDt_1> import_ = class_("simple_block", new rDw_1(rDt_1.class_));
   public static final rUO<rUV> short_ = class_("bamboo", new rDc_1(rUV.class_));
   public static final rUO<rUm_1> default_ = class_("huge_fungus", new rUZ(rUm_1.class_));
   public static final rUO<rDT> const_ = class_("nether_forest_vegetation", new rUq_1(rDT.class_));
   public static final rUO<rUt_1> strictfp_ = class_("weeping_vines", new reh_3(rUt_1.class_));
   public static final rUO<rUt_1> boolean_ = class_("twisting_vines", new res_3(rUt_1.class_));
   public static final rUO<rDV> transient_ = class_("basalt_columns", new rDu_1(rDV.class_));
   public static final rUO<rDm_1> for_ = class_("delta_feature", new reH_2(rDm_1.class_));
   public static final rUO<rDC> double_ = class_("netherrack_replace_blobs", new riP_2(rDC.class_));
   public static final rUO<rUz_1> switch_ = class_("fill_layer", new rUQ(rUz_1.class_));
   public static final rDf_1 r = class_("bonus_chest", new rDf_1(rUt_1.class_));
   public static final rUO<rUt_1> P = class_("basalt_pillar", new rDZ(rUt_1.class_));
   public static final rUO<rUf_1> B = class_("no_surface_ore", new rUT(rUf_1.class_));
   public static final rUO<rUy_1> S = class_("random_selector", new rUp_1(rUy_1.class_));
   public static final rUO<rUU> s = class_("simple_random_selector", new rUe_1(rUU.class_));
   public static final rUO<reE_2> E = class_("random_boolean_selector", new reG_2(reE_2.class_));
   public static final rUO<rDe_1> G = class_("decorated", new rDU(rDe_1.class_));
   private final Codec<rDg_1<FC, rUO<FC>>> class_;

   public rUO(Codec<FC> var1) {
      this.class_ = var1.fieldOf("config").xmap(var1x -> new rDg_1<>(this, var1x), var0 -> var0.case_).codec();
   }

   public static boolean class_(rKl_1 var0, rfH_2 var1) {
      return var0.class_(var1, var0x -> break_(var0x.break_()));
   }

   private static <C extends rUv_1, F extends rUO<C>> F class_(String var0, F var1) {
      return rVL.class_(rVL.q, var0, (F)var1);
   }

   public Codec<rDg_1<FC, rUO<FC>>> class_() {
      return this.class_;
   }

   protected void class_(rRY var1, rfH_2 var2, xc_3 var3) {
      var1.class_(var2, var3, 3);
   }

   public abstract boolean class_(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, FC var5);

   protected static boolean class_(xd_3 var0) {
      return var0 == xu_3.break_ || var0 == xu_3.byte_ || var0 == xu_3.throws_ || var0 == xu_3.catch_;
   }

   public static boolean break_(xd_3 var0) {
      return var0 == xu_3.finally_ || var0 == xu_3.implements_ || var0 == xu_3.native_ || var0 == xu_3.extends_ || var0 == xu_3.Bi;
   }

   public rDg_1<FC, ?> break_(FC var1) {
      return new rDg_1<>(this, (FC)var1);
   }

   public static boolean break_(rKl_1 var0, rfH_2 var1) {
      return var0.class_(var1, JC::catch_);
   }
}
