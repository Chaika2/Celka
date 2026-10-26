/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hx_1;
import celestial.Ml_1;
import celestial.cG_2;
import celestial.rrJR;
import celestial.rrbb_3;
import celestial.tW_2;

public class rrJV {
    private rrJR[] id_class = new rrJR[0];
    private boolean id_break = false;

    public void id_class(rrJR rrJR2) {
        this.id_class = (rrJR[])rrbb_3.id_class((Object[])this.id_class, (Object)rrJR2);
    }

    public void id_class(boolean bl) {
        this.id_break = bl;
    }

    public boolean id_class() {
        return this.id_break;
    }

    public void id_class(tW_2 tW_22, cG_2 cG_22, Ml_1 ml_1, Hx_1 hx_1, int n, int n2) {
        if (this.id_break) {
            for (int i = 0; i < this.id_class.length; ++i) {
                rrJR rrJR2 = this.id_class[i];
                rrJR2.id_class(tW_22, cG_22, ml_1, hx_1, n, n2);
            }
        }
    }

    public rrJR[] id_break() {
        return this.id_class;
    }
}

