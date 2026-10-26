/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.WB;
import celestial.aI_2;
import celestial.an_3;
import celestial.iO_2;
import celestial.rCL;
import celestial.rCT;
import celestial.rCZ;
import celestial.rCu_1;
import celestial.rLQ;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rRu_1;
import celestial.rYB;
import celestial.rbG_2;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rpB_2;
import celestial.rpr_3;
import celestial.rqL_2;
import celestial.rqd_3;
import celestial.rqn_3;
import celestial.rrEm_1;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import java.util.Random;

public class kT_2
extends xd_3 {
    public static final rCu_1<rpB_2> id_volatile = rCT.id_char;
    protected static final rjC_2 id_final = xd_3.id_class(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
    protected static final rjC_2 id_package = xd_3.id_class(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);

    public kT_2(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, rpB_2.X));
    }

    @Override
    public rdn_3 id_class(rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32) {
        return rdn_3.id_break;
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rqd_3 rqd_32) {
        switch (rqd_32) {
            case COUNTERCLOCKWISE_90: 
            case CLOCKWISE_90: {
                switch (xc_32.id_byte(id_volatile)) {
                    case Z: {
                        return (xc_3)xc_32.id_class(id_volatile, rpB_2.X);
                    }
                    case X: {
                        return (xc_3)xc_32.id_class(id_volatile, rpB_2.Z);
                    }
                }
                return xc_32;
            }
        }
        return xc_32;
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(new rCZ[]{id_volatile});
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, Random random) {
        if (random.nextInt(100) == 0) {
            rYB2.id_class((double)rfH_22.b_() + 0.5, (double)rfH_22.c_() + 0.5, (double)rfH_22.d_() + 0.5, rqn_3.ho, rqL_2.BLOCKS, 0.5f, random.nextFloat() * 0.4f + 0.8f, false);
        }
        for (int i = 0; i < 4; ++i) {
            double d = (double)rfH_22.b_() + random.nextDouble();
            double d2 = (double)rfH_22.c_() + random.nextDouble();
            double d3 = (double)rfH_22.d_() + random.nextDouble();
            double d4 = ((double)random.nextFloat() - 0.5) * 0.5;
            double d5 = ((double)random.nextFloat() - 0.5) * 0.5;
            double d6 = ((double)random.nextFloat() - 0.5) * 0.5;
            int n = random.nextInt(2) * 2 - 1;
            if (!rYB2.id_byte(rfH_22.id_byte()).id_class(this) && !rYB2.id_byte(rfH_22.id_extends()).id_class(this)) {
                d = (double)rfH_22.b_() + 0.5 + 0.25 * (double)n;
                d4 = random.nextFloat() * 2.0f * (float)n;
            } else {
                d3 = (double)rfH_22.d_() + 0.5 + 0.25 * (double)n;
                d6 = random.nextFloat() * 2.0f * (float)n;
            }
            rYB2.id_class(rLQ.id_transient, d, d2, d3, d4, d5, d6);
        }
    }

    @Override
    public void id_class(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        if (rrEm_12.id_default().id_throws() && rrEm_12.B().id_break(rRu_1.id_protected) && random.nextInt(2000) < rrEm_12.id_abstract().id_class()) {
            rbG_2 rbG_22;
            while (rrEm_12.id_byte(rfH_22).id_class(this)) {
                rfH_22 = rfH_22.id_break();
            }
            if (rrEm_12.id_byte(rfH_22).id_class((rRq_1)rrEm_12, rfH_22, aI_2.rb) && (rbG_22 = aI_2.rb.id_class(rrEm_12, null, null, null, rfH_22.id_final(), iO_2.STRUCTURE, false, false)) != null) {
                rbG_22.rc();
            }
        }
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        rpB_2 rpB_22 = rpr_32.id_final();
        rpB_2 rpB_23 = xc_32.id_byte(id_volatile);
        boolean bl = rpB_23 != rpB_22 && rpB_22.id_protected();
        return !bl && !xc_33.id_class(this) && !new WB(rRg_12, rfH_22, rpB_23).id_byte() ? xu_3.id_class.id_continue() : super.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, an_3 an_32) {
        if (!an_32.Pm() && !an_32.BP() && an_32.I()) {
            an_32.id_protected(rfH_22);
        }
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        switch (xc_32.id_byte(id_volatile)) {
            case Z: {
                return id_package;
            }
        }
        return id_final;
    }
}

