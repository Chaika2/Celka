/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hx_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.QY;
import celestial.an_3;
import celestial.fZ_2;
import celestial.pV_2;
import celestial.pg_3;
import celestial.rfU_2;
import celestial.rjU_2;
import celestial.rje_3;
import celestial.rqO_2;
import celestial.rsJ_2;
import celestial.tp_3;
import celestial.wr_3;
import celestial.xN_2;
import celestial.xc_3;

public class qN_2<T extends rsJ_2>
extends pV_2<T> {
    private static final rqO_2 id_throws = new rqO_2("textures/entity/minecart.png");
    protected final tp_3<T> id_class = new wr_3();

    public qN_2(pg_3 pg_32) {
        super(pg_32);
        this.id_byte = 0.7f;
    }

    protected void id_class(T t, float f, xc_3 xc_32, Ml_1 ml_1, Hx_1 hx_1, int n) {
        QY.id_instanceof().id_synchronized().id_class(xc_32, ml_1, hx_1, n, fZ_2.id_class);
    }

    @Override
    public void id_class(T t, float f, float f2, Ml_1 ml_1, Hx_1 hx_1, int n) {
        super.id_class(t, f, f2, ml_1, hx_1, n);
        ml_1.id_class();
        long l = (long)((an_3)t).V() * 493286711L;
        l = l * l * 4392167121L + l * 98761L;
        float f3 = (((float)(l >> 16 & 7L) + 0.5f) / 8.0f - 0.5f) * 0.004f;
        float f4 = (((float)(l >> 20 & 7L) + 0.5f) / 8.0f - 0.5f) * 0.004f;
        float f5 = (((float)(l >> 24 & 7L) + 0.5f) / 8.0f - 0.5f) * 0.004f;
        ml_1.id_class((double)f3, (double)f4, (double)f5);
        double d = rfU_2.id_protected((double)f2, (Double)((rsJ_2)t).id_throws[34], ((an_3)t).rx());
        double d2 = rfU_2.id_protected((double)f2, (Double)((rsJ_2)t).id_throws[35], ((an_3)t).re());
        double d3 = rfU_2.id_protected((double)f2, (Double)((rsJ_2)t).id_throws[36], ((an_3)t).BO());
        double d4 = 0.3f;
        rjU_2 rjU_22 = ((rsJ_2)t).id_continue(d, d2, d3);
        float f6 = rfU_2.id_catch(f2, ((Float)((rsJ_2)t).id_throws[18]).floatValue(), ((Float)((rsJ_2)t).id_throws[16]).floatValue());
        if (rjU_22 != null) {
            rjU_2 rjU_23 = ((rsJ_2)t).id_class(d, d2, d3, (double)0.3f);
            rjU_2 rjU_24 = ((rsJ_2)t).id_class(d, d2, d3, (double)-0.3f);
            if (rjU_23 == null) {
                rjU_23 = rjU_22;
            }
            if (rjU_24 == null) {
                rjU_24 = rjU_22;
            }
            ml_1.id_class(rjU_22.id_break - d, (rjU_23.id_byte + rjU_24.id_byte) / 2.0 - d2, rjU_22.id_protected - d3);
            rjU_2 rjU_25 = rjU_24.id_break(-rjU_23.id_break, -rjU_23.id_byte, -rjU_23.id_protected);
            if (rjU_25.id_case() != 0.0) {
                rjU_25 = rjU_25.id_protected();
                f = (float)(Math.atan2(rjU_25.id_protected, rjU_25.id_break) * 180.0 / Math.PI);
                f6 = (float)(Math.atan(rjU_25.id_byte) * 73.0);
            }
        }
        ml_1.id_class(0.0, 0.375, 0.0);
        ml_1.id_class(rje_3.id_protected.id_byte(180.0f - f));
        ml_1.id_class(rje_3.id_case.id_byte(-f6));
        float f7 = (float)((rsJ_2)t).id_private() - f2;
        float f8 = ((rsJ_2)t).id_catch() - f2;
        if (f8 < 0.0f) {
            f8 = 0.0f;
        }
        if (f7 > 0.0f) {
            ml_1.id_class(rje_3.id_break.id_byte(rfU_2.id_class(f7) * f7 * f8 / 10.0f * (float)((rsJ_2)t).id_implements()));
        }
        int n2 = ((rsJ_2)t).id_new();
        xc_3 xc_32 = ((rsJ_2)t).id_package();
        if (xc_32.id_private() != xN_2.INVISIBLE) {
            ml_1.id_class();
            float f9 = 0.75f;
            ml_1.id_class(0.75f, 0.75f, 0.75f);
            ml_1.id_class(-0.5, (double)((float)(n2 - 8) / 16.0f), 0.5);
            ml_1.id_class(rje_3.id_protected.id_byte(90.0f));
            this.id_class(t, f2, xc_32, ml_1, hx_1, n);
            ml_1.id_break();
        }
        ml_1.id_class(-1.0f, -1.0f, 1.0f);
        this.id_class.id_class(t, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f);
        Ok_1 ok_1 = hx_1.getBuffer(this.id_class.id_class(this.id_class(t)));
        this.id_class.id_class(ml_1, ok_1, n, fZ_2.id_class, 1.0f, 1.0f, 1.0f, 1.0f);
        ml_1.id_break();
    }

    @Override
    public rqO_2 id_class(T t) {
        return id_throws;
    }
}

