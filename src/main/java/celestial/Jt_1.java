/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.an_3;
import celestial.kG_2;
import celestial.rCH;
import celestial.rCL;
import celestial.rCN;
import celestial.rCT;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rhd_3;
import celestial.rhm_3;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rpB_2;
import celestial.rpm_3;
import celestial.rpr_3;
import celestial.rqA_2;
import celestial.rqL_2;
import celestial.rrEm_1;
import celestial.ryZ_2;
import celestial.xc_3;
import celestial.xd_3;
import java.util.List;
import java.util.Random;

public abstract class Jt_1
extends kG_2 {
    public static final rCN id_volatile = rCT.id_return;
    protected static final rjC_2 id_final = xd_3.id_class(6.0, 14.0, 5.0, 10.0, 16.0, 11.0);
    protected static final rjC_2 id_package = xd_3.id_class(5.0, 14.0, 6.0, 11.0, 16.0, 10.0);
    protected static final rjC_2 id_int = xd_3.id_class(6.0, 0.0, 5.0, 10.0, 2.0, 11.0);
    protected static final rjC_2 id_new = xd_3.id_class(5.0, 0.0, 6.0, 11.0, 2.0, 10.0);
    protected static final rjC_2 id_continue = xd_3.id_class(5.0, 6.0, 14.0, 11.0, 10.0, 16.0);
    protected static final rjC_2 id_super = xd_3.id_class(5.0, 6.0, 0.0, 11.0, 10.0, 2.0);
    protected static final rjC_2 id_this = xd_3.id_class(14.0, 6.0, 5.0, 16.0, 10.0, 11.0);
    protected static final rjC_2 id_else = xd_3.id_class(0.0, 6.0, 5.0, 2.0, 10.0, 11.0);
    protected static final rjC_2 id_synchronized = xd_3.id_class(6.0, 15.0, 5.0, 10.0, 16.0, 11.0);
    protected static final rjC_2 id_return = xd_3.id_class(5.0, 15.0, 6.0, 11.0, 16.0, 10.0);
    protected static final rjC_2 id_public = xd_3.id_class(6.0, 0.0, 5.0, 10.0, 1.0, 11.0);
    protected static final rjC_2 id_goto = xd_3.id_class(5.0, 0.0, 6.0, 11.0, 1.0, 10.0);
    protected static final rjC_2 id_while = xd_3.id_class(5.0, 6.0, 15.0, 11.0, 10.0, 16.0);
    protected static final rjC_2 id_try = xd_3.id_class(5.0, 6.0, 0.0, 11.0, 10.0, 1.0);
    protected static final rjC_2 id_instanceof = xd_3.id_class(15.0, 6.0, 5.0, 16.0, 10.0, 11.0);
    protected static final rjC_2 id_throw = xd_3.id_class(0.0, 6.0, 5.0, 1.0, 10.0, 11.0);
    private final boolean id_long;

    public void id_byte(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22) {
        rYB2.id_class(rfH_22, (xc_3)xc_32.id_class(id_volatile, true), 3);
        this.id_case(xc_32, rYB2, rfH_22);
        rYB2.id_finally().id_class(rfH_22, this, this.id_break());
    }

    @Override
    public boolean id_byte(xc_3 xc_32) {
        return true;
    }

    protected Jt_1(boolean bl, Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)((xc_3)((xc_3)this.id_abstract.id_break()).id_class(p, rpr_3.NORTH)).id_class(id_volatile, false)).id_class(q, rCH.WALL));
        this.id_long = bl;
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        rpr_3 rpr_32 = xc_32.id_byte(p);
        boolean bl = xc_32.id_byte(id_volatile);
        switch ((rCH)xc_32.id_byte(q)) {
            case FLOOR: {
                if (rpr_32.id_final() == rpB_2.X) {
                    return bl ? id_public : id_int;
                }
                return bl ? id_goto : id_new;
            }
            case WALL: {
                switch (rpr_32) {
                    case EAST: {
                        return bl ? id_throw : id_else;
                    }
                    case WEST: {
                        return bl ? id_instanceof : id_this;
                    }
                    case SOUTH: {
                        return bl ? id_try : id_super;
                    }
                }
                return bl ? id_while : id_continue;
            }
        }
        if (rpr_32.id_final() == rpB_2.X) {
            return bl ? id_synchronized : id_final;
        }
        return bl ? id_return : id_package;
    }

    @Override
    public int id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rpr_3 rpr_32) {
        return xc_32.id_byte(id_volatile) != false ? 15 : 0;
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, an_3 an_32) {
        if (!rYB2.id_continue && this.id_long && !xc_32.id_byte(id_volatile).booleanValue()) {
            this.id_throws(xc_32, rYB2, rfH_22);
        }
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(p, id_volatile, q);
    }

    @Override
    public ryZ_2 id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, rhd_3 rhd_32, rpm_3 rpm_32, rff_3 rff_32) {
        if (xc_32.id_byte(id_volatile).booleanValue()) {
            return ryZ_2.CONSUME;
        }
        this.id_byte(xc_32, rYB2, rfH_22);
        this.id_class(rhd_32, (rRg_1)rYB2, rfH_22, true);
        return ryZ_2.id_class(rYB2.id_continue);
    }

    protected abstract rqA_2 id_class(boolean var1);

    protected void id_class(rhd_3 rhd_32, rRg_1 rRg_12, rfH_2 rfH_22, boolean bl) {
        rRg_12.id_class(bl ? rhd_32 : null, rfH_22, this.id_class(bl), rqL_2.BLOCKS, 0.3f, bl ? 0.6f : 0.5f);
    }

    private int id_break() {
        return this.id_long ? 30 : 20;
    }

    @Override
    public void id_break(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xc_3 xc_33, boolean bl) {
        if (!bl && !xc_32.id_class(xc_33.id_break())) {
            if (xc_32.id_byte(id_volatile).booleanValue()) {
                this.id_case(xc_32, rYB2, rfH_22);
            }
            super.id_break(xc_32, rYB2, rfH_22, xc_33, bl);
        }
    }

    @Override
    public int id_break(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rpr_3 rpr_32) {
        return xc_32.id_byte(id_volatile) != false && Jt_1.id_private(xc_32) == rpr_32 ? 15 : 0;
    }

    @Override
    public void id_break(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        if (xc_32.id_byte(id_volatile).booleanValue()) {
            if (this.id_long) {
                this.id_throws(xc_32, rrEm_12, rfH_22);
            } else {
                rrEm_12.id_class(rfH_22, (xc_3)xc_32.id_class(id_volatile, false), 3);
                this.id_case(xc_32, rrEm_12, rfH_22);
                this.id_class((rhd_3)null, (rRg_1)rrEm_12, rfH_22, false);
            }
        }
    }

    private void id_throws(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22) {
        boolean bl;
        List<rhm_3> list = rYB2.id_class(rhm_3.class, xc_32.id_finally(rYB2, rfH_22).id_class().id_class(rfH_22));
        boolean bl2 = !list.isEmpty();
        if (bl2 != (bl = xc_32.id_byte(id_volatile).booleanValue())) {
            rYB2.id_class(rfH_22, (xc_3)xc_32.id_class(id_volatile, bl2), 3);
            this.id_case(xc_32, rYB2, rfH_22);
            this.id_class((rhd_3)null, (rRg_1)rYB2, rfH_22, bl2);
        }
        if (bl2) {
            rYB2.id_finally().id_class(new rfH_2(rfH_22), this, this.id_break());
        }
    }

    private void id_case(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22) {
        rYB2.id_break(rfH_22, this);
        rYB2.id_break(rfH_22.id_break(Jt_1.id_private(xc_32).id_case()), this);
    }
}

