/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rCr_1;
import celestial.rFf_1;
import celestial.rFw_1;
import celestial.roE_2;
import celestial.roS_2;

public class rCP
implements roS_2 {
    public final /* synthetic */ rCr_1 id_class;

    @Override
    public void id_byte(roE_2 roE_22, double d) {
    }

    public rCP(rCr_1 rCr_12) {
        this.id_class = rCr_12;
    }

    @Override
    public void id_class(roE_2 roE_22, int n) {
        this.id_class.id_class(new rFw_1(roE_22, rFf_1.SET_WARNING_TIME));
    }

    @Override
    public void id_class(roE_2 roE_22, double d) {
        this.id_class.id_class(new rFw_1(roE_22, rFf_1.SET_SIZE));
    }

    @Override
    public void id_class(roE_2 roE_22, double d, double d2) {
        this.id_class.id_class(new rFw_1(roE_22, rFf_1.SET_CENTER));
    }

    @Override
    public void id_class(roE_2 roE_22, double d, double d2, long l) {
        this.id_class.id_class(new rFw_1(roE_22, rFf_1.LERP_SIZE));
    }

    @Override
    public void id_break(roE_2 roE_22, int n) {
        this.id_class.id_class(new rFw_1(roE_22, rFf_1.SET_WARNING_BLOCKS));
    }

    @Override
    public void id_break(roE_2 roE_22, double d) {
    }
}

