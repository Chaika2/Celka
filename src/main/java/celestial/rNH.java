/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
package celestial;

import celestial.an_3;
import celestial.eA_2;
import celestial.iB_2;
import celestial.rNl_1;
import celestial.rNy_1;
import celestial.rQz_1;
import celestial.rdn_3;
import celestial.rzO_2;
import celestial.rzQ_2;
import celestial.rzV_2;
import celestial.rzd_3;
import celestial.rzr_3;
import celestial.rzx_3;
import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class rNH
extends rzO_2 {
    public final rzV_2 id_break;
    public final int id_byte;

    public boolean id_byte() {
        return this.id_byte > 0;
    }

    public rNH(rQz_1[] rQz_1Array, rzV_2 rzV_22, int n) {
        super(rQz_1Array);
        this.id_break = rzV_22;
        this.id_byte = n;
    }

    public static rNy_1 id_class(rzV_2 rzV_22) {
        return new rNy_1(rzV_22);
    }

    @Override
    public Set<rzd_3<?>> id_class() {
        return ImmutableSet.of(rzQ_2.id_protected);
    }

    @Override
    public rzx_3 id_break() {
        return rNl_1.id_catch;
    }

    @Override
    public rdn_3 id_break(rdn_3 rdn_32, rzr_3 rzr_32) {
        an_3 an_32 = rzr_32.id_break(rzQ_2.id_protected);
        if (an_32 instanceof iB_2) {
            int n = eA_2.id_catch((iB_2)an_32);
            if (n == 0) {
                return rdn_32;
            }
            float f = (float)n * this.id_break.id_break(rzr_32.id_class());
            rdn_32.id_case(Math.round(f));
            if (this.id_byte() && rdn_32.id_char() > this.id_byte) {
                rdn_32.id_throws(this.id_byte);
            }
        }
        return rdn_32;
    }
}

