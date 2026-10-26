/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.du_3;
import celestial.kJ_2;
import celestial.rCf_1;
import celestial.rCu_1;
import celestial.rRR;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rXE;
import celestial.rXG;
import celestial.rXs_1;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rlG_2;
import celestial.rpr_3;
import celestial.rxx_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;

public class zu_3
extends du_3
implements kJ_2 {
    public static final rCu_1<rCf_1> id_final = du_3.id_volatile;
    protected static final rjC_2 id_package = xd_3.id_class(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

    public zu_3(Jq_1 jq_1) {
        super(jq_1);
    }

    @Override
    public boolean id_class(rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32, rXs_1 rXs_12) {
        return false;
    }

    @Override
    public boolean id_class(rRg_1 rRg_12, rfH_2 rfH_22, xc_3 xc_32, rXE rXE2) {
        return false;
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return id_package;
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        rXE rXE2;
        xc_3 xc_32 = super.id_class(rxx_32);
        if (xc_32 != null && (rXE2 = rxx_32.id_int().id_break(rxx_32.id_class().id_final())).id_class(rlG_2.id_break) && rXE2.id_throws() == 8) {
            return xc_32;
        }
        return null;
    }

    @Override
    public rdn_3 id_class(rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32) {
        return new rdn_3(xu_3.rr);
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRR rRR2, rfH_2 rfH_22) {
        if (xc_32.id_byte(id_final) == rCf_1.UPPER) {
            xc_3 xc_33 = rRR2.id_byte(rfH_22.id_break());
            return xc_33.id_class(this) && xc_33.id_byte(id_final) == rCf_1.LOWER;
        }
        rXE rXE2 = rRR2.id_break(rfH_22);
        return super.id_class(xc_32, rRR2, rfH_22) && rXE2.id_class(rlG_2.id_break) && rXE2.id_throws() == 8;
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

