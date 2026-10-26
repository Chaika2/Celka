/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hx_1;
import celestial.Hz_1;
import celestial.IQ;
import celestial.Ml_1;
import celestial.ai_3;
import celestial.an_3;
import celestial.fJ_2;
import celestial.fZ_2;
import celestial.pV_2;
import celestial.pg_3;
import celestial.rfH_2;
import celestial.rje_3;
import celestial.rqO_2;

public class qo_3<T extends an_3>
extends pV_2<T> {
    private final Hz_1 id_class;
    private final float id_throws;
    private final boolean id_case;

    public qo_3(pg_3 pg_32, Hz_1 hz_1, float f, boolean bl) {
        super(pg_32);
        this.id_class = hz_1;
        this.id_throws = f;
        this.id_case = bl;
    }

    public qo_3(pg_3 pg_32, Hz_1 hz_1) {
        this(pg_32, hz_1, 1.0f, false);
    }

    @Override
    public void id_class(T t, float f, float f2, Ml_1 ml_1, Hx_1 hx_1, int n) {
        if ((Integer)((an_3)t).id_throws[41] >= 2 || !(this.id_break.id_break.id_catch().id_int((an_3)t) < 12.25)) {
            ml_1.id_class();
            ml_1.id_class(this.id_throws, this.id_throws, this.id_throws);
            ml_1.id_class(this.id_break.id_byte());
            ml_1.id_class(rje_3.id_protected.id_byte(180.0f));
            this.id_class.id_class(((ai_3)t).id_class(), IQ.GROUND, n, fZ_2.id_class, ml_1, hx_1);
            ml_1.id_break();
            super.id_class(t, f, f2, ml_1, hx_1, n);
        }
    }

    @Override
    public rqO_2 id_class(an_3 an_32) {
        return fJ_2.id_class;
    }

    @Override
    protected int id_class(T t, rfH_2 rfH_22) {
        return this.id_case ? 15 : super.id_class(t, rfH_22);
    }
}

