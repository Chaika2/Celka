/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LV;
import celestial.Ml_1;
import celestial.QY;
import celestial.aI_2;
import celestial.rVL;
import celestial.rlB_2;
import celestial.vp_3;
import celestial.vw_3;

public class vt_3
extends LV<vw_3> {
    public final /* synthetic */ vp_3 id_class;

    public vt_3(vp_3 vp_32, QY qY) {
        this.id_class = vp_32;
        super(qY, vp_32.id_package, vp_32.id_int, 32, vp_32.id_int - 64, 36);
        for (aI_2 aI_22 : rVL.id_transient) {
            if (vp_32.id_finally.id_class(rlB_2.id_catch.id_break(aI_22)) <= 0 && vp_32.id_finally.id_class(rlB_2.id_private.id_break(aI_22)) <= 0) continue;
            this.id_break(new vw_3(this, aI_22));
        }
    }

    @Override
    protected void id_class(Ml_1 ml_1) {
        this.id_class.id_class(ml_1);
    }
}

