/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rJY;
import celestial.rXR;
import celestial.rXu_1;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;

public class rXD
extends rJY {
    public rXD(rXR rXR2, rXu_1 rXu_12, int n, int n2, int n3) {
        super(rXu_12, n, n2, n3);
    }

    @Override
    public boolean id_class(rdn_3 rdn_32) {
        rdb_3 rdb_32 = rdn_32.id_break();
        return rdb_32 == rdy_3.Xb || rdb_32 == rdy_3.dM || rdb_32 == rdy_3.BD;
    }
}

