/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aA_2;
import celestial.an_3;
import celestial.iX_2;
import celestial.rBW;
import celestial.rBk_1;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfw_3;
import celestial.rjU_2;
import celestial.rlG_2;
import java.util.EnumSet;

public class rBY
extends rBk_1 {
    protected final aA_2 id_class;
    protected final double id_break;
    protected double id_byte;
    protected double id_protected;
    protected double id_throws;
    protected boolean id_case;

    @Override
    public void id_byte() {
        this.id_class.id_public().id_class(this.id_byte, this.id_protected, this.id_throws, this.id_break);
        this.id_case = true;
    }

    public rBY(aA_2 aA_22, double d) {
        this.id_class = aA_22;
        this.id_break = d;
        this.id_class(EnumSet.of(rBW.MOVE));
    }

    @Override
    public boolean id_class() {
        rfH_2 rfH_22;
        if (this.id_class.Sr() == null && !this.id_class.Pz()) {
            return false;
        }
        if (this.id_class.Pz() && (rfH_22 = this.id_class((rYB)this.id_class.id_throws[7], this.id_class, 5, 4)) != null) {
            this.id_byte = rfH_22.b_();
            this.id_protected = rfH_22.c_();
            this.id_throws = rfH_22.d_();
            return true;
        }
        return this.id_catch();
    }

    protected rfH_2 id_class(rRq_1 rRq_12, an_3 an_32, int n, int n2) {
        rfH_2 rfH_22 = an_32.Bs();
        int n3 = rfH_22.b_();
        int n4 = rfH_22.c_();
        int n5 = rfH_22.d_();
        float f = n * n * n2 * 2;
        rfH_2 rfH_23 = null;
        rfw_3 rfw_32 = new rfw_3();
        for (int i = n3 - n; i <= n3 + n; ++i) {
            for (int j = n4 - n2; j <= n4 + n2; ++j) {
                for (int k = n5 - n; k <= n5 + n; ++k) {
                    float f2;
                    rfw_32.id_class(i, j, k);
                    if (!rRq_12.id_break(rfw_32).id_class(rlG_2.id_break) || !((f2 = (float)((i - n3) * (i - n3) + (j - n4) * (j - n4) + (k - n5) * (k - n5))) < f)) continue;
                    f = f2;
                    rfH_23 = new rfH_2(rfw_32);
                }
            }
        }
        return rfH_23;
    }

    @Override
    public boolean id_break() {
        return !this.id_class.id_public().id_native();
    }

    protected boolean id_catch() {
        rjU_2 rjU_22 = iX_2.id_class(this.id_class, 5, 4);
        if (rjU_22 == null) {
            return false;
        }
        this.id_byte = rjU_22.id_break;
        this.id_protected = rjU_22.id_byte;
        this.id_throws = rjU_22.id_protected;
        return true;
    }

    @Override
    public void id_protected() {
        this.id_case = false;
    }

    public boolean id_private() {
        return this.id_case;
    }
}

