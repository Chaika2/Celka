/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rWK;
import celestial.rqO_2;
import java.util.Random;

public final class rWy_1
implements rWK {
    public final int id_protected;

    public rWy_1(int n) {
        this.id_protected = n;
    }

    public static rWy_1 id_class(int n) {
        return new rWy_1(n);
    }

    @Override
    public rqO_2 id_class() {
        return id_class;
    }

    @Override
    public int id_class(Random random) {
        return this.id_protected;
    }
}

