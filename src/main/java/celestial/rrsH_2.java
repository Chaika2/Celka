/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.mutable.MutableInt
 */
package celestial;

import celestial.rRo_1;
import celestial.rRq_1;
import celestial.rfH_2;
import celestial.rfw_3;
import celestial.rjC_2;
import celestial.rjh_3;
import celestial.rjw_3;
import celestial.roH_2;
import celestial.rol_3;
import celestial.rpr_3;
import celestial.rrsV_2;
import celestial.rrsp_3;
import celestial.rrsy_3;
import celestial.xc_3;
import org.apache.commons.lang3.mutable.MutableInt;

public final class rrsH_2
extends rrsV_2<rrsp_3, rrsy_3> {
    private static final rpr_3[] id_throws = rpr_3.values();
    private final rfw_3 id_case = new rfw_3();

    public rrsH_2(rol_3 rol_32) {
        super(rol_32, rRo_1.BLOCK, new rrsy_3(rol_32));
    }

    @Override
    public void id_class(rfH_2 rfH_22, int n) {
        ((rrsy_3)this.id_byte).id_throws();
        this.id_class(Long.MAX_VALUE, rfH_22.id_package(), 15 - n, true);
    }

    @Override
    protected void id_class(long l, int n, boolean bl) {
        long l2 = rjh_3.id_throws(l);
        for (rpr_3 rpr_32 : id_throws) {
            long l3 = rfH_2.id_class(l, rpr_32);
            long l4 = rjh_3.id_throws(l3);
            if (l2 != l4 && !((rrsy_3)this.id_byte).id_catch(l4)) continue;
            this.id_break(l, l3, n, bl);
        }
    }

    @Override
    protected int id_class(long l, long l2, int n) {
        int n2 = n;
        if (Long.MAX_VALUE != l2) {
            int n3 = this.id_break(Long.MAX_VALUE, l, 0);
            if (n > n3) {
                n2 = n3;
            }
            if (n2 == 0) {
                return n2;
            }
        }
        long l3 = rjh_3.id_throws(l);
        roH_2 roH_22 = ((rrsy_3)this.id_byte).id_class(l3, true);
        for (rpr_3 rpr_32 : id_throws) {
            long l4;
            roH_2 roH_23;
            long l5 = rfH_2.id_class(l, rpr_32);
            if (l5 == l2 || (roH_23 = l3 == (l4 = rjh_3.id_throws(l5)) ? roH_22 : ((rrsy_3)this.id_byte).id_class(l4, true)) == null) continue;
            int n4 = this.id_break(l5, l, this.id_class(roH_23, l5));
            if (n2 > n4) {
                n2 = n4;
            }
            if (n2 != 0) continue;
            return n2;
        }
        return n2;
    }

    @Override
    protected int id_break(long l, long l2, int n) {
        rjC_2 rjC_22;
        int n2;
        int n3;
        if (l2 == Long.MAX_VALUE) {
            return 15;
        }
        if (l == Long.MAX_VALUE) {
            return n + 15 - this.id_protected(l2);
        }
        if (n >= 15) {
            return n;
        }
        int n4 = Integer.signum(rfH_2.id_class(l2) - rfH_2.id_class(l));
        rpr_3 rpr_32 = rpr_3.id_class(n4, n3 = Integer.signum(rfH_2.id_break(l2) - rfH_2.id_break(l)), n2 = Integer.signum(rfH_2.id_byte(l2) - rfH_2.id_byte(l)));
        if (rpr_32 == null) {
            return 15;
        }
        MutableInt mutableInt = new MutableInt();
        xc_3 xc_32 = this.id_class(l2, mutableInt);
        if (mutableInt.getValue() >= 15) {
            return 15;
        }
        xc_3 xc_33 = this.id_class(l, null);
        rjC_2 rjC_23 = this.id_class(xc_33, l, rpr_32);
        return rjw_3.id_break(rjC_23, rjC_22 = this.id_class(xc_32, l2, rpr_32.id_case())) ? 15 : n + Math.max(1, mutableInt.getValue());
    }

    private int id_protected(long l) {
        int n = rfH_2.id_class(l);
        int n2 = rfH_2.id_break(l);
        int n3 = rfH_2.id_byte(l);
        rRq_1 rRq_12 = this.id_class.id_throws(n >> 4, n3 >> 4);
        return rRq_12 != null ? rRq_12.id_catch(this.id_case.id_class(n, n2, n3)) : 0;
    }
}

