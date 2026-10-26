/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Oa_1;
import celestial.Oi_1;
import celestial.gj_3;
import celestial.gt_3;
import celestial.gw_3;
import celestial.gy_3;
import java.util.ArrayDeque;

public class gf_3
implements gj_3 {
    private final gw_3 id_class;

    public gf_3(gt_3 gt_32) {
        this.id_class = new gw_3(gt_32);
    }

    public String toString() {
        return "function " + this.id_class.id_class();
    }

    @Override
    public void id_class(Oa_1 oa_1, gy_3 gy_32, ArrayDeque<Oi_1> arrayDeque, int n) {
        this.id_class.id_class(oa_1).ifPresent(gt_32 -> {
            gj_3[] gj_3Array = gt_32.id_break();
            int n2 = n - arrayDeque.size();
            int n3 = Math.min(gj_3Array.length, n2);
            for (int i = n3 - 1; i >= 0; --i) {
                arrayDeque.addFirst(new Oi_1(oa_1, gy_32, gj_3Array[i]));
            }
        });
    }
}

