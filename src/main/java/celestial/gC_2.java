/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.gA_2;
import celestial.gF_2;
import celestial.rjU_2;

public class gC_2
extends gF_2 {
    public gC_2() {
        super(128.0f, true, gA_2.NORMAL, false, false);
    }

    @Override
    public rjU_2 id_class(rjU_2 rjU_22, float f) {
        return rjU_22.id_throws(f * 0.94f + 0.06f, f * 0.94f + 0.06f, f * 0.91f + 0.09f);
    }

    @Override
    public boolean id_class(int n, int n2) {
        return false;
    }
}

