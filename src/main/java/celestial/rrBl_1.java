/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rKA;
import celestial.rKC;
import celestial.rKj_1;
import celestial.rrBT;
import celestial.rrBn_1;

public interface rrBl_1
extends rrBT,
rrBn_1 {
    public int id_class(rKC var1, int var2, int var3, int var4, int var5, int var6);

    @Override
    default public int id_class(rKA<?> rKA2, rKj_1 rKj_12, int n, int n2) {
        return this.id_class(rKA2, rKj_12.id_class(this.id_class(n + 0), this.id_break(n2 + 2)), rKj_12.id_class(this.id_class(n + 2), this.id_break(n2 + 2)), rKj_12.id_class(this.id_class(n + 2), this.id_break(n2 + 0)), rKj_12.id_class(this.id_class(n + 0), this.id_break(n2 + 0)), rKj_12.id_class(this.id_class(n + 1), this.id_break(n2 + 1)));
    }
}

