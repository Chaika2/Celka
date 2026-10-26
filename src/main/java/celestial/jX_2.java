/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hx_1;
import celestial.Ig_1;
import celestial.JD;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.QY;
import celestial.Qr_1;
import celestial.Qw_1;
import celestial.an_3;
import celestial.cm_3;
import celestial.fN_2;
import celestial.jJ_2;
import celestial.jW_2;
import celestial.jz_3;
import celestial.lp_3;
import celestial.rfH_2;
import celestial.rgS_2;
import celestial.rje_3;
import celestial.rpl_3;
import celestial.rrbN_2;
import celestial.rrbb_3;
import celestial.rrdZ;
import celestial.ryS_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.zM_2;
import celestial.zj_3;
import java.util.List;

public class jX_2
extends jW_2<ryS_2> {
    private final jJ_2 id_class = new jJ_2();
    private static double id_break = 4096.0;

    public jX_2(jz_3 jz_32) {
        super(jz_32);
    }

    public static void id_class() {
        QY qY = QY.id_instanceof();
        double d = rrbb_3.id_class(((Qw_1)qY.id_class[20]).U, 1.0, 120.0);
        double d2 = Math.max(1.5 * (double)qY.id_else().id_continue() / d, 16.0);
        id_break = d2 * d2;
    }

    @Override
    public void id_class(ryS_2 ryS_22, float f, Ml_1 ml_1, Hx_1 hx_1, int n, int n2) {
        xc_3 xc_32 = ryS_22.id_abstract();
        ml_1.id_class();
        float f2 = 0.6666667f;
        if (xc_32.id_break() instanceof zM_2) {
            ml_1.id_class(0.5, 0.5, 0.5);
            var9_9 = -((float)(xc_32.id_byte(zM_2.id_package) * 360) / 16.0f);
            ml_1.id_class(rje_3.id_protected.id_byte(var9_9));
            this.id_class.id_break.id_finally = true;
        } else {
            ml_1.id_class(0.5, 0.5, 0.5);
            var9_9 = -xc_32.id_byte(zj_3.id_package).id_package();
            ml_1.id_class(rje_3.id_protected.id_byte(var9_9));
            ml_1.id_class(0.0, -0.3125, -0.4375);
            this.id_class.id_break.id_finally = false;
        }
        ml_1.id_class();
        ml_1.id_class(0.6666667f, -0.6666667f, -0.6666667f);
        Ig_1 ig_1 = jX_2.id_class(xc_32.id_break());
        Ok_1 ok_1 = ig_1.id_class(hx_1, this.id_class::id_class);
        this.id_class.id_class.id_class(ml_1, ok_1, n, n2);
        this.id_class.id_break.id_class(ml_1, ok_1, n, n2);
        ml_1.id_break();
        if (jX_2.id_class(ryS_22)) {
            cm_3 cm_32 = this.id_catch.id_class();
            float f3 = 0.010416667f;
            ml_1.id_class(0.0, 0.3333333432674408, 0.046666666865348816);
            ml_1.id_class(0.010416667f, -0.010416667f, 0.010416667f);
            int n3 = ryS_22.id_private().id_catch();
            if (rrbb_3.K()) {
                n3 = rrbN_2.id_byte(n3);
            }
            double d = 0.4;
            int n4 = (int)((double)fN_2.id_break(n3) * 0.4);
            int n5 = (int)((double)fN_2.id_byte(n3) * 0.4);
            int n6 = (int)((double)fN_2.id_protected(n3) * 0.4);
            int n7 = fN_2.id_class(0, n6, n5, n4);
            int n8 = 20;
            for (int i = 0; i < 4; ++i) {
                rpl_3 rpl_32 = ryS_22.id_class(i, rgP_22 -> {
                    List<rpl_3> list = cm_32.id_break((rgS_2)rgP_22, 90);
                    return list.isEmpty() ? rpl_3.id_class : list.get(0);
                });
                if (rpl_32 == null) continue;
                float f4 = -cm_32.id_class(rpl_32) / 2;
                cm_32.id_class(rpl_32, f4, (float)(i * 10 - 20), n7, false, ml_1.id_byte().id_class(), hx_1, false, 0, n);
            }
        }
        ml_1.id_break();
    }

    private static boolean id_class(ryS_2 ryS_22) {
        if (rrdZ.id_new) {
            return false;
        }
        if (!rrbb_3.id_package) {
            rfH_2 rfH_22 = ryS_22.id_char();
            an_3 an_32 = QY.id_instanceof().id_catch();
            double d = an_32.id_class((double)rfH_22.b_(), (double)rfH_22.c_(), (double)rfH_22.d_());
            if (d > id_break) {
                return false;
            }
        }
        return true;
    }

    public static Ig_1 id_class(xd_3 xd_32) {
        Qr_1 qr_1 = xd_32 instanceof JD ? ((JD)xd_32).id_break() : Qr_1.id_class;
        return lp_3.id_implements.get(qr_1);
    }
}

