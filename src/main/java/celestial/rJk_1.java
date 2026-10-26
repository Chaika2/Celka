/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rJJ;
import celestial.rJY;
import celestial.rXu_1;
import celestial.rdn_3;
import celestial.rdy_3;

public class rJk_1
extends rJY {
    public rJk_1(rJJ rJJ2, rXu_1 rXu_12, int n, int n2, int n3) {
        super(rXu_12, n, n2, n3);
    }

    @Override
    public boolean id_class(rdn_3 rdn_32) {
        return rdn_32.id_throws() || rdn_32.id_break() == rdy_3.dm || rdn_32.id_public();
    }
}

