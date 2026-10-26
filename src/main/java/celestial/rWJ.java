/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Wp_1;
import celestial.rWN;
import celestial.rXk_1;
import celestial.rYB;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rkf_3;
import celestial.rqO_2;
import celestial.rxA_2;
import celestial.xd_3;

public class rWJ
extends rWN {
    public rWJ(rqO_2 rqO_22) {
        super(rqO_22);
    }

    @Override
    public boolean id_class(int n, int n2) {
        return n * n2 >= 2;
    }

    @Override
    public rdn_3 id_class(rXk_1 rXk_12) {
        rdn_3 rdn_32 = rdn_3.id_break;
        rxA_2 rxA_22 = (rxA_2)rdy_3.XL;
        for (int i = 0; i < rXk_12.id_else(); ++i) {
            rdn_3 rdn_33 = rXk_12.id_extends(i);
            if (rdn_33.id_class()) continue;
            rdb_3 rdb_32 = rdn_33.id_break();
            if (xd_3.id_class(rdb_32) instanceof Wp_1) {
                rdn_32 = rdn_33;
                continue;
            }
            if (!(rdb_32 instanceof rxA_2)) continue;
            rxA_22 = (rxA_2)rdb_32;
        }
        rdn_3 rdn_34 = Wp_1.id_break(rxA_22.id_byte());
        if (rdn_32.id_final()) {
            rdn_34.id_byte(rdn_32.id_package().id_catch());
        }
        return rdn_34;
    }

    @Override
    public boolean id_class(rXk_1 rXk_12, rYB rYB2) {
        int n = 0;
        int n2 = 0;
        for (int i = 0; i < rXk_12.id_else(); ++i) {
            rdn_3 rdn_32 = rXk_12.id_extends(i);
            if (rdn_32.id_class()) continue;
            if (xd_3.id_class(rdn_32.id_break()) instanceof Wp_1) {
                ++n;
            } else {
                if (!(rdn_32.id_break() instanceof rxA_2)) {
                    return false;
                }
                ++n2;
            }
            if (n2 <= 1 && n <= 1) continue;
            return false;
        }
        return n == 1 && n2 == 1;
    }

    @Override
    public rkf_3<?> W_() {
        return rkf_3.id_volatile;
    }
}

