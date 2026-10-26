/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rTs_1;
import com.mojang.serialization.Codec;

public class rTS<T> {
    public final T id_class;
    public final int id_break;
    private double id_byte;

    public rTS(T t, int n) {
        this.id_break = n;
        this.id_class = t;
    }

    public String toString() {
        return this.id_break + ":" + this.id_class;
    }

    public static <E> Codec<rTS<E>> id_class(Codec<E> codec) {
        return new rTs_1(codec);
    }

    public T id_class() {
        return this.id_class;
    }

    public void id_class(float f) {
        this.id_byte = -Math.pow(f, 1.0f / (float)this.id_break);
    }

    public double id_break() {
        return this.id_byte;
    }
}

