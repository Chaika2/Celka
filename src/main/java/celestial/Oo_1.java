/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.JJ;
import celestial.JM;
import celestial.JP;
import celestial.JQ;
import celestial.JW;
import celestial.Jc_1;
import celestial.Jd_1;
import celestial.Jh_1;
import celestial.Jm_1;
import celestial.XD;
import celestial.XG;
import celestial.XI;
import celestial.XJ;
import celestial.XM;
import celestial.XP;
import celestial.XW;
import celestial.Xd_1;
import celestial.Xe_1;
import celestial.Xi_1;
import celestial.Xl_1;
import celestial.Xo_1;
import celestial.Xq_1;
import celestial.Xs_1;
import celestial.Xt_1;
import celestial.Xy_1;
import celestial.hH_2;
import celestial.hN_2;
import celestial.hP_2;
import celestial.hX_2;
import celestial.hb_3;
import celestial.hg_3;
import celestial.hi_3;
import celestial.hk_3;
import celestial.hp_3;
import celestial.hr_3;
import celestial.ht_3;
import celestial.hu_3;
import celestial.hv_3;
import celestial.hx_3;
import celestial.hz_3;
import celestial.rqO_2;
import com.google.common.collect.Maps;
import java.util.Map;

public class Oo_1 {
    private static final Map<rqO_2, hP_2<?>> id_transient = Maps.newHashMap();
    public static final Xs_1 id_class = Oo_1.id_class(new Xs_1());
    public static final Xd_1 id_break = Oo_1.id_class(new Xd_1(new rqO_2("player_killed_entity")));
    public static final Xd_1 id_byte = Oo_1.id_class(new Xd_1(new rqO_2("entity_killed_player")));
    public static final ht_3 id_protected = Oo_1.id_class(new ht_3());
    public static final XG id_throws = Oo_1.id_class(new XG());
    public static final XD id_case = Oo_1.id_class(new XD());
    public static final XI id_catch = Oo_1.id_class(new XI());
    public static final hg_3 id_private = Oo_1.id_class(new hg_3());
    public static final hp_3 id_implements = Oo_1.id_class(new hp_3());
    public static final hi_3 id_finally = Oo_1.id_class(new hi_3());
    public static final hx_3 id_extends = Oo_1.id_class(new hx_3());
    public static final hN_2 id_native = Oo_1.id_class(new hN_2());
    public static final JQ id_volatile = Oo_1.id_class(new JQ());
    public static final JM id_final = Oo_1.id_class(new JM());
    public static final hX_2 id_package = Oo_1.id_class(new hX_2());
    public static final Xo_1 id_int = Oo_1.id_class(new Xo_1(new rqO_2("location")));
    public static final Xo_1 id_new = Oo_1.id_class(new Xo_1(new rqO_2("slept_in_bed")));
    public static final hv_3 id_continue = Oo_1.id_class(new hv_3());
    public static final Jm_1 id_super = Oo_1.id_class(new Jm_1());
    public static final XM id_this = Oo_1.id_class(new XM());
    public static final XW id_else = Oo_1.id_class(new XW());
    public static final hk_3 id_synchronized = Oo_1.id_class(new hk_3());
    public static final JW id_return = Oo_1.id_class(new JW());
    public static final Jh_1 id_public = Oo_1.id_class(new Jh_1());
    public static final Xy_1 id_goto = Oo_1.id_class(new Xy_1());
    public static final hu_3 id_while = Oo_1.id_class(new hu_3());
    public static final hH_2 id_try = Oo_1.id_class(new hH_2());
    public static final Jc_1 id_instanceof = Oo_1.id_class(new Jc_1());
    public static final Xl_1 id_throw = Oo_1.id_class(new Xl_1());
    public static final XP id_interface = Oo_1.id_class(new XP());
    public static final hz_3 id_char = Oo_1.id_class(new hz_3());
    public static final Xi_1 id_abstract = Oo_1.id_class(new Xi_1());
    public static final XJ id_long = Oo_1.id_class(new XJ());
    public static final Xo_1 id_float = Oo_1.id_class(new Xo_1(new rqO_2("hero_of_the_village")));
    public static final Xo_1 id_void = Oo_1.id_class(new Xo_1(new rqO_2("voluntary_exile")));
    public static final JP id_static = Oo_1.id_class(new JP());
    public static final hb_3 id_import = Oo_1.id_class(new hb_3());
    public static final JJ id_short = Oo_1.id_class(new JJ());
    public static final Xe_1 id_default = Oo_1.id_class(new Xe_1());
    public static final Xt_1 id_const = Oo_1.id_class(new Xt_1());
    public static final Jd_1 id_strictfp = Oo_1.id_class(new Jd_1());
    public static final Xq_1 id_boolean = Oo_1.id_class(new Xq_1());

    private static <T extends hP_2<?>> T id_class(T t) {
        if (id_transient.containsKey(t.id_class())) {
            throw new IllegalArgumentException("Duplicate criterion id " + t.id_class());
        }
        id_transient.put(t.id_class(), t);
        return t;
    }

    public static Iterable<? extends hP_2<?>> id_class() {
        return id_transient.values();
    }

    public static <T extends hr_3> hP_2<T> id_class(rqO_2 rqO_22) {
        return id_transient.get(rqO_22);
    }
}

