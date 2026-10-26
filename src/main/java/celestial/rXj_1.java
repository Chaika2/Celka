/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rJY;
import celestial.rXu_1;
import celestial.rdn_3;
import celestial.rdy_3;

public class rXj_1
extends rJY {
    public rXj_1(rXu_1 rXu_12, int n, int n2, int n3) {
        super(rXu_12, n, n2, n3);
    }

    @Override
    public boolean id_class(rdn_3 rdn_32) {
        return rXj_1.id_protected(rdn_32);
    }

    @Override
    public int id_protected() {
        return 64;
    }

    public static boolean id_protected(rdn_3 rdn_32) {
        return rdn_32.id_break() == rdy_3.JH;
    }
}

