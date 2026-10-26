/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rQP;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rzU_2;
import celestial.rzr_3;
import java.util.function.Consumer;

public class rQB
extends rzU_2 {
    public final /* synthetic */ rdb_3 id_class;

    public rQB(rQP rQP2, rdb_3 rdb_32) {
        this.id_class = rdb_32;
        super(rQP2);
    }

    @Override
    public void id_class(Consumer<rdn_3> consumer, rzr_3 rzr_32) {
        consumer.accept(new rdn_3(this.id_class));
    }
}

