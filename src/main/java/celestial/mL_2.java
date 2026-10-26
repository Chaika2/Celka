/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.mN_2;
import celestial.rKT;
import celestial.rKW;
import celestial.rKd_1;
import celestial.rVL;
import celestial.rYG;
import celestial.rYl_1;
import celestial.ror_3;

public class mL_2
extends mN_2 {
    public mL_2(String string) {
        super(string);
    }

    @Override
    protected rKd_1 id_class(rVL<rYG> rVL2, rVL<rKW> rVL3, long l) {
        return new rKT(new ror_3(rVL2.id_byte(rYl_1.id_break)), l, () -> rVL3.id_byte(rKW.id_private));
    }
}

