/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rJY;
import celestial.rXR;
import celestial.rXu_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rhd_3;
import celestial.rpq_3;
import celestial.rqL_2;
import celestial.rqn_3;

public class rXU
extends rJY {
    public final /* synthetic */ rpq_3 id_class;
    public final /* synthetic */ rXR id_break;

    public rXU(rXR rXR2, rXu_1 rXu_12, int n, int n2, int n3, rpq_3 rpq_32) {
        this.id_break = rXR2;
        this.id_class = rpq_32;
        super(rXu_12, n, n2, n3);
    }

    @Override
    public rdn_3 id_class(rhd_3 rhd_32, rdn_3 rdn_32) {
        ((rJY)this.id_break.id_throws.get(0)).id_class(1);
        ((rJY)this.id_break.id_throws.get(1)).id_class(1);
        rdn_32.id_break().id_break(rdn_32, (rYB)rhd_32.id_throws[7], rhd_32);
        this.id_class.id_class((rYB rYB2, rfH_2 rfH_22) -> {
            long l = rYB2.r();
            if (this.id_break.id_byte != l) {
                rYB2.id_class((rhd_3)null, (rfH_2)rfH_22, rqn_3.dj, rqL_2.BLOCKS, 1.0f, 1.0f);
                this.id_break.id_byte = l;
            }
        });
        return super.id_class(rhd_32, rdn_32);
    }

    @Override
    public boolean id_class(rdn_3 rdn_32) {
        return false;
    }
}

