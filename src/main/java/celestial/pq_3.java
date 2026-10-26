/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.Tn_1;
import celestial.pW_2;
import celestial.pg_3;
import celestial.rEx_1;
import celestial.rbB_2;
import celestial.rfU_2;
import celestial.rje_3;
import celestial.rqO_2;
import celestial.tC_2;

public class pq_3
extends pW_2<rEx_1, tC_2<rEx_1>> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/zombie/drowned.png");

    public pq_3(pg_3 pg_32) {
        super(pg_32, new tC_2(0.0f, 0.0f, 64, 64), new tC_2(0.5f, true), new tC_2(1.0f, true));
        this.id_class(new Tn_1<rEx_1>(this));
    }

    @Override
    public rqO_2 id_class(rbB_2 rbB_22) {
        return id_class;
    }

    @Override
    protected void id_class(rEx_1 rEx_12, Ml_1 ml_1, float f, float f2, float f3) {
        super.id_class(rEx_12, ml_1, f, f2, f3);
        float f4 = rEx_12.id_synchronized(f3);
        if (f4 > 0.0f) {
            ml_1.id_class(rje_3.id_break.id_byte(rfU_2.id_catch(f4, ((Float)rEx_12.id_throws[16]).floatValue(), -10.0f - ((Float)rEx_12.id_throws[16]).floatValue())));
        }
    }
}

