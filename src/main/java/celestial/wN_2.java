/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.Iq_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.an_3;
import celestial.rqO_2;
import celestial.tp_3;
import java.util.function.Function;

public abstract class wN_2<E extends an_3>
extends tp_3<E> {
    public wN_2() {
        this(HU::id_protected);
    }

    public wN_2(Function<rqO_2, HU> function) {
        super(function);
    }

    public abstract Iterable<Iq_1> id_class();

    @Override
    public void id_class(Ml_1 ml_1, Ok_1 ok_1, int n, int n2, float f, float f2, float f3, float f4) {
        this.id_class().forEach(iq_1 -> iq_1.id_class(ml_1, ok_1, n, n2, f, f2, f3, f4));
    }
}

