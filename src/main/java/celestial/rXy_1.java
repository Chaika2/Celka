/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rJP;
import celestial.rJY;
import celestial.rJr_1;
import celestial.rXd_1;
import celestial.rXp_1;
import celestial.rXq_1;
import celestial.rXu_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rhd_3;
import celestial.rhz_3;
import celestial.rpq_3;
import celestial.xc_3;

public abstract class rXy_1
extends rJr_1 {
    protected final rXd_1 id_class = new rXd_1();
    protected final rXu_1 id_break = new rXp_1(this, 2);
    protected final rpq_3 id_byte;
    protected final rhd_3 id_protected;

    public rXy_1(rJP<?> rJP2, int n, rhz_3 rhz_32, rpq_3 rpq_32) {
        super(rJP2, n);
        int n2;
        this.id_byte = rpq_32;
        this.id_protected = rhz_32.id_throws;
        this.id_break(new rJY(this.id_break, 0, 27, 47));
        this.id_break(new rJY(this.id_break, 1, 76, 47));
        this.id_break(new rXq_1(this, this.id_class, 2, 134, 47));
        for (n2 = 0; n2 < 3; ++n2) {
            for (int i = 0; i < 9; ++i) {
                this.id_break(new rJY(rhz_32, i + n2 * 9 + 9, 8 + i * 18, 84 + n2 * 18));
            }
        }
        for (n2 = 0; n2 < 9; ++n2) {
            this.id_break(new rJY(rhz_32, n2, 8 + n2 * 18, 142));
        }
    }

    @Override
    public boolean id_class(rhd_3 rhd_32) {
        return this.id_byte.id_class((rYB rYB2, rfH_2 rfH_22) -> !this.id_class(rYB2.id_byte((rfH_2)rfH_22)) ? false : rhd_32.id_class((double)rfH_22.b_() + 0.5, (double)rfH_22.c_() + 0.5, (double)rfH_22.d_() + 0.5) <= 64.0, true);
    }

    @Override
    public void id_class(rXu_1 rXu_12) {
        super.id_class(rXu_12);
        if (rXu_12 == this.id_break) {
            this.id_class();
        }
    }

    protected boolean id_class(rdn_3 rdn_32) {
        return false;
    }

    @Override
    public rdn_3 id_class(rhd_3 rhd_32, int n) {
        rdn_3 rdn_32 = rdn_3.id_break;
        rJY rJY2 = (rJY)this.id_throws.get(n);
        if (rJY2 != null && rJY2.id_break()) {
            rdn_3 rdn_33 = rJY2.id_class();
            rdn_32 = rdn_33.id_implements();
            if (n == 2) {
                if (!this.id_class(rdn_33, 3, 39, true)) {
                    return rdn_3.id_break;
                }
                rJY2.id_class(rdn_33, rdn_32);
            } else if (n != 0 && n != 1) {
                if (n >= 3 && n < 39) {
                    int n2;
                    int n3 = n2 = this.id_class(rdn_32) ? 1 : 0;
                    if (!this.id_class(rdn_33, n2, 2, false)) {
                        return rdn_3.id_break;
                    }
                }
            } else if (!this.id_class(rdn_33, 3, 39, false)) {
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

    protected abstract rdn_3 id_class(rhd_3 var1, rdn_3 var2);

    protected abstract boolean id_class(rhd_3 var1, boolean var2);

    public abstract void id_class();

    protected abstract boolean id_class(xc_3 var1);

    @Override
    public void id_break(rhd_3 rhd_32) {
        super.id_break(rhd_32);
        this.id_byte.id_class((rYB rYB2, rfH_2 rfH_22) -> this.id_class(rhd_32, (rYB)rYB2, this.id_break));
    }
}

