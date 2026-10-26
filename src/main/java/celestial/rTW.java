/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rTx_1;
import java.util.Queue;

public final class rTW<T>
implements rTx_1<T, T> {
    private final Queue<T> id_class;

    public rTW(Queue<T> queue) {
        this.id_class = queue;
    }

    @Override
    public boolean id_class(T t) {
        return this.id_class.add(t);
    }

    @Override
    public T id_class() {
        return this.id_class.poll();
    }

    @Override
    public boolean id_break() {
        return this.id_class.isEmpty();
    }
}

