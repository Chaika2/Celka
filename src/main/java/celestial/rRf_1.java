/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.rRg_1;
import celestial.rrEm_1;

public interface rRf_1
extends rRg_1 {
    public rrEm_1 id_byte();

    default public void id_class(an_3 an_32) {
        an_32.Bu().forEach(this::a_);
    }
}

