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

public abstract class tX_2<E extends an_3>
extends tp_3<E> {
    private final boolean id_class;
    private final float id_break;
    private final float id_byte;
    private final float id_protected;
    private final float id_throws;
    private final float id_case;

    protected tX_2() {
        this(false, 5.0f, 2.0f);
    }

    protected tX_2(Function<rqO_2, HU> function, boolean bl, float f, float f2, float f3, float f4, float f5) {
        super(function);
        this.id_class = bl;
        this.id_break = f;
        this.id_byte = f2;
        this.id_protected = f3;
        this.id_throws = f4;
        this.id_case = f5;
    }

    protected tX_2(boolean bl, float f, float f2, float f3, float f4, float f5) {
        this(HU::id_protected, bl, f, f2, f3, f4, f5);
    }

    protected tX_2(boolean bl, float f, float f2) {
        this(bl, f, f2, 2.0f, 2.0f, 24.0f);
    }

    @Override
    public void id_class(Ml_1 ml_1, Ok_1 ok_1, int n, int n2, float f, float f2, float f3, float f4) {
        if (this.id_int) {
            float f5;
            ml_1.id_class();
            if (this.id_class) {
                f5 = 1.5f / this.id_protected;
                ml_1.id_class(f5, f5, f5);
            }
            ml_1.id_class(0.0, (double)(this.id_break / 16.0f), (double)(this.id_byte / 16.0f));
            this.id_class().forEach(iq_1 -> iq_1.id_class(ml_1, ok_1, n, n2, f, f2, f3, f4));
            ml_1.id_break();
            ml_1.id_class();
            f5 = 1.0f / this.id_throws;
            ml_1.id_class(f5, f5, f5);
            ml_1.id_class(0.0, (double)(this.id_case / 16.0f), 0.0);
            this.id_break().forEach(iq_1 -> iq_1.id_class(ml_1, ok_1, n, n2, f, f2, f3, f4));
            ml_1.id_break();
        } else {
            this.id_class().forEach(iq_1 -> iq_1.id_class(ml_1, ok_1, n, n2, f, f2, f3, f4));
            this.id_break().forEach(iq_1 -> iq_1.id_class(ml_1, ok_1, n, n2, f, f2, f3, f4));
        }
    }

    protected abstract Iterable<Iq_1> id_class();

    protected abstract Iterable<Iq_1> id_break();
}

