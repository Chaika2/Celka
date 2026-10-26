/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rNL;
import celestial.rQB;
import celestial.rQz_1;
import celestial.rWR;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rlb_3;
import celestial.rpL_2;
import celestial.rzK_2;
import celestial.rzM_2;
import celestial.rzY_2;
import celestial.rzm_3;
import celestial.rzr_3;
import java.util.function.Consumer;

public class rQP
extends rzY_2 {
    public final rlb_3<rdb_3> id_catch;
    public final boolean id_private;

    public rQP(rlb_3<rdb_3> rlb_32, boolean bl, int n, int n2, rQz_1[] rQz_1Array, rNL[] rNLArray) {
        super(n, n2, rQz_1Array, rNLArray);
        this.id_catch = rlb_32;
        this.id_private = bl;
    }

    @Override
    public boolean expand(rzr_3 rzr_32, Consumer<rWR> consumer) {
        return this.id_private ? this.id_class(rzr_32, consumer) : super.expand(rzr_32, consumer);
    }

    public static rzK_2<?> id_class(rlb_3<rdb_3> rlb_32) {
        return rQP.id_class((int n, int n2, rQz_1[] rQz_1Array, rNL[] rNLArray) -> new rQP(rlb_32, true, n, n2, rQz_1Array, rNLArray));
    }

    @Override
    public rzm_3 id_class() {
        return rzM_2.id_throws;
    }

    private boolean id_class(rzr_3 rzr_32, Consumer<rWR> consumer) {
        if (!this.id_class(rzr_32)) {
            return false;
        }
        for (rdb_3 rdb_32 : this.id_catch.id_class()) {
            consumer.accept(new rQB(this, rdb_32));
        }
        return true;
    }

    @Override
    public void id_class(Consumer<rdn_3> consumer, rzr_3 rzr_32) {
        this.id_catch.id_class().forEach(rdb_32 -> consumer.accept(new rdn_3((rpL_2)rdb_32)));
    }
}

