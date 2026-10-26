/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rAB;
import celestial.rWN;
import celestial.rXk_1;
import celestial.rYB;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rkf_3;
import celestial.rqO_2;

public class rWZ
extends rWN {
    public rWZ(rqO_2 rqO_22) {
        super(rqO_22);
    }

    @Override
    public boolean id_class(int n, int n2) {
        return n >= 2 && n2 >= 2;
    }

    @Override
    public rdn_3 id_class(rXk_1 rXk_12) {
        rdn_3 rdn_32 = rXk_12.id_extends(1 + rXk_12.id_protected());
        if (rdn_32.id_break() != rdy_3.kQ) {
            return rdn_3.id_break;
        }
        rdn_3 rdn_33 = new rdn_3(rdy_3.kz, 8);
        rAB.id_class(rdn_33, rAB.id_protected(rdn_32));
        rAB.id_class(rdn_33, rAB.id_break(rdn_32));
        return rdn_33;
    }

    @Override
    public boolean id_class(rXk_1 rXk_12, rYB rYB2) {
        if (rXk_12.id_protected() == 3 && rXk_12.id_byte() == 3) {
            for (int i = 0; i < rXk_12.id_protected(); ++i) {
                for (int j = 0; j < rXk_12.id_byte(); ++j) {
                    rdn_3 rdn_32 = rXk_12.id_extends(i + j * rXk_12.id_protected());
                    if (rdn_32.id_class()) {
                        return false;
                    }
                    rdb_3 rdb_32 = rdn_32.id_break();
                    if (!(i == 1 && j == 1 ? rdb_32 != rdy_3.kQ : rdb_32 != rdy_3.OO)) continue;
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public rkf_3<?> W_() {
        return rkf_3.id_finally;
    }
}

