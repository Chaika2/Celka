/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rNl_1;
import celestial.rQz_1;
import celestial.rWD;
import celestial.rdn_3;
import celestial.rzO_2;
import celestial.rzh_3;
import celestial.rzr_3;
import celestial.rzx_3;

public class rNn_1
extends rzO_2 {
    public final rWD id_break;

    public rNn_1(rQz_1[] rQz_1Array, rWD rWD2) {
        super(rQz_1Array);
        this.id_break = rWD2;
    }

    public static rzh_3<?> id_class(rWD rWD2) {
        return rNn_1.id_class((rQz_1[] rQz_1Array) -> new rNn_1((rQz_1[])rQz_1Array, rWD2));
    }

    @Override
    public rzx_3 id_break() {
        return rNl_1.id_package;
    }

    @Override
    public rdn_3 id_break(rdn_3 rdn_32, rzr_3 rzr_32) {
        int n = this.id_break.applyAsInt(rdn_32.id_char());
        rdn_32.id_throws(n);
        return rdn_32;
    }
}

