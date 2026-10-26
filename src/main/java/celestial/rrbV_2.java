/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfw_3;
import celestial.rpr_3;
import celestial.rrbb_3;
import celestial.rrbg_3;
import celestial.yQ_2;
import celestial.yX_2;
import celestial.yZ_2;
import java.util.HashSet;
import java.util.Set;

public class rrbV_2 {
    private an_3 id_class = null;
    private double id_break = 0.0;
    private double id_byte = -2.147483648E9;
    private double id_protected = -2.147483648E9;
    private double id_throws = -2.147483648E9;
    private int id_case = 0;
    private long id_catch = 0L;
    private Set<rfH_2> id_private = new HashSet<rfH_2>();
    private rfw_3 id_implements = new rfw_3();

    public double id_byte() {
        return this.id_protected;
    }

    public rrbV_2(an_3 an_32) {
        this.id_class = an_32;
        this.id_break = an_32.Bx();
    }

    public String toString() {
        return "Entity: " + this.id_class + ", offsetY: " + this.id_break;
    }

    public void id_class(yX_2 yX_22) {
        if (rrbb_3.rA()) {
            long l = System.currentTimeMillis();
            if (l < this.id_catch + 500L) {
                return;
            }
            this.id_catch = l;
        }
        double d = this.id_class.rx() - 0.5;
        double d2 = this.id_class.re() - 0.5 + this.id_break;
        double d3 = this.id_class.BO() - 0.5;
        int n = rrbg_3.id_class(this.id_class);
        double d4 = d - this.id_byte;
        double d5 = d2 - this.id_protected;
        double d6 = d3 - this.id_throws;
        double d7 = 0.1;
        if (!(Math.abs(d4) <= d7 && Math.abs(d5) <= d7 && Math.abs(d6) <= d7 && this.id_case == n)) {
            this.id_byte = d;
            this.id_protected = d2;
            this.id_throws = d3;
            this.id_case = n;
            HashSet<rfH_2> hashSet = new HashSet<rfH_2>();
            if (n > 0) {
                rpr_3 rpr_32 = (rfU_2.id_byte(d) & 0xF) >= 8 ? rpr_3.EAST : rpr_3.WEST;
                rpr_3 rpr_33 = (rfU_2.id_byte(d2) & 0xF) >= 8 ? rpr_3.UP : rpr_3.DOWN;
                rpr_3 rpr_34 = (rfU_2.id_byte(d3) & 0xF) >= 8 ? rpr_3.SOUTH : rpr_3.NORTH;
                rfH_2 rfH_22 = new rfH_2(d, d2, d3);
                yQ_2 yQ_22 = yX_22.id_class(rfH_22);
                rfH_2 rfH_23 = this.id_class(yQ_22, rfH_22, rpr_32);
                yQ_2 yQ_23 = yX_22.id_class(rfH_23);
                rfH_2 rfH_24 = this.id_class(yQ_22, rfH_22, rpr_34);
                yQ_2 yQ_24 = yX_22.id_class(rfH_24);
                rfH_2 rfH_25 = this.id_class(yQ_23, rfH_23, rpr_34);
                yQ_2 yQ_25 = yX_22.id_class(rfH_25);
                rfH_2 rfH_26 = this.id_class(yQ_22, rfH_22, rpr_33);
                yQ_2 yQ_26 = yX_22.id_class(rfH_26);
                rfH_2 rfH_27 = this.id_class(yQ_26, rfH_26, rpr_32);
                yQ_2 yQ_27 = yX_22.id_class(rfH_27);
                rfH_2 rfH_28 = this.id_class(yQ_26, rfH_26, rpr_34);
                yQ_2 yQ_28 = yX_22.id_class(rfH_28);
                rfH_2 rfH_29 = this.id_class(yQ_27, rfH_27, rpr_34);
                yQ_2 yQ_29 = yX_22.id_class(rfH_29);
                this.id_class(yQ_22, this.id_private, hashSet);
                this.id_class(yQ_23, this.id_private, hashSet);
                this.id_class(yQ_24, this.id_private, hashSet);
                this.id_class(yQ_25, this.id_private, hashSet);
                this.id_class(yQ_26, this.id_private, hashSet);
                this.id_class(yQ_27, this.id_private, hashSet);
                this.id_class(yQ_28, this.id_private, hashSet);
                this.id_class(yQ_29, this.id_private, hashSet);
            }
            this.id_break(yX_22);
            this.id_private = hashSet;
        }
    }

    private rfH_2 id_class(yQ_2 yQ_22, rfH_2 rfH_22, rpr_3 rpr_32) {
        return yQ_22 != null ? yQ_22.id_class(rpr_32) : rfH_22.id_class(rpr_32, 16);
    }

    public an_3 id_class() {
        return this.id_class;
    }

    private void id_class(yQ_2 yQ_22, Set<rfH_2> set, Set<rfH_2> set2) {
        if (yQ_22 != null) {
            yZ_2 yZ_22 = yQ_22.id_byte();
            if (yZ_22 != null && !yZ_22.id_class()) {
                yQ_22.id_class(false);
            }
            rfH_2 rfH_22 = yQ_22.id_throws().id_int();
            if (set != null) {
                set.remove(rfH_22);
            }
            if (set2 != null) {
                set2.add(rfH_22);
            }
        }
    }

    public double id_break() {
        return this.id_byte;
    }

    public void id_break(yX_2 yX_22) {
        for (rfH_2 rfH_22 : this.id_private) {
            yQ_2 yQ_22 = yX_22.id_class(rfH_22);
            this.id_class(yQ_22, (Set<rfH_2>)null, (Set<rfH_2>)null);
        }
    }

    public int id_throws() {
        return this.id_case;
    }

    public double id_case() {
        return this.id_break;
    }

    public double id_protected() {
        return this.id_throws;
    }
}

