/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.Wt_1;
import celestial.an_3;
import celestial.dV_2;
import celestial.rCL;
import celestial.rCN;
import celestial.rCT;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rhd_3;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rpa_3;
import celestial.rpr_3;
import celestial.rqd_3;
import celestial.rrEm_1;
import celestial.rxx_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.zC_2;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class zA_2
extends xd_3 {
    public static final rCN id_volatile = rCT.id_return;
    public static final rCN id_final = rCT.id_class;
    public static final rCN id_package = rCT.id_protected;
    public static final rCN id_int = Wt_1.id_volatile;
    public static final rCN id_new = Wt_1.id_final;
    public static final rCN id_continue = Wt_1.id_package;
    public static final rCN id_super = Wt_1.id_int;
    private static final Map<rpr_3, rCN> id_synchronized = dV_2.id_continue;
    protected static final rjC_2 id_this = xd_3.id_class(0.0, 1.0, 0.0, 16.0, 2.5, 16.0);
    protected static final rjC_2 id_else = xd_3.id_class(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
    private final zC_2 id_return;

    public zA_2(zC_2 zC_22, Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)((xc_3)((xc_3)((xc_3)((xc_3)((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, false)).id_class(id_final, false)).id_class(id_package, false)).id_class(id_int, false)).id_class(id_new, false)).id_class(id_continue, false)).id_class(id_super, false));
        this.id_return = zC_22;
    }

    public boolean id_class(xc_3 xc_32, rpr_3 rpr_32) {
        xd_3 xd_32 = xc_32.id_break();
        if (xd_32 == this.id_return) {
            return xc_32.id_byte(zC_2.id_volatile) == rpr_32.id_case();
        }
        return xd_32 == this;
    }

    private void id_class(rYB rYB2, rfH_2 rfH_22) {
        xc_3 xc_32 = rYB2.id_byte(rfH_22);
        boolean bl = xc_32.id_byte(id_volatile);
        boolean bl2 = false;
        List<an_3> list = rYB2.id_class((an_3)null, xc_32.id_finally(rYB2, rfH_22).id_class().id_class(rfH_22));
        if (!list.isEmpty()) {
            for (an_3 an_32 : list) {
                if (an_32.rB()) continue;
                bl2 = true;
                break;
            }
        }
        if (bl2 != bl) {
            xc_32 = (xc_3)xc_32.id_class(id_volatile, bl2);
            rYB2.id_class(rfH_22, xc_32, 3);
            this.id_class(rYB2, rfH_22, xc_32);
        }
        if (bl2) {
            rYB2.id_finally().id_class(new rfH_2(rfH_22), this, 10);
        }
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, an_3 an_32) {
        if (!rYB2.id_continue && !xc_32.id_byte(id_volatile).booleanValue()) {
            this.id_class(rYB2, rfH_22);
        }
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return xc_32.id_byte(id_final) != false ? id_this : id_else;
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rqd_3 rqd_32) {
        switch (rqd_32) {
            case CLOCKWISE_180: {
                return (xc_3)((xc_3)((xc_3)((xc_3)xc_32.id_class(id_int, xc_32.id_byte(id_continue))).id_class(id_new, xc_32.id_byte(id_super))).id_class(id_continue, xc_32.id_byte(id_int))).id_class(id_super, xc_32.id_byte(id_new));
            }
            case COUNTERCLOCKWISE_90: {
                return (xc_3)((xc_3)((xc_3)((xc_3)xc_32.id_class(id_int, xc_32.id_byte(id_new))).id_class(id_new, xc_32.id_byte(id_continue))).id_class(id_continue, xc_32.id_byte(id_super))).id_class(id_super, xc_32.id_byte(id_int));
            }
            case CLOCKWISE_90: {
                return (xc_3)((xc_3)((xc_3)((xc_3)xc_32.id_class(id_int, xc_32.id_byte(id_super))).id_class(id_new, xc_32.id_byte(id_int))).id_class(id_continue, xc_32.id_byte(id_new))).id_class(id_super, xc_32.id_byte(id_continue));
            }
        }
        return xc_32;
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpa_3 rpa_32) {
        switch (rpa_32) {
            case LEFT_RIGHT: {
                return (xc_3)((xc_3)xc_32.id_class(id_int, xc_32.id_byte(id_continue))).id_class(id_continue, xc_32.id_byte(id_int));
            }
            case FRONT_BACK: {
                return (xc_3)((xc_3)xc_32.id_class(id_new, xc_32.id_byte(id_super))).id_class(id_super, xc_32.id_byte(id_new));
            }
        }
        return super.id_class(xc_32, rpa_32);
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(id_volatile, id_final, id_package, id_int, id_new, id_super, id_continue);
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        rYB rYB2 = rxx_32.id_int();
        rfH_2 rfH_22 = rxx_32.id_class();
        return (xc_3)((xc_3)((xc_3)((xc_3)this.id_continue().id_class(id_int, this.id_class(rYB2.id_byte(rfH_22.id_private()), rpr_3.NORTH))).id_class(id_new, this.id_class(rYB2.id_byte(rfH_22.id_extends()), rpr_3.EAST))).id_class(id_continue, this.id_class(rYB2.id_byte(rfH_22.id_protected()), rpr_3.SOUTH))).id_class(id_super, this.id_class(rYB2.id_byte(rfH_22.id_byte()), rpr_3.WEST));
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        return rpr_32.id_final().id_protected() ? (xc_3)xc_32.id_class(id_synchronized.get(rpr_32), this.id_class(xc_33, rpr_32)) : super.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xc_3 xc_33, boolean bl) {
        if (!xc_33.id_class(xc_32.id_break())) {
            this.id_class(rYB2, rfH_22, xc_32);
        }
    }

    private void id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32) {
        block0: for (rpr_3 rpr_32 : new rpr_3[]{rpr_3.SOUTH, rpr_3.WEST}) {
            for (int i = 1; i < 42; ++i) {
                rfH_2 rfH_23 = rfH_22.id_class(rpr_32, i);
                xc_3 xc_33 = rYB2.id_byte(rfH_23);
                if (xc_33.id_class(this.id_return)) {
                    if (xc_33.id_byte(zC_2.id_volatile) != rpr_32.id_case()) continue block0;
                    this.id_return.id_class(rYB2, rfH_23, xc_33, false, true, i, xc_32);
                    continue block0;
                }
                if (!xc_33.id_class(this)) continue block0;
            }
        }
    }

    @Override
    public void id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32, rhd_3 rhd_32) {
        if (!rYB2.id_continue && !rhd_32.ss().id_class() && rhd_32.ss().id_break() == rdy_3.JJ) {
            rYB2.id_class(rfH_22, (xc_3)xc_32.id_class(id_package, true), 4);
        }
        super.id_class(rYB2, rfH_22, xc_32, rhd_32);
    }

    @Override
    public void id_break(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        if (rrEm_12.id_byte(rfH_22).id_byte(id_volatile).booleanValue()) {
            this.id_class(rrEm_12, rfH_22);
        }
    }

    @Override
    public void id_break(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xc_3 xc_33, boolean bl) {
        if (!bl && !xc_32.id_class(xc_33.id_break())) {
            this.id_class(rYB2, rfH_22, (xc_3)xc_32.id_class(id_volatile, true));
        }
    }
}

