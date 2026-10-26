/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.QP;
import celestial.rLQ;
import celestial.rLX;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rls_3;
import celestial.rpr_3;
import celestial.rrEm_1;
import celestial.rsB_2;
import celestial.xc_3;
import celestial.xd_3;
import java.util.Random;

public class dH_2
extends xd_3 {
    public dH_2(Jq_1 jq_1) {
        super(jq_1);
    }

    protected void id_class(rsB_2 rsB_22) {
    }

    public void id_class(rYB rYB2, rfH_2 rfH_22, rsB_2 rsB_22) {
    }

    public void id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32, xc_3 xc_33, rsB_2 rsB_22) {
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, Random random) {
        rfH_2 rfH_23;
        if (random.nextInt(16) == 0 && dH_2.id_implements(rYB2.id_byte(rfH_23 = rfH_22.id_break()))) {
            double d = (double)rfH_22.b_() + random.nextDouble();
            double d2 = (double)rfH_22.c_() - 0.05;
            double d3 = (double)rfH_22.d_() + random.nextDouble();
            rYB2.id_class(new rLX(rLQ.id_public, xc_32), d, d2, d3, 0.0, 0.0, 0.0);
        }
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        rRg_12.id_finally().id_class(rfH_22, this, this.id_break());
        return super.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xc_3 xc_33, boolean bl) {
        rYB2.id_finally().id_class(rfH_22, this, this.id_break());
    }

    @Override
    public void id_break(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        if (dH_2.id_implements(rrEm_12.id_byte(rfH_22.id_break())) && rfH_22.c_() >= 0) {
            rsB_2 rsB_22 = new rsB_2(rrEm_12, (double)rfH_22.b_() + 0.5, rfH_22.c_(), (double)rfH_22.d_() + 0.5, rrEm_12.id_byte(rfH_22));
            this.id_class(rsB_22);
            rrEm_12.a_(rsB_22);
        }
    }

    protected int id_break() {
        return 2;
    }

    public int id_catch(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22) {
        return -16777216;
    }

    public static boolean id_implements(xc_3 xc_32) {
        QP qP = xc_32.id_byte();
        return xc_32.id_catch() || xc_32.id_class(rls_3.N) || qP.id_class() || qP.id_throws();
    }
}

