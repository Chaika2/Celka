/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.gy_3;
import celestial.rfH_2;
import celestial.rjK_2;
import celestial.rjU_2;

public interface Rf_1 {
    default public rfH_2 id_byte(gy_3 gy_32) {
        return new rfH_2(this.id_class(gy_32));
    }

    public boolean id_byte();

    public rjU_2 id_class(gy_3 var1);

    public boolean id_class();

    public boolean id_break();

    public rjK_2 id_break(gy_3 var1);
}

