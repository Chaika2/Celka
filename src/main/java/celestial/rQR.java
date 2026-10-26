/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.eA_2;
import celestial.ev_3;
import celestial.rNl_1;
import celestial.rQD;
import celestial.rQK;
import celestial.rQY;
import celestial.rQe_1;
import celestial.rQo_1;
import celestial.rQz_1;
import celestial.rdn_3;
import celestial.rqO_2;
import celestial.rzO_2;
import celestial.rzQ_2;
import celestial.rzd_3;
import celestial.rzh_3;
import celestial.rzr_3;
import celestial.rzx_3;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;

public class rQR
extends rzO_2 {
    public static final Map<rqO_2, rQK> id_break = Maps.newHashMap();
    public final ev_3 id_byte;
    public final rQo_1 id_protected;

    public rQR(rQz_1[] rQz_1Array, ev_3 ev_32, rQo_1 rQo_12) {
        super(rQz_1Array);
        this.id_byte = ev_32;
        this.id_protected = rQo_12;
    }

    static {
        id_break.put(rQY.id_class, rQY::id_class);
        id_break.put(rQD.id_class, rQD::id_class);
        id_break.put(rQe_1.id_class, rQe_1::id_class);
    }

    public static rzh_3<?> id_class(ev_3 ev_32, int n) {
        return rQR.id_class((rQz_1[] rQz_1Array) -> new rQR((rQz_1[])rQz_1Array, ev_32, new rQe_1(n)));
    }

    @Override
    public Set<rzd_3<?>> id_class() {
        return ImmutableSet.of(rzQ_2.id_implements);
    }

    public static rzh_3<?> id_class(ev_3 ev_32) {
        return rQR.id_class((rQz_1[] rQz_1Array) -> new rQR((rQz_1[])rQz_1Array, ev_32, new rQD()));
    }

    public static rzh_3<?> id_class(ev_3 ev_32, float f, int n) {
        return rQR.id_class((rQz_1[] rQz_1Array) -> new rQR((rQz_1[])rQz_1Array, ev_32, new rQY(n, f)));
    }

    public static rzh_3<?> id_break(ev_3 ev_32) {
        return rQR.id_class((rQz_1[] rQz_1Array) -> new rQR((rQz_1[])rQz_1Array, ev_32, new rQe_1(1)));
    }

    @Override
    public rdn_3 id_break(rdn_3 rdn_32, rzr_3 rzr_32) {
        rdn_3 rdn_33 = rzr_32.id_break(rzQ_2.id_implements);
        if (rdn_33 != null) {
            int n = eA_2.id_class(this.id_byte, rdn_33);
            int n2 = this.id_protected.id_class(rzr_32.id_class(), rdn_32.id_char(), n);
            rdn_32.id_throws(n2);
        }
        return rdn_32;
    }

    @Override
    public rzx_3 id_break() {
        return rNl_1.id_int;
    }
}

