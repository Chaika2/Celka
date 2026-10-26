/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.WQ;
import celestial.an_3;
import celestial.eA_2;
import celestial.eY_2;
import celestial.rCL;
import celestial.rCN;
import celestial.rCZ;
import celestial.rLc_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rhd_3;
import celestial.rpB_2;
import celestial.rpm_3;
import celestial.rpr_3;
import celestial.rrEm_1;
import celestial.rxJ_2;
import celestial.rxx_3;
import celestial.ryZ_2;
import celestial.xc_3;
import celestial.xd_3;
import java.util.Random;

public class Wz_1
extends xd_3 {
    public static final rCN id_volatile = WQ.id_volatile;

    private static void id_byte(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22) {
        Wz_1.id_class(rYB2, rfH_22);
        if (!xc_32.id_byte(id_volatile).booleanValue()) {
            rYB2.id_class(rfH_22, (xc_3)xc_32.id_class(id_volatile, true), 3);
        }
    }

    public Wz_1(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)this.id_continue().id_class(id_volatile, false));
    }

    @Override
    public void id_class(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, rdn_3 rdn_32) {
        super.id_class(xc_32, rrEm_12, rfH_22, rdn_32);
        if (eA_2.id_class(eY_2.id_else, rdn_32) == 0) {
            int n = 1 + rrEm_12.id_int.nextInt(5);
            this.id_class(rrEm_12, rfH_22, n);
        }
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, Random random) {
        if (xc_32.id_byte(id_volatile).booleanValue()) {
            Wz_1.id_class(rYB2, rfH_22);
        }
    }

    private static void id_class(rYB rYB2, rfH_2 rfH_22) {
        double d = 0.5625;
        Random random = rYB2.id_int;
        for (rpr_3 rpr_32 : rpr_3.values()) {
            rfH_2 rfH_23 = rfH_22.id_break(rpr_32);
            if (rYB2.id_byte(rfH_23).id_implements(rYB2, rfH_23)) continue;
            rpB_2 rpB_22 = rpr_32.id_final();
            double d2 = rpB_22 == rpB_2.X ? 0.5 + 0.5625 * (double)rpr_32.id_implements() : (double)random.nextFloat();
            double d3 = rpB_22 == rpB_2.Y ? 0.5 + 0.5625 * (double)rpr_32.id_finally() : (double)random.nextFloat();
            double d4 = rpB_22 == rpB_2.Z ? 0.5 + 0.5625 * (double)rpr_32.id_extends() : (double)random.nextFloat();
            rYB2.id_class(rLc_1.id_class, (double)rfH_22.b_() + d2, (double)rfH_22.c_() + d3, (double)rfH_22.d_() + d4, 0.0, 0.0, 0.0);
        }
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(new rCZ[]{id_volatile});
    }

    @Override
    public void id_class(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        if (xc_32.id_byte(id_volatile).booleanValue()) {
            rrEm_12.id_class(rfH_22, (xc_3)xc_32.id_class(id_volatile, false), 3);
        }
    }

    @Override
    public ryZ_2 id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, rhd_3 rhd_32, rpm_3 rpm_32, rff_3 rff_32) {
        if (rYB2.id_continue) {
            Wz_1.id_class(rYB2, rfH_22);
        } else {
            Wz_1.id_byte(xc_32, rYB2, rfH_22);
        }
        rdn_3 rdn_32 = rhd_32.id_protected(rpm_32);
        return rdn_32.id_break() instanceof rxJ_2 && new rxx_3(rhd_32, rpm_32, rdn_32, rff_32).id_break() ? ryZ_2.PASS : ryZ_2.SUCCESS;
    }

    @Override
    public void id_class(rYB rYB2, rfH_2 rfH_22, an_3 an_32) {
        Wz_1.id_byte(rYB2.id_byte(rfH_22), rYB2, rfH_22);
        super.id_class(rYB2, rfH_22, an_32);
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, rhd_3 rhd_32) {
        Wz_1.id_byte(xc_32, rYB2, rfH_22);
        super.id_class(xc_32, rYB2, rfH_22, rhd_32);
    }

    @Override
    public boolean a_(xc_3 xc_32) {
        return xc_32.id_byte(id_volatile);
    }
}

