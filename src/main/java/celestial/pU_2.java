/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hx_1;
import celestial.Hz_1;
import celestial.IQ;
import celestial.Ml_1;
import celestial.fJ_2;
import celestial.fZ_2;
import celestial.pV_2;
import celestial.pg_3;
import celestial.rhy_3;
import celestial.rje_3;
import celestial.rqO_2;

public class pU_2
extends pV_2<rhy_3> {
    private final Hz_1 id_class;

    public pU_2(pg_3 pg_32, Hz_1 hz_1) {
        super(pg_32);
        this.id_class = hz_1;
    }

    @Override
    public rqO_2 id_class(rhy_3 rhy_32) {
        return fJ_2.id_class;
    }

    @Override
    public void id_class(rhy_3 rhy_32, float f, float f2, Ml_1 ml_1, Hx_1 hx_1, int n) {
        ml_1.id_class();
        ml_1.id_class(this.id_break.id_byte());
        ml_1.id_class(rje_3.id_protected.id_byte(180.0f));
        if (rhy_32.id_protected()) {
            ml_1.id_class(rje_3.id_case.id_byte(180.0f));
            ml_1.id_class(rje_3.id_protected.id_byte(180.0f));
            ml_1.id_class(rje_3.id_break.id_byte(90.0f));
        }
        this.id_class.id_class(rhy_32.id_class(), IQ.GROUND, n, fZ_2.id_class, ml_1, hx_1);
        ml_1.id_break();
        super.id_class(rhy_32, f, f2, ml_1, hx_1, n);
    }
}

