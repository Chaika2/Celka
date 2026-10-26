/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.It_1;
import celestial.rje_3;
import celestial.rpr_3;
import celestial.rrbb_3;

public class Iw_1 {
    public final It_1[] id_class;
    public final rje_3 id_break;

    public Iw_1(It_1[] it_1Array, float f, float f2, float f3, float f4, float f5, float f6, boolean bl, rpr_3 rpr_32) {
        this.id_class = it_1Array;
        float f7 = 0.0f / f5;
        float f8 = 0.0f / f6;
        if (rrbb_3.T()) {
            f7 = 0.05f / f5;
            f8 = 0.05f / f6;
            if (f3 < f) {
                f7 = -f7;
            }
            if (f4 < f2) {
                f8 = -f8;
            }
        }
        it_1Array[0] = it_1Array[0].id_class(f3 / f5 - f7, f2 / f6 + f8);
        it_1Array[1] = it_1Array[1].id_class(f / f5 + f7, f2 / f6 + f8);
        it_1Array[2] = it_1Array[2].id_class(f / f5 + f7, f4 / f6 - f8);
        it_1Array[3] = it_1Array[3].id_class(f3 / f5 - f7, f4 / f6 - f8);
        if (bl) {
            int n = it_1Array.length;
            for (int i = 0; i < n / 2; ++i) {
                It_1 it_1 = it_1Array[i];
                it_1Array[i] = it_1Array[n - 1 - i];
                it_1Array[n - 1 - i] = it_1;
            }
        }
        this.id_break = rpr_32.id_native();
        if (bl) {
            this.id_break.id_class(-1.0f, 1.0f, 1.0f);
        }
    }
}

