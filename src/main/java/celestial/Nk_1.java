/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.NN;
import celestial.cr_3;
import celestial.rEI;
import celestial.rqL_2;
import celestial.rqn_3;

public class Nk_1
extends cr_3 {
    private final rEI id_class;

    @Override
    public void id_byte() {
        if (!((Boolean)this.id_class.id_throws[27]).booleanValue() && this.id_class.I_() == null) {
            this.id_catch = (float)this.id_class.rx();
            this.id_private = (float)this.id_class.re();
            this.id_implements = (float)this.id_class.BO();
            float f = this.id_class.id_char(0.0f);
            this.id_throws = 0.0f + 1.0f * f * f;
            this.id_case = 0.7f + 0.5f * f;
        } else {
            this.id_super();
        }
    }

    public Nk_1(rEI rEI2) {
        super(rqn_3.sL, rqL_2.HOSTILE);
        this.id_class = rEI2;
        this.id_native = NN.NONE;
        this.id_finally = true;
        this.id_extends = 0;
    }

    @Override
    public boolean id_throws() {
        return !this.id_class.BF();
    }
}

