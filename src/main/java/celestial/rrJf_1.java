/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Aq_1;
import celestial.Ax_1;
import celestial.QY;
import celestial.an_3;
import celestial.cb_3;
import celestial.gm_3;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rfo_3;
import celestial.rhd_3;
import celestial.rpm_3;
import celestial.rpr_3;
import celestial.ryZ_2;

public class rrJf_1
extends Ax_1 {
    private boolean id_catch = false;
    private rfH_2 id_private = null;
    private an_3 id_implements = null;

    public rrJf_1(QY qY, Aq_1 aq_1) {
        super(qY, aq_1);
    }

    @Override
    public ryZ_2 id_class(cb_3 cb_32, gm_3 gm_32, rpm_3 rpm_32, rff_3 rff_32) {
        this.id_catch = true;
        this.id_private = rff_32.id_class();
        ryZ_2 ryZ_22 = super.id_class(cb_32, gm_32, rpm_32, rff_32);
        this.id_catch = false;
        return ryZ_22;
    }

    @Override
    public ryZ_2 id_class(rhd_3 rhd_32, an_3 an_32, rpm_3 rpm_32) {
        this.id_implements = an_32;
        return super.id_class(rhd_32, an_32, rpm_32);
    }

    @Override
    public ryZ_2 id_class(rhd_3 rhd_32, an_3 an_32, rfo_3 rfo_32, rpm_3 rpm_32) {
        this.id_implements = an_32;
        return super.id_class(rhd_32, an_32, rfo_32, rpm_32);
    }

    @Override
    public boolean id_class(rfH_2 rfH_22, rpr_3 rpr_32, boolean bl) {
        this.id_catch = true;
        this.id_private = rfH_22;
        boolean bl2 = super.id_class(rfH_22, rpr_32, bl);
        this.id_catch = false;
        return bl2;
    }

    @Override
    public ryZ_2 id_class(rpm_3 rpm_32) {
        this.id_catch = true;
        ryZ_2 ryZ_22 = super.id_class(rpm_32);
        this.id_catch = false;
        return ryZ_22;
    }

    @Override
    public boolean id_break(rfH_2 rfH_22, rpr_3 rpr_32, boolean bl) {
        this.id_catch = true;
        this.id_private = rfH_22;
        boolean bl2 = super.id_break(rfH_22, rpr_32, bl);
        this.id_catch = false;
        return bl2;
    }

    public rfH_2 id_continue() {
        return this.id_private;
    }

    public boolean id_new() {
        return this.id_catch;
    }

    public an_3 id_super() {
        return this.id_implements;
    }
}

