/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ve_1;
import celestial.Vu_1;
import java.util.Arrays;
import java.util.HashSet;

public class rrWj_1 {
    public static void id_class(Vu_1[] vu_1Array, Vu_1[] vu_1Array2) {
        HashSet<String> hashSet = new HashSet<String>();
        for (int i = 0; i < vu_1Array2.length; ++i) {
            Vu_1 vu_1 = vu_1Array2[i];
            hashSet.add(vu_1.id_final());
        }
        HashSet<Vu_1> hashSet2 = new HashSet<Vu_1>(Arrays.asList(vu_1Array));
        hashSet2.removeAll(Arrays.asList(vu_1Array2));
        for (Vu_1 vu_1 : hashSet2) {
            String string = vu_1.id_final();
            if (!hashSet.contains(string)) continue;
            vu_1.id_break(Ve_1.id_class, false);
        }
    }
}

