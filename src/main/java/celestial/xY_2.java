/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.kE_2;
import celestial.kX_2;
import celestial.rCL;
import celestial.rCT;
import celestial.rCm_1;
import celestial.rLT;
import celestial.rRR;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rls_3;
import celestial.rpr_3;
import celestial.rrEm_1;
import celestial.rxx_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import java.util.Random;

public class xY_2
extends kE_2
implements kX_2 {
    public static final rCm_1 id_volatile = rCT.X;
    protected static final rjC_2[] id_final = new rjC_2[]{xd_3.id_class(11.0, 7.0, 6.0, 15.0, 12.0, 10.0), xd_3.id_class(9.0, 5.0, 5.0, 15.0, 12.0, 11.0), xd_3.id_class(7.0, 3.0, 4.0, 15.0, 12.0, 12.0)};
    protected static final rjC_2[] id_package = new rjC_2[]{xd_3.id_class(1.0, 7.0, 6.0, 5.0, 12.0, 10.0), xd_3.id_class(1.0, 5.0, 5.0, 7.0, 12.0, 11.0), xd_3.id_class(1.0, 3.0, 4.0, 9.0, 12.0, 12.0)};
    protected static final rjC_2[] id_int = new rjC_2[]{xd_3.id_class(6.0, 7.0, 1.0, 10.0, 12.0, 5.0), xd_3.id_class(5.0, 5.0, 1.0, 11.0, 12.0, 7.0), xd_3.id_class(4.0, 3.0, 1.0, 12.0, 12.0, 9.0)};
    protected static final rjC_2[] id_new = new rjC_2[]{xd_3.id_class(6.0, 7.0, 11.0, 10.0, 12.0, 15.0), xd_3.id_class(5.0, 5.0, 9.0, 11.0, 12.0, 15.0), xd_3.id_class(4.0, 3.0, 7.0, 12.0, 12.0, 15.0)};

    public xY_2(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)((xc_3)this.id_abstract.id_break()).id_class(p, rpr_3.NORTH)).id_class(id_volatile, 0));
    }

    @Override
    public boolean id_class(rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32, boolean bl) {
        return xc_32.id_byte(id_volatile) < 2;
    }

    @Override
    public boolean id_class(rYB rYB2, Random random, rfH_2 rfH_22, xc_3 xc_32) {
        return true;
    }

    @Override
    public void id_class(rrEm_1 rrEm_12, Random random, rfH_2 rfH_22, xc_3 xc_32) {
        rrEm_12.id_class(rfH_22, (xc_3)xc_32.id_class(id_volatile, xc_32.id_byte(id_volatile) + 1), 2);
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(p, id_volatile);
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rLT rLT2) {
        return false;
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        return rpr_32 == xc_32.id_byte(p) && !xc_32.id_class(rRg_12, rfH_22) ? xu_3.id_class.id_continue() : super.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRR rRR2, rfH_2 rfH_22) {
        xd_3 xd_32 = rRR2.id_byte(rfH_22.id_break(xc_32.id_byte(p))).id_break();
        return xd_32.id_class(rls_3.id_public);
    }

    @Override
    public void id_class(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        int n;
        if (rrEm_12.id_int.nextInt(5) == 0 && (n = xc_32.id_byte(id_volatile).intValue()) < 2) {
            rrEm_12.id_class(rfH_22, (xc_3)xc_32.id_class(id_volatile, n + 1), 2);
        }
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        xc_3 xc_32 = this.id_continue();
        rYB rYB2 = rxx_32.id_int();
        rfH_2 rfH_22 = rxx_32.id_class();
        for (rpr_3 rpr_32 : rxx_32.id_throws()) {
            if (!rpr_32.id_final().id_protected() || !(xc_32 = (xc_3)xc_32.id_class(p, rpr_32)).id_class((rRR)rYB2, rfH_22)) continue;
            return xc_32;
        }
        return null;
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        int n = xc_32.id_byte(id_volatile);
        switch (xc_32.id_byte(p)) {
            case SOUTH: {
                return id_new[n];
            }
            default: {
                return id_int[n];
            }
            case WEST: {
                return id_package[n];
            }
            case EAST: 
        }
        return id_final[n];
    }

    @Override
    public boolean a_(xc_3 xc_32) {
        return xc_32.id_byte(id_volatile) < 2;
    }
}

