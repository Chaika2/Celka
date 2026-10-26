/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.NQ;
import celestial.NW;
import celestial.Nf_1;
import celestial.cS_2;
import celestial.cb_3;
import celestial.rYB;
import celestial.rqn_3;

public class cP_2
implements NW {
    private final cb_3 id_class;
    private final Nf_1 id_break;
    private int id_byte = 0;

    public cP_2(cb_3 cb_32, Nf_1 nf_1) {
        this.id_class = cb_32;
        this.id_break = nf_1;
    }

    @Override
    public void id_break() {
        --this.id_byte;
        if (this.id_byte <= 0 && this.id_class.W()) {
            float f = ((rYB)this.id_class.id_throws[7]).id_int.nextFloat();
            if (f < 1.0E-4f) {
                this.id_byte = 0;
                this.id_break.id_class((NQ)new cS_2(this.id_class, rqn_3.id_synchronized));
            } else if (f < 0.001f) {
                this.id_byte = 0;
                this.id_break.id_class((NQ)new cS_2(this.id_class, rqn_3.id_else));
            } else if (f < 0.01f) {
                this.id_byte = 0;
                this.id_break.id_class((NQ)new cS_2(this.id_class, rqn_3.id_this));
            }
        }
    }
}

