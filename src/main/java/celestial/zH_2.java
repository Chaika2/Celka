/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.aI_2;
import celestial.an_3;
import celestial.iB_2;
import celestial.rCL;
import celestial.rCT;
import celestial.rCm_1;
import celestial.rON;
import celestial.rRq_1;
import celestial.rRu_1;
import celestial.rYB;
import celestial.rbB_2;
import celestial.rbv_3;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rhd_3;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rls_3;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.rrEm_1;
import celestial.rxx_3;
import celestial.ryO_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import java.util.Random;

public class zH_2
extends xd_3 {
    private static final rjC_2 id_package = xd_3.id_class(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
    private static final rjC_2 id_int = xd_3.id_class(1.0, 0.0, 1.0, 15.0, 7.0, 15.0);
    public static final rCm_1 id_volatile = rCT.u;
    public static final rCm_1 id_final = rCT.c;

    public zH_2(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, 0)).id_class(id_final, 1));
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        xc_3 xc_32 = rxx_32.id_int().id_byte(rxx_32.id_class());
        return xc_32.id_class(this) ? (xc_3)xc_32.id_class(id_final, Math.min(4, xc_32.id_byte(id_final) + 1)) : super.id_class(rxx_32);
    }

    @Override
    public boolean id_class(xc_3 xc_32, rxx_3 rxx_32) {
        return rxx_32.id_volatile().id_break() == this.id_case() && xc_32.id_byte(id_final) < 4 ? true : super.id_class(xc_32, rxx_32);
    }

    @Override
    public void id_class(rYB rYB2, rhd_3 rhd_32, rfH_2 rfH_22, xc_3 xc_32, ryO_2 ryO_22, rdn_3 rdn_32) {
        super.id_class(rYB2, rhd_32, rfH_22, xc_32, ryO_22, rdn_32);
        this.id_class(rYB2, rfH_22, xc_32);
    }

    private boolean id_class(rYB rYB2) {
        float f = rYB2.id_protected(1.0f);
        if ((double)f < 0.69 && (double)f > 0.65) {
            return true;
        }
        return rYB2.id_int.nextInt(500) == 0;
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xc_3 xc_33, boolean bl) {
        if (zH_2.id_class(rYB2, rfH_22) && !rYB2.id_continue) {
            rYB2.id_byte(2005, rfH_22, 0);
        }
    }

    private boolean id_class(rYB rYB2, an_3 an_32) {
        if (!(an_32 instanceof rON) && !(an_32 instanceof rbv_3)) {
            if (!(an_32 instanceof iB_2)) {
                return false;
            }
            return an_32 instanceof rhd_3 || rYB2.B().id_break(rRu_1.id_break);
        }
        return false;
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(id_volatile, id_final);
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return xc_32.id_byte(id_final) > 1 ? id_int : id_package;
    }

    @Override
    public void id_class(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        if (this.id_class(rrEm_12) && zH_2.id_class(rrEm_12, rfH_22)) {
            int n = xc_32.id_byte(id_volatile);
            if (n < 2) {
                rrEm_12.id_class((rhd_3)null, rfH_22, rqn_3.dC, rqL_2.BLOCKS, 0.7f, 0.9f + random.nextFloat() * 0.2f);
                rrEm_12.id_class(rfH_22, (xc_3)xc_32.id_class(id_volatile, n + 1), 2);
            } else {
                rrEm_12.id_class((rhd_3)null, rfH_22, rqn_3.dl, rqL_2.BLOCKS, 0.7f, 0.9f + random.nextFloat() * 0.2f);
                rrEm_12.id_class(rfH_22, false);
                for (int i = 0; i < xc_32.id_byte(id_final); ++i) {
                    rrEm_12.id_byte(2001, rfH_22, xd_3.id_finally(xc_32));
                    rON rON2 = aI_2.o.id_class(rrEm_12);
                    rON2.e_(-24000);
                    rON2.id_implements(rfH_22);
                    rON2.id_class((double)rfH_22.b_() + 0.3 + (double)i * 0.2, (double)rfH_22.c_(), (double)rfH_22.d_() + 0.3, 0.0f, 0.0f);
                    rrEm_12.a_(rON2);
                }
            }
        }
    }

    private void id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32) {
        rYB2.id_class((rhd_3)null, rfH_22, rqn_3.dn, rqL_2.BLOCKS, 0.7f, 0.9f + rYB2.id_int.nextFloat() * 0.2f);
        int n = xc_32.id_byte(id_final);
        if (n <= 1) {
            rYB2.id_break(rfH_22, false);
        } else {
            rYB2.id_class(rfH_22, (xc_3)xc_32.id_class(id_final, n - 1), 2);
            rYB2.id_byte(2001, rfH_22, xd_3.id_finally(xc_32));
        }
    }

    private void id_class(rYB rYB2, rfH_2 rfH_22, an_3 an_32, int n) {
        xc_3 xc_32;
        if (this.id_class(rYB2, an_32) && !rYB2.id_continue && rYB2.id_int.nextInt(n) == 0 && (xc_32 = rYB2.id_byte(rfH_22)).id_class(xu_3.OX)) {
            this.id_class(rYB2, rfH_22, xc_32);
        }
    }

    @Override
    public void id_class(rYB rYB2, rfH_2 rfH_22, an_3 an_32, float f) {
        if (!(an_32 instanceof rbB_2)) {
            this.id_class(rYB2, rfH_22, an_32, 3);
        }
        super.id_class(rYB2, rfH_22, an_32, f);
    }

    public static boolean id_class(rRq_1 rRq_12, rfH_2 rfH_22) {
        return zH_2.id_break(rRq_12, rfH_22.id_break());
    }

    @Override
    public void id_class(rYB rYB2, rfH_2 rfH_22, an_3 an_32) {
        this.id_class(rYB2, rfH_22, an_32, 100);
        super.id_class(rYB2, rfH_22, an_32);
    }

    public static boolean id_break(rRq_1 rRq_12, rfH_2 rfH_22) {
        return rRq_12.id_byte(rfH_22).id_class(rls_3.id_throw);
    }
}

