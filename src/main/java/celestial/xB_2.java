/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jp_1;
import celestial.Jq_1;
import celestial.kX_2;
import celestial.rCy_1;
import celestial.rRR;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rhd_3;
import celestial.rjC_2;
import celestial.rjU_2;
import celestial.rjm_3;
import celestial.rkx_3;
import celestial.rls_3;
import celestial.rpr_3;
import celestial.rrEm_1;
import celestial.xP_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import java.util.Random;

public class xB_2
extends xd_3
implements kX_2 {
    protected static final rjC_2 id_volatile = xd_3.id_class(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

    @Override
    public Jp_1 id_byte() {
        return Jp_1.XZ;
    }

    public xB_2(Jq_1 jq_1) {
        super(jq_1);
    }

    @Override
    public boolean id_class(rYB rYB2, Random random, rfH_2 rfH_22, xc_3 xc_32) {
        return true;
    }

    @Override
    public void id_class(rrEm_1 rrEm_12, Random random, rfH_2 rfH_22, xc_3 xc_32) {
        this.id_class(rrEm_12, rfH_22);
    }

    @Override
    public float id_class(xc_3 xc_32, rhd_3 rhd_32, rRq_1 rRq_12, rfH_2 rfH_22) {
        return rhd_32.ss().id_break() instanceof rkx_3 ? 1.0f : super.id_class(xc_32, rhd_32, rRq_12, rfH_22);
    }

    protected void id_class(rYB rYB2, rfH_2 rfH_22) {
        rYB2.id_class(rfH_22.id_final(), (xc_3)xu_3.hs.id_continue().id_class(xP_2.id_new, rCy_1.SMALL), 3);
    }

    @Override
    public rdn_3 id_class(rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32) {
        return new rdn_3(rdy_3.rw);
    }

    @Override
    public void id_class(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        if (random.nextInt(3) == 0 && rrEm_12.id_finally(rfH_22.id_final()) && rrEm_12.id_class(rfH_22.id_final(), 0) >= 9) {
            this.id_class(rrEm_12, rfH_22);
        }
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRR rRR2, rfH_2 rfH_22) {
        return rRR2.id_byte(rfH_22.id_break()).id_class(rls_3.M);
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        if (!xc_32.id_class(rRg_12, rfH_22)) {
            return xu_3.id_class.id_continue();
        }
        if (rpr_32 == rpr_3.UP && xc_33.id_class(xu_3.hs)) {
            rRg_12.id_class(rfH_22, xu_3.hs.id_continue(), 2);
        }
        return super.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        rjU_2 rjU_22 = xc_32.id_class(rfH_22);
        return id_volatile.id_class(rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected);
    }

    @Override
    public boolean id_class(rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32, boolean bl) {
        return rRq_12.id_byte(rfH_22.id_final()).id_catch();
    }
}

