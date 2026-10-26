/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hx_1;
import celestial.Hz_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.fZ_2;
import celestial.pV_2;
import celestial.pg_3;
import celestial.rfU_2;
import celestial.rhD_2;
import celestial.rje_3;
import celestial.rqO_2;
import celestial.wp_3;

public class Tr_1
extends pV_2<rhD_2> {
    public static final rqO_2 id_class = new rqO_2("textures/entity/trident.png");
    private final wp_3 id_throws = new wp_3();

    public Tr_1(pg_3 pg_32) {
        super(pg_32);
    }

    @Override
    public void id_class(rhD_2 rhD_22, float f, float f2, Ml_1 ml_1, Hx_1 hx_1, int n) {
        ml_1.id_class();
        ml_1.id_class(rje_3.id_protected.id_byte(rfU_2.id_catch(f2, ((Float)rhD_22.id_throws[17]).floatValue(), ((Float)rhD_22.id_throws[15]).floatValue()) - 90.0f));
        ml_1.id_class(rje_3.id_case.id_byte(rfU_2.id_catch(f2, ((Float)rhD_22.id_throws[18]).floatValue(), ((Float)rhD_22.id_throws[16]).floatValue()) + 90.0f));
        Ok_1 ok_1 = Hz_1.id_byte(hx_1, this.id_throws.id_class(this.id_class(rhD_22)), false, rhD_22.id_super());
        this.id_throws.id_class(ml_1, ok_1, n, fZ_2.id_class, 1.0f, 1.0f, 1.0f, 1.0f);
        ml_1.id_break();
        super.id_class(rhD_22, f, f2, ml_1, hx_1, n);
    }

    @Override
    public rqO_2 id_class(rhD_2 rhD_22) {
        return id_class;
    }
}

