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
import celestial.fZ_2;
import celestial.fj_3;
import celestial.fv_3;
import celestial.pV_2;
import celestial.pg_3;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rjV_2;
import celestial.rje_3;
import celestial.rjj_3;
import celestial.rpr_3;
import celestial.rqO_2;
import celestial.rsO_2;
import celestial.rsh_3;
import celestial.yX_2;

public class qZ_2
extends pV_2<rsO_2> {
    public qZ_2(pg_3 pg_32) {
        super(pg_32);
    }

    private void id_class(rjV_2 rjV_22, rjj_3 rjj_32, Ok_1 ok_1, float f, float f2, float f3, float f4, float f5, int n, int n2, int n3, int n4) {
        ok_1.id_class(rjV_22, f, f2, f5).id_break(255, 255, 255, 255).id_class(f3, f4).id_byte(fZ_2.id_class).id_break(n4).id_class(rjj_32, (float)n, (float)n2, (float)n3).id_class();
    }

    private void id_class(Ml_1 ml_1, Ok_1 ok_1, rsO_2 rsO_22, int n, int n2, fj_3 fj_32, fj_3 fj_33) {
        MH mH = ml_1.id_byte();
        rjV_2 rjV_22 = mH.id_class();
        rjj_3 rjj_32 = mH.id_break();
        float f = (float)(-n) / 2.0f;
        float f2 = (float)(-n2) / 2.0f;
        float f3 = 0.5f;
        float f4 = fj_33.id_case();
        float f5 = fj_33.id_catch();
        float f6 = fj_33.id_private();
        float f7 = fj_33.id_implements();
        float f8 = fj_33.id_case();
        float f9 = fj_33.id_catch();
        float f10 = fj_33.id_private();
        float f11 = fj_33.id_break(1.0);
        float f12 = fj_33.id_case();
        float f13 = fj_33.id_class(1.0);
        float f14 = fj_33.id_private();
        float f15 = fj_33.id_implements();
        int n3 = n / 16;
        int n4 = n2 / 16;
        double d = 16.0 / (double)n3;
        double d2 = 16.0 / (double)n4;
        for (int i = 0; i < n3; ++i) {
            for (int j = 0; j < n4; ++j) {
                float f16 = f + (float)((i + 1) * 16);
                float f17 = f + (float)(i * 16);
                float f18 = f2 + (float)((j + 1) * 16);
                float f19 = f2 + (float)(j * 16);
                int n5 = rfU_2.id_byte(rsO_22.rx());
                int n6 = rfU_2.id_byte(rsO_22.re() + (double)((f18 + f19) / 2.0f / 16.0f));
                int n7 = rfU_2.id_byte(rsO_22.BO());
                rpr_3 rpr_32 = rsO_22.Pg();
                if (rpr_32 == rpr_3.NORTH) {
                    n5 = rfU_2.id_byte(rsO_22.rx() + (double)((f16 + f17) / 2.0f / 16.0f));
                }
                if (rpr_32 == rpr_3.WEST) {
                    n7 = rfU_2.id_byte(rsO_22.BO() - (double)((f16 + f17) / 2.0f / 16.0f));
                }
                if (rpr_32 == rpr_3.SOUTH) {
                    n5 = rfU_2.id_byte(rsO_22.rx() - (double)((f16 + f17) / 2.0f / 16.0f));
                }
                if (rpr_32 == rpr_3.EAST) {
                    n7 = rfU_2.id_byte(rsO_22.BO() + (double)((f16 + f17) / 2.0f / 16.0f));
                }
                int n8 = yX_2.id_class((rYB)rsO_22.id_throws[7], new rfH_2(n5, n6, n7));
                float f20 = fj_32.id_class(d * (double)(n3 - i));
                float f21 = fj_32.id_class(d * (double)(n3 - (i + 1)));
                float f22 = fj_32.id_break(d2 * (double)(n4 - j));
                float f23 = fj_32.id_break(d2 * (double)(n4 - (j + 1)));
                this.id_class(rjV_22, rjj_32, ok_1, f16, f19, f21, f22, -0.5f, 0, 0, -1, n8);
                this.id_class(rjV_22, rjj_32, ok_1, f17, f19, f20, f22, -0.5f, 0, 0, -1, n8);
                this.id_class(rjV_22, rjj_32, ok_1, f17, f18, f20, f23, -0.5f, 0, 0, -1, n8);
                this.id_class(rjV_22, rjj_32, ok_1, f16, f18, f21, f23, -0.5f, 0, 0, -1, n8);
                this.id_class(rjV_22, rjj_32, ok_1, f16, f18, f4, f6, 0.5f, 0, 0, 1, n8);
                this.id_class(rjV_22, rjj_32, ok_1, f17, f18, f5, f6, 0.5f, 0, 0, 1, n8);
                this.id_class(rjV_22, rjj_32, ok_1, f17, f19, f5, f7, 0.5f, 0, 0, 1, n8);
                this.id_class(rjV_22, rjj_32, ok_1, f16, f19, f4, f7, 0.5f, 0, 0, 1, n8);
                this.id_class(rjV_22, rjj_32, ok_1, f16, f18, f8, f10, -0.5f, 0, 1, 0, n8);
                this.id_class(rjV_22, rjj_32, ok_1, f17, f18, f9, f10, -0.5f, 0, 1, 0, n8);
                this.id_class(rjV_22, rjj_32, ok_1, f17, f18, f9, f11, 0.5f, 0, 1, 0, n8);
                this.id_class(rjV_22, rjj_32, ok_1, f16, f18, f8, f11, 0.5f, 0, 1, 0, n8);
                this.id_class(rjV_22, rjj_32, ok_1, f16, f19, f8, f10, 0.5f, 0, -1, 0, n8);
                this.id_class(rjV_22, rjj_32, ok_1, f17, f19, f9, f10, 0.5f, 0, -1, 0, n8);
                this.id_class(rjV_22, rjj_32, ok_1, f17, f19, f9, f11, -0.5f, 0, -1, 0, n8);
                this.id_class(rjV_22, rjj_32, ok_1, f16, f19, f8, f11, -0.5f, 0, -1, 0, n8);
                this.id_class(rjV_22, rjj_32, ok_1, f16, f18, f13, f14, 0.5f, -1, 0, 0, n8);
                this.id_class(rjV_22, rjj_32, ok_1, f16, f19, f13, f15, 0.5f, -1, 0, 0, n8);
                this.id_class(rjV_22, rjj_32, ok_1, f16, f19, f12, f15, -0.5f, -1, 0, 0, n8);
                this.id_class(rjV_22, rjj_32, ok_1, f16, f18, f12, f14, -0.5f, -1, 0, 0, n8);
                this.id_class(rjV_22, rjj_32, ok_1, f17, f18, f13, f14, -0.5f, 1, 0, 0, n8);
                this.id_class(rjV_22, rjj_32, ok_1, f17, f19, f13, f15, -0.5f, 1, 0, 0, n8);
                this.id_class(rjV_22, rjj_32, ok_1, f17, f19, f12, f15, 0.5f, 1, 0, 0, n8);
                this.id_class(rjV_22, rjj_32, ok_1, f17, f18, f12, f14, 0.5f, 1, 0, 0, n8);
            }
        }
    }

    @Override
    public rqO_2 id_class(rsO_2 rsO_22) {
        return QY.id_instanceof().id_boolean().id_byte().id_extends().id_protected();
    }

    @Override
    public void id_class(rsO_2 rsO_22, float f, float f2, Ml_1 ml_1, Hx_1 hx_1, int n) {
        ml_1.id_class();
        ml_1.id_class(rje_3.id_protected.id_byte(180.0f - f));
        rsh_3 rsh_32 = rsO_22.id_catch;
        float f3 = 0.0625f;
        ml_1.id_class(0.0625f, 0.0625f, 0.0625f);
        Ok_1 ok_1 = hx_1.getBuffer(HU.id_break(this.id_class(rsO_22)));
        fv_3 fv_32 = QY.id_instanceof().id_boolean();
        this.id_class(ml_1, ok_1, rsO_22, rsh_32.id_class(), rsh_32.id_break(), fv_32.id_class(rsh_32), fv_32.id_byte());
        ml_1.id_break();
        super.id_class(rsO_22, f, f2, ml_1, hx_1, n);
    }
}

