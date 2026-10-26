/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rJP;
import celestial.rJY;
import celestial.rJr_1;
import celestial.rXA;
import celestial.rXu_1;
import celestial.rdn_3;
import celestial.rhd_3;
import celestial.rhz_3;

public class rJs_1
extends rJr_1 {
    private final rXu_1 id_class;

    public rJs_1(int n, rhz_3 rhz_32) {
        this(n, rhz_32, new rXA(9));
    }

    public rJs_1(int n, rhz_3 rhz_32, rXu_1 rXu_12) {
        super(rJP.id_catch, n);
        int n2;
        int n3;
        rJs_1.id_class(rXu_12, 9);
        this.id_class = rXu_12;
        rXu_12.b_(rhz_32.id_throws);
        for (n3 = 0; n3 < 3; ++n3) {
            for (n2 = 0; n2 < 3; ++n2) {
                this.id_break(new rJY(rXu_12, n2 + n3 * 3, 62 + n2 * 18, 17 + n3 * 18));
            }
        }
        for (n3 = 0; n3 < 3; ++n3) {
            for (n2 = 0; n2 < 9; ++n2) {
                this.id_break(new rJY(rhz_32, n2 + n3 * 9 + 9, 8 + n2 * 18, 84 + n3 * 18));
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
            if (n < 9 ? !this.id_class(rdn_33, 9, 45, true) : !this.id_class(rdn_33, 0, 9, false)) {
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
    public boolean id_class(rhd_3 rhd_32) {
        return this.id_class.id_byte(rhd_32);
    }

    @Override
    public void id_break(rhd_3 rhd_32) {
        super.id_break(rhd_32);
        this.id_class.id_break(rhd_32);
    }
}

