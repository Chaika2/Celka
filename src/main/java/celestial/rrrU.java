/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrrD;
import java.util.Random;

public class rrrU
extends rrrD {
    @Override
    public String id_byte(Random random) {
        return "1x2_se" + (random.nextInt(1) + 1);
    }

    @Override
    public String id_class(Random random) {
        return "1x1_b" + (random.nextInt(4) + 1);
    }

    @Override
    public String id_class(Random random, boolean bl) {
        return bl ? "1x2_c_stairs" : "1x2_c" + (random.nextInt(4) + 1);
    }

    @Override
    public String id_break(Random random, boolean bl) {
        return bl ? "1x2_d_stairs" : "1x2_d" + (random.nextInt(5) + 1);
    }

    @Override
    public String id_break(Random random) {
        return "1x1_as" + (random.nextInt(4) + 1);
    }

    @Override
    public String id_throws(Random random) {
        return "2x2_s1";
    }

    @Override
    public String id_protected(Random random) {
        return "2x2_b" + (random.nextInt(5) + 1);
    }
}

