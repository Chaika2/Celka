/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rKA;
import celestial.rKC;
import celestial.rKj_1;
import celestial.rrBn_1;
import celestial.rrBq_1;

public interface rrBH
extends rrBn_1,
rrBq_1 {
    public int id_class(rKC var1, int var2);

    @Override
    default public int id_class(rKA<?> rKA2, rKj_1 rKj_12, int n, int n2) {
        return this.id_class(rKA2, rKj_12.id_class(this.id_class(n), this.id_break(n2)));
    }
}

