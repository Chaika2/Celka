/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.dB_2;
import celestial.iB_2;
import celestial.rCD;
import celestial.rCL;
import celestial.rCT;
import celestial.rCZ;
import celestial.rCu_1;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rhd_3;
import celestial.rpm_3;
import celestial.rrEm_1;
import celestial.rxx_3;
import celestial.ryG_2;
import celestial.ryO_2;
import celestial.ryZ_2;
import celestial.xN_2;
import celestial.xc_3;
import celestial.xd_3;

public class zx_3
extends dB_2 {
    public static final rCu_1<rCD> id_volatile = rCT.Y;

    protected zx_3(Jq_1 jq_1) {
        super(jq_1);
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(new rCZ[]{id_volatile});
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xd_3 xd_32, rfH_2 rfH_23, boolean bl) {
        ryO_2 ryO_22;
        if (rYB2 instanceof rrEm_1 && (ryO_22 = rYB2.id_class(rfH_22)) instanceof ryG_2) {
            ryG_2 ryG_22 = (ryG_2)ryO_22;
            boolean bl2 = rYB2.id_public(rfH_22);
            boolean bl3 = ryG_22.id_goto();
            if (bl2 && !bl3) {
                ryG_22.id_byte(true);
                this.id_class((rrEm_1)rYB2, ryG_22);
            } else if (!bl2 && bl3) {
                ryG_22.id_byte(false);
            }
        }
    }

    private void id_class(rrEm_1 rrEm_12, ryG_2 ryG_22) {
        switch (ryG_22.id_package()) {
            case SAVE: {
                ryG_22.id_break(false);
                break;
            }
            case LOAD: {
                ryG_22.id_class(rrEm_12, false);
                break;
            }
            case CORNER: {
                ryG_22.id_return();
            }
        }
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        return (xc_3)this.id_continue().id_class(id_volatile, rCD.DATA);
    }

    @Override
    public ryZ_2 id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, rhd_3 rhd_32, rpm_3 rpm_32, rff_3 rff_32) {
        ryO_2 ryO_22 = rYB2.id_class(rfH_22);
        if (ryO_22 instanceof ryG_2) {
            return ((ryG_2)ryO_22).id_class(rhd_32) ? ryZ_2.id_class(rYB2.id_continue) : ryZ_2.PASS;
        }
        return ryZ_2.PASS;
    }

    @Override
    public void id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32, iB_2 iB_22, rdn_3 rdn_32) {
        ryO_2 ryO_22;
        if (!rYB2.id_continue && iB_22 != null && (ryO_22 = rYB2.id_class(rfH_22)) instanceof ryG_2) {
            ((ryG_2)ryO_22).id_class(iB_22);
        }
    }

    @Override
    public xN_2 id_class(xc_3 xc_32) {
        return xN_2.MODEL;
    }

    @Override
    public ryO_2 id_class(rRq_1 rRq_12) {
        return new ryG_2();
    }
}

