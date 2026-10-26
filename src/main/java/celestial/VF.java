/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LZ;
import celestial.QF;
import celestial.Qw_1;
import celestial.VL;
import celestial.rfU_2;
import celestial.rgP_2;
import celestial.rrbb_3;
import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class VF
extends QF {
    protected final float rF;
    protected final double rL;
    protected double rA;
    protected Function<Qw_1, Double> rn;
    protected BiConsumer<Qw_1, Double> rC;
    protected BiFunction<Qw_1, VF, rgP_2> rl;
    protected double[] rH;

    public double id_byte(double d) {
        return this.id_protected(rfU_2.id_protected(rfU_2.id_class(d, 0.0, 1.0), this.rL, this.rA));
    }

    public VF(String string, double d, double d2, float f, Function<Qw_1, Double> function, BiConsumer<Qw_1, Double> biConsumer, BiFunction<Qw_1, VF, rgP_2> biFunction) {
        super(string);
        this.rL = d;
        this.rA = d2;
        this.rF = f;
        this.rn = function;
        this.rC = biConsumer;
        this.rl = biFunction;
    }

    public VF(String string, double d, double d2, double[] dArray, Function<Qw_1, Double> function, BiConsumer<Qw_1, Double> biConsumer, BiFunction<Qw_1, VF, rgP_2> biFunction) {
        super(string);
        this.rL = d;
        this.rA = d2;
        this.rF = 0.0f;
        this.rn = function;
        this.rC = biConsumer;
        this.rl = biFunction;
        this.rH = dArray;
        if (dArray != null) {
            dArray = (double[])dArray.clone();
            Arrays.sort(dArray);
        }
    }

    public void id_class(Qw_1 qw_1, double d) {
        this.rC.accept(qw_1, d);
    }

    public double id_class(Qw_1 qw_1) {
        return this.rn.apply(qw_1);
    }

    @Override
    public LZ id_class(Qw_1 qw_1, int n, int n2, int n3) {
        return new VL(this, qw_1, n, n2, n3, 20, this);
    }

    public void id_break(float f) {
        this.rA = f;
    }

    public rgP_2 id_break(Qw_1 qw_1) {
        return this.rl.apply(qw_1, this);
    }

    public double id_break(double d) {
        return rfU_2.id_class((this.id_protected(d) - this.rL) / (this.rA - this.rL), 0.0, 1.0);
    }

    public double id_throws() {
        return this.rL;
    }

    public double id_case() {
        return this.rA;
    }

    private double id_protected(double d) {
        if (this.rF > 0.0f) {
            d = this.rF * (float)Math.round(d / (double)this.rF);
        }
        if (this.rH != null) {
            for (int i = 0; i < this.rH.length; ++i) {
                double d2;
                double d3 = i <= 0 ? -1.7976931348623157E308 : (this.rH[i - 1] + this.rH[i]) / 2.0;
                double d4 = d2 = i >= this.rH.length - 1 ? Double.MAX_VALUE : (this.rH[i] + this.rH[i + 1]) / 2.0;
                if (!rrbb_3.id_break(d, d3, d2)) continue;
                d = this.rH[i];
                break;
            }
        }
        return rfU_2.id_class(d, this.rL, this.rA);
    }
}

