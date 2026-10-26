/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rVE;
import celestial.rVG;
import celestial.rcZ_2;
import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rpf_3;
import celestial.rqE_2;
import celestial.ruu_3;
import java.util.function.Function;
import java.util.function.Predicate;

public class rVs_1<T>
implements rVE<T> {
    private final rqE_2<T> id_class;
    private final rpf_3<T> id_break;
    private final rVG<T> id_byte;
    private final Function<rcd_3, T> id_protected;
    private final Function<T, rcd_3> id_throws;
    private final int id_case;

    public rVs_1(rqE_2<T> rqE_22, int n, rVG<T> rVG2, Function<rcd_3, T> function, Function<T, rcd_3> function2) {
        this.id_class = rqE_22;
        this.id_case = n;
        this.id_byte = rVG2;
        this.id_protected = function;
        this.id_throws = function2;
        this.id_break = new rpf_3(1 << n);
    }

    @Override
    public void id_class(ruu_3 ruu_32) {
        this.id_break.id_class();
        int n = ruu_32.id_case();
        for (int i = 0; i < n; ++i) {
            this.id_break.id_break(this.id_class.id_class(ruu_32.id_case()));
        }
    }

    @Override
    public int id_class() {
        int n = ruu_3.id_class(this.id_break());
        for (int i = 0; i < this.id_break(); ++i) {
            n += ruu_3.id_class(this.id_class.id_class(this.id_break.id_class(i)));
        }
        return n;
    }

    @Override
    public void id_class(rcy_3 rcy_32) {
        this.id_break.id_class();
        for (int i = 0; i < rcy_32.size(); ++i) {
            this.id_break.id_break(this.id_protected.apply(rcy_32.id_class(i)));
        }
    }

    @Override
    public int id_class(T t) {
        int n = this.id_break.id_class(t);
        if (n == -1 && (n = this.id_break.id_break(t)) >= 1 << this.id_case) {
            n = this.id_byte.onResize(this.id_case + 1, t);
        }
        return n;
    }

    @Override
    public boolean id_class(Predicate<T> predicate) {
        for (int i = 0; i < this.id_break(); ++i) {
            if (!predicate.test(this.id_break.id_class(i))) continue;
            return true;
        }
        return false;
    }

    @Override
    public T id_class(int n) {
        return this.id_break.id_class(n);
    }

    public void id_break(rcy_3 rcy_32) {
        for (int i = 0; i < this.id_break(); ++i) {
            rcy_32.add((rcZ_2)this.id_throws.apply(this.id_break.id_class(i)));
        }
    }

    public int id_break() {
        return this.id_break.id_break();
    }

    @Override
    public void id_break(ruu_3 ruu_32) {
        int n = this.id_break();
        ruu_32.id_protected(n);
        for (int i = 0; i < n; ++i) {
            ruu_32.id_protected(this.id_class.id_class(this.id_break.id_class(i)));
        }
    }
}

