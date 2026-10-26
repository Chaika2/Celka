/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rYG;
import celestial.rYT;
import celestial.rYn_1;
import celestial.rpW_2;

public final class rYq_1
extends Enum<rYq_1>
implements rYT {
    public static final /* enum */ rYq_1 INSTANCE = new rYq_1();
    public ThreadLocal<double[]> DOUBLE8 = ThreadLocal.withInitial(() -> new double[8]);
    private static final /* synthetic */ rYq_1[] $VALUES;

    static {
        $VALUES = rYq_1.id_break();
    }

    public static rYq_1[] values() {
        return (rYq_1[])$VALUES.clone();
    }

    public static rYq_1 valueOf(String string) {
        return Enum.valueOf(rYq_1.class, string);
    }

    private static double id_class(double d) {
        return d * d;
    }

    private static double id_class(long l) {
        double d = (double)((int)Math.floorMod(l >> 24, 1024L)) / 1024.0;
        return (d - 0.5) * 0.9;
    }

    private static double id_class(long l, int n, int n2, int n3, double d, double d2, double d3) {
        long l2 = rpW_2.id_class(l, n);
        l2 = rpW_2.id_class(l2, n2);
        l2 = rpW_2.id_class(l2, n3);
        l2 = rpW_2.id_class(l2, n);
        l2 = rpW_2.id_class(l2, n2);
        l2 = rpW_2.id_class(l2, n3);
        double d4 = rYq_1.id_class(l2);
        l2 = rpW_2.id_class(l2, l);
        double d5 = rYq_1.id_class(l2);
        l2 = rpW_2.id_class(l2, l);
        double d6 = rYq_1.id_class(l2);
        return rYq_1.id_class(d3 + d6) + rYq_1.id_class(d2 + d5) + rYq_1.id_class(d + d4);
    }

    @Override
    public rYG id_class(long l, int n, int n2, int n3, rYn_1 rYn_12) {
        int n4;
        int n5;
        int n6;
        int n7;
        int n8 = n - 2;
        int n9 = n2 - 2;
        int n10 = n3 - 2;
        int n11 = n8 >> 2;
        int n12 = n9 >> 2;
        int n13 = n10 >> 2;
        double d = (double)(n8 & 3) / 4.0;
        double d2 = (double)(n9 & 3) / 4.0;
        double d3 = (double)(n10 & 3) / 4.0;
        double[] dArray = this.DOUBLE8.get();
        for (n7 = 0; n7 < 8; ++n7) {
            boolean bl = (n7 & 4) == 0;
            boolean bl2 = (n7 & 2) == 0;
            n6 = (n7 & 1) == 0 ? 1 : 0;
            n5 = bl ? n11 : n11 + 1;
            n4 = bl2 ? n12 : n12 + 1;
            int n14 = n6 != 0 ? n13 : n13 + 1;
            double d4 = bl ? d : d - 1.0;
            double d5 = bl2 ? d2 : d2 - 1.0;
            double d6 = n6 != 0 ? d3 : d3 - 1.0;
            dArray[n7] = rYq_1.id_class(l, n5, n4, n14, d4, d5, d6);
        }
        n7 = 0;
        double d7 = dArray[0];
        for (n6 = 1; n6 < 8; ++n6) {
            if (!(d7 > dArray[n6])) continue;
            n7 = n6;
            d7 = dArray[n6];
        }
        n6 = (n7 & 4) == 0 ? n11 : n11 + 1;
        n5 = (n7 & 2) == 0 ? n12 : n12 + 1;
        n4 = (n7 & 1) == 0 ? n13 : n13 + 1;
        return rYn_12.id_protected(n6, n5, n4);
    }

    private static /* synthetic */ rYq_1[] id_break() {
        return new rYq_1[]{INSTANCE};
    }
}

