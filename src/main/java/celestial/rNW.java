/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.eA_2;
import celestial.rNl_1;
import celestial.rNz_1;
import celestial.rQz_1;
import celestial.rWK;
import celestial.rdn_3;
import celestial.rzO_2;
import celestial.rzr_3;
import celestial.rzx_3;
import java.util.Random;

public class rNW
extends rzO_2 {
    public final rWK id_break;
    public final boolean id_byte;

    public rNW(rQz_1[] rQz_1Array, rWK rWK2, boolean bl) {
        super(rQz_1Array);
        this.id_break = rWK2;
        this.id_byte = bl;
    }

    public static rNz_1 id_class(rWK rWK2) {
        return new rNz_1(rWK2);
    }

    @Override
    public rzx_3 id_break() {
        return rNl_1.id_byte;
    }

    @Override
    public rdn_3 id_break(rdn_3 rdn_32, rzr_3 rzr_32) {
        Random random = rzr_32.id_class();
        return eA_2.id_class(random, rdn_32, this.id_break.id_class(random), this.id_byte);
    }
}

