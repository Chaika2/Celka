/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rJN;
import celestial.rJY;
import celestial.rJc_1;
import celestial.rJr_1;
import celestial.rOD;
import celestial.rOK;
import celestial.rXu_1;
import celestial.rdn_3;
import celestial.rhd_3;
import celestial.rhz_3;

public class rJQ
extends rJr_1 {
    private final rXu_1 id_class;
    private final rOD id_break;

    public rJQ(int n, rhz_3 rhz_32, rXu_1 rXu_12, rOD rOD2) {
        super(null, n);
        int n2;
        int n3;
        this.id_class = rXu_12;
        this.id_break = rOD2;
        int n4 = 3;
        rXu_12.b_(rhz_32.id_throws);
        int n5 = -18;
        this.id_break(new rJN(this, rXu_12, 0, 8, 18, rOD2));
        this.id_break(new rJc_1(this, rXu_12, 1, 8, 36, rOD2));
        if (rOD2 instanceof rOK && ((rOK)rOD2).sJ()) {
            for (n3 = 0; n3 < 3; ++n3) {
                for (n2 = 0; n2 < ((rOK)rOD2).sc(); ++n2) {
                    this.id_break(new rJY(rXu_12, 2 + n2 + n3 * ((rOK)rOD2).sc(), 80 + n2 * 18, 18 + n3 * 18));
                }
            }
        }
        for (n3 = 0; n3 < 3; ++n3) {
            for (n2 = 0; n2 < 9; ++n2) {
                this.id_break(new rJY(rhz_32, n2 + n3 * 9 + 9, 8 + n2 * 18, 102 + n3 * 18 + -18));
            }
        }
        for (n3 = 0; n3 < 9; ++n3) {
            this.id_break(new rJY(rhz_32, n3, 8 + n3 * 18, 142));
        }
    }

    @Override
    public rdn_3 id_class(rhd_3 rhd_32, int n) {
        rdn_3 rdn_32 = rdn_3.id_break;
        rJY rJY2 = (rJY)this.id_throws.get(n);
        if (rJY2 != null && rJY2.id_break()) {
            rdn_3 rdn_33 = rJY2.id_class();
            rdn_32 = rdn_33.id_implements();
            int n2 = this.id_class.id_else();
            if (n < n2) {
                if (!this.id_class(rdn_33, n2, this.id_throws.size(), true)) {
                    return rdn_3.id_break;
                }
            } else if (this.id_class(1).id_class(rdn_33) && !this.id_class(1).id_break()) {
                if (!this.id_class(rdn_33, 1, 2, false)) {
                    return rdn_3.id_break;
                }
            } else if (this.id_class(0).id_class(rdn_33)) {
                if (!this.id_class(rdn_33, 0, 1, false)) {
                    return rdn_3.id_break;
                }
            } else if (n2 <= 2 || !this.id_class(rdn_33, 2, n2, false)) {
                int n3 = n2 + 27;
                int n4 = n3 + 9;
                if (n >= n3 && n < n4 ? !this.id_class(rdn_33, n2, n3, false) : (n >= n2 && n < n3 ? !this.id_class(rdn_33, n3, n4, false) : !this.id_class(rdn_33, n3, n3, false))) {
                    return rdn_3.id_break;
                }
                return rdn_3.id_break;
            }
            if (rdn_33.id_class()) {
                rJY2.id_break(rdn_3.id_break);
            } else {
                rJY2.id_byte();
            }
        }
        return rdn_32;
    }

    @Override
    public boolean id_class(rhd_3 rhd_32) {
        return this.id_class.id_byte(rhd_32) && this.id_break.BM() && this.id_break.id_implements(rhd_32) < 8.0f;
    }

    @Override
    public void id_break(rhd_3 rhd_32) {
        super.id_break(rhd_32);
        this.id_class.id_break(rhd_32);
    }
}

