/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rq_3;
import celestial.xc_3;

public interface rw_3
extends rq_3 {
    public xc_3 id_class(int var1, int var2, int var3);

    default public xc_3[] id_class(int n, int n2) {
        xc_3[] xc_3Array = new xc_3[this.id_class()];
        for (int i = 0; i < this.id_class(); ++i) {
            xc_3Array[i] = this.id_class(n, i, n2);
        }
        return xc_3Array;
    }
}

