/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.rCL;
import celestial.rCN;
import celestial.rCT;
import celestial.rCm_1;
import celestial.rLQ;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfw_3;
import celestial.rjC_2;
import celestial.rja_3;
import celestial.rjw_3;
import celestial.rls_3;
import celestial.rpr_3;
import celestial.rrEm_1;
import celestial.rxx_3;
import celestial.xc_3;
import celestial.xd_3;
import java.util.Random;

public class kZ_2
extends xd_3 {
    public static final rCm_1 id_volatile = rCT.N;
    public static final rCN id_final = rCT.id_synchronized;

    public kZ_2(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, 7)).id_class(id_final, false));
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        int n = kZ_2.id_private(xc_33) + 1;
        if (n != 1 || xc_32.id_byte(id_volatile) != n) {
            rRg_12.id_finally().id_class(rfH_22, this, 1);
        }
        return xc_32;
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, Random random) {
        rfH_2 rfH_23;
        xc_3 xc_33;
        if (!(!rYB2.id_while(rfH_22.id_final()) || random.nextInt(15) != 1 || (xc_33 = rYB2.id_byte(rfH_23 = rfH_22.id_break())).id_native() && xc_33.id_protected(rYB2, rfH_23, rpr_3.UP))) {
            double d = (double)rfH_22.b_() + random.nextDouble();
            double d2 = (double)rfH_22.c_() - 0.05;
            double d3 = (double)rfH_22.d_() + random.nextDouble();
            rYB2.id_class(rLQ.id_volatile, d, d2, d3, 0.0, 0.0, 0.0);
        }
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(id_volatile, id_final);
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        return kZ_2.id_class((xc_3)this.id_continue().id_class(id_final, true), rxx_32.id_int(), rxx_32.id_class());
    }

    private static xc_3 id_class(xc_3 xc_32, rRg_1 rRg_12, rfH_2 rfH_22) {
        int n = 7;
        rfw_3 rfw_32 = new rfw_3();
        for (rpr_3 rpr_32 : rpr_3.values()) {
            rfw_32.id_class((rja_3)rfH_22, rpr_32);
            n = Math.min(n, kZ_2.id_private(rRg_12.id_byte(rfw_32)) + 1);
            if (n == 1) break;
        }
        return (xc_3)xc_32.id_class(id_volatile, n);
    }

    @Override
    public void id_class(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        if (!xc_32.id_byte(id_final).booleanValue() && xc_32.id_byte(id_volatile) == 7) {
            kZ_2.id_protected(xc_32, rrEm_12, rfH_22);
            rrEm_12.id_class(rfH_22, false);
        }
    }

    @Override
    public void id_break(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        rrEm_12.id_class(rfH_22, kZ_2.id_class(xc_32, rrEm_12, rfH_22), 3);
    }

    @Override
    public rjC_2 id_break(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22) {
        return rjw_3.id_class();
    }

    @Override
    public int id_protected(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22) {
        return 1;
    }

    private static int id_private(xc_3 xc_32) {
        if (rls_3.id_super.id_class(xc_32.id_break())) {
            return 0;
        }
        return xc_32.id_break() instanceof kZ_2 ? xc_32.id_byte(id_volatile) : 7;
    }

    @Override
    public boolean a_(xc_3 xc_32) {
        return xc_32.id_byte(id_volatile) == 7 && xc_32.id_byte(id_final) == false;
    }
}

