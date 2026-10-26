/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.NN;
import celestial.an_3;
import celestial.cr_3;
import celestial.rfU_2;
import celestial.rhd_3;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.rsJ_2;

public class Ny_1
extends cr_3 {
    private final rhd_3 id_class;
    private final rsJ_2 id_package;

    @Override
    public void id_byte() {
        if (!((Boolean)this.id_package.id_throws[27]).booleanValue() && this.id_class.Pm() && this.id_class.ra() == this.id_package) {
            float f = rfU_2.id_class(an_3.id_case(this.id_package.rv()));
            this.id_throws = (double)f >= 0.01 ? 0.0f + rfU_2.id_class(f, 0.0f, 1.0f) * 0.75f : 0.0f;
        } else {
            this.id_super();
        }
    }

    public Ny_1(rhd_3 rhd_32, rsJ_2 rsJ_22) {
        super(rqn_3.Gj, rqL_2.NEUTRAL);
        this.id_class = rhd_32;
        this.id_package = rsJ_22;
        this.id_native = NN.NONE;
        this.id_finally = true;
        this.id_extends = 0;
        this.id_throws = 0.0f;
    }

    @Override
    public boolean id_throws() {
        return !this.id_package.BF();
    }

    @Override
    public boolean id_protected() {
        return true;
    }
}

