/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.TI;
import celestial.Tw_1;
import celestial.pg_3;
import celestial.qc_3;
import celestial.rMZ;
import celestial.rje_3;
import celestial.rqO_2;
import celestial.tD_2;

public class qO_2
extends qc_3<rMZ, tD_2<rMZ>> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/iron_golem/iron_golem.png");

    public qO_2(pg_3 pg_32) {
        super(pg_32, new tD_2(), 0.7f);
        this.id_class(new Tw_1(this));
        this.id_class(new TI(this));
    }

    @Override
    public rqO_2 id_class(rMZ rMZ2) {
        return id_class;
    }

    @Override
    protected void id_class(rMZ rMZ2, Ml_1 ml_1, float f, float f2, float f3) {
        super.id_class(rMZ2, ml_1, f, f2, f3);
        if (!((double)((Float)rMZ2.id_private[18]).floatValue() < 0.01)) {
            float f4 = 13.0f;
            float f5 = ((Float)rMZ2.id_private[19]).floatValue() - ((Float)rMZ2.id_private[18]).floatValue() * (1.0f - f3) + 6.0f;
            float f6 = (Math.abs(f5 % 13.0f - 6.5f) - 3.25f) / 3.25f;
            ml_1.id_class(rje_3.id_case.id_byte(6.5f * f6));
        }
    }
}

