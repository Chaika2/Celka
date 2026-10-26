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

public class rea_3
implements raP_2 {
    public boolean id_class;

    @Override
    public void id_class() {
        this.id_class = false;
    }

    @Override
    public boolean id_class(rrPt_1 rrPt_12, int n, rar_3 rar_32, rfH_2 rfH_22, List<rrrn_1> list, Random random) {
        rqd_3 rqd_32 = rar_32.id_break.id_protected();
        int n2 = random.nextInt(4) + 1;
        rar_3 rar_33 = reD_2.id_class(list, reD_2.id_class(rrPt_12, rar_32, new rfH_2(0, 0, -4), "bridge_piece", rqd_32, true));
        rar_33.id_package = -1;
        int n3 = 0;
        for (int i = 0; i < n2; ++i) {
            if (random.nextBoolean()) {
                rar_33 = reD_2.id_class(list, reD_2.id_class(rrPt_12, rar_33, new rfH_2(0, n3, -4), "bridge_piece", rqd_32, true));
                n3 = 0;
                continue;
            }
            rar_33 = random.nextBoolean() ? reD_2.id_class(list, reD_2.id_class(rrPt_12, rar_33, new rfH_2(0, n3, -4), "bridge_steep_stairs", rqd_32, true)) : reD_2.id_class(list, reD_2.id_class(rrPt_12, rar_33, new rfH_2(0, n3, -8), "bridge_gentle_stairs", rqd_32, true));
            n3 = 4;
        }
        if (!this.id_class && random.nextInt(10 - n) == 0) {
            reD_2.id_class(list, reD_2.id_class(rrPt_12, rar_33, new rfH_2(-8 + random.nextInt(8), n3, -70 + random.nextInt(10)), "ship", rqd_32, true));
            this.id_class = true;
        } else if (!reD_2.id_class(rrPt_12, reD_2.id_byte, n + 1, rar_33, new rfH_2(-3, n3 + 1, -11), list, random)) {
            return false;
        }
        rar_33 = reD_2.id_class(list, reD_2.id_class(rrPt_12, rar_33, new rfH_2(4, n3, 0), "bridge_end", rqd_32.id_class(rqd_3.CLOCKWISE_180), true));
        rar_33.id_package = -1;
        return true;
    }
}

