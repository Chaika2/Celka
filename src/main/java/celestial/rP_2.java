/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfH_2;

public interface rP_2 {
    default public double id_class(rfH_2 rfH_22) {
        return this.id_class(rfH_22.b_(), rfH_22.c_(), rfH_22.d_());
    }

    public double id_class(int var1, int var2, int var3);

    default public double id_class() {
        return 0.0;
    }

    default public boolean id_break(rfH_2 rfH_22) {
        return this.id_break(rfH_22.b_(), rfH_22.c_(), rfH_22.d_());
    }

    public boolean id_break(int var1, int var2, int var3);
}

