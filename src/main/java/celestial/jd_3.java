/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.Hx_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.QY;
import celestial.cb_3;
import celestial.jW_2;
import celestial.jz_3;
import celestial.rCD;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rpa_3;
import celestial.rqd_3;
import celestial.ryG_2;
import celestial.xc_3;
import celestial.xu_3;
import celestial.yX_2;

public class jd_3
extends jW_2<ryG_2> {
    public jd_3(jz_3 jz_32) {
        super(jz_32);
    }

    @Override
    public boolean id_class(ryG_2 ryG_22) {
        return true;
    }

    private void id_class(ryG_2 ryG_22, Ok_1 ok_1, rfH_2 rfH_22, boolean bl, Ml_1 ml_1) {
        rYB rYB2 = ryG_22.id_while();
        rfH_2 rfH_23 = ryG_22.id_char();
        rfH_2 rfH_24 = rfH_23.id_break(rfH_22);
        for (rfH_2 rfH_25 : rfH_2.id_class(rfH_24, rfH_24.id_break(ryG_22.id_extends()).id_break(-1, -1, -1))) {
            xc_3 xc_32 = rYB2.id_byte(rfH_25);
            boolean bl2 = xc_32.id_catch();
            boolean bl3 = xc_32.id_class(xu_3.bo);
            if (!bl2 && !bl3) continue;
            float f = bl2 ? 0.05f : 0.0f;
            double d = (float)(rfH_25.b_() - rfH_23.b_()) + 0.45f - f;
            double d2 = (float)(rfH_25.c_() - rfH_23.c_()) + 0.45f - f;
            double d3 = (float)(rfH_25.d_() - rfH_23.d_()) + 0.45f - f;
            double d4 = (float)(rfH_25.b_() - rfH_23.b_()) + 0.55f + f;
            double d5 = (float)(rfH_25.c_() - rfH_23.c_()) + 0.55f + f;
            double d6 = (float)(rfH_25.d_() - rfH_23.d_()) + 0.55f + f;
            if (bl) {
                yX_2.id_class(ml_1, ok_1, d, d2, d3, d4, d5, d6, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f);
                continue;
            }
            if (bl2) {
                yX_2.id_class(ml_1, ok_1, d, d2, d3, d4, d5, d6, 0.5f, 0.5f, 1.0f, 1.0f, 0.5f, 0.5f, 1.0f);
                continue;
            }
            yX_2.id_class(ml_1, ok_1, d, d2, d3, d4, d5, d6, 1.0f, 0.25f, 0.25f, 1.0f, 1.0f, 0.25f, 0.25f);
        }
    }

    @Override
    public void id_class(ryG_2 ryG_22, float f, Ml_1 ml_1, Hx_1 hx_1, int n, int n2) {
        if (((cb_3)QY.id_instanceof().id_class[57]).sU() || ((cb_3)QY.id_instanceof().id_class[57]).id_native()) {
            rfH_2 rfH_22 = ryG_22.id_finally();
            rfH_2 rfH_23 = ryG_22.id_extends();
            if (rfH_23.b_() >= 1 && rfH_23.c_() >= 1 && rfH_23.d_() >= 1 && (ryG_22.id_package() == rCD.SAVE || ryG_22.id_package() == rCD.LOAD)) {
                double d;
                double d2;
                double d3;
                double d4;
                double d5 = rfH_22.b_();
                double d6 = rfH_22.d_();
                double d7 = rfH_22.c_();
                double d8 = d7 + (double)rfH_23.c_();
                double d9 = switch (ryG_22.id_native()) {
                    case rpa_3.LEFT_RIGHT -> {
                        d4 = rfH_23.b_();
                        yield -rfH_23.d_();
                    }
                    case rpa_3.FRONT_BACK -> {
                        d4 = -rfH_23.b_();
                        yield rfH_23.d_();
                    }
                    default -> {
                        d4 = rfH_23.b_();
                        yield rfH_23.d_();
                    }
                };
                double d10 = switch (ryG_22.id_volatile()) {
                    case rqd_3.CLOCKWISE_90 -> {
                        d3 = d9 < 0.0 ? d5 : d5 + 1.0;
                        d2 = d4 < 0.0 ? d6 + 1.0 : d6;
                        d = d3 - d9;
                        yield d2 + d4;
                    }
                    case rqd_3.CLOCKWISE_180 -> {
                        d3 = d4 < 0.0 ? d5 : d5 + 1.0;
                        d2 = d9 < 0.0 ? d6 : d6 + 1.0;
                        d = d3 - d4;
                        yield d2 - d9;
                    }
                    case rqd_3.COUNTERCLOCKWISE_90 -> {
                        d3 = d9 < 0.0 ? d5 + 1.0 : d5;
                        d2 = d4 < 0.0 ? d6 : d6 + 1.0;
                        d = d3 + d9;
                        yield d2 - d4;
                    }
                    default -> {
                        d3 = d4 < 0.0 ? d5 + 1.0 : d5;
                        d2 = d9 < 0.0 ? d6 + 1.0 : d6;
                        d = d3 + d4;
                        yield d2 + d9;
                    }
                };
                float f2 = 1.0f;
                float f3 = 0.9f;
                float f4 = 0.5f;
                Ok_1 ok_1 = hx_1.getBuffer(HU.id_return());
                if (ryG_22.id_package() == rCD.SAVE || ryG_22.id_instanceof()) {
                    yX_2.id_class(ml_1, ok_1, d3, d7, d2, d, d8, d10, 0.9f, 0.9f, 0.9f, 1.0f, 0.5f, 0.5f, 0.5f);
                }
                if (ryG_22.id_package() == rCD.SAVE && ryG_22.id_try()) {
                    this.id_class(ryG_22, ok_1, rfH_22, true, ml_1);
                    this.id_class(ryG_22, ok_1, rfH_22, false, ml_1);
                }
            }
        }
    }
}

