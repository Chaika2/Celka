/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rVL;
import celestial.rlM_2;
import celestial.rlO_2;
import celestial.rqO_2;
import java.util.stream.Stream;

public class Ud_1<T> {
    private final rlM_2 id_class;
    private final rVL<T> id_break;
    private final String id_byte;

    public Ud_1(rlM_2 rlM_22, rVL<T> rVL2, String string) {
        this.id_class = rlM_22;
        this.id_break = rVL2;
        this.id_byte = string;
    }

    @SafeVarargs
    public final Ud_1<T> id_class(T ... TArray) {
        Stream.of(TArray).map(this.id_break::id_break).forEach(rqO_22 -> this.id_class.id_class((rqO_2)rqO_22, this.id_byte));
        return this;
    }

    public Ud_1<T> id_class(rlO_2<T> rlO_22) {
        this.id_class.id_break(rlO_22.id_break(), this.id_byte);
        return this;
    }

    public Ud_1<T> id_class(T t) {
        this.id_class.id_class(this.id_break.id_break(t), this.id_byte);
        return this;
    }
}

