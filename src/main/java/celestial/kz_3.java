/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.dB_2;
import celestial.iB_2;
import celestial.rCL;
import celestial.rCN;
import celestial.rCT;
import celestial.rCZ;
import celestial.rHg_1;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rdR_2;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rhd_3;
import celestial.rpm_3;
import celestial.rsE_2;
import celestial.ryO_2;
import celestial.ryZ_2;
import celestial.xN_2;
import celestial.xc_3;
import celestial.xd_3;

public class kz_3
extends dB_2 {
    public static final rCN id_volatile = rCT.id_final;

    protected kz_3(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, false));
    }

    @Override
    public void id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32, iB_2 iB_22, rdn_3 rdn_32) {
        rcd_3 rcd_32;
        super.id_class(rYB2, rfH_22, xc_32, iB_22, rdn_32);
        rcd_3 rcd_33 = rdn_32.id_int();
        if (rcd_33.id_throws("BlockEntityTag") && (rcd_32 = rcd_33.id_int("BlockEntityTag")).id_throws("RecordItem")) {
            rYB2.id_class(rfH_22, (xc_3)xc_32.id_class(id_volatile, true), 2);
        }
    }

    @Override
    public ryO_2 id_class(rRq_1 rRq_12) {
        return new rHg_1();
    }

    @Override
    public xN_2 id_class(xc_3 xc_32) {
        return xN_2.MODEL;
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(new rCZ[]{id_volatile});
    }

    @Override
    public ryZ_2 id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, rhd_3 rhd_32, rpm_3 rpm_32, rff_3 rff_32) {
        if (xc_32.id_byte(id_volatile).booleanValue()) {
            this.id_class(rYB2, rfH_22);
            xc_32 = (xc_3)xc_32.id_class(id_volatile, false);
            rYB2.id_class(rfH_22, xc_32, 2);
            return ryZ_2.id_class(rYB2.id_continue);
        }
        return ryZ_2.PASS;
    }

    private void id_class(rYB rYB2, rfH_2 rfH_22) {
        rHg_1 rHg_12;
        rdn_3 rdn_32;
        ryO_2 ryO_22;
        if (!rYB2.id_continue && (ryO_22 = rYB2.id_class(rfH_22)) instanceof rHg_1 && !(rdn_32 = (rHg_12 = (rHg_1)ryO_22).id_throws()).id_class()) {
            rYB2.id_byte(1010, rfH_22, 0);
            rHg_12.id_public();
            float f = 0.7f;
            double d = (double)(rYB2.id_int.nextFloat() * 0.7f) + (double)0.15f;
            double d2 = (double)(rYB2.id_int.nextFloat() * 0.7f) + 0.06000000238418579 + 0.6;
            double d3 = (double)(rYB2.id_int.nextFloat() * 0.7f) + (double)0.15f;
            rdn_3 rdn_33 = rdn_32.id_implements();
            rsE_2 rsE_22 = new rsE_2(rYB2, (double)rfH_22.b_() + d, (double)rfH_22.c_() + d2, (double)rfH_22.d_() + d3, rdn_33);
            rsE_22.id_private();
            rYB2.a_(rsE_22);
        }
    }

    public void id_class(rRg_1 rRg_12, rfH_2 rfH_22, xc_3 xc_32, rdn_3 rdn_32) {
        ryO_2 ryO_22 = rRg_12.id_class(rfH_22);
        if (ryO_22 instanceof rHg_1) {
            ((rHg_1)ryO_22).id_class(rdn_32.id_implements());
            rRg_12.id_class(rfH_22, (xc_3)xc_32.id_class(id_volatile, true), 2);
        }
    }

    @Override
    public void id_break(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xc_3 xc_33, boolean bl) {
        if (!xc_32.id_class(xc_33.id_break())) {
            this.id_class(rYB2, rfH_22);
            super.id_break(xc_32, rYB2, rfH_22, xc_33, bl);
        }
    }

    @Override
    public int id_break(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22) {
        rdb_3 rdb_32;
        ryO_2 ryO_22 = rYB2.id_class(rfH_22);
        if (ryO_22 instanceof rHg_1 && (rdb_32 = ((rHg_1)ryO_22).id_throws().id_break()) instanceof rdR_2) {
            return ((rdR_2)rdb_32).id_catch();
        }
        return 0;
    }

    @Override
    public boolean id_case(xc_3 xc_32) {
        return true;
    }
}

