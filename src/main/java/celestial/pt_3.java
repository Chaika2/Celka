/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.Hx_1;
import celestial.Iq_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.fZ_2;
import celestial.pV_2;
import celestial.pg_3;
import celestial.pw_3;
import celestial.rSa_1;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rjY_2;
import celestial.rje_3;
import celestial.rqO_2;
import celestial.yt_3;

public class pt_3
extends pV_2<rSa_1> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/end_crystal/end_crystal.png");
    private static final HU id_throws = HU.id_protected(id_class);
    private static final float id_case = (float)Math.sin(0.7853981633974483);
    private final Iq_1 id_catch;
    private final Iq_1 id_private;
    private final Iq_1 id_implements;

    public pt_3(pg_3 pg_32) {
        super(pg_32);
        this.id_byte = 0.5f;
        this.id_private = new Iq_1(64, 32, 0, 0);
        this.id_private.id_class(-4.0f, -4.0f, -4.0f, 8.0f, 8.0f, 8.0f);
        this.id_catch = new Iq_1(64, 32, 32, 0);
        this.id_catch.id_class(-4.0f, -4.0f, -4.0f, 8.0f, 8.0f, 8.0f);
        this.id_implements = new Iq_1(64, 32, 0, 16);
        this.id_implements.id_class(-6.0f, 0.0f, -6.0f, 12.0f, 4.0f, 12.0f);
    }

    @Override
    public boolean id_class(rSa_1 rSa_12, yt_3 yt_32, double d, double d2, double d3) {
        return super.id_class(rSa_12, yt_32, d, d2, d3) || rSa_12.id_protected() != null;
    }

    @Override
    public void id_class(rSa_1 rSa_12, float f, float f2, Ml_1 ml_1, Hx_1 hx_1, int n) {
        ml_1.id_class();
        float f3 = pt_3.id_class(rSa_12, f2);
        float f4 = ((float)rSa_12.id_class + f2) * 3.0f;
        Ok_1 ok_1 = hx_1.getBuffer(id_throws);
        ml_1.id_class();
        ml_1.id_class(2.0f, 2.0f, 2.0f);
        ml_1.id_class(0.0, -0.5, 0.0);
        int n2 = fZ_2.id_class;
        if (rSa_12.id_throws()) {
            this.id_implements.id_class(ml_1, ok_1, n, n2);
        }
        ml_1.id_class(rje_3.id_protected.id_byte(f4));
        ml_1.id_class(0.0, (double)(1.5f + f3 / 2.0f), 0.0);
        ml_1.id_class(new rjY_2(new rje_3(id_case, 0.0f, id_case), 60.0f, true));
        this.id_private.id_class(ml_1, ok_1, n, n2);
        float f5 = 0.875f;
        ml_1.id_class(0.875f, 0.875f, 0.875f);
        ml_1.id_class(new rjY_2(new rje_3(id_case, 0.0f, id_case), 60.0f, true));
        ml_1.id_class(rje_3.id_protected.id_byte(f4));
        this.id_private.id_class(ml_1, ok_1, n, n2);
        ml_1.id_class(0.875f, 0.875f, 0.875f);
        ml_1.id_class(new rjY_2(new rje_3(id_case, 0.0f, id_case), 60.0f, true));
        ml_1.id_class(rje_3.id_protected.id_byte(f4));
        this.id_catch.id_class(ml_1, ok_1, n, n2);
        ml_1.id_break();
        ml_1.id_break();
        rfH_2 rfH_22 = rSa_12.id_protected();
        if (rfH_22 != null) {
            float f6 = (float)rfH_22.b_() + 0.5f;
            float f7 = (float)rfH_22.c_() + 0.5f;
            float f8 = (float)rfH_22.d_() + 0.5f;
            float f9 = (float)((double)f6 - rSa_12.rx());
            float f10 = (float)((double)f7 - rSa_12.re());
            float f11 = (float)((double)f8 - rSa_12.BO());
            ml_1.id_class((double)f9, (double)f10, (double)f11);
            pw_3.id_class(-f9, -f10 + f3, -f11, f2, rSa_12.id_class, ml_1, hx_1, n);
        }
        super.id_class(rSa_12, f, f2, ml_1, hx_1, n);
    }

    @Override
    public rqO_2 id_class(rSa_1 rSa_12) {
        return id_class;
    }

    public static float id_class(rSa_1 rSa_12, float f) {
        float f2 = (float)rSa_12.id_class + f;
        float f3 = rfU_2.id_class(f2 * 0.2f) / 2.0f + 0.5f;
        f3 = (f3 * f3 + f3) * 0.4f;
        return f3 - 1.4f;
    }
}

