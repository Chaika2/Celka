/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HQ;
import celestial.HU;
import celestial.Hx_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.an_3;
import celestial.iB_2;
import celestial.is_3;
import celestial.pg_3;
import celestial.qd_3;
import celestial.rRo_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rjU_2;
import celestial.rjV_2;
import celestial.rrbb_3;
import celestial.rrdZ;
import celestial.tp_3;
import celestial.yt_3;

public abstract class qc_3<T extends is_3, M extends tp_3<T>>
extends qd_3<T, M> {
    public qc_3(pg_3 pg_32, M m, float f) {
        super(pg_32, m, f);
    }

    public static void id_class(Ok_1 ok_1, rjV_2 rjV_22, int n, float f, float f2, float f3, float f4, float f5, int n2, int n3, boolean bl, float f6, float f7) {
        float f8 = 0.5f;
        float f9 = 0.4f;
        float f10 = 0.3f;
        if (n3 % 2 == 0) {
            f8 *= 0.7f;
            f9 *= 0.7f;
            f10 *= 0.7f;
        }
        float f11 = (float)n3 / (float)n2;
        float f12 = f * f11;
        float f13 = f2 > 0.0f ? f2 * f11 * f11 : f2 - f2 * (1.0f - f11) * (1.0f - f11);
        float f14 = f3 * f11;
        if (!bl) {
            ok_1.id_class(rjV_22, f12 + f6, f13 + f4 - f5, f14 - f7).id_class(f8, f9, f10, 1.0f).id_break(n).id_class();
        }
        ok_1.id_class(rjV_22, f12 - f6, f13 + f5, f14 + f7).id_class(f8, f9, f10, 1.0f).id_break(n).id_class();
        if (bl) {
            ok_1.id_class(rjV_22, f12 + f6, f13 + f4 - f5, f14 - f7).id_class(f8, f9, f10, 1.0f).id_break(n).id_class();
        }
    }

    public static void id_class(Ok_1 ok_1, rjV_2 rjV_22, float f, float f2, float f3, int n, int n2, int n3, int n4, float f4, float f5, float f6, float f7) {
        int n5 = 24;
        for (int i = 0; i < 24; ++i) {
            float f8 = (float)i / 23.0f;
            int n6 = (int)rfU_2.id_catch(f8, n, n2);
            int n7 = (int)rfU_2.id_catch(f8, n3, n4);
            int n8 = HQ.id_class(n6, n7);
            qc_3.id_class(ok_1, rjV_22, n8, f, f2, f3, f4, f5, 24, i, false, f6, f7);
            qc_3.id_class(ok_1, rjV_22, n8, f, f2, f3, f4, f5, 24, i + 1, true, f6, f7);
        }
    }

    @Override
    public boolean id_class(T t, yt_3 yt_32, double d, double d2, double d3) {
        if (super.id_class(t, yt_32, d, d2, d3)) {
            return true;
        }
        an_3 an_32 = ((is_3)t).N();
        return an_32 != null ? yt_32.id_class(an_32.PE()) : false;
    }

    @Override
    public void id_class(T t, float f, float f2, Ml_1 ml_1, Hx_1 hx_1, int n) {
        super.id_class(t, f, f2, ml_1, hx_1, n);
        an_3 an_32 = ((is_3)t).N();
        if (an_32 != null) {
            this.id_class(t, f2, ml_1, hx_1, an_32);
        }
    }

    private <E extends an_3> void id_class(T t, float f, Ml_1 ml_1, Hx_1 hx_1, E e) {
        if (!rrbb_3.rs() || !rrdZ.id_new) {
            ml_1.id_class();
            rjU_2 rjU_22 = e.id_class(f);
            double d = (double)(rfU_2.id_catch(f, ((Float)((is_3)t).id_private[23]).floatValue(), ((Float)((is_3)t).id_private[24]).floatValue()) * ((float)Math.PI / 180)) + 1.5707963267948966;
            rjU_2 rjU_23 = ((an_3)t).BA();
            double d2 = Math.cos(d) * rjU_23.id_protected + Math.sin(d) * rjU_23.id_break;
            double d3 = Math.sin(d) * rjU_23.id_protected - Math.cos(d) * rjU_23.id_break;
            double d4 = rfU_2.id_protected((double)f, (Double)((is_3)t).id_throws[8], ((an_3)t).rx()) + d2;
            double d5 = rfU_2.id_protected((double)f, (Double)((is_3)t).id_throws[9], ((an_3)t).re()) + rjU_23.id_byte;
            double d6 = rfU_2.id_protected((double)f, (Double)((is_3)t).id_throws[10], ((an_3)t).BO()) + d3;
            ml_1.id_class(d2, rjU_23.id_byte, d3);
            float f2 = (float)(rjU_22.id_break - d4);
            float f3 = (float)(rjU_22.id_byte - d5);
            float f4 = (float)(rjU_22.id_protected - d6);
            float f5 = 0.025f;
            Ok_1 ok_1 = hx_1.getBuffer(HU.id_native());
            rjV_2 rjV_22 = ml_1.id_byte().id_class();
            float f6 = rfU_2.id_implements(f2 * f2 + f4 * f4) * 0.025f / 2.0f;
            float f7 = f4 * f6;
            float f8 = f2 * f6;
            rfH_2 rfH_22 = new rfH_2(((an_3)t).id_new(f));
            rfH_2 rfH_23 = new rfH_2(e.id_new(f));
            int n = this.id_class(t, rfH_22);
            int n2 = this.id_break.id_class(e).id_class(e, rfH_23);
            int n3 = ((rYB)((is_3)t).id_throws[7]).id_class(rRo_1.SKY, rfH_22);
            int n4 = ((rYB)((is_3)t).id_throws[7]).id_class(rRo_1.SKY, rfH_23);
            if (rrbb_3.rs()) {
                rrdZ.Z();
            }
            qc_3.id_class(ok_1, rjV_22, f2, f3, f4, n, n2, n3, n4, 0.025f, 0.025f, f7, f8);
            qc_3.id_class(ok_1, rjV_22, f2, f3, f4, n, n2, n3, n4, 0.025f, 0.0f, f7, f8);
            if (rrbb_3.rs()) {
                rrdZ.v();
            }
            ml_1.id_break();
        }
    }

    @Override
    protected boolean id_break(T t) {
        return super.id_break(t) && (((iB_2)t).rJ() || ((an_3)t).Bk() && t == this.id_break.id_byte);
    }
}

