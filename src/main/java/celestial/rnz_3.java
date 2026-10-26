/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rgP_2;
import celestial.rnW_2;
import celestial.rpC_2;
import celestial.rqR_2;

public class rnz_3
implements rpC_2 {
    private long id_class = rqR_2.id_break();

    @Override
    public void id_byte(rgP_2 rgP_22) {
    }

    @Override
    public void id_break(int n) {
        if (rqR_2.id_break() - this.id_class >= 1000L) {
            this.id_class = rqR_2.id_break();
            rnW_2.id_finally.info("Converting... {}%", (Object)n);
        }
    }

    @Override
    public void id_break(rgP_2 rgP_22) {
    }

    @Override
    public void id_finally() {
    }

    @Override
    public void id_protected(rgP_2 rgP_22) {
    }
}

