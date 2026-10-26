/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jy_1;
import celestial.WP;
import celestial.ap_3;
import celestial.kT_2;
import celestial.rCT;
import celestial.rRg_1;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfw_3;
import celestial.rjU_2;
import celestial.rls_3;
import celestial.rpB_2;
import celestial.rpr_3;
import celestial.rqT_2;
import celestial.rrEm_1;
import celestial.xc_3;
import celestial.xu_3;
import java.util.Optional;
import java.util.function.Predicate;

public class WB {
    private static final Jy_1 id_class = (xc_32, rRq_12, rfH_22) -> xc_32.id_class(xu_3.rg);
    private final rRg_1 id_break;
    private final rpB_2 id_byte;
    private final rpr_3 id_protected;
    private int id_throws;
    private rfH_2 id_case;
    private int id_catch;
    private int id_private;

    public boolean id_byte() {
        return this.id_class() && this.id_throws == this.id_private * this.id_catch;
    }

    public WB(rRg_1 rRg_12, rfH_2 rfH_22, rpB_2 rpB_22) {
        this.id_break = rRg_12;
        this.id_byte = rpB_22;
        this.id_protected = rpB_22 == rpB_2.X ? rpr_3.WEST : rpr_3.SOUTH;
        this.id_case = this.id_class(rfH_22);
        if (this.id_case == null) {
            this.id_case = rfH_22;
            this.id_private = 1;
            this.id_catch = 1;
        } else {
            this.id_private = this.id_protected();
            if (this.id_private > 0) {
                this.id_catch = this.id_throws();
            }
        }
    }

    public boolean id_class() {
        return this.id_case != null && this.id_private >= 2 && this.id_private <= 21 && this.id_catch >= 3 && this.id_catch <= 21;
    }

    public static rjU_2 id_class(rqT_2 rqT_22, rpB_2 rpB_22, rjU_2 rjU_22, ap_3 ap_32) {
        double d;
        rpB_2 rpB_23;
        double d2;
        double d3 = (double)rqT_22.id_break - (double)ap_32.id_class;
        double d4 = (double)rqT_22.id_byte - (double)ap_32.id_break;
        rfH_2 rfH_22 = rqT_22.id_class;
        if (d3 > 0.0) {
            float f = (float)rfH_22.id_class(rpB_22) + ap_32.id_class / 2.0f;
            d2 = rfU_2.id_class(rfU_2.id_byte(rjU_22.id_class(rpB_22) - (double)f, 0.0, d3), 0.0, 1.0);
        } else {
            d2 = 0.5;
        }
        if (d4 > 0.0) {
            rpB_23 = rpB_2.Y;
            d = rfU_2.id_class(rfU_2.id_byte(rjU_22.id_class(rpB_23) - (double)rfH_22.id_class(rpB_23), 0.0, d4), 0.0, 1.0);
        } else {
            d = 0.0;
        }
        rpB_23 = rpB_22 == rpB_2.X ? rpB_2.Z : rpB_2.X;
        double d5 = rjU_22.id_class(rpB_23) - ((double)rfH_22.id_class(rpB_23) + 0.5);
        return new rjU_2(d2, d, d5);
    }

    public static WP id_class(rrEm_1 rrEm_12, rqT_2 rqT_22, rpB_2 rpB_22, rjU_2 rjU_22, ap_3 ap_32, rjU_2 rjU_23, float f, float f2) {
        rfH_2 rfH_22 = rqT_22.id_class;
        xc_3 xc_32 = rrEm_12.id_byte(rfH_22);
        rpB_2 rpB_23 = xc_32.id_byte(rCT.id_char);
        double d = rqT_22.id_break;
        double d2 = rqT_22.id_byte;
        int n = rpB_22 == rpB_23 ? 0 : 90;
        rjU_2 rjU_24 = rpB_22 == rpB_23 ? rjU_23 : new rjU_2(rjU_23.id_protected, rjU_23.id_byte, -rjU_23.id_break);
        double d3 = (double)ap_32.id_class / 2.0 + (d - (double)ap_32.id_class) * rjU_22.id_class();
        double d4 = (d2 - (double)ap_32.id_break) * rjU_22.id_break();
        double d5 = 0.5 + rjU_22.id_byte();
        boolean bl = rpB_23 == rpB_2.X;
        rjU_2 rjU_25 = new rjU_2((double)rfH_22.b_() + (bl ? d3 : d5), (double)rfH_22.c_() + d4, (double)rfH_22.d_() + (bl ? d5 : d3));
        return new WP(rjU_25, rjU_24, f + (float)n, f2);
    }

    public static Optional<WB> id_class(rRg_1 rRg_12, rfH_2 rfH_22, rpB_2 rpB_22) {
        return WB.id_class(rRg_12, rfH_22, (WB wB) -> wB.id_class() && wB.id_throws == 0, rpB_22);
    }

    private boolean id_class(rfw_3 rfw_32, int n) {
        for (int i = 0; i < this.id_private; ++i) {
            rfw_3 rfw_33 = rfw_32.id_class(this.id_case).id_byte(rpr_3.UP, n).id_byte(this.id_protected, i);
            if (id_class.test(this.id_break.id_byte(rfw_33), this.id_break, rfw_33)) continue;
            return false;
        }
        return true;
    }

    public static Optional<WB> id_class(rRg_1 rRg_12, rfH_2 rfH_22, Predicate<WB> predicate, rpB_2 rpB_22) {
        Optional<WB> optional = Optional.of(new WB(rRg_12, rfH_22, rpB_22)).filter(predicate);
        if (optional.isPresent()) {
            return optional;
        }
        rpB_2 rpB_23 = rpB_22 == rpB_2.X ? rpB_2.Z : rpB_2.X;
        return Optional.of(new WB(rRg_12, rfH_22, rpB_23)).filter(predicate);
    }

    private int id_class(rfH_2 rfH_22, rpr_3 rpr_32) {
        rfw_3 rfw_32 = new rfw_3();
        for (int i = 0; i <= 21; ++i) {
            rfw_32.id_class(rfH_22).id_byte(rpr_32, i);
            xc_3 xc_32 = this.id_break.id_byte(rfw_32);
            if (!WB.id_class(xc_32)) {
                if (!id_class.test(xc_32, this.id_break, rfw_32)) break;
                return i;
            }
            xc_3 xc_33 = this.id_break.id_byte(rfw_32.id_class(rpr_3.DOWN));
            if (!id_class.test(xc_33, this.id_break, rfw_32)) break;
        }
        return 0;
    }

    private rfH_2 id_class(rfH_2 rfH_22) {
        int n = Math.max(0, rfH_22.c_() - 21);
        while (rfH_22.c_() > n && WB.id_class(this.id_break.id_byte(rfH_22.id_break()))) {
            rfH_22 = rfH_22.id_break();
        }
        rpr_3 rpr_32 = this.id_protected.id_case();
        int n2 = this.id_class(rfH_22, rpr_32) - 1;
        return n2 < 0 ? null : rfH_22.id_class(rpr_32, n2);
    }

    private int id_class(rfw_3 rfw_32) {
        for (int i = 0; i < 21; ++i) {
            rfw_32.id_class(this.id_case).id_byte(rpr_3.UP, i).id_byte(this.id_protected, -1);
            if (!id_class.test(this.id_break.id_byte(rfw_32), this.id_break, rfw_32)) {
                return i;
            }
            rfw_32.id_class(this.id_case).id_byte(rpr_3.UP, i).id_byte(this.id_protected, this.id_private);
            if (!id_class.test(this.id_break.id_byte(rfw_32), this.id_break, rfw_32)) {
                return i;
            }
            for (int j = 0; j < this.id_private; ++j) {
                rfw_32.id_class(this.id_case).id_byte(rpr_3.UP, i).id_byte(this.id_protected, j);
                xc_3 xc_32 = this.id_break.id_byte(rfw_32);
                if (!WB.id_class(xc_32)) {
                    return i;
                }
                if (!xc_32.id_class(xu_3.Pi)) continue;
                ++this.id_throws;
            }
        }
        return 21;
    }

    private static boolean id_class(xc_3 xc_32) {
        return xc_32.id_catch() || xc_32.id_class(rls_3.N) || xc_32.id_class(xu_3.Pi);
    }

    public void id_break() {
        xc_3 xc_32 = (xc_3)xu_3.Pi.id_continue().id_class(kT_2.id_volatile, this.id_byte);
        rfH_2.id_class(this.id_case, this.id_case.id_class(rpr_3.UP, this.id_catch - 1).id_class(this.id_protected, this.id_private - 1)).forEach(rfH_22 -> this.id_break.id_class((rfH_2)rfH_22, xc_32, 18));
    }

    private int id_throws() {
        rfw_3 rfw_32 = new rfw_3();
        int n = this.id_class(rfw_32);
        return n >= 3 && n <= 21 && this.id_class(rfw_32, n) ? n : 0;
    }

    private int id_protected() {
        int n = this.id_class(this.id_case, this.id_protected);
        return n >= 2 && n <= 21 ? n : 0;
    }
}

