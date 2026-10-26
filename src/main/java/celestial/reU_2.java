/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.raP_2;
import celestial.rar_3;
import celestial.reD_2;
import celestial.rfH_2;
import celestial.rqd_3;
import celestial.rrPt_1;
import celestial.rrrn_1;
import java.util.List;
import java.util.Random;

public class reU_2
implements raP_2 {
    @Override
    public void id_class() {
    }

    @Override
    public boolean id_class(rrPt_1 rrPt_12, int n, rar_3 rar_32, rfH_2 rfH_22, List<rrrn_1> list, Random random) {
        if (n > 8) {
            return false;
        }
        rqd_3 rqd_32 = rar_32.id_break.id_protected();
        rar_3 rar_33 = reD_2.id_class(list, reD_2.id_class(rrPt_12, rar_32, rfH_22, "base_floor", rqd_32, true));
        int n2 = random.nextInt(3);
        if (n2 == 0) {
            reD_2.id_class(list, reD_2.id_class(rrPt_12, rar_33, new rfH_2(-1, 4, -1), "base_roof", rqd_32, true));
        } else if (n2 == 1) {
            rar_33 = reD_2.id_class(list, reD_2.id_class(rrPt_12, rar_33, new rfH_2(-1, 0, -1), "second_floor_2", rqd_32, false));
            rar_33 = reD_2.id_class(list, reD_2.id_class(rrPt_12, rar_33, new rfH_2(-1, 8, -1), "second_roof", rqd_32, false));
            reD_2.id_class(rrPt_12, reD_2.id_throws, n + 1, rar_33, null, list, random);
        } else if (n2 == 2) {
            rar_33 = reD_2.id_class(list, reD_2.id_class(rrPt_12, rar_33, new rfH_2(-1, 0, -1), "second_floor_2", rqd_32, false));
            rar_33 = reD_2.id_class(list, reD_2.id_class(rrPt_12, rar_33, new rfH_2(-1, 4, -1), "third_floor_2", rqd_32, false));
            rar_33 = reD_2.id_class(list, reD_2.id_class(rrPt_12, rar_33, new rfH_2(-1, 8, -1), "third_roof", rqd_32, true));
            reD_2.id_class(rrPt_12, reD_2.id_throws, n + 1, rar_33, null, list, random);
        }
        return true;
    }
}

