/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aA_2;
import celestial.eX_2;
import celestial.rLf_1;
import celestial.rLp_1;
import celestial.rLy_1;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rjU_2;
import celestial.rlG_2;
import java.util.Random;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;

public class iX_2 {
    public static rjU_2 id_byte(aA_2 aA_22, int n, int n2, rjU_2 rjU_22) {
        rjU_2 rjU_23 = aA_22.Ps().id_protected(rjU_22);
        return iX_2.id_class(aA_22, n, n2, 0, rjU_23, true, 1.5707963705062866, aA_22::id_class, false, 0, 0, true);
    }

    public static rjU_2 id_class(aA_2 aA_22, int n, int n2, rjU_2 rjU_22, double d) {
        rjU_2 rjU_23 = rjU_22.id_class(aA_22.rx(), aA_22.re(), aA_22.BO());
        return iX_2.id_class(aA_22, n, n2, 0, rjU_23, true, d, aA_22::id_class, false, 0, 0, true);
    }

    private static rjU_2 id_class(aA_2 aA_22, int n, int n2, int n3, rjU_2 rjU_22, boolean bl, double d, ToDoubleFunction<rfH_2> toDoubleFunction, boolean bl2, int n4, int n5, boolean bl3) {
        rLy_1 rLy_12 = aA_22.id_public();
        Random random = aA_22.Sa();
        boolean bl4 = aA_22.k() ? aA_22.J().id_class((eX_2)aA_22.Ps(), (double)(aA_22.d() + (float)n) + 1.0) : false;
        boolean bl5 = false;
        double d2 = Double.NEGATIVE_INFINITY;
        rfH_2 rfH_23 = aA_22.Bs();
        for (int i = 0; i < 10; ++i) {
            double d3;
            rLp_1 rLp_12;
            rfH_2 rfH_24;
            rfH_2 rfH_25 = iX_2.id_class(random, n, n2, n3, rjU_22, d);
            if (rfH_25 == null) continue;
            int n6 = rfH_25.b_();
            int n7 = rfH_25.c_();
            int n8 = rfH_25.d_();
            if (aA_22.k() && n > 1) {
                rfH_24 = aA_22.J();
                n6 = aA_22.rx() > (double)rfH_24.b_() ? (n6 -= random.nextInt(n / 2)) : (n6 += random.nextInt(n / 2));
                n8 = aA_22.BO() > (double)rfH_24.d_() ? (n8 -= random.nextInt(n / 2)) : (n8 += random.nextInt(n / 2));
            }
            if ((rfH_24 = new rfH_2((double)n6 + aA_22.rx(), (double)n7 + aA_22.re(), (double)n8 + aA_22.BO())).c_() < 0 || rfH_24.c_() > ((rYB)aA_22.id_throws[7]).id_try() || bl4 && !aA_22.id_private(rfH_24) || bl3 && !rLy_12.id_class(rfH_24)) continue;
            if (bl2) {
                rfH_24 = iX_2.id_class(rfH_24, random.nextInt(n4 + 1) + n5, ((rYB)aA_22.id_throws[7]).id_try(), (rfH_2 rfH_22) -> ((rYB)aA_22.id_throws[7]).id_byte((rfH_2)rfH_22).id_byte().id_break());
            }
            if (!bl && ((rYB)aA_22.id_throws[7]).id_break(rfH_24).id_class(rlG_2.id_break) || aA_22.id_class(rLp_12 = rLf_1.id_class((rRq_1)((rYB)aA_22.id_throws[7]), rfH_24.id_new())) != 0.0f || !((d3 = toDoubleFunction.applyAsDouble(rfH_24)) > d2)) continue;
            d2 = d3;
            rfH_23 = rfH_24;
            bl5 = true;
        }
        return bl5 ? rjU_2.id_protected(rfH_23) : null;
    }

    private static rfH_2 id_class(Random random, int n, int n2, int n3, rjU_2 rjU_22, double d) {
        if (rjU_22 != null && !(d >= Math.PI)) {
            double d2 = rfU_2.id_protected(rjU_22.id_protected, rjU_22.id_break) - 1.5707963705062866;
            double d3 = d2 + (double)(2.0f * random.nextFloat() - 1.0f) * d;
            double d4 = Math.sqrt(random.nextDouble()) * (double)rfU_2.id_class * (double)n;
            double d5 = -d4 * Math.sin(d3);
            double d6 = d4 * Math.cos(d3);
            if (!(Math.abs(d5) > (double)n) && !(Math.abs(d6) > (double)n)) {
                int n4 = random.nextInt(2 * n2 + 1) - n2 + n3;
                return new rfH_2(d5, (double)n4, d6);
            }
            return null;
        }
        int n5 = random.nextInt(2 * n + 1) - n;
        int n6 = random.nextInt(2 * n2 + 1) - n2 + n3;
        int n7 = random.nextInt(2 * n + 1) - n;
        return new rfH_2(n5, n6, n7);
    }

    public static rfH_2 id_class(rfH_2 rfH_22, int n, int n2, Predicate<rfH_2> predicate) {
        rfH_2 rfH_23;
        if (n < 0) {
            throw new IllegalArgumentException("aboveSolidAmount was " + n + ", expected >= 0");
        }
        if (!predicate.test(rfH_22)) {
            return rfH_22;
        }
        rfH_2 rfH_24 = rfH_22.id_final();
        while (rfH_24.c_() < n2 && predicate.test(rfH_24)) {
            rfH_24 = rfH_24.id_final();
        }
        rfH_2 rfH_25 = rfH_24;
        while (rfH_25.c_() < n2 && rfH_25.c_() - rfH_24.c_() < n && !predicate.test(rfH_23 = rfH_25.id_final())) {
            rfH_25 = rfH_23;
        }
        return rfH_25;
    }

    public static rjU_2 id_class(aA_2 aA_22, int n, int n2, ToDoubleFunction<rfH_2> toDoubleFunction) {
        return iX_2.id_class(aA_22, n, n2, 0, null, false, 0.0, toDoubleFunction, true, 0, 0, true);
    }

    public static rjU_2 id_class(aA_2 aA_22, int n, int n2, rjU_2 rjU_22, float f, int n3, int n4) {
        return iX_2.id_class(aA_22, n, n2, 0, rjU_22, false, f, aA_22::id_class, true, n3, n4, true);
    }

    public static rjU_2 id_class(aA_2 aA_22, int n, int n2, int n3, rjU_2 rjU_22, double d) {
        return iX_2.id_class(aA_22, n, n2, n3, rjU_22, true, d, aA_22::id_class, true, 0, 0, false);
    }

    public static rjU_2 id_class(aA_2 aA_22, int n, int n2, rjU_2 rjU_22) {
        rjU_2 rjU_23 = rjU_22.id_class(aA_22.rx(), aA_22.re(), aA_22.BO());
        return iX_2.id_class(aA_22, n, n2, 0, rjU_23, false, 1.5707963705062866, aA_22::id_class, true, 0, 0, true);
    }

    public static rjU_2 id_class(aA_2 aA_22, int n, int n2) {
        return iX_2.id_class(aA_22, n, n2, 0, null, true, 1.5707963705062866, aA_22::id_class, false, 0, 0, true);
    }

    public static rjU_2 id_break(aA_2 aA_22, int n, int n2) {
        return iX_2.id_class(aA_22, n, n2, aA_22::id_class);
    }

    public static rjU_2 id_break(aA_2 aA_22, int n, int n2, rjU_2 rjU_22) {
        rjU_2 rjU_23 = rjU_22.id_class(aA_22.rx(), aA_22.re(), aA_22.BO());
        return iX_2.id_class(aA_22, n, n2, 0, rjU_23, true, 1.5707963705062866, aA_22::id_class, false, 0, 0, true);
    }

    public static rjU_2 id_break(aA_2 aA_22, int n, int n2, int n3, rjU_2 rjU_22, double d) {
        rjU_2 rjU_23 = rjU_22.id_class(aA_22.rx(), aA_22.re(), aA_22.BO());
        return iX_2.id_class(aA_22, n, n2, n3, rjU_23, false, d, aA_22::id_class, true, 0, 0, false);
    }

    public static rjU_2 id_protected(aA_2 aA_22, int n, int n2, rjU_2 rjU_22) {
        rjU_2 rjU_23 = aA_22.Ps().id_protected(rjU_22);
        return iX_2.id_class(aA_22, n, n2, 0, rjU_23, false, 1.5707963705062866, aA_22::id_class, true, 0, 0, true);
    }
}

