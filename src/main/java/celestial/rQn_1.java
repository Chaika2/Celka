/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rQF;
import celestial.rQQ;
import celestial.rQz_1;
import celestial.rWi_1;
import celestial.rzr_3;

public class rQn_1
implements rQz_1 {
    public final float id_class;

    public rQn_1(float f) {
        this.id_class = f;
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.id_class((rzr_3)object);
    }

    public static rQQ id_class(float f) {
        return () -> new rQn_1(f);
    }

    public boolean id_class(rzr_3 rzr_32) {
        return rzr_32.id_class().nextFloat() < this.id_class;
    }

    @Override
    public rWi_1 id_break() {
        return rQF.id_byte;
    }
}

