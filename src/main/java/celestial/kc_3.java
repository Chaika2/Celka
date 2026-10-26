/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.kE_2;
import celestial.kd_3;
import celestial.rCL;
import celestial.rCN;
import celestial.rCT;
import celestial.rCc_1;
import celestial.rRR;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rXE;
import celestial.rXG;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rpa_3;
import celestial.rpr_3;
import celestial.rqd_3;
import celestial.rxx_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;

public class kc_3
extends xd_3
implements kd_3 {
    public static final rCc_1 id_volatile = kE_2.p;
    public static final rCN id_final = rCT.id_throw;
    protected static final rjC_2 id_package = xd_3.id_class(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
    protected static final rjC_2 id_int = xd_3.id_class(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
    protected static final rjC_2 id_new = xd_3.id_class(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
    protected static final rjC_2 id_continue = xd_3.id_class(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

    protected kc_3(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, rpr_3.NORTH)).id_class(id_final, false));
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rqd_3 rqd_32) {
        return (xc_3)xc_32.id_class(id_volatile, rqd_32.id_class(xc_32.id_byte(id_volatile)));
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpa_3 rpa_32) {
        return xc_32.id_class(rpa_32.id_class(xc_32.id_byte(id_volatile)));
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(id_volatile, id_final);
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        xc_3 xc_32;
        if (!rxx_32.id_byte() && (xc_32 = rxx_32.id_int().id_byte(rxx_32.id_class().id_break(rxx_32.id_finally().id_case()))).id_class(this) && xc_32.id_byte(id_volatile) == rxx_32.id_finally()) {
            return null;
        }
        xc_32 = this.id_continue();
        rYB rYB2 = rxx_32.id_int();
        rfH_2 rfH_22 = rxx_32.id_class();
        rXE rXE2 = rxx_32.id_int().id_break(rxx_32.id_class());
        for (rpr_3 rpr_32 : rxx_32.id_throws()) {
            if (!rpr_32.id_final().id_protected() || !(xc_32 = (xc_3)xc_32.id_class(id_volatile, rpr_32.id_case())).id_class((rRR)rYB2, rfH_22)) continue;
            return (xc_3)xc_32.id_class(id_final, rXE2.id_class() == rXG.id_byte);
        }
        return null;
    }

    private boolean id_class(rRq_1 rRq_12, rfH_2 rfH_22, rpr_3 rpr_32) {
        xc_3 xc_32 = rRq_12.id_byte(rfH_22);
        return xc_32.id_protected(rRq_12, rfH_22, rpr_32);
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRR rRR2, rfH_2 rfH_22) {
        rpr_3 rpr_32 = xc_32.id_byte(id_volatile);
        return this.id_class((rRq_1)rRR2, rfH_22.id_break(rpr_32.id_case()), rpr_32);
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        if (rpr_32.id_case() == xc_32.id_byte(id_volatile) && !xc_32.id_class(rRg_12, rfH_22)) {
            return xu_3.id_class.id_continue();
        }
        if (xc_32.id_byte(id_final).booleanValue()) {
            rRg_12.id_extends().id_class(rfH_22, rXG.id_byte, rXG.id_byte.id_class(rRg_12));
        }
        return super.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        switch (xc_32.id_byte(id_volatile)) {
            case NORTH: {
                return id_continue;
            }
            case SOUTH: {
                return id_new;
            }
            case WEST: {
                return id_int;
            }
        }
        return id_package;
    }

    @Override
    public rXE id_throws(xc_3 xc_32) {
        return xc_32.id_byte(id_final) != false ? rXG.id_byte.id_class(false) : super.id_throws(xc_32);
    }
}

