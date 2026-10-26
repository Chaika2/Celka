/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.kJ_2;
import celestial.kX_2;
import celestial.rCf_1;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rXE;
import celestial.rXG;
import celestial.rXs_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rlG_2;
import celestial.rpr_3;
import celestial.rrEm_1;
import celestial.rxx_3;
import celestial.xF_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import celestial.zu_3;
import java.util.Random;

public class WH
extends xF_2
implements kJ_2,
kX_2 {
    protected static final rjC_2 id_volatile = xd_3.id_class(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

    protected WH(Jq_1 jq_1) {
        super(jq_1);
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return id_volatile;
    }

    @Override
    public boolean id_class(rRg_1 rRg_12, rfH_2 rfH_22, xc_3 xc_32, rXE rXE2) {
        return false;
    }

    @Override
    public void id_class(rrEm_1 rrEm_12, Random random, rfH_2 rfH_22, xc_3 xc_32) {
        xc_3 xc_33 = xu_3.rP.id_continue();
        xc_3 xc_34 = (xc_3)xc_33.id_class(zu_3.id_final, rCf_1.UPPER);
        rfH_2 rfH_23 = rfH_22.id_final();
        if (rrEm_12.id_byte(rfH_23).id_class(xu_3.id_try)) {
            rrEm_12.id_class(rfH_22, xc_33, 2);
            rrEm_12.id_class(rfH_23, xc_34, 2);
        }
    }

    @Override
    public boolean id_class(rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32, rXs_1 rXs_12) {
        return false;
    }

    @Override
    public boolean id_class(rYB rYB2, Random random, rfH_2 rfH_22, xc_3 xc_32) {
        return true;
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        rXE rXE2 = rxx_32.id_int().id_break(rxx_32.id_class());
        return rXE2.id_class(rlG_2.id_break) && rXE2.id_throws() == 8 ? super.id_class(rxx_32) : null;
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        xc_3 xc_34 = super.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
        if (!xc_34.id_catch()) {
            rRg_12.id_extends().id_class(rfH_22, rXG.id_byte, rXG.id_byte.id_class(rRg_12));
        }
        return xc_34;
    }

    @Override
    public boolean id_class(rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32, boolean bl) {
        return true;
    }

    @Override
    public rXE id_throws(xc_3 xc_32) {
        return rXG.id_byte.id_class(false);
    }

    @Override
    protected boolean id_catch(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22) {
        return xc_32.id_protected(rRq_12, rfH_22, rpr_3.UP) && !xc_32.id_class(xu_3.bV);
    }
}

