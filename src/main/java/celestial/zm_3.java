/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.Oo_1;
import celestial.an_3;
import celestial.rCL;
import celestial.rCT;
import celestial.rCZ;
import celestial.rCm_1;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rff_3;
import celestial.rhN_2;
import celestial.rhf_3;
import celestial.rhm_3;
import celestial.rjU_2;
import celestial.rlB_2;
import celestial.rpB_2;
import celestial.rpr_3;
import celestial.rrEm_1;
import celestial.xc_3;
import celestial.xd_3;
import java.util.Random;

public class zm_3
extends xd_3 {
    private static final rCm_1 id_volatile = rCT.H;

    @Override
    public boolean id_byte(xc_3 xc_32) {
        return true;
    }

    public zm_3(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, 0));
    }

    @Override
    public int id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rpr_3 rpr_32) {
        return xc_32.id_byte(id_volatile);
    }

    @Override
    public void id_class(rYB rYB2, xc_3 xc_32, rff_3 rff_32, rhf_3 rhf_32) {
        int n = zm_3.id_class(rYB2, xc_32, rff_32, rhf_32);
        an_3 an_32 = rhf_32.id_else();
        if (an_32 instanceof rhN_2) {
            rhN_2 rhN_22 = (rhN_2)an_32;
            rhN_22.id_break(rlB_2.T);
            Oo_1.id_short.id_class(rhN_22, rhf_32, rff_32.id_case(), n);
        }
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(new rCZ[]{id_volatile});
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xc_3 xc_33, boolean bl) {
        if (!(rYB2.id_import() || xc_32.id_class(xc_33.id_break()) || xc_32.id_byte(id_volatile) <= 0 || rYB2.id_finally().id_class(rfH_22, this))) {
            rYB2.id_class(rfH_22, (xc_3)xc_32.id_class(id_volatile, 0), 18);
        }
    }

    private static int id_class(rff_3 rff_32, rjU_2 rjU_22) {
        rpr_3 rpr_32 = rff_32.id_break();
        double d = Math.abs(rfU_2.id_catch(rjU_22.id_break) - 0.5);
        double d2 = Math.abs(rfU_2.id_catch(rjU_22.id_byte) - 0.5);
        double d3 = Math.abs(rfU_2.id_catch(rjU_22.id_protected) - 0.5);
        rpB_2 rpB_22 = rpr_32.id_final();
        double d4 = rpB_22 == rpB_2.Y ? Math.max(d, d3) : (rpB_22 == rpB_2.Z ? Math.max(d, d2) : Math.max(d2, d3));
        return Math.max(1, rfU_2.id_throws(15.0 * rfU_2.id_class((0.5 - d4) / 0.5, 0.0, 1.0)));
    }

    private static void id_class(rRg_1 rRg_12, xc_3 xc_32, int n, rfH_2 rfH_22, int n2) {
        rRg_12.id_class(rfH_22, (xc_3)xc_32.id_class(id_volatile, n), 3);
        rRg_12.id_finally().id_class(rfH_22, xc_32.id_break(), n2);
    }

    private static int id_class(rRg_1 rRg_12, xc_3 xc_32, rff_3 rff_32, an_3 an_32) {
        int n;
        int n2 = zm_3.id_class(rff_32, rff_32.id_case());
        int n3 = n = an_32 instanceof rhm_3 ? 20 : 8;
        if (!rRg_12.id_finally().id_class(rff_32.id_class(), xc_32.id_break())) {
            zm_3.id_class(rRg_12, xc_32, n2, rff_32.id_class(), n);
        }
        return n2;
    }

    @Override
    public void id_break(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        if (xc_32.id_byte(id_volatile) != 0) {
            rrEm_12.id_class(rfH_22, (xc_3)xc_32.id_class(id_volatile, 0), 3);
        }
    }
}

