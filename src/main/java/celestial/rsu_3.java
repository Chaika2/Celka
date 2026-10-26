/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.rYB;
import celestial.rhd_3;
import celestial.rpm_3;
import celestial.rsJ_2;
import celestial.rsd_3;
import celestial.ryZ_2;

public class rsu_3
extends rsJ_2 {
    public rsu_3(aI_2<?> aI_22, rYB rYB2) {
        super(aI_22, rYB2);
    }

    public rsu_3(rYB rYB2, double d, double d2, double d3) {
        super(aI_2.id_switch, rYB2, d, d2, d3);
    }

    @Override
    public void id_class(int n, int n2, int n3, boolean bl) {
        if (bl) {
            if (this.BP()) {
                this.Bn();
            }
            if (this.id_private() == 0) {
                this.id_break(-this.id_implements());
                this.id_class(10);
                this.id_byte(50.0f);
                this.rf();
            }
        }
    }

    @Override
    public ryZ_2 id_class(rhd_3 rhd_32, rpm_3 rpm_32) {
        if (rhd_32.sN()) {
            return ryZ_2.PASS;
        }
        if (this.BP()) {
            return ryZ_2.PASS;
        }
        if (!((rYB)this.id_throws[7]).id_continue) {
            return rhd_32.id_this(this) ? ryZ_2.CONSUME : ryZ_2.PASS;
        }
        return ryZ_2.SUCCESS;
    }

    @Override
    public rsd_3 id_final() {
        return rsd_3.RIDEABLE;
    }
}

