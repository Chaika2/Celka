/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.module.combat.FastSwap;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rrTF;
import java.util.function.Predicate;

public abstract class rrCv_1
extends rrTF<FastSwap> {
    public rrCv_1(FastSwap fastSwap) {
        super(fastSwap);
    }

    public abstract rdb_3 id_class();

    public abstract Predicate<rdn_3> id_break();
}

