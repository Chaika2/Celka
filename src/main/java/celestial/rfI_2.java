/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.rfD_2;
import celestial.rfH_2;
import celestial.rjU_2;

public class rfI_2
implements rfD_2 {
    private final rfH_2 id_class;
    private final rjU_2 id_break;

    public rfI_2(rfH_2 rfH_22) {
        this.id_class = rfH_22;
        this.id_break = rjU_2.id_class(rfH_22);
    }

    public String toString() {
        return "BlockPosTracker{blockPos=" + this.id_class + ", centerPosition=" + this.id_break + "}";
    }

    @Override
    public rjU_2 id_class() {
        return this.id_break;
    }

    @Override
    public boolean id_class(iB_2 iB_22) {
        return true;
    }

    @Override
    public rfH_2 id_break() {
        return this.id_class;
    }
}

