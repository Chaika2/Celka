/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Iq_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.rrJR;
import celestial.tW_2;

public class rrJo_1 {
    private int id_class = 0;
    private Iq_1 id_break = null;

    public rrJo_1(int n, Iq_1 iq_1) {
        this.id_class = n;
        this.id_break = iq_1;
    }

    public Iq_1 id_class() {
        return this.id_break;
    }

    public void id_class(tW_2 tW_22, Ml_1 ml_1, Ok_1 ok_1, int n, int n2) {
        Iq_1 iq_1 = rrJR.id_class(tW_22, this.id_class);
        if (iq_1 != null) {
            iq_1.id_class(ml_1);
        }
        this.id_break.id_class(ml_1, ok_1, n, n2);
    }
}

