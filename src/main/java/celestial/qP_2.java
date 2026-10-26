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
import celestial.iB_2;
import celestial.pg_3;
import celestial.qc_3;
import celestial.rEI;
import celestial.rYB;
import celestial.rfU_2;
import celestial.rfl_3;
import celestial.rjU_2;
import celestial.rjV_2;
import celestial.rje_3;
import celestial.rjj_3;
import celestial.rqO_2;
import celestial.tf_3;
import celestial.yt_3;

public class qP_2
extends qc_3<rEI, tf_3> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/guardian.png");
    private static final rqO_2 id_package = new rqO_2("textures/entity/guardian_beam.png");
    private static final HU id_int = HU.id_protected(id_package);

    public qP_2(pg_3 pg_32) {
        this(pg_32, 0.5f);
    }

    protected qP_2(pg_3 pg_32, float f) {
        super(pg_32, new tf_3(), f);
    }

    private rjU_2 id_class(iB_2 iB_22, double d, float f) {
        double d2 = rfU_2.id_protected((double)f, (Double)iB_22.id_throws[34], iB_22.rx());
        double d3 = rfU_2.id_protected((double)f, (Double)iB_22.id_throws[35], iB_22.re()) + d;
        double d4 = rfU_2.id_protected((double)f, (Double)iB_22.id_throws[36], iB_22.BO());
        return new rjU_2(d2, d3, d4);
    }

    @Override
    public void id_class(rEI rEI2, float f, float f2, Ml_1 ml_1, Hx_1 hx_1, int n) {
        super.id_class(rEI2, f, f2, ml_1, hx_1, n);
        iB_2 iB_22 = rEI2.sW();
        if (iB_22 != null) {
            float f3 = rEI2.id_char(f2);
            float f4 = (float)((rYB)rEI2.id_throws[7]).r() + f2;
            float f5 = f4 * 0.5f % 1.0f;
            float f6 = rEI2.Bx();
            ml_1.id_class();
            ml_1.id_class(0.0, (double)f6, 0.0);
            rjU_2 rjU_22 = this.id_class(iB_22, (double)iB_22.Bm() * 0.5, f2);
            rjU_2 rjU_23 = this.id_class(rEI2, f6, f2);
            rjU_2 rjU_24 = rjU_22.id_protected(rjU_23);
            float f7 = (float)(rjU_24.id_case() + 1.0);
            rjU_24 = rjU_24.id_protected();
            float f8 = (float)Math.acos(rjU_24.id_byte);
            float f9 = (float)Math.atan2(rjU_24.id_protected, rjU_24.id_break);
            ml_1.id_class(rje_3.id_protected.id_byte((1.5707964f - f9) * 57.295776f));
            ml_1.id_class(rje_3.id_break.id_byte(f8 * 57.295776f));
            boolean bl = true;
            float f10 = f4 * 0.05f * -1.5f;
            float f11 = f3 * f3;
            int n2 = 64 + (int)(f11 * 191.0f);
            int n3 = 32 + (int)(f11 * 191.0f);
            int n4 = 128 - (int)(f11 * 64.0f);
            float f12 = 0.2f;
            float f13 = 0.282f;
            float f14 = rfU_2.id_break(f10 + 2.3561945f) * 0.282f;
            float f15 = rfU_2.id_class(f10 + 2.3561945f) * 0.282f;
            float f16 = rfU_2.id_break(f10 + 0.7853982f) * 0.282f;
            float f17 = rfU_2.id_class(f10 + 0.7853982f) * 0.282f;
            float f18 = rfU_2.id_break(f10 + 3.926991f) * 0.282f;
            float f19 = rfU_2.id_class(f10 + 3.926991f) * 0.282f;
            float f20 = rfU_2.id_break(f10 + 5.4977875f) * 0.282f;
            float f21 = rfU_2.id_class(f10 + 5.4977875f) * 0.282f;
            float f22 = rfU_2.id_break(f10 + (float)Math.PI) * 0.2f;
            float f23 = rfU_2.id_class(f10 + (float)Math.PI) * 0.2f;
            float f24 = rfU_2.id_break(f10 + 0.0f) * 0.2f;
            float f25 = rfU_2.id_class(f10 + 0.0f) * 0.2f;
            float f26 = rfU_2.id_break(f10 + 1.5707964f) * 0.2f;
            float f27 = rfU_2.id_class(f10 + 1.5707964f) * 0.2f;
            float f28 = rfU_2.id_break(f10 + 4.712389f) * 0.2f;
            float f29 = rfU_2.id_class(f10 + 4.712389f) * 0.2f;
            float f30 = 0.0f;
            float f31 = 0.4999f;
            float f32 = -1.0f + f5;
            float f33 = f7 * 2.5f + f32;
            Ok_1 ok_1 = hx_1.getBuffer(id_int);
            MH mH = ml_1.id_byte();
            rjV_2 rjV_22 = mH.id_class();
            rjj_3 rjj_32 = mH.id_break();
            qP_2.id_class(ok_1, rjV_22, rjj_32, f22, f7, f23, n2, n3, n4, 0.4999f, f33);
            qP_2.id_class(ok_1, rjV_22, rjj_32, f22, 0.0f, f23, n2, n3, n4, 0.4999f, f32);
            qP_2.id_class(ok_1, rjV_22, rjj_32, f24, 0.0f, f25, n2, n3, n4, 0.0f, f32);
            qP_2.id_class(ok_1, rjV_22, rjj_32, f24, f7, f25, n2, n3, n4, 0.0f, f33);
            qP_2.id_class(ok_1, rjV_22, rjj_32, f26, f7, f27, n2, n3, n4, 0.4999f, f33);
            qP_2.id_class(ok_1, rjV_22, rjj_32, f26, 0.0f, f27, n2, n3, n4, 0.4999f, f32);
            qP_2.id_class(ok_1, rjV_22, rjj_32, f28, 0.0f, f29, n2, n3, n4, 0.0f, f32);
            qP_2.id_class(ok_1, rjV_22, rjj_32, f28, f7, f29, n2, n3, n4, 0.0f, f33);
            float f34 = 0.0f;
            if ((Integer)rEI2.id_throws[41] % 2 == 0) {
                f34 = 0.5f;
            }
            qP_2.id_class(ok_1, rjV_22, rjj_32, f14, f7, f15, n2, n3, n4, 0.5f, f34 + 0.5f);
            qP_2.id_class(ok_1, rjV_22, rjj_32, f16, f7, f17, n2, n3, n4, 1.0f, f34 + 0.5f);
            qP_2.id_class(ok_1, rjV_22, rjj_32, f20, f7, f21, n2, n3, n4, 1.0f, f34);
            qP_2.id_class(ok_1, rjV_22, rjj_32, f18, f7, f19, n2, n3, n4, 0.5f, f34);
            ml_1.id_break();
        }
    }

    private static void id_class(Ok_1 ok_1, rjV_2 rjV_22, rjj_3 rjj_32, float f, float f2, float f3, int n, int n2, int n3, float f4, float f5) {
        ok_1.id_class(rjV_22, f, f2, f3).id_break(n, n2, n3, 255).id_class(f4, f5).id_byte(fZ_2.id_class).id_break(0xF000F0).id_class(rjj_32, 0.0f, 1.0f, 0.0f).id_class();
    }

    @Override
    public rqO_2 id_class(rEI rEI2) {
        return id_class;
    }

    @Override
    public boolean id_class(rEI rEI2, yt_3 yt_32, double d, double d2, double d3) {
        iB_2 iB_22;
        if (super.id_class(rEI2, yt_32, d, d2, d3)) {
            return true;
        }
        if (rEI2.sk() && (iB_22 = rEI2.sW()) != null) {
            rjU_2 rjU_22 = this.id_class(iB_22, (double)iB_22.Bm() * 0.5, 1.0f);
            rjU_2 rjU_23 = this.id_class(rEI2, rEI2.Bx(), 1.0f);
            return yt_32.id_class(new rfl_3(rjU_23.id_break, rjU_23.id_byte, rjU_23.id_protected, rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected));
        }
        return false;
    }
}

