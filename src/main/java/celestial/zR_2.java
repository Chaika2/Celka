/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.QY;
import celestial.an_3;
import celestial.cb_3;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rjU_2;
import celestial.rrAb_1;
import celestial.rrQX;
import celestial.xc_3;
import celestial.xd_3;

public class zR_2
extends xd_3 {
    public zR_2(Jq_1 jq_1) {
        super(jq_1);
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, an_3 an_32) {
        if (an_32 == (cb_3)QY.id_instanceof().id_class[57]) {
            rrAb_1 rrAb_12 = rrAb_1.id_class(this, new rjU_2(0.25, 0.05f, 0.25));
            if (!((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrAb_12).id_byte()) {
                an_32.id_class(xc_32, rrAb_12.id_break());
            }
        } else {
            an_32.id_class(xc_32, new rjU_2(0.25, 0.05f, 0.25));
        }
        an_32.id_class(this);
    }
}

