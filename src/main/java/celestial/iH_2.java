/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfD_2;
import celestial.rfH_2;
import celestial.rfI_2;
import celestial.rjU_2;

public class iH_2 {
    private final rfD_2 id_class;
    private final float id_break;
    private final int id_byte;

    public int id_byte() {
        return this.id_byte;
    }

    public iH_2(rfH_2 rfH_22, float f, int n) {
        this(new rfI_2(rfH_22), f, n);
    }

    public iH_2(rfD_2 rfD_22, float f, int n) {
        this.id_class = rfD_22;
        this.id_break = f;
        this.id_byte = n;
    }

    public iH_2(rjU_2 rjU_22, float f, int n) {
        this(new rfI_2(new rfH_2(rjU_22)), f, n);
    }

    public rfD_2 id_class() {
        return this.id_class;
    }

    public float id_break() {
        return this.id_break;
    }
}

