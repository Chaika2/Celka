/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Qz_1;
import celestial.rDg_1;
import celestial.rDv_1;
import celestial.rUx_1;
import java.util.Random;

public class Qm_1
extends Qz_1 {
    @Override
    protected rDg_1<rDv_1, ?> id_class(Random random, boolean bl) {
        return rUx_1.rR;
    }

    @Override
    protected rDg_1<rDv_1, ?> id_class(Random random) {
        return random.nextBoolean() ? rUx_1.re : rUx_1.ra;
    }
}

