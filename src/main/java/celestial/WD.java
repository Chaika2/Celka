/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.rCL;
import celestial.rCT;
import celestial.rCZ;
import celestial.rCm_1;
import celestial.rLT;
import celestial.rRR;
import celestial.rRg_1;
import celestial.rRo_1;
import celestial.rRq_1;
import celestial.rfH_2;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rjw_3;
import celestial.rpr_3;
import celestial.rrEm_1;
import celestial.rxx_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import java.util.Random;

public class WD
extends xd_3 {
    public static final rCm_1 id_volatile = rCT.m;
    protected static final rjC_2[] id_final = new rjC_2[]{rjw_3.id_class(), xd_3.id_class(0.0, 0.0, 0.0, 16.0, 2.0, 16.0), xd_3.id_class(0.0, 0.0, 0.0, 16.0, 4.0, 16.0), xd_3.id_class(0.0, 0.0, 0.0, 16.0, 6.0, 16.0), xd_3.id_class(0.0, 0.0, 0.0, 16.0, 8.0, 16.0), xd_3.id_class(0.0, 0.0, 0.0, 16.0, 10.0, 16.0), xd_3.id_class(0.0, 0.0, 0.0, 16.0, 12.0, 16.0), xd_3.id_class(0.0, 0.0, 0.0, 16.0, 14.0, 16.0), xd_3.id_class(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)};

    @Override
    public rjC_2 id_byte(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return id_final[xc_32.id_byte(id_volatile)];
    }

    protected WD(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, 1));
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRR rRR2, rfH_2 rfH_22) {
        xc_3 xc_33 = rRR2.id_byte(rfH_22.id_break());
        if (!(xc_33.id_class(xu_3.PT) || xc_33.id_class(xu_3.Ei) || xc_33.id_class(xu_3.Ec))) {
            if (!xc_33.id_class(xu_3.Jh) && !xc_33.id_class(xu_3.PY)) {
                return xd_3.id_class(xc_33.id_extends(rRR2, rfH_22.id_break()), rpr_3.UP) || xc_33.id_break() == this && xc_33.id_byte(id_volatile) == 8;
            }
            return true;
        }
        return false;
    }

    @Override
    public void id_class(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        if (rrEm_12.id_class(rRo_1.BLOCK, rfH_22) > 11) {
            WD.id_protected(xc_32, rrEm_12, rfH_22);
            rrEm_12.id_class(rfH_22, false);
        }
    }

    @Override
    public boolean id_class(xc_3 xc_32, rxx_3 rxx_32) {
        int n = xc_32.id_byte(id_volatile);
        if (rxx_32.id_volatile().id_break() == this.id_case() && n < 8) {
            if (rxx_32.id_byte()) {
                return rxx_32.id_finally() == rpr_3.UP;
            }
            return true;
        }
        return n == 1;
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        xc_3 xc_32 = rxx_32.id_int().id_byte(rxx_32.id_class());
        if (xc_32.id_class(this)) {
            int n = xc_32.id_byte(id_volatile);
            return (xc_3)xc_32.id_class(id_volatile, Math.min(8, n + 1));
        }
        return super.id_class(rxx_32);
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(new rCZ[]{id_volatile});
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        return !xc_32.id_class(rRg_12, rfH_22) ? xu_3.id_class.id_continue() : super.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return id_final[xc_32.id_byte(id_volatile)];
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rLT rLT2) {
        switch (rLT2) {
            case LAND: {
                return xc_32.id_byte(id_volatile) < 5;
            }
            case WATER: {
                return false;
            }
            case AIR: {
                return false;
            }
        }
        return false;
    }

    @Override
    public rjC_2 id_break(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return id_final[xc_32.id_byte(id_volatile) - 1];
    }

    @Override
    public rjC_2 id_break(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22) {
        return id_final[xc_32.id_byte(id_volatile)];
    }

    @Override
    public boolean id_break(xc_3 xc_32) {
        return true;
    }
}

