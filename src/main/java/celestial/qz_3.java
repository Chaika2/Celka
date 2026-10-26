/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hx_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.fZ_2;
import celestial.pV_2;
import celestial.pg_3;
import celestial.rfU_2;
import celestial.rhw_3;
import celestial.rje_3;
import celestial.rqO_2;
import celestial.ta_3;

public class qz_3
extends pV_2<rhw_3> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/llama/spit.png");
    private final ta_3<rhw_3> id_throws = new ta_3();

    public qz_3(pg_3 pg_32) {
        super(pg_32);
    }

    @Override
    public void id_class(rhw_3 rhw_32, float f, float f2, Ml_1 ml_1, Hx_1 hx_1, int n) {
        ml_1.id_class();
        ml_1.id_class(0.0, (double)0.15f, 0.0);
        ml_1.id_class(rje_3.id_protected.id_byte(rfU_2.id_catch(f2, ((Float)rhw_32.id_throws[17]).floatValue(), ((Float)rhw_32.id_throws[15]).floatValue()) - 90.0f));
        ml_1.id_class(rje_3.id_case.id_byte(rfU_2.id_catch(f2, ((Float)rhw_32.id_throws[18]).floatValue(), ((Float)rhw_32.id_throws[16]).floatValue())));
        this.id_throws.id_class(rhw_32, f2, 0.0f, -0.1f, 0.0f, 0.0f);
        Ok_1 ok_1 = hx_1.getBuffer(this.id_throws.id_class(id_class));
        this.id_throws.id_class(ml_1, ok_1, n, fZ_2.id_class, 1.0f, 1.0f, 1.0f, 1.0f);
        ml_1.id_break();
        super.id_class(rhw_32, f, f2, ml_1, hx_1, n);
    }

    @Override
    public rqO_2 id_class(rhw_3 rhw_32) {
        return id_class;
    }
}

