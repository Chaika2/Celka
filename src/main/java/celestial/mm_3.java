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
import celestial.rYi_1;

public class mm_3
extends mN_2 {
    public mm_3(String string) {
        super(string);
    }

    @Override
    protected rKd_1 id_class(rVL<rYG> rVL2, rVL<rKW> rVL3, long l) {
        return new rKT(new rYi_1(l, false, true, rVL2), l, () -> rVL3.id_byte(rKW.id_byte));
    }
}

