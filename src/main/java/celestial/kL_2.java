/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.kG_2;
import celestial.rCH;
import celestial.rCL;
import celestial.rCN;
import celestial.rCT;
import celestial.rLc_1;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rhd_3;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rpm_3;
import celestial.rpr_3;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.ryZ_2;
import celestial.xc_3;
import celestial.xd_3;
import java.util.Random;

public class kL_2
extends kG_2 {
    public static final rCN id_volatile = rCT.id_return;
    protected static final rjC_2 id_final = xd_3.id_class(5.0, 4.0, 10.0, 11.0, 12.0, 16.0);
    protected static final rjC_2 id_package = xd_3.id_class(5.0, 4.0, 0.0, 11.0, 12.0, 6.0);
    protected static final rjC_2 id_int = xd_3.id_class(10.0, 4.0, 5.0, 16.0, 12.0, 11.0);
    protected static final rjC_2 id_new = xd_3.id_class(0.0, 4.0, 5.0, 6.0, 12.0, 11.0);
    protected static final rjC_2 id_continue = xd_3.id_class(5.0, 0.0, 4.0, 11.0, 6.0, 12.0);
    protected static final rjC_2 id_super = xd_3.id_class(4.0, 0.0, 5.0, 12.0, 6.0, 11.0);
    protected static final rjC_2 id_this = xd_3.id_class(5.0, 10.0, 4.0, 11.0, 16.0, 12.0);
    protected static final rjC_2 id_else = xd_3.id_class(4.0, 10.0, 5.0, 12.0, 16.0, 11.0);

    public xc_3 id_byte(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22) {
        xc_32 = (xc_3)xc_32.id_class(id_volatile);
        rYB2.id_class(rfH_22, xc_32, 3);
        this.id_throws(xc_32, rYB2, rfH_22);
        return xc_32;
    }

    @Override
    public boolean id_byte(xc_3 xc_32) {
        return true;
    }

    protected kL_2(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)((xc_3)((xc_3)this.id_abstract.id_break()).id_class(p, rpr_3.NORTH)).id_class(id_volatile, false)).id_class(q, rCH.WALL));
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(q, p, id_volatile);
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        switch ((rCH)xc_32.id_byte(q)) {
            case FLOOR: {
                switch (xc_32.id_byte(p).id_final()) {
                    case X: {
                        return id_super;
                    }
                }
                return id_continue;
            }
            case WALL: {
                switch (xc_32.id_byte(p)) {
                    case EAST: {
                        return id_new;
                    }
                    case WEST: {
                        return id_int;
                    }
                    case SOUTH: {
                        return id_package;
                    }
                }
                return id_final;
            }
        }
        switch (xc_32.id_byte(p).id_final()) {
            case X: {
                return id_else;
            }
        }
        return id_this;
    }

    @Override
    public int id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rpr_3 rpr_32) {
        return xc_32.id_byte(id_volatile) != false ? 15 : 0;
    }

    private static void id_class(xc_3 xc_32, rRg_1 rRg_12, rfH_2 rfH_22, float f) {
        rpr_3 rpr_32 = xc_32.id_byte(p).id_case();
        rpr_3 rpr_33 = kL_2.id_private(xc_32).id_case();
        double d = (double)rfH_22.b_() + 0.5 + 0.1 * (double)rpr_32.id_implements() + 0.2 * (double)rpr_33.id_implements();
        double d2 = (double)rfH_22.c_() + 0.5 + 0.1 * (double)rpr_32.id_finally() + 0.2 * (double)rpr_33.id_finally();
        double d3 = (double)rfH_22.d_() + 0.5 + 0.1 * (double)rpr_32.id_extends() + 0.2 * (double)rpr_33.id_extends();
        rRg_12.id_class(new rLc_1(1.0f, 0.0f, 0.0f, f), d, d2, d3, 0.0, 0.0, 0.0);
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, Random random) {
        if (xc_32.id_byte(id_volatile).booleanValue() && random.nextFloat() < 0.25f) {
            kL_2.id_class(xc_32, (rRg_1)rYB2, rfH_22, 0.5f);
        }
    }

    @Override
    public ryZ_2 id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, rhd_3 rhd_32, rpm_3 rpm_32, rff_3 rff_32) {
        if (rYB2.id_continue) {
            xc_3 xc_33 = (xc_3)xc_32.id_class(id_volatile);
            if (xc_33.id_byte(id_volatile).booleanValue()) {
                kL_2.id_class(xc_33, (rRg_1)rYB2, rfH_22, 1.0f);
            }
            return ryZ_2.SUCCESS;
        }
        xc_3 xc_34 = this.id_byte(xc_32, rYB2, rfH_22);
        float f = xc_34.id_byte(id_volatile) != false ? 0.6f : 0.5f;
        rYB2.id_class((rhd_3)null, rfH_22, rqn_3.Gb, rqL_2.BLOCKS, 0.3f, f);
        return ryZ_2.CONSUME;
    }

    @Override
    public void id_break(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xc_3 xc_33, boolean bl) {
        if (!bl && !xc_32.id_class(xc_33.id_break())) {
            if (xc_32.id_byte(id_volatile).booleanValue()) {
                this.id_throws(xc_32, rYB2, rfH_22);
            }
            super.id_break(xc_32, rYB2, rfH_22, xc_33, bl);
        }
    }

    @Override
    public int id_break(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rpr_3 rpr_32) {
        return xc_32.id_byte(id_volatile) != false && kL_2.id_private(xc_32) == rpr_32 ? 15 : 0;
    }

    private void id_throws(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22) {
        rYB2.id_break(rfH_22, this);
        rYB2.id_break(rfH_22.id_break(kL_2.id_private(xc_32).id_case()), this);
    }
}

