/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.ryZ_2;

public class rym_3<T> {
    private final ryZ_2 id_class;
    private final T id_break;

    public static <T> rym_3<T> id_byte(T t) {
        return new rym_3<T>(ryZ_2.PASS, t);
    }

    public rym_3(ryZ_2 ryZ_22, T t) {
        this.id_class = ryZ_22;
        this.id_break = t;
    }

    public static <T> rym_3<T> id_class(T t) {
        return new rym_3<T>(ryZ_2.SUCCESS, t);
    }

    public static <T> rym_3<T> id_class(T t, boolean bl) {
        return bl ? rym_3.id_class(t) : rym_3.id_break(t);
    }

    public ryZ_2 id_class() {
        return this.id_class;
    }

    public static <T> rym_3<T> id_break(T t) {
        return new rym_3<T>(ryZ_2.CONSUME, t);
    }

    public T id_break() {
        return this.id_break;
    }

    public static <T> rym_3<T> id_protected(T t) {
        return new rym_3<T>(ryZ_2.FAIL, t);
    }
}

