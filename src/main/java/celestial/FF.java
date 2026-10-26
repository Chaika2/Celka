/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.FA;
import celestial.Fv_1;
import celestial.rJY;
import celestial.rJr_1;
import celestial.rdn_3;
import celestial.rhd_3;
import celestial.rhz_3;
import celestial.rqs_3;

public class FF
extends rJr_1 {
    public final rqs_3<rdn_3> id_class = rqs_3.id_class();

    public FF(rhd_3 rhd_32) {
        super(null, 0);
        int n;
        rhz_3 rhz_32 = (rhz_3)rhd_32.id_implements[1];
        for (n = 0; n < 5; ++n) {
            for (int i = 0; i < 9; ++i) {
                this.id_break(new FA(Fv_1.id_case, n * 9 + i, 9 + i * 18, 18 + n * 18));
            }
        }
        for (n = 0; n < 9; ++n) {
            this.id_break(new rJY(rhz_32, n, 9 + n * 18, 112));
        }
        this.id_class(0.0f);
    }

    @Override
    public rdn_3 id_class(rhd_3 rhd_32, int n) {
        rJY rJY2;
        if (n >= this.id_throws.size() - 9 && n < this.id_throws.size() && (rJY2 = (rJY)this.id_throws.get(n)) != null && rJY2.id_break()) {
            rJY2.id_break(rdn_3.id_break);
        }
        return rdn_3.id_break;
    }

    @Override
    public boolean id_class(rdn_3 rdn_32, rJY rJY2) {
        return rJY2.id_byte != Fv_1.id_case;
    }

    @Override
    public boolean id_class(rJY rJY2) {
        return rJY2.id_byte != Fv_1.id_case;
    }

    public boolean id_class() {
        return this.id_class.size() > 45;
    }

    public void id_class(float f) {
        int n = (this.id_class.size() + 9 - 1) / 9 - 5;
        int n2 = (int)((double)(f * (float)n) + 0.5);
        if (n2 < 0) {
            n2 = 0;
        }
        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 9; ++j) {
                int n3 = j + (i + n2) * 9;
                if (n3 >= 0 && n3 < this.id_class.size()) {
                    Fv_1.id_case.id_break(j + i * 9, this.id_class.get(n3));
                    continue;
                }
                Fv_1.id_case.id_break(j + i * 9, rdn_3.id_break);
            }
        }
    }

    @Override
    public boolean id_class(rhd_3 rhd_32) {
        return true;
    }
}

