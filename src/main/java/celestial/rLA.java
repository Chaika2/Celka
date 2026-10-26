/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.is_3;
import celestial.rLC;
import celestial.rLT;
import celestial.rLf_1;
import celestial.rLl_1;
import celestial.rLp_1;
import celestial.rLq_1;
import celestial.rLy_1;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rjU_2;
import celestial.xd_3;
import celestial.xu_3;

public class rLA
extends rLy_1 {
    private boolean id_class;

    @Override
    protected rjU_2 id_byte() {
        return new rjU_2(this.id_break.rx(), this.id_super(), this.id_break.BO());
    }

    public rLA(is_3 is_32, rYB rYB2) {
        super(is_32, rYB2);
    }

    @Override
    public rLC id_class(an_3 an_32, int n) {
        return this.id_class(an_32.Bs(), n);
    }

    protected boolean id_class(rLp_1 rLp_12) {
        if (rLp_12 == rLp_1.WATER) {
            return false;
        }
        if (rLp_12 == rLp_1.LAVA) {
            return false;
        }
        return rLp_12 != rLp_1.OPEN;
    }

    private boolean id_class(int n, int n2, int n3, int n4, int n5, int n6, rjU_2 rjU_22, double d, double d2) {
        int n7 = n - n4 / 2;
        int n8 = n3 - n6 / 2;
        if (!this.id_break(n7, n2, n8, n4, n5, n6, rjU_22, d, d2)) {
            return false;
        }
        for (int i = n7; i < n7 + n4; ++i) {
            for (int j = n8; j < n8 + n6; ++j) {
                double d3 = (double)i + 0.5 - rjU_22.id_break;
                double d4 = (double)j + 0.5 - rjU_22.id_protected;
                if (d3 * d + d4 * d2 < 0.0) continue;
                rLp_1 rLp_12 = this.id_int.id_class(this.id_byte, i, n2 - 1, j, this.id_break, n4, n5, n6, true, true);
                if (!this.id_class(rLp_12)) {
                    return false;
                }
                rLp_12 = this.id_int.id_class(this.id_byte, i, n2, j, this.id_break, n4, n5, n6, true, true);
                float f = this.id_break.id_class(rLp_12);
                if (f < 0.0f || f >= 8.0f) {
                    return false;
                }
                if (rLp_12 != rLp_1.DAMAGE_FIRE && rLp_12 != rLp_1.DANGER_FIRE && rLp_12 != rLp_1.DAMAGE_OTHER) continue;
                return false;
            }
        }
        return true;
    }

    @Override
    protected boolean id_class(rjU_2 rjU_22, rjU_2 rjU_23, int n, int n2, int n3) {
        int n4 = rfU_2.id_byte(rjU_22.id_break);
        int n5 = rfU_2.id_byte(rjU_22.id_protected);
        double d = rjU_23.id_break - rjU_22.id_break;
        double d2 = rjU_23.id_protected - rjU_22.id_protected;
        double d3 = d * d + d2 * d2;
        if (d3 < 1.0E-8) {
            return false;
        }
        double d4 = 1.0 / Math.sqrt(d3);
        if (!this.id_class(n4, rfU_2.id_byte(rjU_22.id_byte), n5, n += 2, n2, n3 += 2, rjU_22, d *= d4, d2 *= d4)) {
            return false;
        }
        n -= 2;
        n3 -= 2;
        double d5 = 1.0 / Math.abs(d);
        double d6 = 1.0 / Math.abs(d2);
        double d7 = (double)n4 - rjU_22.id_break;
        double d8 = (double)n5 - rjU_22.id_protected;
        if (d >= 0.0) {
            d7 += 1.0;
        }
        if (d2 >= 0.0) {
            d8 += 1.0;
        }
        d7 /= d;
        d8 /= d2;
        int n6 = d < 0.0 ? -1 : 1;
        int n7 = d2 < 0.0 ? -1 : 1;
        int n8 = rfU_2.id_byte(rjU_23.id_break);
        int n9 = rfU_2.id_byte(rjU_23.id_protected);
        int n10 = n8 - n4;
        int n11 = n9 - n5;
        while (n10 * n6 > 0 || n11 * n7 > 0) {
            if (d7 < d8) {
                d7 += d5;
                n10 = n8 - (n4 += n6);
            } else {
                d8 += d6;
                n11 = n9 - (n5 += n7);
            }
            if (this.id_class(n4, rfU_2.id_byte(rjU_22.id_byte), n5, n, n2, n3, rjU_22, d, d2)) continue;
            return false;
        }
        return true;
    }

    @Override
    protected rLl_1 id_class(int n) {
        this.id_int = new rLf_1();
        this.id_int.id_class(true);
        return new rLl_1(this.id_int, n);
    }

    @Override
    public rLC id_class(rfH_2 rfH_22, int n) {
        rfH_2 rfH_23;
        if (this.id_byte.id_byte(rfH_22).id_catch()) {
            rfH_23 = rfH_22.id_break();
            while (rfH_23.c_() > 0 && this.id_byte.id_byte(rfH_23).id_catch()) {
                rfH_23 = rfH_23.id_break();
            }
            if (rfH_23.c_() > 0) {
                return super.id_class(rfH_23.id_final(), n);
            }
            while (rfH_23.c_() < this.id_byte.id_try() && this.id_byte.id_byte(rfH_23).id_catch()) {
                rfH_23 = rfH_23.id_final();
            }
            rfH_22 = rfH_23;
        }
        if (!this.id_byte.id_byte(rfH_22).id_byte().id_break()) {
            return super.id_class(rfH_22, n);
        }
        rfH_23 = rfH_22.id_final();
        while (rfH_23.c_() < this.id_byte.id_try() && this.id_byte.id_byte(rfH_23).id_byte().id_break()) {
            rfH_23 = rfH_23.id_final();
        }
        return super.id_class(rfH_23, n);
    }

    public void id_class(boolean bl) {
        this.id_int.id_break(bl);
    }

    private boolean id_break(int n, int n2, int n3, int n4, int n5, int n6, rjU_2 rjU_22, double d, double d2) {
        for (rfH_2 rfH_22 : rfH_2.id_class(new rfH_2(n, n2, n3), new rfH_2(n + n4 - 1, n2 + n5 - 1, n3 + n6 - 1))) {
            double d3;
            double d4 = (double)rfH_22.b_() + 0.5 - rjU_22.id_break;
            if (d4 * d + (d3 = (double)rfH_22.d_() + 0.5 - rjU_22.id_protected) * d2 < 0.0 || this.id_byte.id_byte(rfH_22).id_class((rRq_1)this.id_byte, rfH_22, rLT.LAND)) continue;
            return false;
        }
        return true;
    }

    @Override
    protected boolean id_break() {
        return this.id_break.BL() || this.id_package() || this.id_break.Pm();
    }

    public void id_break(boolean bl) {
        this.id_class = bl;
    }

    public boolean id_throws() {
        return this.id_int.id_byte();
    }

    private int id_super() {
        if (this.id_break.rT() && this.id_new()) {
            int n = rfU_2.id_byte(this.id_break.re());
            xd_3 xd_32 = this.id_byte.id_byte(new rfH_2(this.id_break.rx(), (double)n, this.id_break.BO())).id_break();
            int n2 = 0;
            while (xd_32 == xu_3.id_try) {
                xd_32 = this.id_byte.id_byte(new rfH_2(this.id_break.rx(), (double)(++n), this.id_break.BO())).id_break();
                if (++n2 <= 16) continue;
                return rfU_2.id_byte(this.id_break.re());
            }
            return n;
        }
        return rfU_2.id_byte(this.id_break.re() + 0.5);
    }

    @Override
    protected void id_protected() {
        super.id_protected();
        if (this.id_class) {
            if (this.id_byte.id_case(new rfH_2(this.id_break.rx(), this.id_break.re() + 0.5, this.id_break.BO()))) {
                return;
            }
            for (int i = 0; i < this.id_protected.id_throws(); ++i) {
                rLq_1 rLq_12 = this.id_protected.id_class(i);
                if (!this.id_byte.id_case(new rfH_2(rLq_12.id_class, rLq_12.id_break, rLq_12.id_byte))) continue;
                this.id_protected.id_break(i);
                return;
            }
        }
    }
}

