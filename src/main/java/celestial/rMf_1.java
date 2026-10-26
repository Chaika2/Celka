/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.is_3;
import celestial.rBc_1;
import celestial.rMl_1;

public class rMf_1
extends rBc_1 {
    private final rMl_1 id_class;

    public rMf_1(rMl_1 rMl_12, Class<?> ... classArray) {
        super(rMl_12, classArray);
        this.id_class = rMl_12;
    }

    @Override
    protected void id_class(is_3 is_32, iB_2 iB_22) {
        if (is_32 instanceof rMl_1 && ((rMl_1)is_32).v()) {
            is_32.id_byte(iB_22);
        }
    }

    @Override
    public boolean id_break() {
        if (!this.id_class.id_try && !this.id_class.id_instanceof) {
            return super.id_break();
        }
        this.id_class.id_byte((iB_2)null);
        return false;
    }
}

