/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rJP;
import celestial.rJY;
import celestial.rJr_1;
import celestial.rXA;
import celestial.rXV;
import celestial.rXg_1;
import celestial.rXj_1;
import celestial.rXu_1;
import celestial.rdn_3;
import celestial.rhd_3;
import celestial.rhz_3;
import celestial.rpF_2;
import celestial.rpI_2;

public class rXf_1
extends rJr_1 {
    private final rXu_1 id_class;
    private final rpF_2 id_break;
    private final rJY id_byte;

    public rXf_1(int n, rhz_3 rhz_32) {
        this(n, rhz_32, new rXA(5), new rpI_2(2));
    }

    public rXf_1(int n, rhz_3 rhz_32, rXu_1 rXu_12, rpF_2 rpF_22) {
        super(rJP.id_extends, n);
        int n2;
        rXf_1.id_class(rXu_12, 5);
        rXf_1.id_class(rpF_22, 2);
        this.id_class = rXu_12;
        this.id_break = rpF_22;
        this.id_break(new rXg_1(rXu_12, 0, 56, 51));
        this.id_break(new rXg_1(rXu_12, 1, 79, 58));
        this.id_break(new rXg_1(rXu_12, 2, 102, 51));
        this.id_byte = this.id_break(new rXV(rXu_12, 3, 79, 17));
        this.id_break(new rXj_1(rXu_12, 4, 17, 17));
        this.id_class(rpF_22);
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
    public rdn_3 id_class(rhd_3 rhd_32, int n) {
        rdn_3 rdn_32 = rdn_3.id_break;
        rJY rJY2 = (rJY)this.id_throws.get(n);
        if (rJY2 != null && rJY2.id_break()) {
            rdn_3 rdn_33 = rJY2.id_class();
            rdn_32 = rdn_33.id_implements();
            if ((n < 0 || n > 2) && n != 3 && n != 4) {
                if (rXj_1.id_protected(rdn_32) ? this.id_class(rdn_33, 4, 5, false) || this.id_byte.id_class(rdn_33) && !this.id_class(rdn_33, 3, 4, false) : (this.id_byte.id_class(rdn_33) ? !this.id_class(rdn_33, 3, 4, false) : (rXg_1.id_protected(rdn_32) && rdn_32.id_char() == 1 ? !this.id_class(rdn_33, 0, 3, false) : (n >= 5 && n < 32 ? !this.id_class(rdn_33, 32, 41, false) : (n >= 32 && n < 41 ? !this.id_class(rdn_33, 5, 32, false) : !this.id_class(rdn_33, 5, 41, false)))))) {
                    return rdn_3.id_break;
                }
            } else {
                if (!this.id_class(rdn_33, 5, 41, true)) {
                    return rdn_3.id_break;
                }
                rJY2.id_class(rdn_33, rdn_32);
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

    public int id_class() {
        return this.id_break.id_class(1);
    }

    @Override
    public boolean id_class(rhd_3 rhd_32) {
        return this.id_class.id_byte(rhd_32);
    }

    public int id_break() {
        return this.id_break.id_class(0);
    }
}

