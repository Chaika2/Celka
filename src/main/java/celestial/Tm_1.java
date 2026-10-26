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
import celestial.fZ_2;
import celestial.qE_2;
import celestial.rXQ;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfU_2;
import celestial.rhQ_2;
import celestial.rje_3;
import celestial.rrbb_3;
import celestial.wh_3;

public class Tm_1
extends Tf_1<cG_2, wh_3<cG_2>> {
    public Tm_1(qE_2<cG_2, wh_3<cG_2>> qE_22) {
        super(qE_22);
    }

    @Override
    public void id_class(Ml_1 ml_1, Hx_1 hx_1, int n, cG_2 cG_22, float f, float f2, float f3, float f4, float f5, float f6) {
        rdn_3 rdn_32;
        if (cG_22.id_super() && !cG_22.Pp() && cG_22.id_class(rhQ_2.CAPE) && cG_22.id_case() != null && (rdn_32 = cG_22.id_class(rXQ.CHEST)).id_break() != rdy_3.kc) {
            ml_1.id_class();
            ml_1.id_class(0.0, 0.0, 0.125);
            double d = rfU_2.id_protected((double)f3, (Double)cG_22.id_implements[10], (Double)cG_22.id_implements[13]) - rfU_2.id_protected((double)f3, (Double)cG_22.id_throws[8], cG_22.rx());
            double d2 = rfU_2.id_protected((double)f3, (Double)cG_22.id_implements[11], (Double)cG_22.id_implements[14]) - rfU_2.id_protected((double)f3, (Double)cG_22.id_throws[9], cG_22.re());
            double d3 = rfU_2.id_protected((double)f3, (Double)cG_22.id_implements[12], (Double)cG_22.id_implements[15]) - rfU_2.id_protected((double)f3, (Double)cG_22.id_throws[10], cG_22.BO());
            float f7 = ((Float)cG_22.id_private[24]).floatValue() + (((Float)cG_22.id_private[23]).floatValue() - ((Float)cG_22.id_private[24]).floatValue()) * f3;
            double d4 = rfU_2.id_class(f7 * ((float)Math.PI / 180));
            double d5 = -rfU_2.id_break(f7 * ((float)Math.PI / 180));
            float f8 = (float)d2 * 10.0f;
            f8 = rfU_2.id_class(f8, -6.0f, 32.0f);
            float f9 = (float)(d * d4 + d3 * d5) * 100.0f;
            f9 = rfU_2.id_class(f9, 0.0f, 150.0f);
            float f10 = (float)(d * d5 - d3 * d4) * 100.0f;
            f10 = rfU_2.id_class(f10, -20.0f, 20.0f);
            if (f9 < 0.0f) {
                f9 = 0.0f;
            }
            if (f9 > 165.0f) {
                f9 = 165.0f;
            }
            if (f8 < -5.0f) {
                f8 = -5.0f;
            }
            float f11 = rfU_2.id_catch(f3, ((Float)cG_22.id_implements[7]).floatValue(), ((Float)cG_22.id_implements[8]).floatValue());
            f8 += rfU_2.id_class(rfU_2.id_catch(f3, ((Float)cG_22.id_throws[28]).floatValue(), ((Float)cG_22.id_throws[29]).floatValue()) * 6.0f) * 32.0f * f11;
            if (cG_22.x()) {
                f8 += 25.0f;
            }
            float f12 = rrbb_3.rV() * 20.0f;
            f12 = rrbb_3.id_class(f12, 0.02f, 1.0f);
            Float f13 = Float.valueOf(rfU_2.id_catch(f12, ((Float)cG_22.id_class[11]).floatValue(), 6.0f + f9 / 2.0f + f8));
            cG_22.id_class[11] = f13;
            Float f14 = Float.valueOf(rfU_2.id_catch(f12, ((Float)cG_22.id_class[13]).floatValue(), f10 / 2.0f));
            cG_22.id_class[13] = f14;
            Float f15 = Float.valueOf(rfU_2.id_catch(f12, ((Float)cG_22.id_class[12]).floatValue(), 180.0f - f10 / 2.0f));
            cG_22.id_class[12] = f15;
            ml_1.id_class(rje_3.id_break.id_byte(((Float)cG_22.id_class[11]).floatValue()));
            ml_1.id_class(rje_3.id_case.id_byte(((Float)cG_22.id_class[13]).floatValue()));
            ml_1.id_class(rje_3.id_protected.id_byte(((Float)cG_22.id_class[12]).floatValue()));
            Ok_1 ok_1 = hx_1.getBuffer(HU.id_break(cG_22.id_case()));
            ((wh_3)this.id_byte()).id_break(ml_1, ok_1, n, fZ_2.id_class);
            ml_1.id_break();
        }
    }
}

