/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.Hx_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.QY;
import celestial.jW_2;
import celestial.jz_3;
import celestial.kD_2;
import celestial.ka_3;
import celestial.lT_2;
import celestial.lo_3;
import celestial.rCg_1;
import celestial.rHa_1;
import celestial.rRp_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.xc_3;
import celestial.xu_3;
import celestial.yS_2;
import java.util.Random;

public class jO_2
extends jW_2<rHa_1> {
    private final lo_3 id_class = QY.id_instanceof().id_synchronized();

    public jO_2(jz_3 jz_32) {
        super(jz_32);
    }

    private void id_class(rfH_2 rfH_22, xc_3 xc_32, Ml_1 ml_1, Hx_1 hx_1, rYB rYB2, boolean bl, int n) {
        HU hU = yS_2.id_break(xc_32);
        Ok_1 ok_1 = hx_1.getBuffer(hU);
        this.id_class.id_byte().id_class((rRp_1)rYB2, this.id_class.id_class(xc_32), xc_32, rfH_22, ml_1, ok_1, bl, new Random(), xc_32.id_break(rfH_22), n);
    }

    @Override
    public void id_class(rHa_1 rHa_12, float f, Ml_1 ml_1, Hx_1 hx_1, int n, int n2) {
        rYB rYB2 = rHa_12.id_while();
        if (rYB2 != null) {
            rfH_2 rfH_22 = rHa_12.id_char().id_break(rHa_12.id_extends().id_case());
            xc_3 xc_32 = rHa_12.id_native();
            if (!xc_32.id_catch()) {
                lT_2.id_class();
                ml_1.id_class();
                ml_1.id_class((double)rHa_12.id_break(f), (double)rHa_12.id_byte(f), (double)rHa_12.id_protected(f));
                if (xc_32.id_class(xu_3.rS) && rHa_12.id_class(f) <= 4.0f) {
                    xc_32 = (xc_3)xc_32.id_class(ka_3.id_package, rHa_12.id_class(f) <= 0.5f);
                    this.id_class(rfH_22, xc_32, ml_1, hx_1, rYB2, false, n2);
                } else if (rHa_12.id_finally() && !rHa_12.id_catch()) {
                    rCg_1 rCg_12 = xc_32.id_class(xu_3.D) ? rCg_1.STICKY : rCg_1.DEFAULT;
                    xc_3 xc_33 = (xc_3)((xc_3)xu_3.rS.id_continue().id_class(ka_3.id_final, rCg_12)).id_class(ka_3.id_volatile, xc_32.id_byte(kD_2.id_volatile));
                    xc_33 = (xc_3)xc_33.id_class(ka_3.id_package, rHa_12.id_class(f) >= 0.5f);
                    this.id_class(rfH_22, xc_33, ml_1, hx_1, rYB2, false, n2);
                    rfH_2 rfH_23 = rfH_22.id_break(rHa_12.id_extends());
                    ml_1.id_break();
                    ml_1.id_class();
                    xc_32 = (xc_3)xc_32.id_class(kD_2.id_final, true);
                    this.id_class(rfH_23, xc_32, ml_1, hx_1, rYB2, true, n2);
                } else {
                    this.id_class(rfH_22, xc_32, ml_1, hx_1, rYB2, false, n2);
                }
                ml_1.id_break();
                lT_2.id_break();
            }
        }
    }
}

