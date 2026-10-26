/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rXc_1;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rhd_3;
import java.util.Set;

public interface rXu_1
extends rXc_1 {
    public boolean id_byte(rhd_3 var1);

    public rdn_3 id_class(int var1, int var2);

    default public boolean id_class(Set<rdb_3> set) {
        for (int i = 0; i < this.id_else(); ++i) {
            rdn_3 rdn_32 = this.id_extends(i);
            if (!set.contains(rdn_32.id_break()) || rdn_32.id_char() <= 0) continue;
            return true;
        }
        return false;
    }

    default public int id_class(rdb_3 rdb_32) {
        int n = 0;
        for (int i = 0; i < this.id_else(); ++i) {
            rdn_3 rdn_32 = this.id_extends(i);
            if (!rdn_32.id_break().equals(rdb_32)) continue;
            n += rdn_32.id_char();
        }
        return n;
    }

    public void id_break();

    default public void id_break(rhd_3 rhd_32) {
    }

    public void id_break(int var1, rdn_3 var2);

    public rdn_3 id_extends(int var1);

    default public int ab_() {
        return 64;
    }

    public int id_else();

    public boolean id_return();

    public rdn_3 id_native(int var1);

    default public boolean a_(int n, rdn_3 rdn_32) {
        return true;
    }

    default public void b_(rhd_3 rhd_32) {
    }
}

