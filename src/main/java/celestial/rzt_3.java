/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rQs_1;
import celestial.rQz_1;
import celestial.rWR;
import celestial.rWV;
import celestial.rzE_2;
import celestial.rzI_2;
import celestial.rzb_3;
import celestial.rzr_3;
import celestial.rzw_3;
import java.util.function.Consumer;

public abstract class rzt_3
extends rzE_2 {
    protected final rzE_2[] id_protected;
    private final rWV id_throws;

    protected rzt_3(rzE_2[] rzE_2Array, rQz_1[] rQz_1Array) {
        super(rQz_1Array);
        this.id_protected = rzE_2Array;
        this.id_throws = this.id_class(rzE_2Array);
    }

    @Override
    public final boolean expand(rzr_3 rzr_32, Consumer<rWR> consumer) {
        return !this.id_class(rzr_32) ? false : this.id_throws.expand(rzr_32, consumer);
    }

    public static <T extends rzt_3> rzb_3<T> id_class(rzI_2<T> rzI_22) {
        return new rzw_3(rzI_22);
    }

    protected abstract rWV id_class(rWV[] var1);

    @Override
    public void id_class(rQs_1 rQs_12) {
        super.id_class(rQs_12);
        if (this.id_protected.length == 0) {
            rQs_12.id_class("Empty children list");
        }
        for (int i = 0; i < this.id_protected.length; ++i) {
            this.id_protected[i].id_class(rQs_12.id_break(".entry[" + i + "]"));
        }
    }
}

