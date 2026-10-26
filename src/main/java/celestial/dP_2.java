/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.dB_2;
import celestial.iB_2;
import celestial.kd_3;
import celestial.rCL;
import celestial.rCN;
import celestial.rCT;
import celestial.rCZ;
import celestial.rHA;
import celestial.rHO;
import celestial.rLT;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rXE;
import celestial.rXG;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rlG_2;
import celestial.rpr_3;
import celestial.rxx_3;
import celestial.ryO_2;
import celestial.xN_2;
import celestial.xc_3;
import celestial.xd_3;

public class dP_2
extends dB_2
implements kd_3 {
    public static final rCN id_volatile = rCT.id_throw;
    protected static final rjC_2 id_final = xd_3.id_class(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

    public dP_2(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, true));
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return id_final;
    }

    @Override
    public void id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32, iB_2 iB_22, rdn_3 rdn_32) {
        ryO_2 ryO_22;
        if (rdn_32.id_this() && (ryO_22 = rYB2.id_class(rfH_22)) instanceof rHO) {
            ((rHO)ryO_22).id_class(rdn_32.id_continue());
        }
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        rXE rXE2 = rxx_32.id_int().id_break(rxx_32.id_class());
        return (xc_3)this.id_continue().id_class(id_volatile, rXE2.id_class(rlG_2.id_break) && rXE2.id_throws() == 8);
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rLT rLT2) {
        return false;
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        if (xc_32.id_byte(id_volatile).booleanValue()) {
            rRg_12.id_extends().id_class(rfH_22, rXG.id_byte, rXG.id_byte.id_class(rRg_12));
        }
        return super.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
    }

    @Override
    public ryO_2 id_class(rRq_1 rRq_12) {
        return new rHA();
    }

    @Override
    public xN_2 id_class(xc_3 xc_32) {
        return xN_2.ENTITYBLOCK_ANIMATED;
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(new rCZ[]{id_volatile});
    }

    @Override
    public rXE id_throws(xc_3 xc_32) {
        return xc_32.id_byte(id_volatile) != false ? rXG.id_byte.id_class(false) : super.id_throws(xc_32);
    }
}

