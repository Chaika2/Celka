/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.iB_2;
import celestial.iQ_2;
import celestial.rYB;
import celestial.rjU_2;
import celestial.rye_3;

public interface rEo_1 {
    public int n();

    public static boolean id_class(iB_2 iB_22, iB_2 iB_23) {
        float f = (float)iB_22.id_class(iQ_2.id_case);
        float f2 = !iB_22.n_() && (int)f > 0 ? f / 2.0f + (float)((rYB)iB_22.id_throws[7]).id_int.nextInt((int)f) : f;
        boolean bl = iB_23.id_break(rye_3.id_byte(iB_22), f2);
        if (bl) {
            iB_22.id_class(iB_22, (an_3)iB_23);
            if (!iB_22.n_()) {
                rEo_1.id_break(iB_22, iB_23);
            }
        }
        return bl;
    }

    public static void id_break(iB_2 iB_22, iB_2 iB_23) {
        double d;
        double d2 = iB_22.id_class(iQ_2.id_catch);
        double d3 = d2 - (d = iB_23.id_class(iQ_2.id_byte));
        if (!(d3 <= 0.0)) {
            double d4 = iB_23.rx() - iB_22.rx();
            double d5 = iB_23.BO() - iB_22.BO();
            float f = ((rYB)iB_22.id_throws[7]).id_int.nextInt(21) - 10;
            double d6 = d3 * (double)(((rYB)iB_22.id_throws[7]).id_int.nextFloat() * 0.5f + 0.2f);
            rjU_2 rjU_22 = new rjU_2(d4, 0.0, d5).id_protected().id_class(d6).id_break(f);
            double d7 = d3 * (double)((rYB)iB_22.id_throws[7]).id_int.nextFloat() * 0.5;
            iB_23.id_implements(rjU_22.id_break, d7, rjU_22.id_protected);
            Boolean bl = true;
            iB_23.id_throws[25] = bl;
        }
    }
}

