/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rJD;
import celestial.rJY;
import celestial.rXu_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rhd_3;
import celestial.rpq_3;
import celestial.rqL_2;
import celestial.rqn_3;

public class rJe_1
extends rJY {
    public final /* synthetic */ rpq_3 id_class;
    public final /* synthetic */ rJD id_break;

    public rJe_1(rJD rJD2, rXu_1 rXu_12, int n, int n2, int n3, rpq_3 rpq_32) {
        this.id_break = rJD2;
        this.id_class = rpq_32;
        super(rXu_12, n, n2, n3);
    }

    @Override
    public rdn_3 id_class(rhd_3 rhd_32, rdn_3 rdn_32) {
        rdn_32.id_class((rYB)rhd_32.id_throws[7], rhd_32, rdn_32.id_char());
        this.id_break.id_volatile.id_class(rhd_32);
        rdn_3 rdn_33 = this.id_break.id_class.id_class(1);
        if (!rdn_33.id_class()) {
            this.id_break.id_throws();
        }
        this.id_class.id_class((rYB rYB2, rfH_2 rfH_22) -> {
            long l = rYB2.r();
            if (this.id_break.id_extends != l) {
                rYB2.id_class((rhd_3)null, (rfH_2)rfH_22, rqn_3.dV, rqL_2.BLOCKS, 1.0f, 1.0f);
                this.id_break.id_extends = l;
            }
        });
        return super.id_class(rhd_32, rdn_32);
    }

    @Override
    public boolean id_class(rdn_3 rdn_32) {
        return false;
    }
}

