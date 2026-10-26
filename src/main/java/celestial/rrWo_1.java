/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrWR;

public class rrWo_1<T> {
    private final T id_class;
    private rrWo_1<T> id_break;
    public rrWo_1<T> id_byte;
    public rrWR<T> id_protected;

    public rrWo_1<T> id_byte() {
        return this.id_byte;
    }

    public rrWo_1(T t) {
        this.id_class = t;
    }

    public String toString() {
        return "" + this.id_class;
    }

    public void id_class(rrWR<T> rrWR2) {
        this.id_protected = rrWR2;
    }

    public T id_class() {
        return this.id_class;
    }

    public void id_class(rrWo_1<T> rrWo_12) {
        this.id_break = rrWo_12;
    }

    public rrWo_1<T> id_break() {
        return this.id_break;
    }

    public void id_break(rrWo_1<T> rrWo_12) {
        this.id_byte = rrWo_12;
    }
}

