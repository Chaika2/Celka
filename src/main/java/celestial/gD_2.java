/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Oa_1;
import celestial.gi_3;
import celestial.go_3;
import celestial.gt_3;
import celestial.rnW_2;
import celestial.rqO_2;

public class gD_2
implements go_3<rnW_2> {
    public final rqO_2 id_class;

    public gD_2(rqO_2 rqO_22) {
        this.id_class = rqO_22;
    }

    @Override
    public void id_class(rnW_2 rnW_22, gi_3<rnW_2> gi_32, long l) {
        Oa_1 oa_1 = rnW_22.w();
        oa_1.id_class(this.id_class).ifPresent(gt_32 -> oa_1.id_class((gt_3)gt_32, oa_1.id_protected()));
    }
}

