/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rXE;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rff_3;
import celestial.rfl_3;
import celestial.rfw_3;
import celestial.rjB_2;
import celestial.rjC_2;
import celestial.rjU_2;
import celestial.rpB_2;
import celestial.rpr_3;
import celestial.rrAk_1;
import celestial.rrQX;
import celestial.ryO_2;
import celestial.xc_3;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public interface rRq_1 {
    public xc_3 id_byte(rfH_2 var1);

    default public rff_3 id_class(rjU_2 rjU_22, rjU_2 rjU_23, rfH_2 rfH_22, rjC_2 rjC_22, xc_3 xc_32, boolean bl) {
        rff_3 rff_32;
        rff_3 rff_33 = rjC_22.id_class(rjU_22, rjU_23, rfH_22, bl);
        if (rff_33 != null && (rff_32 = xc_32.id_volatile(this, rfH_22).id_class(rjU_22, rjU_23, rfH_22, bl)) != null && rff_32.id_case().id_protected(rjU_22).id_catch() < rff_33.id_case().id_protected(rjU_22).id_catch()) {
            return rff_33.id_class(rff_32.id_break());
        }
        return rff_33;
    }

    default public rff_3 id_class(rjB_2 rjB_22) {
        return this.id_class(rjB_22, false);
    }

    default public double id_class(rjC_2 rjC_22, Supplier<rjC_2> supplier) {
        if (!rjC_22.id_break()) {
            return rjC_22.id_byte(rpB_2.Y);
        }
        double d = supplier.get().id_byte(rpB_2.Y);
        return d >= 1.0 ? d - 1.0 : Double.NEGATIVE_INFINITY;
    }

    public static <T> T id_class(rjB_2 rjB_22, BiFunction<rjB_2, rfH_2, T> biFunction, Function<rjB_2, T> function) {
        int n;
        int n2;
        rjU_2 rjU_22;
        rjU_2 rjU_23 = rjB_22.id_break();
        if (rjU_23.equals(rjU_22 = rjB_22.id_class())) {
            return function.apply(rjB_22);
        }
        double d = rfU_2.id_protected(-1.0E-7, rjU_22.id_break, rjU_23.id_break);
        double d2 = rfU_2.id_protected(-1.0E-7, rjU_22.id_byte, rjU_23.id_byte);
        double d3 = rfU_2.id_protected(-1.0E-7, rjU_22.id_protected, rjU_23.id_protected);
        double d4 = rfU_2.id_protected(-1.0E-7, rjU_23.id_break, rjU_22.id_break);
        double d5 = rfU_2.id_protected(-1.0E-7, rjU_23.id_byte, rjU_22.id_byte);
        double d6 = rfU_2.id_protected(-1.0E-7, rjU_23.id_protected, rjU_22.id_protected);
        int n3 = rfU_2.id_byte(d4);
        rfw_3 rfw_32 = new rfw_3(n3, n2 = rfU_2.id_byte(d5), n = rfU_2.id_byte(d6));
        T t = biFunction.apply(rjB_22, rfw_32);
        if (t != null) {
            return t;
        }
        double d7 = d - d4;
        double d8 = d2 - d5;
        double d9 = d3 - d6;
        int n4 = rfU_2.id_finally(d7);
        int n5 = rfU_2.id_finally(d8);
        int n6 = rfU_2.id_finally(d9);
        double d10 = n4 == 0 ? Double.MAX_VALUE : (double)n4 / d7;
        double d11 = n5 == 0 ? Double.MAX_VALUE : (double)n5 / d8;
        double d12 = n6 == 0 ? Double.MAX_VALUE : (double)n6 / d9;
        double d13 = d10 * (n4 > 0 ? 1.0 - rfU_2.id_catch(d4) : rfU_2.id_catch(d4));
        double d14 = d11 * (n5 > 0 ? 1.0 - rfU_2.id_catch(d5) : rfU_2.id_catch(d5));
        double d15 = d12 * (n6 > 0 ? 1.0 - rfU_2.id_catch(d6) : rfU_2.id_catch(d6));
        while (d13 <= 1.0 || d14 <= 1.0 || d15 <= 1.0) {
            T t2;
            if (d13 < d14) {
                if (d13 < d15) {
                    n3 += n4;
                    d13 += d10;
                } else {
                    n += n6;
                    d15 += d12;
                }
            } else if (d14 < d15) {
                n2 += n5;
                d14 += d11;
            } else {
                n += n6;
                d15 += d12;
            }
            if ((t2 = biFunction.apply(rjB_22, rfw_32.id_class(n3, n2, n))) == null) continue;
            return t2;
        }
        return function.apply(rjB_22);
    }

    public ryO_2 id_class(rfH_2 var1);

    default public Stream<xc_3> id_class(rfl_3 rfl_32) {
        return rfH_2.id_class(rfl_32).map(this::id_byte);
    }

    default public rff_3 id_class(rjB_2 rjB_23, boolean bl) {
        return rRq_1.id_class(rjB_23, (rjB_22, rfH_22) -> {
            xc_3 xc_32 = this.id_byte((rfH_2)rfH_22);
            rXE rXE2 = this.id_break((rfH_2)rfH_22);
            rjU_2 rjU_22 = rjB_22.id_break();
            rjU_2 rjU_23 = rjB_22.id_class();
            rjC_2 rjC_22 = rjB_22.id_class(xc_32, this, (rfH_2)rfH_22);
            rff_3 rff_32 = this.id_class(rjU_22, rjU_23, (rfH_2)rfH_22, rjC_22, xc_32, bl);
            rjC_2 rjC_23 = rjB_22.id_class(rXE2, this, (rfH_2)rfH_22);
            rff_3 rff_33 = rjC_23.id_class(rjU_22, rjU_23, (rfH_2)rfH_22, bl);
            double d = rff_32 == null ? Double.MAX_VALUE : rjB_22.id_break().id_implements(rff_32.id_case());
            double d2 = rff_33 == null ? Double.MAX_VALUE : rjB_22.id_break().id_implements(rff_33.id_case());
            return d <= d2 ? rff_32 : rff_33;
        }, rjB_22 -> {
            rjU_2 rjU_22 = rjB_22.id_break().id_protected(rjB_22.id_class());
            return rff_3.id_class(rjB_22.id_class(), rpr_3.id_class(rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected), new rfH_2(rjB_22.id_class()));
        });
    }

    public rXE id_break(rfH_2 var1);

    default public rff_3 id_break(rjB_2 rjB_24) {
        return rRq_1.id_class(rjB_24, (rjB_23, rfH_22) -> {
            xc_3 xc_32 = this.id_byte((rfH_2)rfH_22);
            rXE rXE2 = this.id_break((rfH_2)rfH_22);
            rjU_2 rjU_22 = rjB_23.id_break();
            rjU_2 rjU_23 = rjB_23.id_class();
            rjC_2 rjC_22 = rjB_23.id_class(xc_32, this, (rfH_2)rfH_22);
            rrAk_1 rrAk_12 = rrAk_1.id_class(this.id_class(rjU_22, rjU_23, (rfH_2)rfH_22, rjC_22, xc_32, false), rjB_24, xc_32);
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrAk_12);
            rff_3 rff_32 = rrAk_12.id_break();
            rjC_2 rjC_23 = rjB_23.id_class(rXE2, this, (rfH_2)rfH_22);
            rff_3 rff_33 = rjC_23.id_class(rjU_22, rjU_23, (rfH_2)rfH_22, false);
            double d = rff_32 == null ? Double.MAX_VALUE : rjB_23.id_break().id_implements(rff_32.id_case());
            double d2 = rff_33 == null ? Double.MAX_VALUE : rjB_23.id_break().id_implements(rff_33.id_case());
            return d <= d2 ? rff_32 : rff_33;
        }, rjB_22 -> {
            rjU_2 rjU_22 = rjB_22.id_break().id_protected(rjB_22.id_class());
            return rff_3.id_class(rjB_22.id_class(), rpr_3.id_class(rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected), new rfH_2(rjB_22.id_class()));
        });
    }

    default public int id_catch(rfH_2 rfH_22) {
        return this.id_byte(rfH_22).id_case();
    }

    default public int id_try() {
        return 256;
    }

    default public int id_while() {
        return 15;
    }

    default public double id_private(rfH_2 rfH_22) {
        return this.id_class(this.id_byte(rfH_22).id_extends(this, rfH_22), () -> {
            rfH_2 rfH_23 = rfH_22.id_break();
            return this.id_byte(rfH_23).id_extends(this, rfH_23);
        });
    }
}

