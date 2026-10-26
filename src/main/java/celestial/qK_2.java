/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.pg_3;
import celestial.qc_3;
import celestial.rOJ;
import celestial.rfU_2;
import celestial.rje_3;
import celestial.rqO_2;
import celestial.wl_3;

public class qK_2
extends qc_3<rOJ, wl_3<rOJ>> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/squid.png");

    public qK_2(pg_3 pg_32) {
        super(pg_32, new wl_3(), 0.7f);
    }

    @Override
    public rqO_2 id_class(rOJ rOJ2) {
        return id_class;
    }

    @Override
    protected float id_class(rOJ rOJ2, float f) {
        return rfU_2.id_catch(f, rOJ2.id_return, rOJ2.id_synchronized);
    }

    @Override
    protected void id_class(rOJ rOJ2, Ml_1 ml_1, float f, float f2, float f3) {
        float f4 = rfU_2.id_catch(f3, rOJ2.id_break, rOJ2.id_class);
        float f5 = rfU_2.id_catch(f3, rOJ2.id_super, rOJ2.id_protected);
        ml_1.id_class(0.0, 0.5, 0.0);
        ml_1.id_class(rje_3.id_protected.id_byte(180.0f - f2));
        ml_1.id_class(rje_3.id_break.id_byte(f4));
        ml_1.id_class(rje_3.id_protected.id_byte(f5));
        ml_1.id_class(0.0, (double)-1.2f, 0.0);
    }
}

