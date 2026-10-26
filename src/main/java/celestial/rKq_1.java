/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.doubles.DoubleList
 *  it.unimi.dsi.fastutil.doubles.DoubleListIterator
 */
package celestial;

import celestial.rKt_1;
import celestial.rqm_3;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import it.unimi.dsi.fastutil.doubles.DoubleListIterator;

public class rKq_1 {
    private final double id_class;
    private final rKt_1 id_break;
    private final rKt_1 id_byte;

    private rKq_1(rqm_3 rqm_32, int n, DoubleList doubleList) {
        this.id_break = rKt_1.id_class(rqm_32, n, doubleList);
        this.id_byte = rKt_1.id_class(rqm_32, n, doubleList);
        int n2 = Integer.MAX_VALUE;
        int n3 = Integer.MIN_VALUE;
        DoubleListIterator doubleListIterator = doubleList.iterator();
        while (doubleListIterator.hasNext()) {
            int n4 = doubleListIterator.nextIndex();
            double d = doubleListIterator.nextDouble();
            if (d == 0.0) continue;
            n2 = Math.min(n2, n4);
            n3 = Math.max(n3, n4);
        }
        this.id_class = 0.16666666666666666 / rKq_1.id_class(n3 - n2);
    }

    public double id_class(double d, double d2, double d3) {
        double d4 = d * 1.0181268882175227;
        double d5 = d2 * 1.0181268882175227;
        double d6 = d3 * 1.0181268882175227;
        return (this.id_break.id_class(d, d2, d3) + this.id_byte.id_class(d4, d5, d6)) * this.id_class;
    }

    private static double id_class(int n) {
        return 0.1 * (1.0 + 1.0 / (double)(n + 1));
    }

    public static rKq_1 id_class(rqm_3 rqm_32, int n, DoubleList doubleList) {
        return new rKq_1(rqm_32, n, doubleList);
    }
}

