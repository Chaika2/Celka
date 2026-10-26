/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrWy_1;
import celestial.rrxq_3;
import celestial.rrzG_2;

public class rrxX_2
extends rrWy_1<rrxq_3[][]> {
    public rrxX_2() {
        super(60000 + rrzG_2.id_class(10000));
    }

    protected rrxq_3[][] id_class() {
        rrxq_3[][] rrxq_3Array = new rrxq_3[6][4];
        for (int i = 0; i < rrxq_3Array.length; ++i) {
            rrxq_3[] rrxq_3Array2 = rrxq_3Array[i];
            for (int j = 0; j < rrxq_3Array2.length; ++j) {
                rrxq_3Array2[j] = new rrxq_3();
            }
        }
        return rrxq_3Array;
    }

    @Override
    protected /* synthetic */ Object id_break() {
        return this.id_class();
    }
}

