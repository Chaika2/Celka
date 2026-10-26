/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.is_3;
import celestial.rLC;
import celestial.rLF;
import celestial.rLl_1;
import celestial.rLy_1;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rjU_2;
import celestial.ruP_2;

public class rLL
extends rLy_1 {
    @Override
    protected rjU_2 id_byte() {
        return this.id_break.Ps();
    }

    public rLL(is_3 is_32, rYB rYB2) {
        super(is_32, rYB2);
    }

    @Override
    public void id_class() {
        ++this.id_case;
        if (this.id_final) {
            this.id_implements();
        }
        if (!this.id_native()) {
            rjU_2 rjU_22;
            if (this.id_break()) {
                this.id_extends();
            } else if (this.id_protected != null && !this.id_protected.id_byte()) {
                rjU_22 = this.id_protected.id_class(this.id_break);
                if (rfU_2.id_byte(this.id_break.rx()) == rfU_2.id_byte(rjU_22.id_break) && rfU_2.id_byte(this.id_break.re()) == rfU_2.id_byte(rjU_22.id_byte) && rfU_2.id_byte(this.id_break.BO()) == rfU_2.id_byte(rjU_22.id_protected)) {
                    this.id_protected.id_class();
                }
            }
            ruP_2.id_class(this.id_byte, this.id_break, this.id_protected, this.id_volatile);
            if (!this.id_native()) {
                rjU_22 = this.id_protected.id_class(this.id_break);
                this.id_break.id_super().id_class(rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected, this.id_throws);
            }
        }
    }

    @Override
    protected boolean id_class(rjU_2 rjU_22, rjU_2 rjU_23, int n, int n2, int n3) {
        int n4 = rfU_2.id_byte(rjU_22.id_break);
        int n5 = rfU_2.id_byte(rjU_22.id_byte);
        int n6 = rfU_2.id_byte(rjU_22.id_protected);
        double d = rjU_23.id_break - rjU_22.id_break;
        double d2 = rjU_23.id_byte - rjU_22.id_byte;
        double d3 = rjU_23.id_protected - rjU_22.id_protected;
        double d4 = d * d + d2 * d2 + d3 * d3;
        if (d4 < 1.0E-8) {
            return false;
        }
        double d5 = 1.0 / Math.sqrt(d4);
        double d6 = 1.0 / Math.abs(d *= d5);
        double d7 = 1.0 / Math.abs(d2 *= d5);
        double d8 = 1.0 / Math.abs(d3 *= d5);
        double d9 = (double)n4 - rjU_22.id_break;
        double d10 = (double)n5 - rjU_22.id_byte;
        double d11 = (double)n6 - rjU_22.id_protected;
        if (d >= 0.0) {
            d9 += 1.0;
        }
        if (d2 >= 0.0) {
            d10 += 1.0;
        }
        if (d3 >= 0.0) {
            d11 += 1.0;
        }
        d9 /= d;
        d10 /= d2;
        d11 /= d3;
        int n7 = d < 0.0 ? -1 : 1;
        int n8 = d2 < 0.0 ? -1 : 1;
        int n9 = d3 < 0.0 ? -1 : 1;
        int n10 = rfU_2.id_byte(rjU_23.id_break);
        int n11 = rfU_2.id_byte(rjU_23.id_byte);
        int n12 = rfU_2.id_byte(rjU_23.id_protected);
        int n13 = n10 - n4;
        int n14 = n11 - n5;
        int n15 = n12 - n6;
        while (n13 * n7 > 0 || n14 * n8 > 0 || n15 * n9 > 0) {
            if (d9 < d11 && d9 <= d10) {
                d9 += d6;
                n13 = n10 - (n4 += n7);
                continue;
            }
            if (d10 < d9 && d10 <= d11) {
                d10 += d7;
                n14 = n11 - (n5 += n8);
                continue;
            }
            d11 += d8;
            n15 = n12 - (n6 += n9);
        }
        return true;
    }

    @Override
    public boolean id_class(rfH_2 rfH_22) {
        return this.id_byte.id_byte(rfH_22).id_class((rRq_1)this.id_byte, rfH_22, (an_3)this.id_break);
    }

    public void id_class(boolean bl) {
        this.id_int.id_break(bl);
    }

    @Override
    protected rLl_1 id_class(int n) {
        this.id_int = new rLF();
        this.id_int.id_class(true);
        return new rLl_1(this.id_int, n);
    }

    @Override
    public rLC id_class(an_3 an_32, int n) {
        return this.id_class(an_32.Bs(), n);
    }

    @Override
    protected boolean id_break() {
        return this.id_new() && this.id_package() || !this.id_break.Pm();
    }

    public void id_break(boolean bl) {
        this.id_int.id_class(bl);
    }
}

