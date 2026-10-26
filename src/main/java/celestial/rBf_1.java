/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.rBI;
import celestial.rOQ;
import java.util.function.Predicate;

public class rBf_1<T extends iB_2>
extends rBI<T> {
    private final rOQ id_implements;

    public rBf_1(rOQ rOQ2, Class<T> clazz, boolean bl, Predicate<iB_2> predicate) {
        super(rOQ2, clazz, 10, bl, false, predicate);
        this.id_implements = rOQ2;
    }

    @Override
    public boolean id_class() {
        return !this.id_implements.sZ() && super.id_class();
    }

    @Override
    public boolean id_break() {
        return this.id_protected != null ? this.id_protected.id_class(this.id_throws, this.id_byte) : super.id_break();
    }
}

