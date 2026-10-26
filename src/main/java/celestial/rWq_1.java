/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rNL;
import celestial.rQz_1;
import celestial.rdn_3;
import celestial.rqO_2;
import celestial.rzK_2;
import celestial.rzM_2;
import celestial.rzY_2;
import celestial.rzm_3;
import celestial.rzr_3;
import java.util.function.Consumer;

public class rWq_1
extends rzY_2 {
    public final rqO_2 id_catch;

    public rWq_1(rqO_2 rqO_22, int n, int n2, rQz_1[] rQz_1Array, rNL[] rNLArray) {
        super(n, n2, rQz_1Array, rNLArray);
        this.id_catch = rqO_22;
    }

    public static rzK_2<?> id_class(rqO_2 rqO_22) {
        return rWq_1.id_class((int n, int n2, rQz_1[] rQz_1Array, rNL[] rNLArray) -> new rWq_1(rqO_22, n, n2, rQz_1Array, rNLArray));
    }

    @Override
    public void id_class(Consumer<rdn_3> consumer, rzr_3 rzr_32) {
        rzr_32.id_class(this.id_catch, consumer);
    }

    @Override
    public rzm_3 id_class() {
        return rzM_2.id_protected;
    }
}

