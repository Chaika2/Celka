/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.cr_3;
import celestial.rfU_2;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.rsJ_2;

public class NF
extends cr_3 {
    private final rsJ_2 id_class;
    private float id_package = 0.0f;

    @Override
    public void id_byte() {
        if (((Boolean)this.id_class.id_throws[27]).booleanValue()) {
            this.id_super();
        } else {
            this.id_catch = (float)this.id_class.rx();
            this.id_private = (float)this.id_class.re();
            this.id_implements = (float)this.id_class.BO();
            float f = rfU_2.id_class(an_3.id_case(this.id_class.rv()));
            if ((double)f >= 0.01) {
                this.id_package = rfU_2.id_class(this.id_package + 0.0025f, 0.0f, 1.0f);
                this.id_throws = rfU_2.id_catch(rfU_2.id_class(f, 0.0f, 0.5f), 0.0f, 0.7f);
            } else {
                this.id_package = 0.0f;
                this.id_throws = 0.0f;
            }
        }
    }

    public NF(rsJ_2 rsJ_22) {
        super(rqn_3.GV, rqL_2.NEUTRAL);
        this.id_class = rsJ_22;
        this.id_finally = true;
        this.id_extends = 0;
        this.id_throws = 0.0f;
        this.id_catch = (float)rsJ_22.rx();
        this.id_private = (float)rsJ_22.re();
        this.id_implements = (float)rsJ_22.BO();
    }

    @Override
    public boolean id_throws() {
        return !this.id_class.BF();
    }

    @Override
    public boolean id_protected() {
        return true;
    }
}

