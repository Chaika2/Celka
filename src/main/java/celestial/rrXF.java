/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrXC;
import celestial.rrXI;
import celestial.rrXj_1;

public class rrXF
implements rrXI,
rrXj_1 {
    private rrXj_1 id_class;
    private boolean id_break;
    private float[] id_byte;

    @Override
    public rrXC id_byte() {
        return rrXC.FLOAT;
    }

    public rrXF(rrXj_1 rrXj_12) {
        this.id_class = rrXj_12;
    }

    public String toString() {
        return "cached(" + this.id_class + ")";
    }

    @Override
    public float[] id_class() {
        if (!this.id_break) {
            this.id_byte = this.id_class.id_class();
            this.id_break = true;
        }
        return this.id_byte;
    }

    @Override
    public void id_break() {
        this.id_break = false;
    }
}

