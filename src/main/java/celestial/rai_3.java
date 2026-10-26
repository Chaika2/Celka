/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfH_2;
import celestial.rir_3;
import celestial.rqO_2;
import celestial.rqR_2;
import celestial.rqd_3;
import celestial.rrPt_1;
import celestial.rrrn_1;
import java.util.List;
import java.util.Random;

public class rai_3 {
    private static final rqO_2[] id_class = new rqO_2[]{new rqO_2("nether_fossils/fossil_1"), new rqO_2("nether_fossils/fossil_2"), new rqO_2("nether_fossils/fossil_3"), new rqO_2("nether_fossils/fossil_4"), new rqO_2("nether_fossils/fossil_5"), new rqO_2("nether_fossils/fossil_6"), new rqO_2("nether_fossils/fossil_7"), new rqO_2("nether_fossils/fossil_8"), new rqO_2("nether_fossils/fossil_9"), new rqO_2("nether_fossils/fossil_10"), new rqO_2("nether_fossils/fossil_11"), new rqO_2("nether_fossils/fossil_12"), new rqO_2("nether_fossils/fossil_13"), new rqO_2("nether_fossils/fossil_14")};

    public static void id_class(rrPt_1 rrPt_12, List<rrrn_1> list, Random random, rfH_2 rfH_22) {
        rqd_3 rqd_32 = rqd_3.id_class(random);
        list.add(new rir_3(rrPt_12, rqR_2.id_class(id_class, random), rfH_22, rqd_32));
    }
}

