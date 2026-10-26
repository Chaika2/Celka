/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrPA;
import java.util.List;

public class rrPn_1 {
    private final List<rrPA> id_class;

    public rrPn_1(List<rrPA> list) {
        this.id_class = list;
    }

    public String toString() {
        return "ProcessorList[" + this.id_class + "]";
    }

    public List<rrPA> id_class() {
        return this.id_class;
    }
}

