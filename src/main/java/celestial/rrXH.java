/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrXf_1;
import celestial.rrXq_1;
import celestial.rrXt_1;
import celestial.rrXv_1;
import celestial.rrkT;

public class rrXH
implements rrXf_1 {
    private rrXq_1 id_class;
    private rrXt_1[] id_break;
    private int id_byte = -1;

    public rrXH(rrXq_1 rrXq_12, rrXt_1[] rrXt_1Array) {
        this.id_class = rrXq_12;
        this.id_break = rrXt_1Array;
    }

    public String toString() {
        return this.id_class + "()";
    }

    @Override
    public float id_class() {
        rrXt_1[] rrXt_1Array = this.id_break;
        switch (this.id_class) {
            case SMOOTH: {
                float f;
                rrXt_1 rrXt_12 = rrXt_1Array[0];
                if (rrXt_12 instanceof rrXv_1) break;
                float f2 = rrXH.id_class(rrXt_1Array, 0);
                float f3 = rrXt_1Array.length > 1 ? rrXH.id_class(rrXt_1Array, 1) : 1.0f;
                float f4 = f = rrXt_1Array.length > 2 ? rrXH.id_class(rrXt_1Array, 2) : f3;
                if (this.id_byte < 0) {
                    this.id_byte = rrkT.id_class();
                }
                return rrkT.id_class(this.id_byte, f2, f3, f);
            }
        }
        return this.id_class.id_byte(this.id_break);
    }

    private static float id_class(rrXt_1[] rrXt_1Array, int n) {
        rrXf_1 rrXf_12 = (rrXf_1)rrXt_1Array[n];
        return rrXf_12.id_class();
    }
}

