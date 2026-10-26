/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrXq_1;
import celestial.rrXt_1;
import celestial.rrXw_1;

public class rrXl_1
implements rrXw_1 {
    private rrXq_1 id_class;
    private rrXt_1[] id_break;

    public rrXl_1(rrXq_1 rrXq_12, rrXt_1[] rrXt_1Array) {
        this.id_class = rrXq_12;
        this.id_break = rrXt_1Array;
    }

    public String toString() {
        return this.id_class + "()";
    }

    @Override
    public boolean id_break() {
        return this.id_class.id_protected(this.id_break);
    }
}

