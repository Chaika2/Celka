/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.WL;
import celestial.kd_3;
import celestial.rCL;
import celestial.rCN;
import celestial.rCT;
import celestial.rCZ;
import celestial.rLT;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rXE;
import celestial.rXG;
import celestial.rfH_2;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rpB_2;
import celestial.rpr_3;
import celestial.rxx_3;
import celestial.xc_3;
import celestial.xd_3;

public class xq_3
extends WL
implements kd_3 {
    public static final rCN id_volatile = rCT.id_throw;
    protected static final rjC_2 id_final = xd_3.id_class(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
    protected static final rjC_2 id_package = xd_3.id_class(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
    protected static final rjC_2 id_int = xd_3.id_class(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

    public xq_3(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, false)).id_class(id_new, rpB_2.Y));
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rLT rLT2) {
        return false;
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(new rCZ[]{id_volatile}).id_class(new rCZ[]{id_new});
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        switch ((rpB_2)xc_32.id_byte(id_new)) {
            default: {
                return id_int;
            }
            case Z: {
                return id_package;
            }
            case Y: 
        }
        return id_final;
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        if (xc_32.id_byte(id_volatile).booleanValue()) {
            rRg_12.id_extends().id_class(rfH_22, rXG.id_byte, rXG.id_byte.id_class(rRg_12));
        }
        return super.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        rXE rXE2 = rxx_32.id_int().id_break(rxx_32.id_class());
        boolean bl = rXE2.id_class() == rXG.id_byte;
        return (xc_3)super.id_class(rxx_32).id_class(id_volatile, bl);
    }

    @Override
    public rXE id_throws(xc_3 xc_32) {
        return xc_32.id_byte(id_volatile) != false ? rXG.id_byte.id_class(false) : super.id_throws(xc_32);
    }
}

