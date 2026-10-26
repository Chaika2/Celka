/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rNL;
import celestial.rQz_1;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rpL_2;
import celestial.rzK_2;
import celestial.rzM_2;
import celestial.rzY_2;
import celestial.rzm_3;
import celestial.rzr_3;
import java.util.function.Consumer;

public class rWe_1
extends rzY_2 {
    public final rdb_3 id_catch;

    public rWe_1(rdb_3 rdb_32, int n, int n2, rQz_1[] rQz_1Array, rNL[] rNLArray) {
        super(n, n2, rQz_1Array, rNLArray);
        this.id_catch = rdb_32;
    }

    public static rzK_2<?> id_class(rpL_2 rpL_22) {
        return rWe_1.id_class((int n, int n2, rQz_1[] rQz_1Array, rNL[] rNLArray) -> new rWe_1(rpL_22.id_case(), n, n2, rQz_1Array, rNLArray));
    }

    @Override
    public void id_class(Consumer<rdn_3> consumer, rzr_3 rzr_32) {
        consumer.accept(new rdn_3(this.id_catch));
    }

    @Override
    public rzm_3 id_class() {
        return rzM_2.id_break;
    }
}

