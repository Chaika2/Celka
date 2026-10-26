/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.To_1;
import celestial.pg_3;
import celestial.qc_3;
import celestial.rGB;
import celestial.rje_3;
import celestial.rqO_2;
import celestial.wb_3;

public class qL_2
extends qc_3<rGB, wb_3<rGB>> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/phantom.png");

    public qL_2(pg_3 pg_32) {
        super(pg_32, new wb_3(), 0.75f);
        this.id_class(new To_1<rGB>(this));
    }

    @Override
    public rqO_2 id_class(rGB rGB2) {
        return id_class;
    }

    @Override
    protected void id_class(rGB rGB2, Ml_1 ml_1, float f, float f2, float f3) {
        super.id_class(rGB2, ml_1, f, f2, f3);
        ml_1.id_class(rje_3.id_break.id_byte(((Float)rGB2.id_throws[16]).floatValue()));
    }

    @Override
    protected void id_class(rGB rGB2, Ml_1 ml_1, float f) {
        int n = rGB2.id_throws();
        float f2 = 1.0f + 0.15f * (float)n;
        ml_1.id_class(f2, f2, f2);
        ml_1.id_class(0.0, 1.3125, 0.1875);
    }
}

