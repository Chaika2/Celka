/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.dV_2;
import celestial.rCL;
import celestial.rCZ;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rXE;
import celestial.rXG;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rjw_3;
import celestial.rls_3;
import celestial.rpr_3;
import celestial.rxx_3;
import celestial.xc_3;
import celestial.xd_3;

public class kK_2
extends dV_2 {
    @Override
    public rjC_2 id_byte(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return rjw_3.id_class();
    }

    protected kK_2(Jq_1 jq_1) {
        super(1.0f, 1.0f, 16.0f, 16.0f, 16.0f, jq_1);
        this.id_extends((xc_3)((xc_3)((xc_3)((xc_3)((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, false)).id_class(id_final, false)).id_class(id_package, false)).id_class(id_int, false)).id_class(id_new, false));
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(id_volatile, id_final, id_int, id_package, id_new);
    }

    public final boolean id_class(xc_3 xc_32, boolean bl) {
        xd_3 xd_32 = xc_32.id_break();
        return !kK_2.id_byte(xd_32) && bl || xd_32 instanceof kK_2 || xd_32.id_class(rls_3.id_abstract);
    }

    @Override
    public boolean id_class(xc_3 xc_32, xc_3 xc_33, rpr_3 rpr_32) {
        if (xc_33.id_class(this)) {
            if (!rpr_32.id_final().id_protected()) {
                return true;
            }
            if (((Boolean)xc_32.id_byte((rCZ)id_continue.get(rpr_32))).booleanValue() && ((Boolean)xc_33.id_byte((rCZ)id_continue.get(rpr_32.id_case()))).booleanValue()) {
                return true;
            }
        }
        return super.id_class(xc_32, xc_33, rpr_32);
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        rYB rYB2 = rxx_32.id_int();
        rfH_2 rfH_22 = rxx_32.id_class();
        rXE rXE2 = rxx_32.id_int().id_break(rxx_32.id_class());
        rfH_2 rfH_23 = rfH_22.id_private();
        rfH_2 rfH_24 = rfH_22.id_protected();
        rfH_2 rfH_25 = rfH_22.id_byte();
        rfH_2 rfH_26 = rfH_22.id_extends();
        xc_3 xc_32 = rYB2.id_byte(rfH_23);
        xc_3 xc_33 = rYB2.id_byte(rfH_24);
        xc_3 xc_34 = rYB2.id_byte(rfH_25);
        xc_3 xc_35 = rYB2.id_byte(rfH_26);
        return (xc_3)((xc_3)((xc_3)((xc_3)((xc_3)this.id_continue().id_class(id_volatile, this.id_class(xc_32, xc_32.id_protected(rYB2, rfH_23, rpr_3.SOUTH)))).id_class(id_package, this.id_class(xc_33, xc_33.id_protected(rYB2, rfH_24, rpr_3.NORTH)))).id_class(id_int, this.id_class(xc_34, xc_34.id_protected(rYB2, rfH_25, rpr_3.EAST)))).id_class(id_final, this.id_class(xc_35, xc_35.id_protected(rYB2, rfH_26, rpr_3.WEST)))).id_class(id_new, rXE2.id_class() == rXG.id_byte);
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        if (xc_32.id_byte(id_new).booleanValue()) {
            rRg_12.id_extends().id_class(rfH_22, rXG.id_byte, rXG.id_byte.id_class(rRg_12));
        }
        return rpr_32.id_final().id_protected() ? (xc_3)xc_32.id_class((rCZ)id_continue.get(rpr_32), this.id_class(xc_33, xc_33.id_protected(rRg_12, rfH_23, rpr_32.id_case()))) : super.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
    }
}

