/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.raP_2;
import celestial.rar_3;
import celestial.reD_2;
import celestial.rfH_2;
import celestial.rqd_3;
import celestial.rqj_3;
import celestial.rrPt_1;
import celestial.rrrn_1;
import java.util.List;
import java.util.Random;

public class rei_3
implements raP_2 {
    @Override
    public void id_class() {
    }

    @Override
    public boolean id_class(rrPt_1 rrPt_12, int n, rar_3 rar_32, rfH_2 rfH_22, List<rrrn_1> list, Random random) {
        rqd_3 rqd_32 = rar_32.id_break.id_protected();
        rar_3 rar_33 = reD_2.id_class(list, reD_2.id_class(rrPt_12, rar_32, new rfH_2(-3, 4, -3), "fat_tower_base", rqd_32, true));
        rar_33 = reD_2.id_class(list, reD_2.id_class(rrPt_12, rar_33, new rfH_2(0, 4, 0), "fat_tower_middle", rqd_32, true));
        for (int i = 0; i < 2 && random.nextInt(3) != 0; ++i) {
            rar_33 = reD_2.id_class(list, reD_2.id_class(rrPt_12, rar_33, new rfH_2(0, 8, 0), "fat_tower_middle", rqd_32, true));
            for (rqj_3<rqd_3, rfH_2> rqj_32 : reD_2.id_catch) {
                if (!random.nextBoolean()) continue;
                rar_3 rar_34 = reD_2.id_class(list, reD_2.id_class(rrPt_12, rar_33, rqj_32.id_break(), "bridge_end", rqd_32.id_class(rqj_32.id_class()), true));
                reD_2.id_class(rrPt_12, reD_2.id_case, n + 1, rar_34, null, list, random);
            }
        }
        reD_2.id_class(list, reD_2.id_class(rrPt_12, rar_33, new rfH_2(-2, 8, -2), "fat_tower_top", rqd_32, true));
        return true;
    }
}

