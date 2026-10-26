/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.gm_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rrdZ;
import celestial.rrds_1;
import celestial.yO_2;
import celestial.yQ_2;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class rrdC {
    public static Iterator<yQ_2> id_class(gm_3 gm_32, double d, an_3 an_32, int n, yO_2 yO_22) {
        float f = rrdZ.V();
        if (!(f <= 0.0f) && !(f >= (float)((n - 1) * 16))) {
            int n2 = rfU_2.id_case(f / 16.0f) + 1;
            float f2 = gm_32.id_throws((float)d);
            float f3 = rrdZ.sw * rfU_2.id_throws;
            float f4 = f2 > rfU_2.id_protected && f2 < 3.0f * rfU_2.id_protected ? f2 + rfU_2.id_break : f2;
            float f5 = -rfU_2.id_class(f4);
            float f6 = rfU_2.id_break(f4) * rfU_2.id_break(f3);
            float f7 = -rfU_2.id_break(f4) * rfU_2.id_class(f3);
            rfH_2 rfH_22 = new rfH_2(rfU_2.id_byte(an_32.rx()) >> 4, rfU_2.id_byte(an_32.re()) >> 4, rfU_2.id_byte(an_32.BO()) >> 4);
            rfH_2 rfH_23 = rfH_22.id_byte(-f5 * (float)n2, -f6 * (float)n2, -f7 * (float)n2);
            rfH_2 rfH_24 = rfH_22.id_byte(f5 * (float)n, f6 * (float)n, f7 * (float)n);
            return new rrds_1(yO_22, rfH_23, rfH_24, n2, n2);
        }
        List<yQ_2> list = Arrays.asList(yO_22.id_case);
        return list.iterator();
    }
}

