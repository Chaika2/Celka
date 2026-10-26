/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Qw_1;
import celestial.VF;
import celestial.rgP_2;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Vv_1
extends VF {
    @Override
    public double id_byte(double d) {
        return this.rL * Math.pow(Math.E, Math.log(this.rA / this.rL) * d);
    }

    public Vv_1(String string, double d, double d2, float f, Function<Qw_1, Double> function, BiConsumer<Qw_1, Double> biConsumer, BiFunction<Qw_1, VF, rgP_2> biFunction) {
        super(string, d, d2, f, function, biConsumer, biFunction);
    }

    @Override
    public double id_break(double d) {
        return Math.log(d / this.rL) / Math.log(this.rA / this.rL);
    }
}

