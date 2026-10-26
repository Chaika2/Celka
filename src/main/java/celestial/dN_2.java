/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.QP;
import celestial.Qs_1;
import celestial.du_3;
import celestial.iB_2;
import celestial.kE_2;
import celestial.rCI;
import celestial.rCL;
import celestial.rCN;
import celestial.rCT;
import celestial.rCc_1;
import celestial.rCf_1;
import celestial.rCu_1;
import celestial.rLT;
import celestial.rRR;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rff_3;
import celestial.rhd_3;
import celestial.rjC_2;
import celestial.rjU_2;
import celestial.rjm_3;
import celestial.rpB_2;
import celestial.rpa_3;
import celestial.rpm_3;
import celestial.rpr_3;
import celestial.rqd_3;
import celestial.rxx_3;
import celestial.ryZ_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;

public class dN_2
extends xd_3 {
    public static final rCc_1 id_volatile = kE_2.p;
    public static final rCN id_final = rCT.id_else;
    public static final rCu_1<rCI> id_package = rCT.f;
    public static final rCN id_int = rCT.id_return;
    public static final rCu_1<rCf_1> id_new = rCT.G;
    protected static final rjC_2 id_continue = xd_3.id_class(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
    protected static final rjC_2 id_super = xd_3.id_class(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
    protected static final rjC_2 id_this = xd_3.id_class(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
    protected static final rjC_2 id_else = xd_3.id_class(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);

    protected dN_2(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)((xc_3)((xc_3)((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, rpr_3.NORTH)).id_class(id_final, false)).id_class(id_package, rCI.LEFT)).id_class(id_int, false)).id_class(id_new, rCf_1.LOWER));
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rqd_3 rqd_32) {
        return (xc_3)xc_32.id_class(id_volatile, rqd_32.id_class(xc_32.id_byte(id_volatile)));
    }

    private void id_class(rYB rYB2, rfH_2 rfH_22, boolean bl) {
        rYB2.id_class((rhd_3)null, bl ? this.id_implements() : this.id_break(), rfH_22, 0);
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRR rRR2, rfH_2 rfH_22) {
        rfH_2 rfH_23 = rfH_22.id_break();
        xc_3 xc_33 = rRR2.id_byte(rfH_23);
        return xc_32.id_byte(id_new) == rCf_1.LOWER ? xc_33.id_protected(rRR2, rfH_23, rpr_3.UP) : xc_33.id_class(this);
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xd_3 xd_32, rfH_2 rfH_23, boolean bl) {
        boolean bl2;
        boolean bl3 = rYB2.id_public(rfH_22) || rYB2.id_public(rfH_22.id_break(xc_32.id_byte(id_new) == rCf_1.LOWER ? rpr_3.UP : rpr_3.DOWN)) ? true : (bl2 = false);
        if (xd_32 != this && bl2 != xc_32.id_byte(id_int)) {
            if (bl2 != xc_32.id_byte(id_final)) {
                this.id_class(rYB2, rfH_22, bl2);
            }
            rYB2.id_class(rfH_22, (xc_3)((xc_3)xc_32.id_class(id_int, bl2)).id_class(id_final, bl2), 2);
        }
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        rpr_3 rpr_32 = xc_32.id_byte(id_volatile);
        boolean bl = xc_32.id_byte(id_final) == false;
        boolean bl2 = xc_32.id_byte(id_package) == rCI.RIGHT;
        switch (rpr_32) {
            default: {
                return bl ? id_else : (bl2 ? id_super : id_continue);
            }
            case SOUTH: {
                return bl ? id_continue : (bl2 ? id_else : id_this);
            }
            case WEST: {
                return bl ? id_this : (bl2 ? id_continue : id_super);
            }
            case NORTH: 
        }
        return bl ? id_super : (bl2 ? id_this : id_else);
    }

    public void id_class(rYB rYB2, xc_3 xc_32, rfH_2 rfH_22, boolean bl) {
        if (xc_32.id_class(this) && xc_32.id_byte(id_final) != bl) {
            rYB2.id_class(rfH_22, (xc_3)xc_32.id_class(id_final, bl), 10);
            this.id_class(rYB2, rfH_22, bl);
        }
    }

    public static boolean id_class(rYB rYB2, rfH_2 rfH_22) {
        return dN_2.id_implements(rYB2.id_byte(rfH_22));
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(id_new, id_volatile, id_final, id_package, id_int);
    }

    @Override
    public long id_class(xc_3 xc_32, rfH_2 rfH_22) {
        return rfU_2.id_byte(rfH_22.b_(), rfH_22.id_catch(xc_32.id_byte(id_new) == rCf_1.LOWER ? 0 : 1).c_(), rfH_22.d_());
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpa_3 rpa_32) {
        return rpa_32 == rpa_3.NONE ? xc_32 : (xc_3)xc_32.id_class(rpa_32.id_class(xc_32.id_byte(id_volatile))).id_class(id_package);
    }

    @Override
    public void id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32, iB_2 iB_22, rdn_3 rdn_32) {
        rYB2.id_class(rfH_22.id_final(), (xc_3)xc_32.id_class(id_new, rCf_1.UPPER), 3);
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rLT rLT2) {
        switch (rLT2) {
            case LAND: {
                return xc_32.id_byte(id_final);
            }
            case WATER: {
                return false;
            }
            case AIR: {
                return xc_32.id_byte(id_final);
            }
        }
        return false;
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        rfH_2 rfH_22 = rxx_32.id_class();
        if (rfH_22.c_() < 255 && rxx_32.id_int().id_byte(rfH_22.id_final()).id_class(rxx_32)) {
            rYB rYB2 = rxx_32.id_int();
            boolean bl = rYB2.id_public(rfH_22) || rYB2.id_public(rfH_22.id_final());
            return (xc_3)((xc_3)((xc_3)((xc_3)((xc_3)this.id_continue().id_class(id_volatile, rxx_32.id_case())).id_class(id_package, this.id_break(rxx_32))).id_class(id_int, bl)).id_class(id_final, bl)).id_class(id_new, rCf_1.LOWER);
        }
        return null;
    }

    @Override
    public void id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32, rhd_3 rhd_32) {
        if (!rYB2.id_continue && rhd_32.id_implements()) {
            du_3.id_break(rYB2, rfH_22, xc_32, rhd_32);
        }
        super.id_class(rYB2, rfH_22, xc_32, rhd_32);
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        rCf_1 rCf_12 = xc_32.id_byte(id_new);
        if (rpr_32.id_final() == rpB_2.Y && rCf_12 == rCf_1.LOWER == (rpr_32 == rpr_3.UP)) {
            return xc_33.id_class(this) && xc_33.id_byte(id_new) != rCf_12 ? (xc_3)((xc_3)((xc_3)((xc_3)xc_32.id_class(id_volatile, xc_33.id_byte(id_volatile))).id_class(id_final, xc_33.id_byte(id_final))).id_class(id_package, xc_33.id_byte(id_package))).id_class(id_int, xc_33.id_byte(id_int)) : xu_3.id_class.id_continue();
        }
        return rCf_12 == rCf_1.LOWER && rpr_32 == rpr_3.DOWN && !xc_32.id_class(rRg_12, rfH_22) ? xu_3.id_class.id_continue() : super.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
    }

    @Override
    public ryZ_2 id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, rhd_3 rhd_32, rpm_3 rpm_32, rff_3 rff_32) {
        if (this.id_break == QP.id_static) {
            return ryZ_2.PASS;
        }
        xc_32 = (xc_3)xc_32.id_class(id_final);
        rYB2.id_class(rfH_22, xc_32, 10);
        rYB2.id_class(rhd_32, xc_32.id_byte(id_final) != false ? this.id_implements() : this.id_break(), rfH_22, 0);
        return ryZ_2.id_class(rYB2.id_continue);
    }

    private int id_break() {
        return this.id_break == QP.id_static ? 1011 : 1012;
    }

    private rCI id_break(rxx_3 rxx_32) {
        boolean bl;
        rYB rYB2 = rxx_32.id_int();
        rfH_2 rfH_22 = rxx_32.id_class();
        rpr_3 rpr_32 = rxx_32.id_case();
        rfH_2 rfH_23 = rfH_22.id_final();
        rpr_3 rpr_33 = rpr_32.id_private();
        rfH_2 rfH_24 = rfH_22.id_break(rpr_33);
        xc_3 xc_32 = rYB2.id_byte(rfH_24);
        rfH_2 rfH_25 = rfH_23.id_break(rpr_33);
        xc_3 xc_33 = rYB2.id_byte(rfH_25);
        rpr_3 rpr_34 = rpr_32.id_catch();
        rfH_2 rfH_26 = rfH_22.id_break(rpr_34);
        xc_3 xc_34 = rYB2.id_byte(rfH_26);
        rfH_2 rfH_27 = rfH_23.id_break(rpr_34);
        xc_3 xc_35 = rYB2.id_byte(rfH_27);
        int n = (xc_32.id_new(rYB2, rfH_24) ? -1 : 0) + (xc_33.id_new(rYB2, rfH_25) ? -1 : 0) + (xc_34.id_new(rYB2, rfH_26) ? 1 : 0) + (xc_35.id_new(rYB2, rfH_27) ? 1 : 0);
        boolean bl2 = xc_32.id_class(this) && xc_32.id_byte(id_new) == rCf_1.LOWER;
        boolean bl3 = bl = xc_34.id_class(this) && xc_34.id_byte(id_new) == rCf_1.LOWER;
        if ((!bl2 || bl) && n <= 0) {
            if ((!bl || bl2) && n >= 0) {
                int n2 = rpr_32.id_implements();
                int n3 = rpr_32.id_extends();
                rjU_2 rjU_22 = rxx_32.id_extends();
                double d = rjU_22.id_break - (double)rfH_22.b_();
                double d2 = rjU_22.id_protected - (double)rfH_22.d_();
                return !(n2 < 0 && d2 < 0.5 || n2 > 0 && d2 > 0.5 || n3 < 0 && d > 0.5 || n3 > 0 && d < 0.5) ? rCI.LEFT : rCI.RIGHT;
            }
            return rCI.LEFT;
        }
        return rCI.RIGHT;
    }

    public static boolean id_implements(xc_3 xc_32) {
        return xc_32.id_break() instanceof dN_2 && (xc_32.id_byte() == QP.id_goto || xc_32.id_byte() == QP.id_while);
    }

    private int id_implements() {
        return this.id_break == QP.id_static ? 1005 : 1006;
    }

    @Override
    public Qs_1 id_protected(xc_3 xc_32) {
        return Qs_1.DESTROY;
    }

    public boolean id_private(xc_3 xc_32) {
        return xc_32.id_byte(id_final);
    }
}

