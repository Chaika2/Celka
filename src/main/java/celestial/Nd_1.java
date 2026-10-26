/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.cr_3;
import celestial.rqA_2;
import celestial.rqL_2;

public class Nd_1
extends cr_3 {
    private final an_3 id_class;

    @Override
    public void id_byte() {
        if (((Boolean)this.id_class.id_throws[27]).booleanValue()) {
            this.id_super();
        } else {
            this.id_catch = (float)this.id_class.rx();
            this.id_private = (float)this.id_class.re();
            this.id_implements = (float)this.id_class.BO();
        }
    }

    public Nd_1(rqA_2 rqA_22, rqL_2 rqL_22, an_3 an_32) {
        this(rqA_22, rqL_22, 1.0f, 1.0f, an_32);
    }

    public Nd_1(rqA_2 rqA_22, rqL_2 rqL_22, float f, float f2, an_3 an_32) {
        super(rqA_22, rqL_22);
        this.id_throws = f;
        this.id_case = f2;
        this.id_class = an_32;
        this.id_catch = (float)this.id_class.rx();
        this.id_private = (float)this.id_class.re();
        this.id_implements = (float)this.id_class.BO();
    }

    @Override
    public boolean id_throws() {
        return !this.id_class.BF();
    }
}

