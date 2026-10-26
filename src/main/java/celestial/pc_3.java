/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.pg_3;
import celestial.qc_3;
import celestial.rbv_3;
import celestial.rfU_2;
import celestial.rqO_2;
import celestial.td_3;

public class pc_3
extends qc_3<rbv_3, td_3> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/bat.png");

    public pc_3(pg_3 pg_32) {
        super(pg_32, new td_3(), 0.25f);
    }

    @Override
    public rqO_2 id_class(rbv_3 rbv_32) {
        return id_class;
    }

    @Override
    protected void id_class(rbv_3 rbv_32, Ml_1 ml_1, float f, float f2, float f3) {
        if (rbv_32.id_catch()) {
            ml_1.id_class(0.0, (double)-0.1f, 0.0);
        } else {
            ml_1.id_class(0.0, (double)(rfU_2.id_break(f * 0.3f) * 0.1f), 0.0);
        }
        super.id_class(rbv_32, ml_1, f, f2, f3);
    }

    @Override
    protected void id_class(rbv_3 rbv_32, Ml_1 ml_1, float f) {
        ml_1.id_class(0.35f, 0.35f, 0.35f);
    }
}

