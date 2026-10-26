/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Oa_1;
import celestial.gi_3;
import celestial.go_3;
import celestial.gt_3;
import celestial.rlb_3;
import celestial.rnW_2;
import celestial.rqO_2;

public class ge_3
implements go_3<rnW_2> {
    public final rqO_2 id_class;

    public ge_3(rqO_2 rqO_22) {
        this.id_class = rqO_22;
    }

    @Override
    public void id_class(rnW_2 rnW_22, gi_3<rnW_2> gi_32, long l) {
        Oa_1 oa_1 = rnW_22.w();
        rlb_3<gt_3> rlb_32 = oa_1.id_break(this.id_class);
        for (gt_3 gt_32 : rlb_32.id_class()) {
            oa_1.id_class(gt_32, oa_1.id_protected());
        }
    }
}

