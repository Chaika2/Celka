/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rRO;
import celestial.rfU_2;

public class rRh_1 {
    private final rRO id_class;
    private final float id_break;

    public float id_byte() {
        if (this.id_break < 2.0f) {
            return 0.0f;
        }
        return this.id_break > 4.0f ? 1.0f : (this.id_break - 2.0f) / 2.0f;
    }

    public rRh_1(rRO rRO2, long l, long l2, float f) {
        this.id_class = rRO2;
        this.id_break = this.id_class(rRO2, l, l2, f);
    }

    private float id_class(rRO rRO2, long l, long l2, float f) {
        if (rRO2 == rRO.PEACEFUL) {
            return 0.0f;
        }
        boolean bl = rRO2 == rRO.HARD;
        float f2 = 0.75f;
        float f3 = rfU_2.id_class(((float)l + -72000.0f) / 1440000.0f, 0.0f, 1.0f) * 0.25f;
        f2 += f3;
        float f4 = 0.0f;
        f4 += rfU_2.id_class((float)l2 / 3600000.0f, 0.0f, 1.0f) * (bl ? 1.0f : 0.75f);
        f4 += rfU_2.id_class(f * 0.25f, 0.0f, f3);
        if (rRO2 == rRO.EASY) {
            f4 *= 0.5f;
        }
        return (float)rRO2.id_class() * (f2 += f4);
    }

    public boolean id_class(float f) {
        return this.id_break > f;
    }

    public rRO id_class() {
        return this.id_class;
    }

    public float id_break() {
        return this.id_break;
    }
}

