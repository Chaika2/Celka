/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rNL;
import celestial.rQz_1;
import celestial.rdn_3;
import celestial.rzK_2;
import celestial.rzM_2;
import celestial.rzY_2;
import celestial.rzm_3;
import celestial.rzr_3;
import java.util.function.Consumer;

public class rWt_1
extends rzY_2 {
    public rWt_1(int n, int n2, rQz_1[] rQz_1Array, rNL[] rNLArray) {
        super(n, n2, rQz_1Array, rNLArray);
    }

    @Override
    public void id_class(Consumer<rdn_3> consumer, rzr_3 rzr_32) {
    }

    @Override
    public rzm_3 id_class() {
        return rzM_2.id_class;
    }

    public static rzK_2<?> id_break() {
        return rWt_1.id_class(rWt_1::new);
    }
}

