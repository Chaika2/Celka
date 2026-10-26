/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rRu_1;
import celestial.rYB;
import celestial.rhN_2;
import celestial.rhd_3;
import celestial.rkw_3;
import java.util.Collections;

public interface rXv_1 {
    public rkw_3<?> id_byte();

    default public boolean id_class(rYB rYB2, rhN_2 rhN_22, rkw_3<?> rkw_32) {
        if (!rkw_32.id_implements() && rYB2.B().id_break(rRu_1.id_else) && !rhN_22.id_float().id_break(rkw_32)) {
            return false;
        }
        this.id_class(rkw_32);
        return true;
    }

    default public void id_class(rhd_3 rhd_32) {
        rkw_3<?> rkw_32 = this.id_byte();
        if (rkw_32 != null && !rkw_32.id_implements()) {
            rhd_32.id_break(Collections.singleton(rkw_32));
            this.id_class((rkw_3)null);
        }
    }

    public void id_class(rkw_3<?> var1);
}

