/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rKA;
import celestial.rKC;
import celestial.rKV;
import celestial.rKj_1;

public interface rrBA {
    public int id_class(rKC var1, int var2, int var3);

    default public <R extends rKj_1> rKV<R> id_class(rKA<R> rKA2) {
        return () -> rKA2.id_class((int n, int n2) -> {
            rKA2.id_class((long)n, (long)n2);
            return this.id_class((rKC)rKA2, n, n2);
        });
    }
}

