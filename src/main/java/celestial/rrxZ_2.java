/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.MT;
import celestial.fJ_2;
import celestial.fj_3;
import celestial.rfU_2;
import celestial.rrbb_3;
import celestial.rrdA;
import celestial.rrdZ;
import celestial.rrxC_2;
import celestial.rrxm_3;
import java.nio.Buffer;
import java.nio.IntBuffer;

public class rrxZ_2 {
    private static IntBuffer id_class = rrbb_3.id_break(1024);
    private static IntBuffer id_break = rrbb_3.id_break(1024);
    private static boolean id_byte;

    public static void id_class(int n, rrxm_3 rrxm_32) {
        id_byte = rrbb_3.rs();
        rrxC_2[] rrxC_2Array = rrxm_32.id_class();
        for (int i = 0; i < rrxC_2Array.length; ++i) {
            rrxC_2 rrxC_22 = rrxC_2Array[i];
            rrxZ_2.id_class(n, rrxC_22);
        }
    }

    private static void id_class(int n, rrxC_2 rrxC_22) {
        int n2;
        fj_3 fj_32 = rrxC_22.id_class();
        int[] nArray = rrxC_22.id_break();
        int[] nArray2 = rrxC_22.id_byte();
        MT.id_super(fj_32.id_case);
        if (id_byte) {
            n2 = fj_32.id_extends != null ? fj_32.id_extends.id_case : 0;
            int n3 = fj_32.id_native != null ? fj_32.id_native.id_case : 0;
            fJ_2 fJ_22 = fj_32.id_extends();
            rrdA.id_class(n2, n3, fJ_22.id_package(), fJ_22.id_int(), fJ_22.id_volatile());
            if (rrdZ.PV.id_case()) {
                rrdZ.PV.id_class(fj_32.id_case(), fj_32.id_private(), fj_32.id_catch(), fj_32.id_implements());
            }
        }
        if (id_class.capacity() < nArray.length) {
            n2 = rfU_2.id_byte(nArray.length);
            id_class = rrbb_3.id_break(n2);
            id_break = rrbb_3.id_break(n2);
        }
        ((Buffer)id_class).clear();
        ((Buffer)id_break).clear();
        id_class.put(nArray);
        id_break.put(nArray2);
        ((Buffer)id_class).flip();
        ((Buffer)id_break).flip();
        MT.id_class(n, id_class, id_break);
    }
}

