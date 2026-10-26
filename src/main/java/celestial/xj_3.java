/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.floats.Float2FloatFunction
 */
package celestial;

import celestial.rHu_1;
import celestial.rHw_1;
import celestial.ryX_2;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;

public class xj_3
implements ryX_2<rHu_1, Float2FloatFunction> {
    public final /* synthetic */ rHw_1 id_class;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public xj_3(rHw_1 rHw_12) {
        this.id_class = rHw_12;
    }

    @Override
    public Float2FloatFunction id_class(rHu_1 rHu_12, rHu_1 rHu_13) {
        return f -> Math.max(rHu_12.id_class(f), rHu_13.id_class(f));
    }

    @Override
    public Float2FloatFunction id_class(rHu_1 rHu_12) {
        return rHu_12::id_class;
    }

    public Float2FloatFunction id_class() {
        return this.id_class::id_class;
    }

    @Override
    public /* synthetic */ Object id_break() {
        return this.id_class();
    }
}

