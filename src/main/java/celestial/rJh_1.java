/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rJY;
import celestial.rXH;
import celestial.rXu_1;
import celestial.rdn_3;
import celestial.rdy_3;

public class rJh_1
extends rJY {
    private final rXH id_class;

    @Override
    public int id_byte(rdn_3 rdn_32) {
        return rJh_1.id_throws(rdn_32) ? 1 : super.id_byte(rdn_32);
    }

    public rJh_1(rXH rXH2, rXu_1 rXu_12, int n, int n2, int n3) {
        super(rXu_12, n, n2, n3);
        this.id_class = rXH2;
    }

    @Override
    public boolean id_class(rdn_3 rdn_32) {
        return this.id_class.id_break(rdn_32) || rJh_1.id_throws(rdn_32);
    }

    public static boolean id_throws(rdn_3 rdn_32) {
        return rdn_32.id_break() == rdy_3.hg;
    }
}

