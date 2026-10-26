/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rBk_1;
import celestial.rEu_1;
import celestial.rRu_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rff_3;
import celestial.rjB_2;
import celestial.rjS_2;
import celestial.rjU_2;
import celestial.rjs_3;
import celestial.rls_3;
import celestial.xc_3;
import celestial.xd_3;
import java.util.Random;

public class rEF
extends rBk_1 {
    private final rEu_1 id_class;

    public rEF(rEu_1 rEu_12) {
        this.id_class = rEu_12;
    }

    @Override
    public boolean id_class() {
        if (this.id_class.sd() != null) {
            return false;
        }
        if (!((rYB)this.id_class.id_throws[7]).B().id_break(rRu_1.id_break)) {
            return false;
        }
        return this.id_class.Sa().nextInt(20) == 0;
    }

    @Override
    public void id_throws() {
        Random random = this.id_class.Sa();
        rYB rYB2 = (rYB)this.id_class.id_throws[7];
        int n = rfU_2.id_byte(this.id_class.rx() - 2.0 + random.nextDouble() * 4.0);
        int n2 = rfU_2.id_byte(this.id_class.re() + random.nextDouble() * 3.0);
        int n3 = rfU_2.id_byte(this.id_class.BO() - 2.0 + random.nextDouble() * 4.0);
        rfH_2 rfH_22 = new rfH_2(n, n2, n3);
        xc_3 xc_32 = rYB2.id_byte(rfH_22);
        xd_3 xd_32 = xc_32.id_break();
        rjU_2 rjU_22 = new rjU_2((double)rfU_2.id_byte(this.id_class.rx()) + 0.5, (double)n2 + 0.5, (double)rfU_2.id_byte(this.id_class.BO()) + 0.5);
        rjU_2 rjU_23 = new rjU_2((double)n + 0.5, (double)n2 + 0.5, (double)n3 + 0.5);
        rff_3 rff_32 = rYB2.id_class(new rjB_2(rjU_22, rjU_23, rjS_2.OUTLINE, rjs_3.NONE, this.id_class));
        boolean bl = rff_32.id_class().equals(rfH_22);
        if (xd_32.id_class(rls_3.id_switch) && bl) {
            rYB2.id_class(rfH_22, false);
            this.id_class.id_byte(xc_32.id_break().id_continue());
        }
    }
}

