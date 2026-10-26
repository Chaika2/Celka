/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.Hx_1;
import celestial.MH;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.fZ_2;
import celestial.pV_2;
import celestial.pg_3;
import celestial.rfU_2;
import celestial.rhm_3;
import celestial.rjV_2;
import celestial.rje_3;
import celestial.rjj_3;

public abstract class pN_2<T extends rhm_3>
extends pV_2<T> {
    public pN_2(pg_3 pg_32) {
        super(pg_32);
    }

    public void id_class(rjV_2 rjV_22, rjj_3 rjj_32, Ok_1 ok_1, int n, int n2, int n3, float f, float f2, int n4, int n5, int n6, int n7) {
        ok_1.id_class(rjV_22, (float)n, (float)n2, (float)n3).id_break(255, 255, 255, 255).id_class(f, f2).id_byte(fZ_2.id_class).id_break(n7).id_class(rjj_32, (float)n4, (float)n6, (float)n5).id_class();
    }

    @Override
    public void id_class(T t, float f, float f2, Ml_1 ml_1, Hx_1 hx_1, int n) {
        ml_1.id_class();
        ml_1.id_class(rje_3.id_protected.id_byte(rfU_2.id_catch(f2, ((Float)((rhm_3)t).id_throws[17]).floatValue(), ((Float)((rhm_3)t).id_throws[15]).floatValue()) - 90.0f));
        ml_1.id_class(rje_3.id_case.id_byte(rfU_2.id_catch(f2, ((Float)((rhm_3)t).id_throws[18]).floatValue(), ((Float)((rhm_3)t).id_throws[16]).floatValue())));
        boolean bl = false;
        float f3 = 0.0f;
        float f4 = 0.5f;
        float f5 = 0.0f;
        float f6 = 0.15625f;
        float f7 = 0.0f;
        float f8 = 0.15625f;
        float f9 = 0.15625f;
        float f10 = 0.3125f;
        float f11 = 0.05625f;
        float f12 = (float)((rhm_3)t).id_catch - f2;
        if (f12 > 0.0f) {
            float f13 = -rfU_2.id_class(f12 * 3.0f) * f12;
            ml_1.id_class(rje_3.id_case.id_byte(f13));
        }
        ml_1.id_class(rje_3.id_break.id_byte(45.0f));
        ml_1.id_class(0.05625f, 0.05625f, 0.05625f);
        ml_1.id_class(-4.0, 0.0, 0.0);
        Ok_1 ok_1 = hx_1.getBuffer(HU.id_byte(this.id_class(t)));
        MH mH = ml_1.id_byte();
        rjV_2 rjV_22 = mH.id_class();
        rjj_3 rjj_32 = mH.id_break();
        this.id_class(rjV_22, rjj_32, ok_1, -7, -2, -2, 0.0f, 0.15625f, -1, 0, 0, n);
        this.id_class(rjV_22, rjj_32, ok_1, -7, -2, 2, 0.15625f, 0.15625f, -1, 0, 0, n);
        this.id_class(rjV_22, rjj_32, ok_1, -7, 2, 2, 0.15625f, 0.3125f, -1, 0, 0, n);
        this.id_class(rjV_22, rjj_32, ok_1, -7, 2, -2, 0.0f, 0.3125f, -1, 0, 0, n);
        this.id_class(rjV_22, rjj_32, ok_1, -7, 2, -2, 0.0f, 0.15625f, 1, 0, 0, n);
        this.id_class(rjV_22, rjj_32, ok_1, -7, 2, 2, 0.15625f, 0.15625f, 1, 0, 0, n);
        this.id_class(rjV_22, rjj_32, ok_1, -7, -2, 2, 0.15625f, 0.3125f, 1, 0, 0, n);
        this.id_class(rjV_22, rjj_32, ok_1, -7, -2, -2, 0.0f, 0.3125f, 1, 0, 0, n);
        for (int i = 0; i < 4; ++i) {
            ml_1.id_class(rje_3.id_break.id_byte(90.0f));
            this.id_class(rjV_22, rjj_32, ok_1, -8, -2, 0, 0.0f, 0.0f, 0, 1, 0, n);
            this.id_class(rjV_22, rjj_32, ok_1, 8, -2, 0, 0.5f, 0.0f, 0, 1, 0, n);
            this.id_class(rjV_22, rjj_32, ok_1, 8, 2, 0, 0.5f, 0.15625f, 0, 1, 0, n);
            this.id_class(rjV_22, rjj_32, ok_1, -8, 2, 0, 0.0f, 0.15625f, 0, 1, 0, n);
        }
        ml_1.id_break();
        super.id_class(t, f, f2, ml_1, hx_1, n);
    }
}

