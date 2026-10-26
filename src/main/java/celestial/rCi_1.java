/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rAi_1;
import celestial.rCe_1;
import celestial.rVL;
import celestial.rlr_3;
import celestial.rqO_2;
import java.util.Objects;

public class rCi_1<T>
extends rAi_1 {
    private final rCe_1 id_package;
    private final T id_int;
    private final rlr_3<T> id_new;

    protected rCi_1(rlr_3<T> rlr_32, T t, rCe_1 rCe_12) {
        super(rCi_1.id_class(rlr_32, t));
        this.id_new = rlr_32;
        this.id_package = rCe_12;
        this.id_int = t;
    }

    public boolean equals(Object object) {
        return this == object || object instanceof rCi_1 && Objects.equals(this.id_class(), ((rCi_1)object).id_class());
    }

    public String toString() {
        return "Stat{name=" + this.id_class() + ", formatter=" + this.id_package + "}";
    }

    public int hashCode() {
        return this.id_class().hashCode();
    }

    public static <T> String id_class(rlr_3<T> rlr_32, T t) {
        return rCi_1.id_class(rVL.h.id_break(rlr_32)) + ":" + rCi_1.id_class(rlr_32.id_class().id_break(t));
    }

    public String id_class(int n) {
        return this.id_package.format(n);
    }

    private static <T> String id_class(rqO_2 rqO_22) {
        return rqO_22.toString().replace(':', '.');
    }

    public T id_throws() {
        return this.id_int;
    }

    public rlr_3<T> id_protected() {
        return this.id_new;
    }
}

