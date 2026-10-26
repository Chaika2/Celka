/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rNl_1;
import celestial.rQz_1;
import celestial.rWK;
import celestial.rdn_3;
import celestial.rzO_2;
import celestial.rzh_3;
import celestial.rzr_3;
import celestial.rzx_3;

public class rNV
extends rzO_2 {
    public final rWK id_break;

    public rNV(rQz_1[] rQz_1Array, rWK rWK2) {
        super(rQz_1Array);
        this.id_break = rWK2;
    }

    public static rzh_3<?> id_class(rWK rWK2) {
        return rNV.id_class((rQz_1[] rQz_1Array) -> new rNV((rQz_1[])rQz_1Array, rWK2));
    }

    @Override
    public rzx_3 id_break() {
        return rNl_1.id_break;
    }

    @Override
    public rdn_3 id_break(rdn_3 rdn_32, rzr_3 rzr_32) {
        rdn_32.id_throws(this.id_break.id_class(rzr_32.id_class()));
        return rdn_32;
    }
}

