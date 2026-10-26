/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rVj_1;
import celestial.rgc_3;
import celestial.rpv_3;

public class rVo_1
implements rpv_3 {
    private float id_break;
    private int id_byte;
    public final /* synthetic */ rVj_1 id_class;

    public rVo_1(rVj_1 rVj_12, float f) {
        this.id_class = rVj_12;
        this.id_break = f;
    }

    public int id_class() {
        return this.id_byte;
    }

    @Override
    public boolean accept(int n, rgc_3 rgc_32, int n2) {
        this.id_break -= this.id_class.id_class.getWidth(n2, rgc_32);
        if (this.id_break >= 0.0f) {
            this.id_byte = n + Character.charCount(n2);
            return true;
        }
        return false;
    }

    public void id_break() {
        this.id_byte = 0;
    }
}

