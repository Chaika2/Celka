/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrXj_1;
import celestial.rrXq_1;
import celestial.rrXt_1;

public class rrXp_1
implements rrXj_1 {
    private rrXq_1 id_class;
    private rrXt_1[] id_break;

    public rrXp_1(rrXq_1 rrXq_12, rrXt_1[] rrXt_1Array) {
        this.id_class = rrXq_12;
        this.id_break = rrXt_1Array;
    }

    public String toString() {
        return this.id_class + "()";
    }

    @Override
    public float[] id_class() {
        return this.id_class.id_throws(this.id_break);
    }
}

