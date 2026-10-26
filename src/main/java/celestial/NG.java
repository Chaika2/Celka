/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.NE;
import celestial.Nb_1;
import celestial.cr_3;
import celestial.rbF_2;
import celestial.rqL_2;
import celestial.rqn_3;

public class NG
extends Nb_1 {
    public NG(rbF_2 rbF_22) {
        super(rbF_22, rqn_3.p, rqL_2.NEUTRAL);
    }

    @Override
    protected cr_3 id_class() {
        return new NE(this.id_class);
    }

    @Override
    protected boolean id_break() {
        return this.id_class.T_();
    }
}

