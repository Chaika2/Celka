/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rCZ;

public final class rCv_1<T extends Comparable<T>> {
    private final rCZ<T> id_class;
    private final T id_break;

    public rCv_1(rCZ<T> rCZ2, T t) {
        if (!rCZ2.id_class().contains(t)) {
            throw new IllegalArgumentException("Value " + t + " does not belong to property " + rCZ2);
        }
        this.id_class = rCZ2;
        this.id_break = t;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof rCv_1)) {
            return false;
        }
        rCv_1 rCv_12 = (rCv_1)object;
        return this.id_class == rCv_12.id_class && this.id_break.equals(rCv_12.id_break);
    }

    public String toString() {
        return this.id_class.id_throws() + "=" + this.id_class.id_class(this.id_break);
    }

    public int hashCode() {
        int n = this.id_class.hashCode();
        return 31 * n + this.id_break.hashCode();
    }

    public rCZ<T> id_class() {
        return this.id_class;
    }

    public T id_break() {
        return this.id_break;
    }
}

