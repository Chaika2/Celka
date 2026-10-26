/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jo_1;
import celestial.Jq_1;
import celestial.WJ;
import celestial.an_3;
import celestial.rCL;
import celestial.rCN;
import celestial.rCR;
import celestial.rCT;
import celestial.rCZ;
import celestial.rCu_1;
import celestial.rJr_1;
import celestial.rRR;
import celestial.rRq_1;
import celestial.rXu_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfl_3;
import celestial.rpJ_2;
import celestial.rpa_3;
import celestial.rpr_3;
import celestial.rqd_3;
import celestial.rrEm_1;
import celestial.rsJ_2;
import celestial.rsW_2;
import celestial.xc_3;
import celestial.xd_3;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class dk_3
extends Jo_1 {
    public static final rCu_1<rCR> id_package = rCT.O;
    public static final rCN id_int = rCT.id_return;

    @Override
    public boolean id_byte(xc_3 xc_32) {
        return true;
    }

    public dk_3(Jq_1 jq_1) {
        super(true, jq_1);
        this.id_extends((xc_3)((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_int, false)).id_class(id_package, rCR.NORTH_SOUTH));
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xc_3 xc_33, boolean bl) {
        if (!xc_33.id_class(xc_32.id_break())) {
            this.id_class(rYB2, rfH_22, this.id_class(xc_32, rYB2, rfH_22, bl));
        }
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpa_3 rpa_32) {
        rCR rCR2 = xc_32.id_byte(id_package);
        block0 : switch (rpa_32) {
            case LEFT_RIGHT: {
                switch (rCR2) {
                    case ASCENDING_NORTH: {
                        return (xc_3)xc_32.id_class(id_package, rCR.ASCENDING_SOUTH);
                    }
                    case ASCENDING_SOUTH: {
                        return (xc_3)xc_32.id_class(id_package, rCR.ASCENDING_NORTH);
                    }
                    case SOUTH_EAST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.NORTH_EAST);
                    }
                    case SOUTH_WEST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.NORTH_WEST);
                    }
                    case NORTH_WEST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.SOUTH_WEST);
                    }
                    case NORTH_EAST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.SOUTH_EAST);
                    }
                }
                return super.id_class(xc_32, rpa_32);
            }
            case FRONT_BACK: {
                switch (rCR2) {
                    case ASCENDING_EAST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.ASCENDING_WEST);
                    }
                    case ASCENDING_WEST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.ASCENDING_EAST);
                    }
                    default: {
                        break block0;
                    }
                    case SOUTH_EAST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.SOUTH_WEST);
                    }
                    case SOUTH_WEST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.SOUTH_EAST);
                    }
                    case NORTH_WEST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.NORTH_EAST);
                    }
                    case NORTH_EAST: 
                }
                return (xc_3)xc_32.id_class(id_package, rCR.NORTH_WEST);
            }
        }
        return super.id_class(xc_32, rpa_32);
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(id_package, id_int);
    }

    protected <T extends rsJ_2> List<T> id_class(rYB rYB2, rfH_2 rfH_22, Class<T> clazz, Predicate<an_3> predicate) {
        return rYB2.id_class(clazz, this.id_class(rfH_22), predicate);
    }

    private rfl_3 id_class(rfH_2 rfH_22) {
        double d = 0.2;
        return new rfl_3((double)rfH_22.b_() + 0.2, rfH_22.c_(), (double)rfH_22.d_() + 0.2, (double)(rfH_22.b_() + 1) - 0.2, (double)(rfH_22.c_() + 1) - 0.2, (double)(rfH_22.d_() + 1) - 0.2);
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rqd_3 rqd_32) {
        switch (rqd_32) {
            case CLOCKWISE_180: {
                switch (xc_32.id_byte(id_package)) {
                    case ASCENDING_EAST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.ASCENDING_WEST);
                    }
                    case ASCENDING_WEST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.ASCENDING_EAST);
                    }
                    case ASCENDING_NORTH: {
                        return (xc_3)xc_32.id_class(id_package, rCR.ASCENDING_SOUTH);
                    }
                    case ASCENDING_SOUTH: {
                        return (xc_3)xc_32.id_class(id_package, rCR.ASCENDING_NORTH);
                    }
                    case SOUTH_EAST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.NORTH_WEST);
                    }
                    case SOUTH_WEST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.NORTH_EAST);
                    }
                    case NORTH_WEST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.SOUTH_EAST);
                    }
                    case NORTH_EAST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.SOUTH_WEST);
                    }
                }
            }
            case COUNTERCLOCKWISE_90: {
                switch (xc_32.id_byte(id_package)) {
                    case ASCENDING_EAST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.ASCENDING_NORTH);
                    }
                    case ASCENDING_WEST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.ASCENDING_SOUTH);
                    }
                    case ASCENDING_NORTH: {
                        return (xc_3)xc_32.id_class(id_package, rCR.ASCENDING_WEST);
                    }
                    case ASCENDING_SOUTH: {
                        return (xc_3)xc_32.id_class(id_package, rCR.ASCENDING_EAST);
                    }
                    case SOUTH_EAST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.NORTH_EAST);
                    }
                    case SOUTH_WEST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.SOUTH_EAST);
                    }
                    case NORTH_WEST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.SOUTH_WEST);
                    }
                    case NORTH_EAST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.NORTH_WEST);
                    }
                    case NORTH_SOUTH: {
                        return (xc_3)xc_32.id_class(id_package, rCR.EAST_WEST);
                    }
                    case EAST_WEST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.NORTH_SOUTH);
                    }
                }
            }
            case CLOCKWISE_90: {
                switch (xc_32.id_byte(id_package)) {
                    case ASCENDING_EAST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.ASCENDING_SOUTH);
                    }
                    case ASCENDING_WEST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.ASCENDING_NORTH);
                    }
                    case ASCENDING_NORTH: {
                        return (xc_3)xc_32.id_class(id_package, rCR.ASCENDING_EAST);
                    }
                    case ASCENDING_SOUTH: {
                        return (xc_3)xc_32.id_class(id_package, rCR.ASCENDING_WEST);
                    }
                    case SOUTH_EAST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.SOUTH_WEST);
                    }
                    case SOUTH_WEST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.NORTH_WEST);
                    }
                    case NORTH_WEST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.NORTH_EAST);
                    }
                    case NORTH_EAST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.SOUTH_EAST);
                    }
                    case NORTH_SOUTH: {
                        return (xc_3)xc_32.id_class(id_package, rCR.EAST_WEST);
                    }
                    case EAST_WEST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.NORTH_SOUTH);
                    }
                }
            }
        }
        return xc_32;
    }

    @Override
    public int id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rpr_3 rpr_32) {
        return xc_32.id_byte(id_int) != false ? 15 : 0;
    }

    private void id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32) {
        if (this.id_class(xc_32, (rRR)rYB2, rfH_22)) {
            xc_3 xc_33;
            boolean bl = xc_32.id_byte(id_int);
            boolean bl2 = false;
            List<rsJ_2> list = this.id_class(rYB2, rfH_22, rsJ_2.class, (Predicate<an_3>)null);
            if (!list.isEmpty()) {
                bl2 = true;
            }
            if (bl2 && !bl) {
                xc_33 = (xc_3)xc_32.id_class(id_int, true);
                rYB2.id_class(rfH_22, xc_33, 3);
                this.id_break(rYB2, rfH_22, xc_33, true);
                rYB2.id_break(rfH_22, this);
                rYB2.id_break(rfH_22.id_break(), this);
                rYB2.id_class(rfH_22, xc_32, xc_33);
            }
            if (!bl2 && bl) {
                xc_33 = (xc_3)xc_32.id_class(id_int, false);
                rYB2.id_class(rfH_22, xc_33, 3);
                this.id_break(rYB2, rfH_22, xc_33, false);
                rYB2.id_break(rfH_22, this);
                rYB2.id_break(rfH_22.id_break(), this);
                rYB2.id_class(rfH_22, xc_32, xc_33);
            }
            if (bl2) {
                rYB2.id_finally().id_class(rfH_22, this, 20);
            }
            rYB2.id_byte(rfH_22, this);
        }
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, an_3 an_32) {
        if (!rYB2.id_continue && !xc_32.id_byte(id_int).booleanValue()) {
            this.id_class(rYB2, rfH_22, xc_32);
        }
    }

    @Override
    public void id_break(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        if (xc_32.id_byte(id_int).booleanValue()) {
            this.id_class((rYB)rrEm_12, rfH_22, xc_32);
        }
    }

    @Override
    public int id_break(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rpr_3 rpr_32) {
        if (!xc_32.id_byte(id_int).booleanValue()) {
            return 0;
        }
        return rpr_32 == rpr_3.UP ? 15 : 0;
    }

    @Override
    public int id_break(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22) {
        if (xc_32.id_byte(id_int).booleanValue()) {
            List<rsW_2> list = this.id_class(rYB2, rfH_22, rsW_2.class, (Predicate<an_3>)null);
            if (!list.isEmpty()) {
                return list.get(0).id_else().id_case();
            }
            List<rsJ_2> list2 = this.id_class(rYB2, rfH_22, rsJ_2.class, rpJ_2.id_protected);
            if (!list2.isEmpty()) {
                return rJr_1.id_break((rXu_1)((Object)list2.get(0)));
            }
        }
        return 0;
    }

    protected void id_break(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32, boolean bl) {
        WJ wJ = new WJ(rYB2, rfH_22, xc_32);
        for (rfH_2 rfH_23 : wJ.id_class()) {
            xc_3 xc_33 = rYB2.id_byte(rfH_23);
            xc_33.id_class(rYB2, rfH_23, xc_33.id_break(), rfH_22, false);
        }
    }

    @Override
    public boolean id_case(xc_3 xc_32) {
        return true;
    }

    @Override
    public rCZ<rCR> id_implements() {
        return id_package;
    }
}

