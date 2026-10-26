/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.Ml_1;
import celestial.TC;
import celestial.TT;
import celestial.Tc_1;
import celestial.Tp_1;
import celestial.pg_3;
import celestial.qd_3;
import celestial.rSY;
import celestial.rYB;
import celestial.rfU_2;
import celestial.rje_3;
import celestial.rqO_2;
import celestial.tJ_2;
import celestial.tx_3;

public class pQ_2
extends qd_3<rSY, tJ_2> {
    public static final rqO_2 id_class = new rqO_2("textures/entity/armorstand/wood.png");

    public pQ_2(pg_3 pg_32) {
        super(pg_32, new tx_3(), 0.0f);
        this.id_class(new Tc_1<rSY, tJ_2, tJ_2>(this, new tJ_2(0.5f), new tJ_2(1.0f)));
        this.id_class(new TT<rSY, tJ_2>(this));
        this.id_class(new TC<rSY, tJ_2>(this));
        this.id_class(new Tp_1<rSY, tJ_2>(this));
    }

    @Override
    public rqO_2 id_class(rSY rSY2) {
        return id_class;
    }

    @Override
    protected void id_class(rSY rSY2, Ml_1 ml_1, float f, float f2, float f3) {
        ml_1.id_class(rje_3.id_protected.id_byte(180.0f - f2));
        float f4 = (float)(((rYB)rSY2.id_throws[7]).r() - rSY2.id_volatile) + f3;
        if (f4 < 5.0f) {
            ml_1.id_class(rje_3.id_protected.id_byte(rfU_2.id_class(f4 / 1.5f * (float)Math.PI) * 3.0f));
        }
    }

    @Override
    protected HU id_class(rSY rSY2, boolean bl, boolean bl2, boolean bl3) {
        if (!rSY2.id_implements()) {
            return super.id_class(rSY2, bl, bl2, bl3);
        }
        rqO_2 rqO_22 = this.id_class(rSY2);
        if (bl2) {
            return HU.id_byte(rqO_22, false);
        }
        return bl ? HU.id_class(rqO_22, false) : null;
    }

    @Override
    protected boolean id_break(rSY rSY2) {
        double d = this.id_break.id_break(rSY2);
        float f = rSY2.x() ? 32.0f : 64.0f;
        return d >= (double)(f * f) ? false : rSY2.D();
    }
}

