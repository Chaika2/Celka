/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rVE;
import celestial.rcy_3;
import celestial.rqE_2;
import celestial.ruu_3;
import java.util.function.Predicate;

public class rVb_1<T>
implements rVE<T> {
    private final rqE_2<T> id_class;
    private final T id_break;

    public rVb_1(rqE_2<T> rqE_22, T t) {
        this.id_class = rqE_22;
        this.id_break = t;
    }

    @Override
    public void id_class(ruu_3 ruu_32) {
    }

    @Override
    public int id_class() {
        return ruu_3.id_class(0);
    }

    @Override
    public void id_class(rcy_3 rcy_32) {
    }

    @Override
    public int id_class(T t) {
        int n = this.id_class.id_class(t);
        return n == -1 ? 0 : n;
    }

    @Override
    public boolean id_class(Predicate<T> predicate) {
        return true;
    }

    @Override
    public T id_class(int n) {
        T t = this.id_class.id_class(n);
        return t == null ? this.id_break : t;
    }

    @Override
    public void id_break(ruu_3 ruu_32) {
    }
}

