/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rNL;
import celestial.rQF;
import celestial.rQs_1;
import celestial.rQz_1;
import celestial.rdn_3;
import celestial.rzJ_2;
import celestial.rzh_3;
import celestial.rzr_3;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class rzO_2
implements rNL {
    protected final rQz_1[] id_class;
    private final Predicate<rzr_3> id_break;

    protected rzO_2(rQz_1[] rQz_1Array) {
        this.id_class = rQz_1Array;
        this.id_break = rQF.id_class(rQz_1Array);
    }

    @Override
    public /* synthetic */ Object apply(Object object, Object object2) {
        return this.id_class((rdn_3)object, (rzr_3)object2);
    }

    @Override
    public void id_class(rQs_1 rQs_12) {
        rNL.super.id_class(rQs_12);
        for (int i = 0; i < this.id_class.length; ++i) {
            this.id_class[i].id_class(rQs_12.id_break(".conditions[" + i + "]"));
        }
    }

    public final rdn_3 id_class(rdn_3 rdn_32, rzr_3 rzr_32) {
        return this.id_break.test(rzr_32) ? this.id_break(rdn_32, rzr_32) : rdn_32;
    }

    protected static rzh_3<?> id_class(Function<rQz_1[], rNL> function) {
        return new rzJ_2(function);
    }

    protected abstract rdn_3 id_break(rdn_3 var1, rzr_3 var2);
}

