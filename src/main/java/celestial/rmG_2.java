/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rut_3;

public class rmG_2<T> {
    public final rut_3<T> id_class;
    public T id_break;
    private boolean id_byte;

    public boolean id_byte() {
        return this.id_byte;
    }

    public rmG_2(rut_3<T> rut_32, T t) {
        this.id_class = rut_32;
        this.id_break = t;
        this.id_byte = true;
    }

    public String toString() {
        return "DataEntry{key=" + this.id_class + ", value=" + this.id_break + ", dirty=" + this.id_byte + "}";
    }

    public void id_class(T t) {
        this.id_break = t;
    }

    public void id_class(boolean bl) {
        this.id_byte = bl;
    }

    public rut_3<T> id_class() {
        return this.id_class;
    }

    public T id_break() {
        return this.id_break;
    }

    public rmG_2<T> id_protected() {
        return new rmG_2<T>(this.id_class, this.id_class.id_break().id_class(this.id_break));
    }
}

