/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.Tk_1;
import celestial.pg_3;
import celestial.rbB_2;
import celestial.rqO_2;

public class qs_3
extends Tk_1 {
    private static final rqO_2 id_class = new rqO_2("textures/entity/zombie/husk.png");

    public qs_3(pg_3 pg_32) {
        super(pg_32);
    }

    @Override
    protected void id_class(rbB_2 rbB_22, Ml_1 ml_1, float f) {
        float f2 = 1.0625f;
        ml_1.id_class(1.0625f, 1.0625f, 1.0625f);
        super.id_class(rbB_22, ml_1, f);
    }

    @Override
    public rqO_2 id_class(rbB_2 rbB_22) {
        return id_class;
    }
}

