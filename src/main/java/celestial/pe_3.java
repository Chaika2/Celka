/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.Hx_1;
import celestial.MH;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.QY;
import celestial.cb_3;
import celestial.fZ_2;
import celestial.pV_2;
import celestial.pg_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfU_2;
import celestial.rhd_3;
import celestial.rhp_3;
import celestial.rjU_2;
import celestial.rjV_2;
import celestial.rje_3;
import celestial.rjj_3;
import celestial.rpZ_2;
import celestial.rqO_2;

public class pe_3
extends pV_2<rhp_3> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/fishing_hook.png");
    private static final HU id_throws = HU.id_byte(id_class);

    public pe_3(pg_3 pg_32) {
        super(pg_32);
    }

    @Override
    public rqO_2 id_class(rhp_3 rhp_32) {
        return id_class;
    }

    private static void id_class(float f, float f2, float f3, Ok_1 ok_1, rjV_2 rjV_22, float f4) {
        ok_1.id_class(rjV_22, f * f4, f2 * (f4 * f4 + f4) * 0.5f + 0.25f, f3 * f4).id_break(0, 0, 0, 255).id_class();
    }

    @Override
    public void id_class(rhp_3 rhp_32, float f, float f2, Ml_1 ml_1, Hx_1 hx_1, int n) {
        rhd_3 rhd_32 = rhp_32.id_case();
        if (rhd_32 != null) {
            float f3;
            double d;
            double d2;
            double d3;
            double d4;
            ml_1.id_class();
            ml_1.id_class();
            ml_1.id_class(0.5f, 0.5f, 0.5f);
            ml_1.id_class(this.id_break.id_byte());
            ml_1.id_class(rje_3.id_protected.id_byte(180.0f));
            MH mH = ml_1.id_byte();
            rjV_2 rjV_22 = mH.id_class();
            rjj_3 rjj_32 = mH.id_break();
            Ok_1 ok_1 = hx_1.getBuffer(id_throws);
            pe_3.id_class(ok_1, rjV_22, rjj_32, n, 0.0f, 0, 0, 1);
            pe_3.id_class(ok_1, rjV_22, rjj_32, n, 1.0f, 0, 1, 1);
            pe_3.id_class(ok_1, rjV_22, rjj_32, n, 1.0f, 1, 1, 0);
            pe_3.id_class(ok_1, rjV_22, rjj_32, n, 0.0f, 1, 0, 0);
            ml_1.id_break();
            int n2 = rhd_32.Su() == rpZ_2.RIGHT ? 1 : -1;
            rdn_3 rdn_32 = rhd_32.ss();
            if (rdn_32.id_break() != rdy_3.Xd) {
                n2 = -n2;
            }
            float f4 = rhd_32.id_goto(f2);
            float f5 = rfU_2.id_class(rfU_2.id_byte(f4) * (float)Math.PI);
            float f6 = rfU_2.id_catch(f2, ((Float)rhd_32.id_private[24]).floatValue(), ((Float)rhd_32.id_private[23]).floatValue()) * ((float)Math.PI / 180);
            double d5 = rfU_2.id_class(f6);
            double d6 = rfU_2.id_break(f6);
            double d7 = (double)n2 * 0.35;
            double d8 = 0.8;
            if ((this.id_break.id_protected == null || this.id_break.id_protected.id_volatile().id_class()) && rhd_32 == (cb_3)QY.id_instanceof().id_class[57]) {
                d4 = this.id_break.id_protected.U;
                rjU_2 rjU_22 = new rjU_2((double)n2 * -0.36 * (d4 /= 100.0), -0.045 * d4, 0.4);
                rjU_22 = rjU_22.id_class(-rfU_2.id_catch(f2, ((Float)rhd_32.id_throws[18]).floatValue(), ((Float)rhd_32.id_throws[16]).floatValue()) * ((float)Math.PI / 180));
                rjU_22 = rjU_22.id_break(-rfU_2.id_catch(f2, ((Float)rhd_32.id_throws[17]).floatValue(), ((Float)rhd_32.id_throws[15]).floatValue()) * ((float)Math.PI / 180));
                rjU_22 = rjU_22.id_break(f5 * 0.5f);
                rjU_22 = rjU_22.id_class(-f5 * 0.7f);
                d3 = rfU_2.id_protected((double)f2, (Double)rhd_32.id_throws[8], rhd_32.rx()) + rjU_22.id_break;
                d2 = rfU_2.id_protected((double)f2, (Double)rhd_32.id_throws[9], rhd_32.re()) + rjU_22.id_byte;
                d = rfU_2.id_protected((double)f2, (Double)rhd_32.id_throws[10], rhd_32.BO()) + rjU_22.id_protected;
                f3 = rhd_32.Bx();
            } else {
                d3 = rfU_2.id_protected((double)f2, (Double)rhd_32.id_throws[8], rhd_32.rx()) - d6 * d7 - d5 * 0.8;
                d2 = (Double)rhd_32.id_throws[9] + (double)rhd_32.Bx() + (rhd_32.re() - (Double)rhd_32.id_throws[9]) * (double)f2 - 0.45;
                d = rfU_2.id_protected((double)f2, (Double)rhd_32.id_throws[10], rhd_32.BO()) - d5 * d7 + d6 * 0.8;
                f3 = rhd_32.x() ? -0.1875f : 0.0f;
            }
            d4 = rfU_2.id_protected((double)f2, (Double)rhp_32.id_throws[8], rhp_32.rx());
            double d9 = rfU_2.id_protected((double)f2, (Double)rhp_32.id_throws[9], rhp_32.re()) + 0.25;
            double d10 = rfU_2.id_protected((double)f2, (Double)rhp_32.id_throws[10], rhp_32.BO());
            float f7 = (float)(d3 - d4);
            float f8 = (float)(d2 - d9) + f3;
            float f9 = (float)(d - d10);
            Ok_1 ok_12 = hx_1.getBuffer(HU.id_return());
            rjV_2 rjV_23 = ml_1.id_byte().id_class();
            int n3 = 16;
            for (int i = 0; i < 16; ++i) {
                pe_3.id_class(f7, f8, f9, ok_12, rjV_23, pe_3.id_class(i, 16));
                pe_3.id_class(f7, f8, f9, ok_12, rjV_23, pe_3.id_class(i + 1, 16));
            }
            ml_1.id_break();
            super.id_class(rhp_32, f, f2, ml_1, hx_1, n);
        }
    }

    private static void id_class(Ok_1 ok_1, rjV_2 rjV_22, rjj_3 rjj_32, int n, float f, int n2, int n3, int n4) {
        ok_1.id_class(rjV_22, f - 0.5f, (float)n2 - 0.5f, 0.0f).id_break(255, 255, 255, 255).id_class((float)n3, (float)n4).id_byte(fZ_2.id_class).id_break(n).id_class(rjj_32, 0.0f, 1.0f, 0.0f).id_class();
    }

    private static float id_class(int n, int n2) {
        return (float)n / (float)n2;
    }
}

