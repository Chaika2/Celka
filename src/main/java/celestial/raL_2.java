/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package celestial;

import celestial.raA_2;
import celestial.rfH_2;
import celestial.rqO_2;
import celestial.rqd_3;
import celestial.rrPt_1;
import celestial.rrrn_1;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class raL_2 {
    public static final rqO_2 id_class = new rqO_2("igloo/top");
    private static final rqO_2 id_break = new rqO_2("igloo/middle");
    private static final rqO_2 id_byte = new rqO_2("igloo/bottom");
    public static final Map<rqO_2, rfH_2> id_protected = ImmutableMap.of((Object)id_class, (Object)new rfH_2(3, 5, 5), (Object)id_break, (Object)new rfH_2(1, 3, 1), (Object)id_byte, (Object)new rfH_2(3, 6, 7));
    public static final Map<rqO_2, rfH_2> id_throws = ImmutableMap.of((Object)id_class, (Object)rfH_2.id_protected, (Object)id_break, (Object)new rfH_2(2, -3, 4), (Object)id_byte, (Object)new rfH_2(0, -3, -2));

    public static void id_class(rrPt_1 rrPt_12, rfH_2 rfH_22, rqd_3 rqd_32, List<rrrn_1> list, Random random) {
        if (random.nextDouble() < 0.5) {
            int n = random.nextInt(8) + 4;
            list.add(new raA_2(rrPt_12, id_byte, rfH_22, rqd_32, n * 3));
            for (int i = 0; i < n - 1; ++i) {
                list.add(new raA_2(rrPt_12, id_break, rfH_22, rqd_32, i * 3));
            }
        }
        list.add(new raA_2(rrPt_12, id_class, rfH_22, rqd_32, 0));
    }
}

