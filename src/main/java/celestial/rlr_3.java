/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rCe_1;
import celestial.rCi_1;
import celestial.rVL;
import celestial.rgP_2;
import celestial.rgn_3;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class rlr_3<T>
implements Iterable<rCi_1<T>> {
    private final rVL<T> id_class;
    private final Map<T, rCi_1<T>> id_break = new IdentityHashMap<T, rCi_1<T>>();
    private rgP_2 id_byte;

    public rgP_2 id_byte() {
        if (this.id_byte == null) {
            this.id_byte = new rgn_3(this.id_break());
        }
        return this.id_byte;
    }

    public rlr_3(rVL<T> rVL2) {
        this.id_class = rVL2;
    }

    @Override
    public Iterator<rCi_1<T>> iterator() {
        return this.id_break.values().iterator();
    }

    public boolean id_class(T t) {
        return this.id_break.containsKey(t);
    }

    public rVL<T> id_class() {
        return this.id_class;
    }

    public rCi_1<T> id_class(T t, rCe_1 rCe_12) {
        return this.id_break.computeIfAbsent(t, object -> new rCi_1<Object>(this, object, rCe_12));
    }

    public String id_break() {
        return "stat_type." + rVL.h.id_break(this).toString().replace(':', '.');
    }

    public rCi_1<T> id_break(T t) {
        return this.id_class(t, rCe_1.id_break);
    }
}

