/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ih_1;
import celestial.fj_3;
import celestial.jZ_2;
import celestial.ju_3;
import celestial.wK_2;
import java.util.Arrays;

public class rrJl_1
extends wK_2 {
    public rrJl_1(wK_2 wK_22, fj_3 fj_32) {
        super(rrJl_1.id_class(wK_22.id_class(), wK_22.id_case(), fj_32), wK_22.id_byte(), Ih_1.id_class(wK_22.id_class()), fj_32, wK_22.id_throws());
    }

    private static int[] id_class(int[] nArray, fj_3 fj_32, fj_3 fj_33) {
        int[] nArray2 = Arrays.copyOf(nArray, nArray.length);
        for (int i = 0; i < 4; ++i) {
            jZ_2 jZ_22 = ju_3.id_private;
            int n = jZ_22.id_class() * i;
            int n2 = jZ_22.id_class(2) / 4;
            nArray2[n + n2] = Float.floatToRawIntBits(fj_33.id_class((double)fj_32.id_throws(Float.intBitsToFloat(nArray[n + n2]))));
            nArray2[n + n2 + 1] = Float.floatToRawIntBits(fj_33.id_break((double)fj_32.id_case(Float.intBitsToFloat(nArray[n + n2 + 1]))));
        }
        return nArray2;
    }
}

