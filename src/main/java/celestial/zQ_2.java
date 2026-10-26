/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.an_3;
import celestial.iB_2;
import celestial.rCL;
import celestial.rCN;
import celestial.rCT;
import celestial.rCZ;
import celestial.rRW;
import celestial.rYB;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rhd_3;
import celestial.rhf_3;
import celestial.rpm_3;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.rsX_2;
import celestial.ryZ_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;

public class zQ_2
extends xd_3 {
    public static final rCN id_volatile = rCT.id_instanceof;

    public zQ_2(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)this.id_continue().id_class(id_volatile, false));
    }

    @Override
    public ryZ_2 id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, rhd_3 rhd_33, rpm_3 rpm_32, rff_3 rff_32) {
        rdn_3 rdn_32 = rhd_33.id_protected(rpm_32);
        rdb_3 rdb_32 = rdn_32.id_break();
        if (rdb_32 != rdy_3.OG && rdb_32 != rdy_3.xa) {
            return super.id_class(xc_32, rYB2, rfH_22, rhd_33, rpm_32, rff_32);
        }
        zQ_2.id_class(rYB2, rfH_22, rhd_33);
        rYB2.id_class(rfH_22, xu_3.id_class.id_continue(), 11);
        if (!rhd_33.id_implements()) {
            if (rdb_32 == rdy_3.OG) {
                rdn_32.id_class(1, rhd_33, (T rhd_32) -> rhd_32.id_byte(rpm_32));
            } else {
                rdn_32.id_catch(1);
            }
        }
        return ryZ_2.id_class(rYB2.id_continue);
    }

    @Override
    public void id_class(rYB rYB2, xc_3 xc_32, rff_3 rff_32, rhf_3 rhf_32) {
        if (!rYB2.id_continue) {
            an_3 an_32 = rhf_32.id_else();
            if (rhf_32.Pz()) {
                rfH_2 rfH_22 = rff_32.id_class();
                zQ_2.id_class(rYB2, rfH_22, an_32 instanceof iB_2 ? (iB_2)an_32 : null);
                rYB2.id_class(rfH_22, false);
            }
        }
    }

    @Override
    public boolean id_class(rRW rRW2) {
        return false;
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(new rCZ[]{id_volatile});
    }

    private static void id_class(rYB rYB2, rfH_2 rfH_22, iB_2 iB_22) {
        if (!rYB2.id_continue) {
            rsX_2 rsX_22 = new rsX_2(rYB2, (double)rfH_22.b_() + 0.5, rfH_22.c_(), (double)rfH_22.d_() + 0.5, iB_22);
            rYB2.a_(rsX_22);
            rYB2.id_class((rhd_3)null, rsX_22.rx(), rsX_22.re(), rsX_22.BO(), rqn_3.db, rqL_2.BLOCKS, 1.0f, 1.0f);
        }
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xd_3 xd_32, rfH_2 rfH_23, boolean bl) {
        if (rYB2.id_public(rfH_22)) {
            zQ_2.id_class(rYB2, rfH_22);
            rYB2.id_class(rfH_22, false);
        }
    }

    @Override
    public void id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32, rhd_3 rhd_32) {
        if (!rYB2.id_import() && !rhd_32.id_implements() && xc_32.id_byte(id_volatile).booleanValue()) {
            zQ_2.id_class(rYB2, rfH_22);
        }
        super.id_class(rYB2, rfH_22, xc_32, rhd_32);
    }

    @Override
    public void id_class(rYB rYB2, rfH_2 rfH_22, rRW rRW2) {
        if (!rYB2.id_continue) {
            rsX_2 rsX_22 = new rsX_2(rYB2, (double)rfH_22.b_() + 0.5, rfH_22.c_(), (double)rfH_22.d_() + 0.5, rRW2.id_protected());
            rsX_22.id_class((short)(rYB2.id_int.nextInt(rsX_22.id_case() / 4) + rsX_22.id_case() / 8));
            rYB2.a_(rsX_22);
        }
    }

    public static void id_class(rYB rYB2, rfH_2 rfH_22) {
        zQ_2.id_class(rYB2, rfH_22, (iB_2)null);
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xc_3 xc_33, boolean bl) {
        if (!xc_33.id_class(xc_32.id_break()) && rYB2.id_public(rfH_22)) {
            zQ_2.id_class(rYB2, rfH_22);
            rYB2.id_class(rfH_22, false);
        }
    }
}

