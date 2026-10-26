/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.kd_3;
import celestial.rCL;
import celestial.rCN;
import celestial.rCT;
import celestial.rCo_1;
import celestial.rCu_1;
import celestial.rLT;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rXE;
import celestial.rXG;
import celestial.rXs_1;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rjw_3;
import celestial.rlG_2;
import celestial.rpr_3;
import celestial.rxx_3;
import celestial.xc_3;
import celestial.xd_3;

public class Wg_1
extends xd_3
implements kd_3 {
    public static final rCu_1<rCo_1> id_volatile = rCT.g;
    public static final rCN id_final = rCT.id_throw;
    protected static final rjC_2 id_package = xd_3.id_class(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
    protected static final rjC_2 id_int = xd_3.id_class(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

    public Wg_1(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)this.id_continue().id_class(id_volatile, rCo_1.BOTTOM)).id_class(id_final, false));
    }

    @Override
    public boolean id_class(rRg_1 rRg_12, rfH_2 rfH_22, xc_3 xc_32, rXE rXE2) {
        return xc_32.id_byte(id_volatile) != rCo_1.DOUBLE ? kd_3.super.id_class(rRg_12, rfH_22, xc_32, rXE2) : false;
    }

    @Override
    public boolean id_class(rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32, rXs_1 rXs_12) {
        return xc_32.id_byte(id_volatile) != rCo_1.DOUBLE ? kd_3.super.id_class(rRq_12, rfH_22, xc_32, rXs_12) : false;
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        if (xc_32.id_byte(id_final).booleanValue()) {
            rRg_12.id_extends().id_class(rfH_22, rXG.id_byte, rXG.id_byte.id_class(rRg_12));
        }
        return super.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rLT rLT2) {
        switch (rLT2) {
            case LAND: {
                return false;
            }
            case WATER: {
                return rRq_12.id_break(rfH_22).id_class(rlG_2.id_break);
            }
            case AIR: {
                return false;
            }
        }
        return false;
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(id_volatile, id_final);
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        rfH_2 rfH_22 = rxx_32.id_class();
        xc_3 xc_32 = rxx_32.id_int().id_byte(rfH_22);
        if (xc_32.id_class(this)) {
            return (xc_3)((xc_3)xc_32.id_class(id_volatile, rCo_1.DOUBLE)).id_class(id_final, false);
        }
        rXE rXE2 = rxx_32.id_int().id_break(rfH_22);
        xc_3 xc_33 = (xc_3)((xc_3)this.id_continue().id_class(id_volatile, rCo_1.BOTTOM)).id_class(id_final, rXE2.id_class() == rXG.id_byte);
        rpr_3 rpr_32 = rxx_32.id_finally();
        return !(rpr_32 == rpr_3.DOWN || rpr_32 != rpr_3.UP && rxx_32.id_extends().id_byte - (double)rfH_22.c_() > 0.5) ? xc_33 : (xc_3)xc_33.id_class(id_volatile, rCo_1.TOP);
    }

    @Override
    public boolean id_class(xc_3 xc_32, rxx_3 rxx_32) {
        rdn_3 rdn_32 = rxx_32.id_volatile();
        rCo_1 rCo_12 = xc_32.id_byte(id_volatile);
        if (rCo_12 != rCo_1.DOUBLE && rdn_32.id_break() == this.id_case()) {
            if (rxx_32.id_byte()) {
                boolean bl = rxx_32.id_extends().id_byte - (double)rxx_32.id_class().c_() > 0.5;
                rpr_3 rpr_32 = rxx_32.id_finally();
                if (rCo_12 == rCo_1.BOTTOM) {
                    return rpr_32 == rpr_3.UP || bl && rpr_32.id_final().id_protected();
                }
                return rpr_32 == rpr_3.DOWN || !bl && rpr_32.id_final().id_protected();
            }
            return true;
        }
        return false;
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        rCo_1 rCo_12 = xc_32.id_byte(id_volatile);
        switch (rCo_12) {
            case DOUBLE: {
                return rjw_3.id_break();
            }
            case TOP: {
                return id_int;
            }
        }
        return id_package;
    }

    @Override
    public boolean id_break(xc_3 xc_32) {
        return xc_32.id_byte(id_volatile) != rCo_1.DOUBLE;
    }

    @Override
    public rXE id_throws(xc_3 xc_32) {
        return xc_32.id_byte(id_final) != false ? rXG.id_byte.id_class(false) : super.id_throws(xc_32);
    }
}

