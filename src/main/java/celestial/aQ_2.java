/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.eC_2;
import celestial.eF_2;
import celestial.ev_3;
import celestial.rXQ;
import celestial.rdn_3;
import celestial.rxS_2;
import java.util.Random;

public class aQ_2
extends ev_3 {
    protected aQ_2(eF_2 eF_22, rXQ ... rXQArray) {
        super(eF_22, eC_2.BREAKABLE, rXQArray);
    }

    @Override
    public int id_class() {
        return 3;
    }

    @Override
    public boolean id_class(rdn_3 rdn_32) {
        return rdn_32.id_throws() ? true : super.id_class(rdn_32);
    }

    public static boolean id_class(rdn_3 rdn_32, int n, Random random) {
        if (rdn_32.id_break() instanceof rxS_2 && random.nextFloat() < 0.6f) {
            return false;
        }
        return random.nextInt(n + 1) > 0;
    }

    @Override
    public int id_class(int n) {
        return 5 + (n - 1) * 8;
    }

    @Override
    public int id_break(int n) {
        return super.id_class(n) + 50;
    }
}

