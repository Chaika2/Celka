/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rKA;
import celestial.rKC;
import celestial.rKV;
import celestial.rKj_1;
import celestial.rrBt_1;

public interface rrBC
extends rrBt_1 {
    public int id_class(rKC var1, rKj_1 var2, rKj_1 var3, int var4, int var5);

    default public <R extends rKj_1> rKV<R> id_class(rKA<R> rKA2, rKV<R> rKV2, rKV<R> rKV3) {
        return () -> {
            Object a = rKV2.make();
            Object a2 = rKV3.make();
            return rKA2.id_class((int n, int n2) -> {
                rKA2.id_class((long)n, (long)n2);
                return this.id_class((rKC)rKA2, (rKj_1)a, (rKj_1)a2, n, n2);
            }, a, a2);
        };
    }
}

