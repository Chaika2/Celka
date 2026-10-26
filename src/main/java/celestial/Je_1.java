/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.JR;
import celestial.Jq_1;
import celestial.kX_2;
import celestial.rCL;
import celestial.rCT;
import celestial.rCZ;
import celestial.rCm_1;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rXG;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rjC_2;
import celestial.rpr_3;
import celestial.rrEm_1;
import celestial.xc_3;
import celestial.xd_3;
import java.util.Random;

public abstract class Je_1
extends JR
implements kX_2 {
    public static final rCm_1 id_int = rCT.W;
    private final double id_new;

    protected Je_1(Jq_1 jq_1, rpr_3 rpr_32, rjC_2 rjC_22, boolean bl, double d) {
        super(jq_1, rpr_32, rjC_22, bl);
        this.id_new = d;
        this.id_extends((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_int, 0));
    }

    @Override
    public xc_3 id_class(rRg_1 rRg_12) {
        return (xc_3)this.id_continue().id_class(id_int, rRg_12.id_long().nextInt(25));
    }

    @Override
    public boolean id_class(rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32, boolean bl) {
        return this.id_private(rRq_12.id_byte(rfH_22.id_break(this.id_volatile)));
    }

    @Override
    public void id_class(rrEm_1 rrEm_12, Random random, rfH_2 rfH_22, xc_3 xc_32) {
        rfH_2 rfH_23 = rfH_22.id_break(this.id_volatile);
        int n = Math.min(xc_32.id_byte(id_int) + 1, 25);
        int n2 = this.id_class(random);
        for (int i = 0; i < n2 && this.id_private(rrEm_12.id_byte(rfH_23)); ++i) {
            rrEm_12.id_break(rfH_23, (xc_3)xc_32.id_class(id_int, n));
            rfH_23 = rfH_23.id_break(this.id_volatile);
            n = Math.min(n + 1, 25);
        }
    }

    protected abstract int id_class(Random var1);

    @Override
    public boolean id_class(rYB rYB2, Random random, rfH_2 rfH_22, xc_3 xc_32) {
        return true;
    }

    @Override
    public void id_class(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        rfH_2 rfH_23;
        if (xc_32.id_byte(id_int) < 25 && random.nextDouble() < this.id_new && this.id_private(rrEm_12.id_byte(rfH_23 = rfH_22.id_break(this.id_volatile)))) {
            rrEm_12.id_break(rfH_23, (xc_3)xc_32.id_class(id_int));
        }
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        if (rpr_32 == this.id_volatile.id_case() && !xc_32.id_class(rRg_12, rfH_22)) {
            rRg_12.id_finally().id_class(rfH_22, this, 1);
        }
        if (rpr_32 != this.id_volatile || !xc_33.id_class(this) && !xc_33.id_class(this.id_break())) {
            if (this.id_final) {
                rRg_12.id_extends().id_class(rfH_22, rXG.id_byte, rXG.id_byte.id_class(rRg_12));
            }
            return super.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
        }
        return this.id_break().id_continue();
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(new rCZ[]{id_int});
    }

    @Override
    protected Je_1 id_implements() {
        return this;
    }

    protected abstract boolean id_private(xc_3 var1);

    @Override
    public boolean a_(xc_3 xc_32) {
        return xc_32.id_byte(id_int) < 25;
    }
}

