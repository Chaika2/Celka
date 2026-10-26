/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.QF;
import celestial.Qw_1;
import celestial.VF;
import celestial.rgP_2;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class rrMT
extends VF {
    private double id_byte(Qw_1 qw_1) {
        return qw_1.id_class(this);
    }

    public rrMT(String string) {
        this(string, 0.0, 1.0, 0.0f);
    }

    public rrMT(String string, double d, double d2, double[] dArray) {
        super(string, d, d2, dArray, (Function<Qw_1, Double>)null, (BiConsumer<Qw_1, Double>)null, (BiFunction<Qw_1, VF, rgP_2>)null);
        this.rn = this::id_byte;
        this.rC = this::id_break;
        this.rl = this::id_class;
    }

    public rrMT(String string, double d, double d2, float f) {
        super(string, d, d2, f, (Function<Qw_1, Double>)null, (BiConsumer<Qw_1, Double>)null, (BiFunction<Qw_1, VF, rgP_2>)null);
        this.rn = this::id_byte;
        this.rC = this::id_break;
        this.rl = this::id_class;
    }

    private rgP_2 id_class(Qw_1 qw_1, VF vF) {
        return qw_1.id_break(vF);
    }

    private void id_break(Qw_1 qw_1, double d) {
        qw_1.id_class((QF)this, d);
    }
}

