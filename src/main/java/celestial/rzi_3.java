/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rNL;
import celestial.rQs_1;
import celestial.rQz_1;
import celestial.rdn_3;
import celestial.rqO_2;
import celestial.rzK_2;
import celestial.rzL_2;
import celestial.rzM_2;
import celestial.rzY_2;
import celestial.rzm_3;
import celestial.rzr_3;
import java.util.function.Consumer;

public class rzi_3
extends rzY_2 {
    public final rqO_2 id_catch;

    public rzi_3(rqO_2 rqO_22, int n, int n2, rQz_1[] rQz_1Array, rNL[] rNLArray) {
        super(n, n2, rQz_1Array, rNLArray);
        this.id_catch = rqO_22;
    }

    @Override
    public void id_class(rQs_1 rQs_12) {
        if (rQs_12.id_class(this.id_catch)) {
            rQs_12.id_class("Table " + this.id_catch + " is recursively called");
        } else {
            super.id_class(rQs_12);
            rzL_2 rzL_22 = rQs_12.id_byte(this.id_catch);
            if (rzL_22 == null) {
                rQs_12.id_class("Unknown loot table called " + this.id_catch);
            } else {
                rzL_22.id_class(rQs_12.id_class("->{" + this.id_catch + "}", this.id_catch));
            }
        }
    }

    public static rzK_2<?> id_class(rqO_2 rqO_22) {
        return rzi_3.id_class((int n, int n2, rQz_1[] rQz_1Array, rNL[] rNLArray) -> new rzi_3(rqO_22, n, n2, rQz_1Array, rNLArray));
    }

    @Override
    public void id_class(Consumer<rdn_3> consumer, rzr_3 rzr_32) {
        rzL_2 rzL_22 = rzr_32.id_class(this.id_catch);
        rzL_22.id_class(rzr_32, consumer);
    }

    @Override
    public rzm_3 id_class() {
        return rzM_2.id_byte;
    }
}

