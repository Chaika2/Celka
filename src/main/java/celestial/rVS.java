/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rVE;
import celestial.rVG;
import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rqE_2;
import celestial.ruu_3;
import java.util.function.Function;
import java.util.function.Predicate;

public class rVS<T>
implements rVE<T> {
    private final rqE_2<T> id_class;
    private final T[] id_break;
    private final rVG<T> id_byte;
    private final Function<rcd_3, T> id_protected;
    private final int id_throws;
    private int id_case;

    public rVS(rqE_2<T> rqE_22, int n, rVG<T> rVG2, Function<rcd_3, T> function) {
        this.id_class = rqE_22;
        this.id_break = new Object[1 << n];
        this.id_throws = n;
        this.id_byte = rVG2;
        this.id_protected = function;
    }

    @Override
    public void id_class(ruu_3 ruu_32) {
        this.id_case = ruu_32.id_case();
        for (int i = 0; i < this.id_case; ++i) {
            this.id_break[i] = this.id_class.id_class(ruu_32.id_case());
        }
    }

    @Override
    public int id_class() {
        int n = ruu_3.id_class(this.id_break());
        for (int i = 0; i < this.id_break(); ++i) {
            n += ruu_3.id_class(this.id_class.id_class(this.id_break[i]));
        }
        return n;
    }

    @Override
    public void id_class(rcy_3 rcy_32) {
        for (int i = 0; i < rcy_32.size(); ++i) {
            this.id_break[i] = this.id_protected.apply(rcy_32.id_class(i));
        }
        this.id_case = rcy_32.size();
    }

    @Override
    public int id_class(T t) {
        int n;
        for (n = 0; n < this.id_case; ++n) {
            if (this.id_break[n] != t) continue;
            return n;
        }
        if ((n = this.id_case++) < this.id_break.length) {
            this.id_break[n] = t;
            return n;
        }
        return this.id_byte.onResize(this.id_throws + 1, t);
    }

    @Override
    public boolean id_class(Predicate<T> predicate) {
        for (int i = 0; i < this.id_case; ++i) {
            if (!predicate.test(this.id_break[i])) continue;
            return true;
        }
        return false;
    }

    @Override
    public T id_class(int n) {
        return n >= 0 && n < this.id_case ? (T)this.id_break[n] : null;
    }

    public int id_break() {
        return this.id_case;
    }

    @Override
    public void id_break(ruu_3 ruu_32) {
        ruu_32.id_protected(this.id_case);
        for (int i = 0; i < this.id_case; ++i) {
            ruu_32.id_protected(this.id_class.id_class(this.id_break[i]));
        }
    }
}

