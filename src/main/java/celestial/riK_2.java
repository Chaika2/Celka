/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfH_2;
import celestial.riD_2;
import celestial.rio_3;
import celestial.rqO_2;
import celestial.rqR_2;
import celestial.rqd_3;
import celestial.rrPt_1;
import celestial.rrrn_1;
import java.util.List;
import java.util.Random;

public class riK_2 {
    public static final rfH_2 id_class = new rfH_2(4, 0, 15);
    private static final rqO_2[] id_break = new rqO_2[]{new rqO_2("shipwreck/with_mast"), new rqO_2("shipwreck/sideways_full"), new rqO_2("shipwreck/sideways_fronthalf"), new rqO_2("shipwreck/sideways_backhalf"), new rqO_2("shipwreck/rightsideup_full"), new rqO_2("shipwreck/rightsideup_fronthalf"), new rqO_2("shipwreck/rightsideup_backhalf"), new rqO_2("shipwreck/with_mast_degraded"), new rqO_2("shipwreck/rightsideup_full_degraded"), new rqO_2("shipwreck/rightsideup_fronthalf_degraded"), new rqO_2("shipwreck/rightsideup_backhalf_degraded")};
    private static final rqO_2[] id_byte = new rqO_2[]{new rqO_2("shipwreck/with_mast"), new rqO_2("shipwreck/upsidedown_full"), new rqO_2("shipwreck/upsidedown_fronthalf"), new rqO_2("shipwreck/upsidedown_backhalf"), new rqO_2("shipwreck/sideways_full"), new rqO_2("shipwreck/sideways_fronthalf"), new rqO_2("shipwreck/sideways_backhalf"), new rqO_2("shipwreck/rightsideup_full"), new rqO_2("shipwreck/rightsideup_fronthalf"), new rqO_2("shipwreck/rightsideup_backhalf"), new rqO_2("shipwreck/with_mast_degraded"), new rqO_2("shipwreck/upsidedown_full_degraded"), new rqO_2("shipwreck/upsidedown_fronthalf_degraded"), new rqO_2("shipwreck/upsidedown_backhalf_degraded"), new rqO_2("shipwreck/sideways_full_degraded"), new rqO_2("shipwreck/sideways_fronthalf_degraded"), new rqO_2("shipwreck/sideways_backhalf_degraded"), new rqO_2("shipwreck/rightsideup_full_degraded"), new rqO_2("shipwreck/rightsideup_fronthalf_degraded"), new rqO_2("shipwreck/rightsideup_backhalf_degraded")};

    public static void id_class(rrPt_1 rrPt_12, rfH_2 rfH_22, rqd_3 rqd_32, List<rrrn_1> list, Random random, rio_3 rio_32) {
        rqO_2 rqO_22 = rqR_2.id_class(rio_32.id_break ? id_break : id_byte, random);
        list.add(new riD_2(rrPt_12, rqO_22, rfH_22, rqd_32, rio_32.id_break));
    }
}

