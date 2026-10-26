/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.mutable.MutableInt
 */
package celestial;

import celestial.rRo_1;
import celestial.rfH_2;
import celestial.rjC_2;
import celestial.rjh_3;
import celestial.rjw_3;
import celestial.roH_2;
import celestial.rol_3;
import celestial.rpr_3;
import celestial.rrsK_2;
import celestial.rrsU_2;
import celestial.rrsV_2;
import celestial.xc_3;
import org.apache.commons.lang3.mutable.MutableInt;

public final class rrso_3
extends rrsV_2<rrsU_2, rrsK_2> {
    private static final rpr_3[] id_throws = rpr_3.values();
    private static final rpr_3[] id_case = new rpr_3[]{rpr_3.NORTH, rpr_3.SOUTH, rpr_3.WEST, rpr_3.EAST};

    public rrso_3(rol_3 rol_32) {
        super(rol_32, rRo_1.SKY, new rrsK_2(rol_32));
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
        roH_2 roH_22 = ((rrsK_2)this.id_byte).id_class(l3, true);
        for (rpr_3 rpr_32 : id_throws) {
            int n4;
            long l4 = rfH_2.id_class(l, rpr_32);
            long l5 = rjh_3.id_throws(l4);
            roH_2 roH_23 = l3 == l5 ? roH_22 : ((rrsK_2)this.id_byte).id_class(l5, true);
            if (roH_23 != null) {
                if (l4 == l2) continue;
                int n5 = this.id_break(l4, l, this.id_class(roH_23, l4));
                if (n2 > n5) {
                    n2 = n5;
                }
                if (n2 != 0) continue;
                return n2;
            }
            if (rpr_32 == rpr_3.DOWN) continue;
            l4 = rfH_2.id_throws(l4);
            while (!((rrsK_2)this.id_byte).id_catch(l5) && !((rrsK_2)this.id_byte).id_final(l5)) {
                l5 = rjh_3.id_class(l5, rpr_3.UP);
                l4 = rfH_2.id_class(l4, 0, 16, 0);
            }
            roH_2 roH_24 = ((rrsK_2)this.id_byte).id_class(l5, true);
            if (l4 == l2) continue;
            if (roH_24 != null) {
                n4 = this.id_break(l4, l, this.id_class(roH_24, l4));
            } else {
                int n6 = n4 = ((rrsK_2)this.id_byte).id_package(l5) ? 0 : 15;
            }
            if (n2 > n4) {
                n2 = n4;
            }
            if (n2 != 0) continue;
            return n2;
        }
        return n2;
    }

    @Override
    protected void id_class(long l, int n, boolean bl) {
        long l2;
        long l3;
        int n2;
        long l4 = rjh_3.id_throws(l);
        int n3 = rfH_2.id_break(l);
        int n4 = rjh_3.id_break(n3);
        int n5 = rjh_3.id_class(n3);
        if (n4 != 0) {
            n2 = 0;
        } else {
            int n6 = 0;
            while (!((rrsK_2)this.id_byte).id_catch(rjh_3.id_class(l4, 0, -n6 - 1, 0)) && ((rrsK_2)this.id_byte).id_break(n5 - n6 - 1)) {
                ++n6;
            }
            n2 = n6;
        }
        long l5 = rfH_2.id_class(l, 0, -1 - n2 * 16, 0);
        long l6 = rjh_3.id_throws(l5);
        if (l4 == l6 || ((rrsK_2)this.id_byte).id_catch(l6)) {
            this.id_break(l, l5, n, bl);
        }
        if (l4 == (l3 = rjh_3.id_throws(l2 = rfH_2.id_class(l, rpr_3.UP))) || ((rrsK_2)this.id_byte).id_catch(l3)) {
            this.id_break(l, l2, n, bl);
        }
        block1: for (rpr_3 rpr_32 : id_case) {
            int n7 = 0;
            do {
                long l7;
                long l8;
                if (l4 == (l8 = rjh_3.id_throws(l7 = rfH_2.id_class(l, rpr_32.id_implements(), -n7, rpr_32.id_extends())))) {
                    this.id_break(l, l7, n, bl);
                    continue block1;
                }
                if (!((rrsK_2)this.id_byte).id_catch(l8)) continue;
                this.id_break(l, l7, n, bl);
            } while (++n7 <= n2 * 16);
        }
    }

    @Override
    public String id_break(long l) {
        return super.id_break(l) + (((rrsK_2)this.id_byte).id_final(l) ? "*" : "");
    }

    @Override
    protected int id_break(long l, long l2, int n) {
        if (l2 == Long.MAX_VALUE) {
            return 15;
        }
        if (l == Long.MAX_VALUE) {
            if (!((rrsK_2)this.id_byte).id_volatile(l2)) {
                return 15;
            }
            n = 0;
        }
        if (n >= 15) {
            return n;
        }
        MutableInt mutableInt = new MutableInt();
        xc_3 xc_32 = this.id_class(l2, mutableInt);
        if (mutableInt.getValue() >= 15) {
            return 15;
        }
        int n2 = rfH_2.id_class(l);
        int n3 = rfH_2.id_break(l);
        int n4 = rfH_2.id_byte(l);
        int n5 = rfH_2.id_class(l2);
        int n6 = rfH_2.id_break(l2);
        int n7 = rfH_2.id_byte(l2);
        boolean bl = n2 == n5 && n4 == n7;
        int n8 = Integer.signum(n5 - n2);
        int n9 = Integer.signum(n6 - n3);
        int n10 = Integer.signum(n7 - n4);
        rpr_3 rpr_32 = l == Long.MAX_VALUE ? rpr_3.DOWN : rpr_3.id_class(n8, n9, n10);
        xc_3 xc_33 = this.id_class(l, null);
        if (rpr_32 != null) {
            rjC_2 rjC_22;
            var20_18 = this.id_class(xc_33, l, rpr_32);
            if (rjw_3.id_break(var20_18, rjC_22 = this.id_class(xc_32, l2, rpr_32.id_case()))) {
                return 15;
            }
        } else {
            var20_18 = this.id_class(xc_33, l, rpr_3.DOWN);
            if (rjw_3.id_break(var20_18, rjw_3.id_class())) {
                return 15;
            }
            int n11 = bl ? -1 : 0;
            rpr_3 rpr_33 = rpr_3.id_class(n8, n11, n10);
            if (rpr_33 == null) {
                return 15;
            }
            rjC_2 rjC_23 = this.id_class(xc_32, l2, rpr_33.id_case());
            if (rjw_3.id_break(rjw_3.id_class(), rjC_23)) {
                return 15;
            }
        }
        boolean bl2 = l == Long.MAX_VALUE || bl && n3 > n6;
        return bl2 && n == 0 && mutableInt.getValue() == 0 ? 0 : n + Math.max(1, mutableInt.getValue());
    }

    @Override
    protected void id_case(long l) {
        ((rrsK_2)this.id_byte).id_throws();
        long l2 = rjh_3.id_throws(l);
        if (((rrsK_2)this.id_byte).id_catch(l2)) {
            super.id_case(l);
        } else {
            l = rfH_2.id_throws(l);
            while (!((rrsK_2)this.id_byte).id_catch(l2) && !((rrsK_2)this.id_byte).id_final(l2)) {
                l2 = rjh_3.id_class(l2, rpr_3.UP);
                l = rfH_2.id_class(l, 0, 16, 0);
            }
            if (((rrsK_2)this.id_byte).id_catch(l2)) {
                super.id_case(l);
            }
        }
    }
}

