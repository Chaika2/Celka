/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rQF;
import celestial.rQs_1;
import celestial.rQz_1;
import celestial.rWi_1;
import celestial.rzr_3;
import java.util.function.Predicate;

public class rzv_3
implements rQz_1 {
    private final rQz_1[] id_class;
    private final Predicate<rzr_3> id_break;

    public rzv_3(rQz_1[] rQz_1Array) {
        this.id_class = rQz_1Array;
        this.id_break = rQF.id_class(rQz_1Array);
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.id_class((rzr_3)object);
    }

    public final boolean id_class(rzr_3 rzr_32) {
        return this.id_break.test(rzr_32);
    }

    @Override
    public void id_class(rQs_1 rQs_12) {
        rQz_1.super.id_class(rQs_12);
        for (int i = 0; i < this.id_class.length; ++i) {
            this.id_class[i].id_class(rQs_12.id_break(".term[" + i + "]"));
        }
    }

    @Override
    public rWi_1 id_break() {
        throw new UnsupportedOperationException();
    }
}

