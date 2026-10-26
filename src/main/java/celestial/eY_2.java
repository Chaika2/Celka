/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aB_2;
import celestial.aE_2;
import celestial.aG_2;
import celestial.aJ_2;
import celestial.aM_2;
import celestial.aN_2;
import celestial.aO_2;
import celestial.aP_2;
import celestial.aQ_2;
import celestial.aS_2;
import celestial.aW_2;
import celestial.aX_2;
import celestial.ab_3;
import celestial.ad_3;
import celestial.ah_3;
import celestial.ak_3;
import celestial.ar_3;
import celestial.as_3;
import celestial.ax_3;
import celestial.az_3;
import celestial.eC_2;
import celestial.eD_2;
import celestial.eF_2;
import celestial.eK_2;
import celestial.eN_2;
import celestial.eQ_2;
import celestial.eZ_2;
import celestial.ea_3;
import celestial.ec_3;
import celestial.ei_3;
import celestial.em_3;
import celestial.eo_3;
import celestial.eu_3;
import celestial.ev_3;
import celestial.rVL;
import celestial.rXQ;

public class eY_2 {
    private static final rXQ[] id_default = new rXQ[]{rXQ.HEAD, rXQ.CHEST, rXQ.LEGS, rXQ.FEET};
    public static final ev_3 id_class = eY_2.id_class("protection", new aM_2(eF_2.COMMON, aO_2.ALL, id_default));
    public static final ev_3 id_break = eY_2.id_class("fire_protection", new aM_2(eF_2.UNCOMMON, aO_2.FIRE, id_default));
    public static final ev_3 id_byte = eY_2.id_class("feather_falling", new aM_2(eF_2.UNCOMMON, aO_2.FALL, id_default));
    public static final ev_3 id_protected = eY_2.id_class("blast_protection", new aM_2(eF_2.RARE, aO_2.EXPLOSION, id_default));
    public static final ev_3 id_throws = eY_2.id_class("projectile_protection", new aM_2(eF_2.UNCOMMON, aO_2.PROJECTILE, id_default));
    public static final ev_3 id_case = eY_2.id_class("respiration", new aJ_2(eF_2.RARE, id_default));
    public static final ev_3 id_catch = eY_2.id_class("aqua_affinity", new eQ_2(eF_2.RARE, id_default));
    public static final ev_3 id_private = eY_2.id_class("thorns", new az_3(eF_2.VERY_RARE, id_default));
    public static final ev_3 id_implements = eY_2.id_class("depth_strider", new em_3(eF_2.RARE, id_default));
    public static final ev_3 id_finally = eY_2.id_class("frost_walker", new eD_2(eF_2.RARE, rXQ.FEET));
    public static final ev_3 id_extends = eY_2.id_class("binding_curse", new eN_2(eF_2.VERY_RARE, id_default));
    public static final ev_3 id_native = eY_2.id_class("soul_speed", new ak_3(eF_2.VERY_RARE, rXQ.FEET));
    public static final ev_3 id_volatile = eY_2.id_class("sharpness", new eu_3(eF_2.COMMON, 0, rXQ.MAINHAND));
    public static final ev_3 id_final = eY_2.id_class("smite", new eu_3(eF_2.UNCOMMON, 1, rXQ.MAINHAND));
    public static final ev_3 id_package = eY_2.id_class("bane_of_arthropods", new eu_3(eF_2.UNCOMMON, 2, rXQ.MAINHAND));
    public static final ev_3 id_int = eY_2.id_class("knockback", new ar_3(eF_2.UNCOMMON, rXQ.MAINHAND));
    public static final ev_3 id_new = eY_2.id_class("fire_aspect", new eo_3(eF_2.RARE, rXQ.MAINHAND));
    public static final ev_3 id_continue = eY_2.id_class("looting", new aP_2(eF_2.RARE, eC_2.WEAPON, rXQ.MAINHAND));
    public static final ev_3 id_super = eY_2.id_class("sweeping", new aW_2(eF_2.RARE, rXQ.MAINHAND));
    public static final ev_3 id_this = eY_2.id_class("efficiency", new eZ_2(eF_2.COMMON, rXQ.MAINHAND));
    public static final ev_3 id_else = eY_2.id_class("silk_touch", new ad_3(eF_2.VERY_RARE, rXQ.MAINHAND));
    public static final ev_3 id_synchronized = eY_2.id_class("unbreaking", new aQ_2(eF_2.UNCOMMON, rXQ.MAINHAND));
    public static final ev_3 id_return = eY_2.id_class("fortune", new aP_2(eF_2.RARE, eC_2.DIGGER, rXQ.MAINHAND));
    public static final ev_3 id_public = eY_2.id_class("power", new ab_3(eF_2.COMMON, rXQ.MAINHAND));
    public static final ev_3 id_goto = eY_2.id_class("punch", new ah_3(eF_2.RARE, rXQ.MAINHAND));
    public static final ev_3 id_while = eY_2.id_class("flame", new eK_2(eF_2.RARE, rXQ.MAINHAND));
    public static final ev_3 id_try = eY_2.id_class("infinity", new ei_3(eF_2.VERY_RARE, rXQ.MAINHAND));
    public static final ev_3 id_instanceof = eY_2.id_class("luck_of_the_sea", new aP_2(eF_2.RARE, eC_2.FISHING_ROD, rXQ.MAINHAND));
    public static final ev_3 id_throw = eY_2.id_class("lure", new aS_2(eF_2.RARE, eC_2.FISHING_ROD, rXQ.MAINHAND));
    public static final ev_3 id_interface = eY_2.id_class("loyalty", new aB_2(eF_2.UNCOMMON, rXQ.MAINHAND));
    public static final ev_3 id_char = eY_2.id_class("impaling", new ea_3(eF_2.RARE, rXQ.MAINHAND));
    public static final ev_3 id_abstract = eY_2.id_class("riptide", new ax_3(eF_2.RARE, rXQ.MAINHAND));
    public static final ev_3 id_long = eY_2.id_class("channeling", new ec_3(eF_2.VERY_RARE, rXQ.MAINHAND));
    public static final ev_3 id_float = eY_2.id_class("multishot", new aE_2(eF_2.RARE, rXQ.MAINHAND));
    public static final ev_3 id_void = eY_2.id_class("quick_charge", new aX_2(eF_2.UNCOMMON, rXQ.MAINHAND));
    public static final ev_3 id_static = eY_2.id_class("piercing", new aG_2(eF_2.COMMON, rXQ.MAINHAND));
    public static final ev_3 id_import = eY_2.id_class("mending", new as_3(eF_2.RARE, rXQ.values()));
    public static final ev_3 id_short = eY_2.id_class("vanishing_curse", new aN_2(eF_2.VERY_RARE, rXQ.values()));

    private static ev_3 id_class(String string, ev_3 ev_32) {
        return rVL.id_class(rVL.id_boolean, string, ev_32);
    }
}

