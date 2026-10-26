/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rHb_1;
import celestial.rWN;
import celestial.rXk_1;
import celestial.rYB;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rkf_3;
import celestial.rqO_2;
import celestial.rqs_3;
import celestial.rxL_2;
import celestial.rxO_2;

public class rkL_2
extends rWN {
    public rkL_2(rqO_2 rqO_22) {
        super(rqO_22);
    }

    @Override
    public boolean id_class(int n, int n2) {
        return n * n2 >= 2;
    }

    @Override
    public boolean id_class(rXk_1 rXk_12, rYB rYB2) {
        rxL_2 rxL_22 = null;
        rdn_3 rdn_32 = null;
        rdn_3 rdn_33 = null;
        for (int i = 0; i < rXk_12.id_else(); ++i) {
            rdn_3 rdn_34 = rXk_12.id_extends(i);
            rdb_3 rdb_32 = rdn_34.id_break();
            if (!(rdb_32 instanceof rxO_2)) continue;
            rxO_2 rxO_22 = (rxO_2)rdb_32;
            if (rxL_22 == null) {
                rxL_22 = rxO_22.id_byte();
            } else if (rxL_22 != rxO_22.id_byte()) {
                return false;
            }
            int n = rHb_1.id_break(rdn_34);
            if (n > 6) {
                return false;
            }
            if (n > 0) {
                if (rdn_32 != null) {
                    return false;
                }
                rdn_32 = rdn_34;
                continue;
            }
            if (rdn_33 != null) {
                return false;
            }
            rdn_33 = rdn_34;
        }
        return rdn_32 != null && rdn_33 != null;
    }

    @Override
    public rdn_3 id_class(rXk_1 rXk_12) {
        for (int i = 0; i < rXk_12.id_else(); ++i) {
            int n;
            rdn_3 rdn_32 = rXk_12.id_extends(i);
            if (rdn_32.id_class() || (n = rHb_1.id_break(rdn_32)) <= 0 || n > 6) continue;
            rdn_3 rdn_33 = rdn_32.id_implements();
            rdn_33.id_throws(1);
            return rdn_33;
        }
        return rdn_3.id_break;
    }

    @Override
    public rqs_3<rdn_3> id_break(rXk_1 rXk_12) {
        rqs_3<rdn_3> rqs_32 = rqs_3.id_class(rXk_12.id_else(), rdn_3.id_break);
        for (int i = 0; i < rqs_32.size(); ++i) {
            rdn_3 rdn_32 = rXk_12.id_extends(i);
            if (rdn_32.id_class()) continue;
            if (rdn_32.id_break().id_int()) {
                rqs_32.set(i, new rdn_3(rdn_32.id_break().id_package()));
                continue;
            }
            if (!rdn_32.id_final() || rHb_1.id_break(rdn_32) <= 0) continue;
            rdn_3 rdn_33 = rdn_32.id_implements();
            rdn_33.id_throws(1);
            rqs_32.set(i, rdn_33);
        }
        return rqs_32;
    }

    @Override
    public rkf_3<?> W_() {
        return rkf_3.id_extends;
    }
}

