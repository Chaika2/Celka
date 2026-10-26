/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.kE_2;
import celestial.rCH;
import celestial.rCT;
import celestial.rCu_1;
import celestial.rRR;
import celestial.rRg_1;
import celestial.rfH_2;
import celestial.rpB_2;
import celestial.rpr_3;
import celestial.rxx_3;
import celestial.xc_3;
import celestial.xu_3;

public class kG_2
extends kE_2 {
    public static final rCu_1<rCH> q = rCT.id_transient;

    protected kG_2(Jq_1 jq_1) {
        super(jq_1);
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        for (rpr_3 rpr_32 : rxx_32.id_throws()) {
            xc_3 xc_32 = rpr_32.id_final() == rpB_2.Y ? (xc_3)((xc_3)this.id_continue().id_class(q, rpr_32 == rpr_3.UP ? rCH.CEILING : rCH.FLOOR)).id_class(p, rxx_32.id_case()) : (xc_3)((xc_3)this.id_continue().id_class(q, rCH.WALL)).id_class(p, rpr_32.id_case());
            if (!xc_32.id_class((rRR)rxx_32.id_int(), rxx_32.id_class())) continue;
            return xc_32;
        }
        return null;
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRR rRR2, rfH_2 rfH_22) {
        return kG_2.id_break(rRR2, rfH_22, kG_2.id_private(xc_32).id_case());
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        return kG_2.id_private(xc_32).id_case() == rpr_32 && !xc_32.id_class(rRg_12, rfH_22) ? xu_3.id_class.id_continue() : super.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
    }

    public static boolean id_break(rRR rRR2, rfH_2 rfH_22, rpr_3 rpr_32) {
        rfH_2 rfH_23 = rfH_22.id_break(rpr_32);
        return rRR2.id_byte(rfH_23).id_protected(rRR2, rfH_23, rpr_32.id_case());
    }

    protected static rpr_3 id_private(xc_3 xc_32) {
        switch (xc_32.id_byte(q)) {
            case CEILING: {
                return rpr_3.DOWN;
            }
            case FLOOR: {
                return rpr_3.UP;
            }
        }
        return xc_32.id_byte(p);
    }
}

