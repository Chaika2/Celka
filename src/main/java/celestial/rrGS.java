/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfH_2;
import celestial.rrGs_1;

public interface rrGS
extends rrGs_1 {
    public void id_byte(int var1);

    default public void id_class(rfH_2 rfH_22, float f) {
        this.id_class(rfH_22.b_());
        this.id_break(rfH_22.c_());
        this.id_byte(rfH_22.d_());
        this.id_class(f);
    }

    public void id_class(float var1);

    public void id_class(int var1);

    public void id_break(int var1);
}

