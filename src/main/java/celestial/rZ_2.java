/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfH_2;
import celestial.rz_3;

public interface rZ_2
extends rz_3 {
    public void id_class(int var1, rfH_2 var2);

    default public void id_class(int n) {
        this.id_class(n, null);
    }

    default public void id_private() {
        this.id_class(0, null);
    }
}

