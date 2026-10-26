/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.rfH_2;
import celestial.xc_3;

public interface rRY {
    default public boolean id_class(rfH_2 rfH_22, boolean bl, an_3 an_32) {
        return this.id_class(rfH_22, bl, an_32, 512);
    }

    public boolean id_class(rfH_2 var1, boolean var2, an_3 var3, int var4);

    public boolean id_class(rfH_2 var1, boolean var2);

    default public boolean id_class(rfH_2 rfH_22, xc_3 xc_32, int n) {
        return this.id_class(rfH_22, xc_32, n, 512);
    }

    public boolean id_class(rfH_2 var1, xc_3 var2, int var3, int var4);

    default public boolean id_break(rfH_2 rfH_22, boolean bl) {
        return this.id_class(rfH_22, bl, null);
    }

    default public boolean a_(an_3 an_32) {
        return false;
    }
}

