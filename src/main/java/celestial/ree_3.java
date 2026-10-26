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

public class ree_3
implements raP_2 {
    @Override
    public void id_class() {
    }

    @Override
    public boolean id_class(rrPt_1 rrPt_12, int n, rar_3 rar_32, rfH_2 rfH_22, List<rrrn_1> list, Random random) {
        rqd_3 rqd_32 = rar_32.id_break.id_protected();
        rar_3 rar_33 = reD_2.id_class(list, reD_2.id_class(rrPt_12, rar_32, new rfH_2(3 + random.nextInt(2), -3, 3 + random.nextInt(2)), "tower_base", rqd_32, true));
        rar_33 = reD_2.id_class(list, reD_2.id_class(rrPt_12, rar_33, new rfH_2(0, 7, 0), "tower_piece", rqd_32, true));
        rar_3 rar_34 = random.nextInt(3) == 0 ? rar_33 : null;
        int n2 = 1 + random.nextInt(3);
        for (int i = 0; i < n2; ++i) {
            rar_33 = reD_2.id_class(list, reD_2.id_class(rrPt_12, rar_33, new rfH_2(0, 4, 0), "tower_piece", rqd_32, true));
            if (i >= n2 - 1 || !random.nextBoolean()) continue;
            rar_34 = rar_33;
        }
        if (rar_34 != null) {
            for (rqj_3<rqd_3, rfH_2> rqj_32 : reD_2.id_protected) {
                if (!random.nextBoolean()) continue;
                rar_3 rar_35 = reD_2.id_class(list, reD_2.id_class(rrPt_12, rar_34, rqj_32.id_break(), "bridge_end", rqd_32.id_class(rqj_32.id_class()), true));
                reD_2.id_class(rrPt_12, reD_2.id_case, n + 1, rar_35, null, list, random);
            }
            reD_2.id_class(list, reD_2.id_class(rrPt_12, rar_33, new rfH_2(-1, 4, -1), "tower_top", rqd_32, true));
        } else {
            if (n != 7) {
                return reD_2.id_class(rrPt_12, reD_2.id_private, n + 1, rar_33, null, list, random);
            }
            reD_2.id_class(list, reD_2.id_class(rrPt_12, rar_33, new rfH_2(-1, 4, -1), "tower_top", rqd_32, true));
        }
        return true;
    }
}

