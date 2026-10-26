/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rQF;
import celestial.rQs_1;
import celestial.rQz_1;
import celestial.rWV;
import celestial.rzm_3;
import celestial.rzr_3;
import java.util.function.Predicate;

public abstract class rzE_2
implements rWV {
    protected final rQz_1[] id_byte;
    private final Predicate<rzr_3> id_protected;

    protected rzE_2(rQz_1[] rQz_1Array) {
        this.id_byte = rQz_1Array;
        this.id_protected = rQF.id_class(rQz_1Array);
    }

    public abstract rzm_3 id_class();

    protected final boolean id_class(rzr_3 rzr_32) {
        return this.id_protected.test(rzr_32);
    }

    public void id_class(rQs_1 rQs_12) {
        for (int i = 0; i < this.id_byte.length; ++i) {
            this.id_byte[i].id_class(rQs_12.id_break(".condition[" + i + "]"));
        }
    }
}

