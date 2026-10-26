/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.an_3;
import celestial.kd_3;
import celestial.rCL;
import celestial.rCN;
import celestial.rCT;
import celestial.rCm_1;
import celestial.rRR;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rXE;
import celestial.rXG;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfw_3;
import celestial.rjC_2;
import celestial.rja_3;
import celestial.rjm_3;
import celestial.rjw_3;
import celestial.rpb_3;
import celestial.rpr_3;
import celestial.rrEm_1;
import celestial.rsB_2;
import celestial.rxx_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import java.util.Iterator;
import java.util.Random;

public class Wl_1
extends xd_3
implements kd_3 {
    private static final rjC_2 id_int;
    private static final rjC_2 id_new;
    private static final rjC_2 id_continue;
    private static final rjC_2 id_super;
    public static final rCm_1 id_volatile;
    public static final rCN id_final;
    public static final rCN id_package;

    @Override
    public rjC_2 id_byte(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22) {
        return rjw_3.id_break();
    }

    protected Wl_1(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, 7)).id_class(id_final, false)).id_class(id_package, false));
    }

    static {
        id_continue = xd_3.id_class(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
        id_super = rjw_3.id_break().id_class(0.0, -1.0, 0.0);
        id_volatile = rCT.p;
        id_final = rCT.id_throw;
        id_package = rCT.id_break;
        rjC_2 rjC_22 = xd_3.id_class(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
        rjC_2 rjC_23 = xd_3.id_class(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
        rjC_2 rjC_24 = xd_3.id_class(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
        rjC_2 rjC_25 = xd_3.id_class(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
        rjC_2 rjC_26 = xd_3.id_class(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
        id_int = rjw_3.id_class(rjC_22, rjC_23, rjC_24, rjC_25, rjC_26);
        rjC_2 rjC_27 = xd_3.id_class(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
        rjC_2 rjC_28 = xd_3.id_class(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
        rjC_2 rjC_29 = xd_3.id_class(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
        rjC_2 rjC_210 = xd_3.id_class(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
        id_new = rjw_3.id_class(id_continue, id_int, rjC_28, rjC_27, rjC_210, rjC_29);
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(id_volatile, id_final, id_package);
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, an_3 an_32) {
        super.id_class(xc_32, rYB2, rfH_22, an_32);
        an_32.rL();
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRR rRR2, rfH_2 rfH_22) {
        return Wl_1.id_class(rRR2, rfH_22) < 7;
    }

    private boolean id_class(rRq_1 rRq_12, rfH_2 rfH_22, int n) {
        return n > 0 && !rRq_12.id_byte(rfH_22.id_break()).id_class(this);
    }

    public static int id_class(rRq_1 rRq_12, rfH_2 rfH_22) {
        rpr_3 rpr_32;
        xc_3 xc_32;
        rfw_3 rfw_32 = rfH_22.id_new().id_class(rpr_3.DOWN);
        xc_3 xc_33 = rRq_12.id_byte(rfw_32);
        int n = 7;
        if (xc_33.id_class(xu_3.hU)) {
            n = xc_33.id_byte(id_volatile);
        } else if (xc_33.id_protected(rRq_12, rfw_32, rpr_3.UP)) {
            return 0;
        }
        Iterator<rpr_3> iterator = rpb_3.HORIZONTAL.iterator();
        while (iterator.hasNext() && (!(xc_32 = rRq_12.id_byte(rfw_32.id_class((rja_3)rfH_22, rpr_32 = iterator.next()))).id_class(xu_3.hU) || (n = Math.min(n, xc_32.id_byte(id_volatile) + 1)) != 1)) {
        }
        return n;
    }

    @Override
    public boolean id_class(xc_3 xc_32, rxx_3 rxx_32) {
        return rxx_32.id_volatile().id_break() == this.id_case();
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        if (!rjm_32.id_class(xc_32.id_break().id_case())) {
            return xc_32.id_byte(id_package) != false ? id_new : id_int;
        }
        return rjw_3.id_break();
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        rfH_2 rfH_22 = rxx_32.id_class();
        rYB rYB2 = rxx_32.id_int();
        int n = Wl_1.id_class(rYB2, rfH_22);
        return (xc_3)((xc_3)((xc_3)this.id_continue().id_class(id_final, rYB2.id_break(rfH_22).id_class() == rXG.id_byte)).id_class(id_volatile, n)).id_class(id_package, this.id_class((rRq_1)rYB2, rfH_22, n));
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xc_3 xc_33, boolean bl) {
        if (!rYB2.id_continue) {
            rYB2.id_finally().id_class(rfH_22, this, 1);
        }
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        if (xc_32.id_byte(id_final).booleanValue()) {
            rRg_12.id_extends().id_class(rfH_22, rXG.id_byte, rXG.id_byte.id_class(rRg_12));
        }
        if (!rRg_12.id_import()) {
            rRg_12.id_finally().id_class(rfH_22, this, 1);
        }
        return xc_32;
    }

    @Override
    public void id_break(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        int n = Wl_1.id_class(rrEm_12, rfH_22);
        xc_3 xc_33 = (xc_3)((xc_3)xc_32.id_class(id_volatile, n)).id_class(id_package, this.id_class((rRq_1)rrEm_12, rfH_22, n));
        if (xc_33.id_byte(id_volatile) == 7) {
            if (xc_32.id_byte(id_volatile) == 7) {
                rrEm_12.a_(new rsB_2(rrEm_12, (double)rfH_22.b_() + 0.5, rfH_22.c_(), (double)rfH_22.d_() + 0.5, (xc_3)xc_33.id_class(id_final, false)));
            } else {
                rrEm_12.id_break(rfH_22, true);
            }
        } else if (xc_32 != xc_33) {
            rrEm_12.id_class(rfH_22, xc_33, 3);
        }
    }

    @Override
    public rjC_2 id_break(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        if (rjm_32.id_class(rjw_3.id_break(), rfH_22, true) && !rjm_32.id_class()) {
            return id_int;
        }
        return xc_32.id_byte(id_volatile) != 0 && xc_32.id_byte(id_package) != false && rjm_32.id_class(id_super, rfH_22, true) ? id_continue : rjw_3.id_class();
    }

    @Override
    public rXE id_throws(xc_3 xc_32) {
        return xc_32.id_byte(id_final) != false ? rXG.id_byte.id_class(false) : super.id_throws(xc_32);
    }
}

