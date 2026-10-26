/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrrl_1;
import celestial.xu_3;
import java.util.Random;

public class rap_3
extends rrrl_1 {
    @Override
    public void id_class(Random random, int n, int n2, int n3, boolean bl) {
        this.id_class = random.nextFloat() < 0.4f ? xu_3.id_volatile.id_continue() : xu_3.rV.id_continue();
    }
}

