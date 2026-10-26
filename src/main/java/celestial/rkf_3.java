/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.rVL;
import celestial.rWJ;
import celestial.rWM;
import celestial.rWO;
import celestial.rWQ;
import celestial.rWS;
import celestial.rWW;
import celestial.rWX;
import celestial.rWZ;
import celestial.rWb_1;
import celestial.rWc_1;
import celestial.rWd_1;
import celestial.rWh_1;
import celestial.rWm_1;
import celestial.rWu_1;
import celestial.rWz_1;
import celestial.rkA_2;
import celestial.rkC_2;
import celestial.rkD_2;
import celestial.rkF_2;
import celestial.rkK_2;
import celestial.rkL_2;
import celestial.rkT_2;
import celestial.rkl_3;
import celestial.rkn_3;
import celestial.rkp_3;
import celestial.rkq_3;
import celestial.rkw_3;
import celestial.rky_3;
import celestial.rqO_2;
import celestial.ruu_3;
import com.google.gson.JsonObject;

public interface rkf_3<T extends rkw_3<?>> {
    public static final rkf_3<rWb_1> id_class = rkf_3.id_class("crafting_shaped", new rWM());
    public static final rkf_3<rWO> id_break = rkf_3.id_class("crafting_shapeless", new rWh_1());
    public static final rWc_1<rkF_2> id_byte = rkf_3.id_class("crafting_special_armordye", new rWc_1<rkF_2>(rkF_2::new));
    public static final rWc_1<rkn_3> id_protected = rkf_3.id_class("crafting_special_bookcloning", new rWc_1<rkn_3>(rkn_3::new));
    public static final rWc_1<rkK_2> id_throws = rkf_3.id_class("crafting_special_mapcloning", new rWc_1<rkK_2>(rkK_2::new));
    public static final rWc_1<rkD_2> id_case = rkf_3.id_class("crafting_special_mapextending", new rWc_1<rkD_2>(rkD_2::new));
    public static final rWc_1<rky_3> id_catch = rkf_3.id_class("crafting_special_firework_rocket", new rWc_1<rky_3>(rky_3::new));
    public static final rWc_1<rkq_3> id_private = rkf_3.id_class("crafting_special_firework_star", new rWc_1<rkq_3>(rkq_3::new));
    public static final rWc_1<rkp_3> id_implements = rkf_3.id_class("crafting_special_firework_star_fade", new rWc_1<rkp_3>(rkp_3::new));
    public static final rWc_1<rWZ> id_finally = rkf_3.id_class("crafting_special_tippedarrow", new rWc_1<rWZ>(rWZ::new));
    public static final rWc_1<rkL_2> id_extends = rkf_3.id_class("crafting_special_bannerduplicate", new rWc_1<rkL_2>(rkL_2::new));
    public static final rWc_1<rWX> id_native = rkf_3.id_class("crafting_special_shielddecoration", new rWc_1<rWX>(rWX::new));
    public static final rWc_1<rWJ> id_volatile = rkf_3.id_class("crafting_special_shulkerboxcoloring", new rWc_1<rWJ>(rWJ::new));
    public static final rWc_1<rWm_1> id_final = rkf_3.id_class("crafting_special_suspiciousstew", new rWc_1<rWm_1>(rWm_1::new));
    public static final rWc_1<rWS> id_package = rkf_3.id_class("crafting_special_repairitem", new rWc_1<rWS>(rWS::new));
    public static final rkl_3<rkT_2> id_int = rkf_3.id_class("smelting", new rkl_3<rkT_2>(rkT_2::new, 200));
    public static final rkl_3<rkA_2> id_new = rkf_3.id_class("blasting", new rkl_3<rkA_2>(rkA_2::new, 100));
    public static final rkl_3<rWQ> id_continue = rkf_3.id_class("smoking", new rkl_3<rWQ>(rWQ::new, 100));
    public static final rkl_3<rkC_2> id_super = rkf_3.id_class("campfire_cooking", new rkl_3<rkC_2>(rkC_2::new, 100));
    public static final rkf_3<rWu_1> id_this = rkf_3.id_class("stonecutting", new rWd_1<rWu_1>(rWu_1::new));
    public static final rkf_3<rWW> id_else = rkf_3.id_class("smithing", new rWz_1());

    public static <S extends rkf_3<T>, T extends rkw_3<?>> S id_class(String string, S s) {
        return (S)rVL.id_class(rVL.M, string, s);
    }

    public void id_class(ruu_3 var1, T var2);

    public T id_break(rqO_2 var1, ruu_3 var2);

    public T id_break(rqO_2 var1, JsonObject var2);
}

