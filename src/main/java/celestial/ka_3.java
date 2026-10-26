/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.dz_3;
import celestial.kD_2;
import celestial.rCL;
import celestial.rCN;
import celestial.rCT;
import celestial.rCg_1;
import celestial.rCu_1;
import celestial.rLT;
import celestial.rRR;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rhd_3;
import celestial.rhx_3;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rjw_3;
import celestial.rpa_3;
import celestial.rpr_3;
import celestial.rqd_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import java.util.Arrays;

public class ka_3
extends dz_3 {
    public static final rCu_1<rCg_1> id_final = rCT.V;
    public static final rCN id_package = rCT.id_public;
    protected static final rjC_2 id_int = xd_3.id_class(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
    protected static final rjC_2 id_new = xd_3.id_class(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
    protected static final rjC_2 id_continue = xd_3.id_class(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
    protected static final rjC_2 id_super = xd_3.id_class(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
    protected static final rjC_2 id_this = xd_3.id_class(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
    protected static final rjC_2 id_else = xd_3.id_class(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
    protected static final rjC_2 id_synchronized = xd_3.id_class(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
    protected static final rjC_2 id_return = xd_3.id_class(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
    protected static final rjC_2 id_public = xd_3.id_class(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
    protected static final rjC_2 id_goto = xd_3.id_class(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
    protected static final rjC_2 id_while = xd_3.id_class(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
    protected static final rjC_2 id_try = xd_3.id_class(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
    protected static final rjC_2 id_instanceof = xd_3.id_class(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
    protected static final rjC_2 id_throw = xd_3.id_class(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
    protected static final rjC_2 id_long = xd_3.id_class(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
    protected static final rjC_2 id_float = xd_3.id_class(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
    protected static final rjC_2 id_void = xd_3.id_class(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
    protected static final rjC_2 id_static = xd_3.id_class(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
    private static final rjC_2[] id_import = ka_3.id_class(true);
    private static final rjC_2[] id_short = ka_3.id_class(false);

    public ka_3(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, rpr_3.NORTH)).id_class(id_final, rCg_1.DEFAULT)).id_class(id_package, false));
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
    public rdn_3 id_class(rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32) {
        return new rdn_3(xc_32.id_byte(id_final) == rCg_1.STICKY ? xu_3.D : xu_3.rB);
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xd_3 xd_32, rfH_2 rfH_23, boolean bl) {
        if (xc_32.id_class((rRR)rYB2, rfH_22)) {
            rfH_2 rfH_24 = rfH_22.id_break(xc_32.id_byte(id_volatile).id_case());
            rYB2.id_byte(rfH_24).id_class(rYB2, rfH_24, xd_32, rfH_23, false);
        }
    }

    private static rjC_2[] id_class(boolean bl) {
        return (rjC_2[])Arrays.stream(rpr_3.values()).map(rpr_32 -> ka_3.id_class(rpr_32, bl)).toArray(rjC_2[]::new);
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rLT rLT2) {
        return false;
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(id_volatile, id_final, id_package);
    }

    @Override
    public void id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32, rhd_3 rhd_32) {
        rfH_2 rfH_23;
        if (!rYB2.id_continue && ((rhx_3)rhd_32.id_implements[18]).id_protected && this.id_class(xc_32, rYB2.id_byte(rfH_23 = rfH_22.id_break(xc_32.id_byte(id_volatile).id_case())))) {
            rYB2.id_break(rfH_23, false);
        }
        super.id_class(rYB2, rfH_22, xc_32, rhd_32);
    }

    private boolean id_class(xc_3 xc_32, xc_3 xc_33) {
        xd_3 xd_32 = xc_32.id_byte(id_final) == rCg_1.DEFAULT ? xu_3.rB : xu_3.D;
        return xc_33.id_class(xd_32) && xc_33.id_byte(kD_2.id_final) != false && xc_33.id_byte(id_volatile) == xc_32.id_byte(id_volatile);
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return (xc_32.id_byte(id_package) != false ? id_import : id_short)[xc_32.id_byte(id_volatile).ordinal()];
    }

    private static rjC_2 id_class(rpr_3 rpr_32, boolean bl) {
        switch (rpr_32) {
            default: {
                return rjw_3.id_class(id_else, bl ? id_throw : id_return);
            }
            case UP: {
                return rjw_3.id_class(id_this, bl ? id_instanceof : id_synchronized);
            }
            case NORTH: {
                return rjw_3.id_class(id_super, bl ? id_float : id_goto);
            }
            case SOUTH: {
                return rjw_3.id_class(id_continue, bl ? id_long : id_public);
            }
            case WEST: {
                return rjw_3.id_class(id_new, bl ? id_static : id_try);
            }
            case EAST: 
        }
        return rjw_3.id_class(id_int, bl ? id_void : id_while);
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRR rRR2, rfH_2 rfH_22) {
        xc_3 xc_33 = rRR2.id_byte(rfH_22.id_break(xc_32.id_byte(id_volatile).id_case()));
        return this.id_class(xc_32, xc_33) || xc_33.id_class(xu_3.rc) && xc_33.id_byte(id_volatile) == xc_32.id_byte(id_volatile);
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        return rpr_32.id_case() == xc_32.id_byte(id_volatile) && !xc_32.id_class(rRg_12, rfH_22) ? xu_3.id_class.id_continue() : super.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
    }

    @Override
    public void id_break(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xc_3 xc_33, boolean bl) {
        if (!xc_32.id_class(xc_33.id_break())) {
            super.id_break(xc_32, rYB2, rfH_22, xc_33, bl);
            rfH_2 rfH_23 = rfH_22.id_break(xc_32.id_byte(id_volatile).id_case());
            if (this.id_class(xc_32, rYB2.id_byte(rfH_23))) {
                rYB2.id_break(rfH_23, true);
            }
        }
    }

    @Override
    public boolean id_break(xc_3 xc_32) {
        return true;
    }
}

