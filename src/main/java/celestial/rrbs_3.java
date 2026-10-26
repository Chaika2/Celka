/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfU_2;
import celestial.rfj_3;
import java.util.Comparator;

public class rrbs_3
implements Comparator<rfj_3> {
    private int id_class;
    private int id_break;
    private double id_byte;
    private double id_protected;

    public rrbs_3(int n, int n2, double d, double d2) {
        this.id_class = n;
        this.id_break = n2;
        this.id_byte = d;
        this.id_protected = 1.0 - rfU_2.id_class(Math.abs(d2) / 1.5707963267948966, 0.0, 1.0);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.id_class((rfj_3)object, (rfj_3)object2);
    }

    public int id_class(rfj_3 rfj_32, rfj_3 rfj_33) {
        int n = this.id_class(rfj_32);
        int n2 = this.id_class(rfj_33);
        return n - n2;
    }

    private int id_class(rfj_3 rfj_32) {
        int n = rfj_32.id_break - this.id_class;
        int n2 = rfj_32.id_byte - this.id_break;
        int n3 = n * n + n2 * n2;
        double d = rfU_2.id_protected((double)n2, (double)n);
        double d2 = Math.abs(d - this.id_byte);
        if (d2 > Math.PI) {
            d2 = Math.PI * 2 - d2;
        }
        return (int)((double)n3 * 1000.0 * this.id_protected * d2 * d2);
    }
}

