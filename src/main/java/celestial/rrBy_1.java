/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rKA;
import celestial.rKC;
import celestial.rKj_1;
import celestial.rrBT;
import celestial.rrBn_1;

public interface rrBy_1
extends rrBT,
rrBn_1 {
    public int id_class(rKC var1, int var2);

    @Override
    default public int id_class(rKA<?> rKA2, rKj_1 rKj_12, int n, int n2) {
        int n3 = rKj_12.id_class(this.id_class(n + 1), this.id_break(n2 + 1));
        return this.id_class(rKA2, n3);
    }
}

