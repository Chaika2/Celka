/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.mN_2;
import celestial.rKQ;
import celestial.rKW;
import celestial.rKd_1;
import celestial.rKz_1;
import celestial.rVL;
import celestial.rYG;

public class mu_3
extends mN_2 {
    public mu_3(String string) {
        super(string);
    }

    @Override
    protected rKd_1 id_class(rVL<rYG> rVL2, rVL<rKW> rVL3, long l) {
        return new rKz_1(rKQ.id_class(rVL2));
    }
}

