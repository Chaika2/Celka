/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.QZ;
import celestial.rDg_1;
import celestial.rDv_1;
import celestial.rUx_1;
import java.util.Random;

public class Qu_1
extends QZ {
    @Override
    protected rDg_1<rDv_1, ?> id_class(Random random, boolean bl) {
        if (random.nextInt(10) == 0) {
            return bl ? rUx_1.Ph : rUx_1.rK;
        }
        return bl ? rUx_1.Ps : rUx_1.rf;
    }
}

