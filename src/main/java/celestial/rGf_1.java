/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aU_2;
import celestial.rLD;
import celestial.rLR;
import java.util.Random;

public class rGf_1
implements aU_2 {
    public rLR id_class;

    public void id_class(Random random) {
        int n = random.nextInt(5);
        if (n <= 1) {
            this.id_class = rLD.id_class;
        } else if (n <= 2) {
            this.id_class = rLD.id_throws;
        } else if (n <= 3) {
            this.id_class = rLD.id_finally;
        } else if (n <= 4) {
            this.id_class = rLD.id_final;
        }
    }
}

