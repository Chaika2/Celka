/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Oo_1;
import celestial.rAB;
import celestial.rJY;
import celestial.rLi_1;
import celestial.rXu_1;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rhN_2;
import celestial.rhd_3;

public class rXg_1
extends rJY {
    public rXg_1(rXu_1 rXu_12, int n, int n2, int n3) {
        super(rXu_12, n, n2, n3);
    }

    @Override
    public rdn_3 id_class(rhd_3 rhd_32, rdn_3 rdn_32) {
        rLi_1 rLi_12 = rAB.id_protected(rdn_32);
        if (rhd_32 instanceof rhN_2) {
            Oo_1.id_extends.id_class((rhN_2)rhd_32, rLi_12);
        }
        super.id_class(rhd_32, rdn_32);
        return rdn_32;
    }

    @Override
    public boolean id_class(rdn_3 rdn_32) {
        return rXg_1.id_protected(rdn_32);
    }

    public static boolean id_protected(rdn_3 rdn_32) {
        rdb_3 rdb_32 = rdn_32.id_break();
        return rdb_32 == rdy_3.JA || rdb_32 == rdy_3.kk || rdb_32 == rdy_3.kQ || rdb_32 == rdy_3.Jn;
    }

    @Override
    public int id_protected() {
        return 1;
    }
}

