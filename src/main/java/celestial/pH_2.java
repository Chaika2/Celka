/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.Tv_1;
import celestial.iB_2;
import celestial.pg_3;
import celestial.qc_3;
import celestial.rEJ;
import celestial.rfU_2;
import celestial.rqO_2;
import celestial.tA_2;

public class pH_2
extends qc_3<rEJ, tA_2<rEJ>> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/creeper/creeper.png");

    public pH_2(pg_3 pg_32) {
        super(pg_32, new tA_2(), 0.5f);
        this.id_class(new Tv_1(this));
    }

    @Override
    protected void id_class(rEJ rEJ2, Ml_1 ml_1, float f) {
        float f2 = rEJ2.id_throw(f);
        float f3 = 1.0f + rfU_2.id_class(f2 * 100.0f) * f2 * 0.01f;
        f2 = rfU_2.id_class(f2, 0.0f, 1.0f);
        f2 *= f2;
        f2 *= f2;
        float f4 = (1.0f + f2 * 0.4f) * f3;
        float f5 = (1.0f + f2 * 0.1f) / f3;
        ml_1.id_class(f4, f5, f4);
    }

    @Override
    public rqO_2 id_class(rEJ rEJ2) {
        return id_class;
    }

    @Override
    protected float id_class(rEJ rEJ2, float f) {
        float f2 = rEJ2.id_throw(f);
        return (int)(f2 * 10.0f) % 2 == 0 ? 0.0f : rfU_2.id_class(f2, 0.5f, 1.0f);
    }

    @Override
    protected /* synthetic */ float id_break(iB_2 iB_22, float f) {
        return this.id_class((rEJ)iB_22, f);
    }
}

