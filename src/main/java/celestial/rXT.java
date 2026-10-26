/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rJP;
import celestial.rJY;
import celestial.rJr_1;
import celestial.rLR;
import celestial.rXt_1;
import celestial.rXu_1;
import celestial.rXw_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rhd_3;
import celestial.rpF_2;
import celestial.rpI_2;
import celestial.rpq_3;
import celestial.xu_3;

public class rXT
extends rJr_1 {
    private final rXu_1 id_class = new rXt_1(this, 1);
    private final rXw_1 id_break;
    private final rpq_3 id_byte;
    private final rpF_2 id_protected;

    public rLR id_byte() {
        return rLR.id_class(this.id_protected.id_class(2));
    }

    public rXT(int n, rXu_1 rXu_12) {
        this(n, rXu_12, new rpI_2(3), rpq_3.id_class);
    }

    public rXT(int n, rXu_1 rXu_12, rpF_2 rpF_22, rpq_3 rpq_32) {
        super(rJP.id_implements, n);
        int n2;
        rXT.id_class(rpF_22, 3);
        this.id_protected = rpF_22;
        this.id_byte = rpq_32;
        this.id_break = new rXw_1(this, this.id_class, 0, 136, 110);
        this.id_break(this.id_break);
        this.id_class(rpF_22);
        int n3 = 36;
        int n4 = 137;
        for (n2 = 0; n2 < 3; ++n2) {
            for (int i = 0; i < 9; ++i) {
                this.id_break(new rJY(rXu_12, i + n2 * 9 + 9, 36 + i * 18, 137 + n2 * 18));
            }
        }
        for (n2 = 0; n2 < 9; ++n2) {
            this.id_break(new rJY(rXu_12, n2, 36 + n2 * 18, 195));
        }
    }

    public int id_class() {
        return this.id_protected.id_class(0);
    }

    @Override
    public rdn_3 id_class(rhd_3 rhd_32, int n) {
        rdn_3 rdn_32 = rdn_3.id_break;
        rJY rJY2 = (rJY)this.id_throws.get(n);
        if (rJY2 != null && rJY2.id_break()) {
            rdn_3 rdn_33 = rJY2.id_class();
            rdn_32 = rdn_33.id_implements();
            if (n == 0) {
                if (!this.id_class(rdn_33, 1, 37, true)) {
                    return rdn_3.id_break;
                }
                rJY2.id_class(rdn_33, rdn_32);
            } else if (!this.id_break.id_break() && this.id_break.id_class(rdn_33) && rdn_33.id_char() == 1 ? !this.id_class(rdn_33, 0, 1, false) : (n >= 1 && n < 28 ? !this.id_class(rdn_33, 28, 37, false) : (n >= 28 && n < 37 ? !this.id_class(rdn_33, 1, 28, false) : !this.id_class(rdn_33, 1, 37, false)))) {
                return rdn_3.id_break;
            }
            if (rdn_33.id_class()) {
                rJY2.id_break(rdn_3.id_break);
            } else {
                rJY2.id_byte();
            }
            if (rdn_33.id_char() == rdn_32.id_char()) {
                return rdn_3.id_break;
            }
            rJY2.id_class(rhd_32, rdn_33);
        }
        return rdn_32;
    }

    @Override
    public void id_class(int n, int n2) {
        super.id_class(n, n2);
        this.id_native();
    }

    @Override
    public boolean id_class(rhd_3 rhd_32) {
        return rXT.id_class(this.id_byte, rhd_32, xu_3.Sv);
    }

    @Override
    public void id_break(rhd_3 rhd_32) {
        rdn_3 rdn_32;
        super.id_break(rhd_32);
        if (!((rYB)rhd_32.id_throws[7]).id_continue && !(rdn_32 = this.id_break.id_class(this.id_break.id_protected())).id_class()) {
            rhd_32.id_class(rdn_32, false);
        }
    }

    public void id_break(int n, int n2) {
        if (this.id_break.id_break()) {
            this.id_protected.id_class(1, n);
            this.id_protected.id_class(2, n2);
            this.id_break.id_class(1);
        }
    }

    public rLR id_break() {
        return rLR.id_class(this.id_protected.id_class(1));
    }

    public boolean id_protected() {
        return !this.id_class.id_extends(0).id_class();
    }
}

