/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrrl_1;
import celestial.xu_3;
import java.util.Random;

public class rrrW
extends rrrl_1 {
    @Override
    public void id_class(Random random, int n, int n2, int n3, boolean bl) {
        float f;
        this.id_class = bl ? ((f = random.nextFloat()) < 0.2f ? xu_3.Bn.id_continue() : (f < 0.5f ? xu_3.BA.id_continue() : (f < 0.55f ? xu_3.By.id_continue() : xu_3.BL.id_continue()))) : xu_3.hb.id_continue();
    }
}

