/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hx_1;
import celestial.Ml_1;
import celestial.iB_2;
import celestial.pg_3;
import celestial.qG_2;
import celestial.qM_2;
import celestial.rED;
import celestial.rfU_2;
import celestial.rjU_2;
import celestial.rqO_2;
import celestial.tK_2;

public class qb_3
extends qG_2<rED> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/illager/illusioner.png");

    public qb_3(pg_3 pg_32) {
        super(pg_32, new tK_2(0.0f, 0.0f, 64, 64), 0.5f);
        this.id_class(new qM_2(this, this));
        ((tK_2)this.id_throws).id_break().id_finally = true;
    }

    @Override
    public rqO_2 id_class(rED rED2) {
        return id_class;
    }

    @Override
    public void id_class(rED rED2, float f, float f2, Ml_1 ml_1, Hx_1 hx_1, int n) {
        if (rED2.Pp()) {
            rjU_2[] rjU_2Array = rED2.id_throw(f2);
            float f3 = this.id_class(rED2, f2);
            for (int i = 0; i < rjU_2Array.length; ++i) {
                ml_1.id_class();
                ml_1.id_class(rjU_2Array[i].id_break + (double)rfU_2.id_break((float)i + f3 * 0.5f) * 0.025, rjU_2Array[i].id_byte + (double)rfU_2.id_break((float)i + f3 * 0.75f) * 0.0125, rjU_2Array[i].id_protected + (double)rfU_2.id_break((float)i + f3 * 0.7f) * 0.025);
                super.id_class(rED2, f, f2, ml_1, hx_1, n);
                ml_1.id_break();
            }
        } else {
            super.id_class(rED2, f, f2, ml_1, hx_1, n);
        }
    }

    @Override
    protected boolean id_break(rED rED2) {
        return true;
    }

    @Override
    protected /* synthetic */ boolean id_protected(iB_2 iB_22) {
        return this.id_break((rED)iB_22);
    }
}

