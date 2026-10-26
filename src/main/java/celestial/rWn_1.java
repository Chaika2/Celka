/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rWK;
import celestial.rqO_2;
import java.util.Random;

public final class rWn_1
implements rWK {
    public final int id_protected;
    public final float id_throws;

    public rWn_1(int n, float f) {
        this.id_protected = n;
        this.id_throws = f;
    }

    @Override
    public rqO_2 id_class() {
        return id_byte;
    }

    public static rWn_1 id_class(int n, float f) {
        return new rWn_1(n, f);
    }

    @Override
    public int id_class(Random random) {
        int n = 0;
        for (int i = 0; i < this.id_protected; ++i) {
            if (!(random.nextFloat() < this.id_throws)) continue;
            ++n;
        }
        return n;
    }
}

