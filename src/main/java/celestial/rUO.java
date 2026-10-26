/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.JC;
import celestial.rDA;
import celestial.rDC;
import celestial.rDD;
import celestial.rDH;
import celestial.rDI;
import celestial.rDK;
import celestial.rDL;
import celestial.rDT;
import celestial.rDU;
import celestial.rDV;
import celestial.rDY;
import celestial.rDZ;
import celestial.rDa_1;
import celestial.rDc_1;
import celestial.rDe_1;
import celestial.rDf_1;
import celestial.rDg_1;
import celestial.rDi_1;
import celestial.rDj_1;
import celestial.rDl_1;
import celestial.rDm_1;
import celestial.rDn_1;
import celestial.rDp_1;
import celestial.rDq_1;
import celestial.rDt_1;
import celestial.rDu_1;
import celestial.rDv_1;
import celestial.rDw_1;
import celestial.rKd_1;
import celestial.rKl_1;
import celestial.rRI;
import celestial.rRY;
import celestial.rUA;
import celestial.rUB;
import celestial.rUC;
import celestial.rUD;
import celestial.rUE;
import celestial.rUF;
import celestial.rUH;
import celestial.rUI;
import celestial.rUJ;
import celestial.rUK;
import celestial.rUL;
import celestial.rUM;
import celestial.rUN;
import celestial.rUP;
import celestial.rUQ;
import celestial.rUR;
import celestial.rUS;
import celestial.rUT;
import celestial.rUU;
import celestial.rUV;
import celestial.rUY;
import celestial.rUZ;
import celestial.rUa_1;
import celestial.rUc_1;
import celestial.rUe_1;
import celestial.rUf_1;
import celestial.rUg_1;
import celestial.rUi_1;
import celestial.rUl_1;
import celestial.rUm_1;
import celestial.rUn_1;
import celestial.rUp_1;
import celestial.rUq_1;
import celestial.rUr_1;
import celestial.rUt_1;
import celestial.rUu_1;
import celestial.rUv_1;
import celestial.rUw_1;
import celestial.rUy_1;
import celestial.rUz_1;
import celestial.rVL;
import celestial.reE_2;
import celestial.reG_2;
import celestial.reH_2;
import celestial.reM_2;
import celestial.reO_2;
import celestial.reS_2;
import celestial.reh_3;
import celestial.rer_3;
import celestial.res_3;
import celestial.rfH_2;
import celestial.riP_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import com.mojang.serialization.Codec;
import java.util.Random;

public abstract class rUO<FC extends rUv_1> {
    public static final rUO<rUt_1> id_break = rUO.id_class("no_op", new rUw_1(rUt_1.id_class));
    public static final rUO<rDv_1> id_byte = rUO.id_class("tree", new reS_2(rDv_1.id_class));
    public static final rUN<rDH> id_protected = rUO.id_class("flower", new rDa_1(rDH.id_class));
    public static final rUN<rDH> id_throws = rUO.id_class("no_bonemeal_flower", new rDa_1(rDH.id_class));
    public static final rUO<rDH> id_case = rUO.id_class("random_patch", new rUg_1(rDH.id_class));
    public static final rUO<rDT> id_catch = rUO.id_class("block_pile", new rDp_1(rDT.id_class));
    public static final rUO<rUH> id_private = rUO.id_class("spring_feature", new rer_3(rUH.id_class));
    public static final rUO<rUt_1> id_implements = rUO.id_class("chorus_plant", new rDj_1(rUt_1.id_class));
    public static final rUO<rUR> id_finally = rUO.id_class("emerald_ore", new rUY(rUR.id_class));
    public static final rUO<rUt_1> id_extends = rUO.id_class("void_start_platform", new reO_2(rUt_1.id_class));
    public static final rUO<rUt_1> id_native = rUO.id_class("desert_well", new rDi_1(rUt_1.id_class));
    public static final rUO<rUt_1> id_volatile = rUO.id_class("fossil", new rUc_1(rUt_1.id_class));
    public static final rUO<rDA> id_final = rUO.id_class("huge_red_mushroom", new rDn_1(rDA.id_class));
    public static final rUO<rDA> id_package = rUO.id_class("huge_brown_mushroom", new rDL(rDA.id_class));
    public static final rUO<rUt_1> id_int = rUO.id_class("ice_spike", new rUA(rUt_1.id_class));
    public static final rUO<rUt_1> id_new = rUO.id_class("glowstone_blob", new rUu_1(rUt_1.id_class));
    public static final rUO<rUt_1> id_continue = rUO.id_class("freeze_top_layer", new rUF(rUt_1.id_class));
    public static final rUO<rUt_1> id_super = rUO.id_class("vines", new reM_2(rUt_1.id_class));
    public static final rUO<rUt_1> id_this = rUO.id_class("monster_room", new rUr_1(rUt_1.id_class));
    public static final rUO<rUt_1> id_else = rUO.id_class("blue_ice", new rDI(rUt_1.id_class));
    public static final rUO<rDq_1> id_synchronized = rUO.id_class("iceberg", new rUn_1(rDq_1.id_class));
    public static final rUO<rDq_1> id_return = rUO.id_class("forest_rock", new rDl_1(rDq_1.id_class));
    public static final rUO<rUa_1> id_public = rUO.id_class("disk", new rUi_1(rUa_1.id_class));
    public static final rUO<rUa_1> id_goto = rUO.id_class("ice_patch", new rUL(rUa_1.id_class));
    public static final rUO<rDq_1> id_while = rUO.id_class("lake", new rUl_1(rDq_1.id_class));
    public static final rUO<rUf_1> id_try = rUO.id_class("ore", new rUI(rUf_1.id_class));
    public static final rUO<rUM> id_instanceof = rUO.id_class("end_spike", new rUE(rUM.id_class));
    public static final rUO<rUt_1> id_throw = rUO.id_class("end_island", new rUS(rUt_1.id_class));
    public static final rUO<rUP> id_interface = rUO.id_class("end_gateway", new rUB(rUP.id_class));
    public static final rUK id_char = rUO.id_class("seagrass", new rUK(rUV.id_class));
    public static final rUO<rUt_1> id_abstract = rUO.id_class("kelp", new rUC(rUt_1.id_class));
    public static final rUO<rUt_1> id_long = rUO.id_class("coral_tree", new rDD(rUt_1.id_class));
    public static final rUO<rUt_1> id_float = rUO.id_class("coral_mushroom", new rDK(rUt_1.id_class));
    public static final rUO<rUt_1> id_void = rUO.id_class("coral_claw", new rDY(rUt_1.id_class));
    public static final rUO<rUJ> id_static = rUO.id_class("sea_pickle", new rUD(rUJ.id_class));
    public static final rUO<rDt_1> id_import = rUO.id_class("simple_block", new rDw_1(rDt_1.id_class));
    public static final rUO<rUV> id_short = rUO.id_class("bamboo", new rDc_1(rUV.id_class));
    public static final rUO<rUm_1> id_default = rUO.id_class("huge_fungus", new rUZ(rUm_1.id_class));
    public static final rUO<rDT> id_const = rUO.id_class("nether_forest_vegetation", new rUq_1(rDT.id_class));
    public static final rUO<rUt_1> id_strictfp = rUO.id_class("weeping_vines", new reh_3(rUt_1.id_class));
    public static final rUO<rUt_1> id_boolean = rUO.id_class("twisting_vines", new res_3(rUt_1.id_class));
    public static final rUO<rDV> id_transient = rUO.id_class("basalt_columns", new rDu_1(rDV.id_class));
    public static final rUO<rDm_1> id_for = rUO.id_class("delta_feature", new reH_2(rDm_1.id_class));
    public static final rUO<rDC> id_double = rUO.id_class("netherrack_replace_blobs", new riP_2(rDC.id_class));
    public static final rUO<rUz_1> id_switch = rUO.id_class("fill_layer", new rUQ(rUz_1.id_class));
    public static final rDf_1 r = rUO.id_class("bonus_chest", new rDf_1(rUt_1.id_class));
    public static final rUO<rUt_1> P = rUO.id_class("basalt_pillar", new rDZ(rUt_1.id_class));
    public static final rUO<rUf_1> B = rUO.id_class("no_surface_ore", new rUT(rUf_1.id_class));
    public static final rUO<rUy_1> S = rUO.id_class("random_selector", new rUp_1(rUy_1.id_class));
    public static final rUO<rUU> s = rUO.id_class("simple_random_selector", new rUe_1(rUU.id_class));
    public static final rUO<reE_2> E = rUO.id_class("random_boolean_selector", new reG_2(reE_2.id_class));
    public static final rUO<rDe_1> G = rUO.id_class("decorated", new rDU(rDe_1.id_class));
    private final Codec<rDg_1<FC, rUO<FC>>> id_class;

    public rUO(Codec<FC> codec) {
        this.id_class = codec.fieldOf("config").xmap(rUv_12 -> new rDg_1<rUv_1, rUO>(this, (rUv_1)rUv_12), rDg_12 -> rDg_12.id_case).codec();
    }

    public static boolean id_class(rKl_1 rKl_12, rfH_2 rfH_22) {
        return rKl_12.id_class(rfH_22, xc_32 -> rUO.id_break(xc_32.id_break()));
    }

    private static <C extends rUv_1, F extends rUO<C>> F id_class(String string, F f) {
        return (F)rVL.id_class(rVL.q, string, f);
    }

    public Codec<rDg_1<FC, rUO<FC>>> id_class() {
        return this.id_class;
    }

    protected void id_class(rRY rRY2, rfH_2 rfH_22, xc_3 xc_32) {
        rRY2.id_class(rfH_22, xc_32, 3);
    }

    public abstract boolean id_class(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, FC var5);

    protected static boolean id_class(xd_3 xd_32) {
        return xd_32 == xu_3.id_break || xd_32 == xu_3.id_byte || xd_32 == xu_3.id_throws || xd_32 == xu_3.id_catch;
    }

    public static boolean id_break(xd_3 xd_32) {
        return xd_32 == xu_3.id_finally || xd_32 == xu_3.id_implements || xd_32 == xu_3.id_native || xd_32 == xu_3.id_extends || xd_32 == xu_3.Bi;
    }

    public rDg_1<FC, ?> id_break(FC FC2) {
        return new rDg_1<FC, rUO>(this, FC2);
    }

    public static boolean id_break(rKl_1 rKl_12, rfH_2 rfH_22) {
        return rKl_12.id_class(rfH_22, JC::id_catch);
    }
}

