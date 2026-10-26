/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.fN_2;
import celestial.rAF;
import celestial.rAL;
import celestial.rqO_2;
import java.io.IOException;

public class jl_3 {
    @Deprecated
    public static int[] id_class(rAL rAL2, rqO_2 rqO_22) throws IOException {
        int[] nArray;
        try (rAF rAF2 = rAL2.id_class(rqO_22);
             fN_2 fN_22 = fN_2.id_class(rAF2.id_break());){
            nArray = fN_22.id_protected();
        }
        return nArray;
    }
}

