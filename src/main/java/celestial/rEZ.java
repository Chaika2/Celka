/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.rBk_1;
import celestial.rEu_1;
import celestial.rRR;
import celestial.rRu_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfl_3;
import celestial.rjU_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import java.util.Random;

public class rEZ
extends rBk_1 {
    private final rEu_1 id_class;

    public rEZ(rEu_1 rEu_12) {
        this.id_class = rEu_12;
    }

    private boolean id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32, xc_3 xc_33, xc_3 xc_34, rfH_2 rfH_23) {
        return xc_33.id_catch() && !xc_34.id_catch() && !xc_34.id_class(xu_3.id_while) && xc_34.id_new(rYB2, rfH_23) && xc_32.id_class((rRR)rYB2, rfH_22) && rYB2.id_class((an_3)this.id_class, rfl_3.id_class(rjU_2.id_byte(rfH_22))).isEmpty();
    }

    @Override
    public boolean id_class() {
        if (this.id_class.sd() == null) {
            return false;
        }
        if (!((rYB)this.id_class.id_throws[7]).B().id_break(rRu_1.id_break)) {
            return false;
        }
        return this.id_class.Sa().nextInt(2000) == 0;
    }

    @Override
    public void id_throws() {
        Random random = this.id_class.Sa();
        rYB rYB2 = (rYB)this.id_class.id_throws[7];
        int n = rfU_2.id_byte(this.id_class.rx() - 1.0 + random.nextDouble() * 2.0);
        int n2 = rfU_2.id_byte(this.id_class.re() + random.nextDouble() * 2.0);
        int n3 = rfU_2.id_byte(this.id_class.BO() - 1.0 + random.nextDouble() * 2.0);
        rfH_2 rfH_22 = new rfH_2(n, n2, n3);
        xc_3 xc_32 = rYB2.id_byte(rfH_22);
        rfH_2 rfH_23 = rfH_22.id_break();
        xc_3 xc_33 = rYB2.id_byte(rfH_23);
        xc_3 xc_34 = this.id_class.sd();
        if (xc_34 != null && this.id_class(rYB2, rfH_22, xc_34 = xd_3.id_break(xc_34, (rYB)this.id_class.id_throws[7], rfH_22), xc_32, xc_33, rfH_23)) {
            rYB2.id_class(rfH_22, xc_34, 3);
            this.id_class.id_byte((xc_3)null);
        }
    }
}

