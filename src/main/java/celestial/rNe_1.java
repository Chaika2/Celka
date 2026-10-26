/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rNl_1;
import celestial.rQz_1;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rzO_2;
import celestial.rzh_3;
import celestial.rzr_3;
import celestial.rzx_3;

public class rNe_1
extends rzO_2 {
    public final rcd_3 id_break;

    public rNe_1(rQz_1[] rQz_1Array, rcd_3 rcd_32) {
        super(rQz_1Array);
        this.id_break = rcd_32;
    }

    public static rzh_3<?> id_class(rcd_3 rcd_32) {
        return rNe_1.id_class((rQz_1[] rQz_1Array) -> new rNe_1((rQz_1[])rQz_1Array, rcd_32));
    }

    @Override
    public rzx_3 id_break() {
        return rNl_1.id_throws;
    }

    @Override
    public rdn_3 id_break(rdn_3 rdn_32, rzr_3 rzr_32) {
        rdn_32.id_int().id_class(this.id_break);
        return rdn_32;
    }
}

