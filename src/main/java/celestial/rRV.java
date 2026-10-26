/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rYr_1;
import celestial.rfH_2;

public interface rRV<T> {
    public void id_class(rfH_2 var1, T var2, int var3, rYr_1 var4);

    default public void id_class(rfH_2 rfH_22, T t, int n) {
        this.id_class(rfH_22, t, n, rYr_1.NORMAL);
    }

    public boolean id_class(rfH_2 var1, T var2);

    public boolean id_break(rfH_2 var1, T var2);
}

