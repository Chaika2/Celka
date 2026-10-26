/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rWN;
import celestial.rXk_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rkf_3;
import celestial.rqO_2;

public class rkK_2
extends rWN {
    public rkK_2(rqO_2 rqO_22) {
        super(rqO_22);
    }

    @Override
    public boolean id_class(int n, int n2) {
        return n >= 3 && n2 >= 3;
    }

    @Override
    public rdn_3 id_class(rXk_1 rXk_12) {
        int n = 0;
        rdn_3 rdn_32 = rdn_3.id_break;
        for (int i = 0; i < rXk_12.id_else(); ++i) {
            rdn_3 rdn_33 = rXk_12.id_extends(i);
            if (rdn_33.id_class()) continue;
            if (rdn_33.id_break() == rdy_3.JX) {
                if (!rdn_32.id_class()) {
                    return rdn_3.id_break;
                }
                rdn_32 = rdn_33;
                continue;
            }
            if (rdn_33.id_break() != rdy_3.dM) {
                return rdn_3.id_break;
            }
            ++n;
        }
        if (!rdn_32.id_class() && n >= 1) {
            rdn_3 rdn_34 = rdn_32.id_implements();
            rdn_34.id_throws(n + 1);
            return rdn_34;
        }
        return rdn_3.id_break;
    }

    @Override
    public boolean id_class(rXk_1 rXk_12, rYB rYB2) {
        int n = 0;
        rdn_3 rdn_32 = rdn_3.id_break;
        for (int i = 0; i < rXk_12.id_else(); ++i) {
            rdn_3 rdn_33 = rXk_12.id_extends(i);
            if (rdn_33.id_class()) continue;
            if (rdn_33.id_break() == rdy_3.JX) {
                if (!rdn_32.id_class()) {
                    return false;
                }
                rdn_32 = rdn_33;
                continue;
            }
            if (rdn_33.id_break() != rdy_3.dM) {
                return false;
            }
            ++n;
        }
        return !rdn_32.id_class() && n > 0;
    }

    @Override
    public rkf_3<?> W_() {
        return rkf_3.id_throws;
    }
}

