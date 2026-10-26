/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfH_2;
import celestial.rqd_3;
import celestial.rrPt_1;
import celestial.rrrK;
import celestial.rrrR;
import celestial.rrrY;
import java.util.List;
import java.util.Random;

public class rrrV {
    public static void id_class(rrPt_1 rrPt_12, rfH_2 rfH_22, rqd_3 rqd_32, List<rrrY> list, Random random) {
        rrrR rrrR2 = new rrrR(random);
        rrrK rrrK2 = new rrrK(rrPt_12, random);
        rrrK2.id_class(rfH_22, rqd_32, list, rrrR2);
    }
}

