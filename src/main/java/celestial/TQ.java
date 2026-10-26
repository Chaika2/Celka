/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hx_1;
import celestial.Ml_1;
import celestial.an_3;
import celestial.iB_2;
import celestial.pg_3;
import celestial.qd_3;
import celestial.rYB;
import celestial.rfU_2;
import celestial.rhF_2;
import celestial.tB_2;
import celestial.wh_3;

public class TQ<T extends iB_2, M extends wh_3<T>>
extends tB_2<T, M> {
    private final pg_3 id_class;
    private rhF_2 id_break;

    public TQ(qd_3<T, M> qd_32) {
        super(qd_32);
        this.id_class = qd_32.id_break();
    }

    @Override
    protected int id_class(T t) {
        return ((iB_2)t).BY();
    }

    @Override
    protected void id_class(Ml_1 ml_1, Hx_1 hx_1, int n, an_3 an_32, float f, float f2, float f3, float f4) {
        float f5 = rfU_2.id_byte(f * f + f3 * f3);
        this.id_break = new rhF_2((rYB)an_32.id_throws[7], an_32.rx(), an_32.re(), an_32.BO());
        Float f6 = Float.valueOf((float)(Math.atan2(f, f3) * 57.2957763671875));
        this.id_break.id_throws[15] = f6;
        Float f7 = Float.valueOf((float)(Math.atan2(f2, f5) * 57.2957763671875));
        this.id_break.id_throws[16] = f7;
        Float f8 = Float.valueOf(((Float)this.id_break.id_throws[15]).floatValue());
        this.id_break.id_throws[17] = f8;
        Float f9 = Float.valueOf(((Float)this.id_break.id_throws[16]).floatValue());
        this.id_break.id_throws[18] = f9;
        this.id_class.id_class(this.id_break, 0.0, 0.0, 0.0, 0.0f, f4, ml_1, hx_1, n);
    }
}

