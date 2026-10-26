/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rKA;
import celestial.rKV;
import celestial.rKj_1;
import celestial.rrBt_1;

public interface rrBn_1
extends rrBt_1 {
    public int id_class(rKA<?> var1, rKj_1 var2, int var3, int var4);

    default public <R extends rKj_1> rKV<R> id_class(rKA<R> rKA2, rKV<R> rKV2) {
        return () -> {
            Object a = rKV2.make();
            return rKA2.id_class((int n, int n2) -> {
                rKA2.id_class((long)n, (long)n2);
                return this.id_class(rKA2, (rKj_1)a, n, n2);
            }, a);
        };
    }
}

