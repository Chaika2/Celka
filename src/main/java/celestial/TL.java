/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.Hx_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.Tf_1;
import celestial.cG_2;
import celestial.qE_2;
import celestial.qd_3;
import celestial.rfU_2;
import celestial.rje_3;
import celestial.wh_3;

public class TL
extends Tf_1<cG_2, wh_3<cG_2>> {
    public TL(qE_2<cG_2, wh_3<cG_2>> qE_22) {
        super(qE_22);
    }

    @Override
    public void id_class(Ml_1 ml_1, Hx_1 hx_1, int n, cG_2 cG_22, float f, float f2, float f3, float f4, float f5, float f6) {
        if ("deadmau5".equals(cG_22.g().getString()) && cG_22.id_finally() && !cG_22.Pp()) {
            Ok_1 ok_1 = hx_1.getBuffer(HU.id_break(cG_22.id_final()));
            int n2 = qd_3.id_byte(cG_22, 0.0f);
            for (int i = 0; i < 2; ++i) {
                float f7 = rfU_2.id_catch(f3, ((Float)cG_22.id_throws[17]).floatValue(), ((Float)cG_22.id_throws[15]).floatValue()) - rfU_2.id_catch(f3, ((Float)cG_22.id_private[24]).floatValue(), ((Float)cG_22.id_private[23]).floatValue());
                float f8 = rfU_2.id_catch(f3, ((Float)cG_22.id_throws[18]).floatValue(), ((Float)cG_22.id_throws[16]).floatValue());
                ml_1.id_class();
                ml_1.id_class(rje_3.id_protected.id_byte(f7));
                ml_1.id_class(rje_3.id_break.id_byte(f8));
                ml_1.id_class((double)(0.375f * (float)(i * 2 - 1)), 0.0, 0.0);
                ml_1.id_class(0.0, -0.375, 0.0);
                ml_1.id_class(rje_3.id_break.id_byte(-f8));
                ml_1.id_class(rje_3.id_protected.id_byte(-f7));
                float f9 = 1.3333334f;
                ml_1.id_class(1.3333334f, 1.3333334f, 1.3333334f);
                ((wh_3)this.id_byte()).id_class(ml_1, ok_1, n, n2);
                ml_1.id_break();
            }
        }
    }
}

