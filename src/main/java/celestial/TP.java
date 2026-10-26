/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hx_1;
import celestial.Ml_1;
import celestial.pg_3;
import celestial.qc_3;
import celestial.rOg_1;
import celestial.rfU_2;
import celestial.rje_3;
import celestial.rqO_2;
import celestial.tO_2;
import celestial.tS_2;
import celestial.tp_3;
import celestial.wT_2;
import celestial.wq_3;

public class TP
extends qc_3<rOg_1, tp_3<rOg_1>> {
    private final wq_3<rOg_1> id_class = new wq_3(0.0f);
    private final wT_2<rOg_1> id_package = new wT_2(0.0f);

    public TP(pg_3 pg_32) {
        super(pg_32, new wq_3(0.0f), 0.15f);
        this.id_class(new tS_2(this));
    }

    @Override
    public rqO_2 id_class(rOg_1 rOg_12) {
        return rOg_12.sF();
    }

    @Override
    public void id_class(rOg_1 rOg_12, float f, float f2, Ml_1 ml_1, Hx_1 hx_1, int n) {
        tO_2 tO_22;
        this.id_throws = tO_22 = rOg_12.sZ() == 0 ? this.id_class : this.id_package;
        float[] fArray = rOg_12.su();
        tO_22.id_class(fArray[0], fArray[1], fArray[2]);
        super.id_class(rOg_12, f, f2, ml_1, hx_1, n);
        tO_22.id_class(1.0f, 1.0f, 1.0f);
    }

    @Override
    protected void id_class(rOg_1 rOg_12, Ml_1 ml_1, float f, float f2, float f3) {
        super.id_class(rOg_12, ml_1, f, f2, f3);
        float f4 = 4.3f * rfU_2.id_class(0.6f * f);
        ml_1.id_class(rje_3.id_protected.id_byte(f4));
        if (!rOg_12.rT()) {
            ml_1.id_class((double)0.2f, (double)0.1f, 0.0);
            ml_1.id_class(rje_3.id_case.id_byte(90.0f));
        }
    }
}

