/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rYB;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rhd_3;
import celestial.rjU_2;
import celestial.rpm_3;
import celestial.rpr_3;

public class rdH_2 {
    private final rhd_3 id_class;
    private final rpm_3 id_break;
    private final rff_3 id_byte;
    private final rYB id_protected;
    private final rdn_3 id_throws;

    public rYB id_int() {
        return this.id_protected;
    }

    public rdH_2(rhd_3 rhd_32, rpm_3 rpm_32, rff_3 rff_32) {
        this((rYB)rhd_32.id_throws[7], rhd_32, rpm_32, rhd_32.id_protected(rpm_32), rff_32);
    }

    protected rdH_2(rYB rYB2, rhd_3 rhd_32, rpm_3 rpm_32, rdn_3 rdn_32, rff_3 rff_32) {
        this.id_class = rhd_32;
        this.id_break = rpm_32;
        this.id_byte = rff_32;
        this.id_throws = rdn_32;
        this.id_protected = rYB2;
    }

    public rfH_2 id_class() {
        return this.id_byte.id_class();
    }

    public rpr_3 id_finally() {
        return this.id_byte.id_break();
    }

    public boolean id_catch() {
        return this.id_class != null && this.id_class.sN();
    }

    public rjU_2 id_extends() {
        return this.id_byte.id_case();
    }

    public rpr_3 id_case() {
        return this.id_class == null ? rpr_3.NORTH : this.id_class.Pg();
    }

    protected final rff_3 id_implements() {
        return this.id_byte;
    }

    public rpm_3 id_package() {
        return this.id_break;
    }

    public float id_private() {
        return this.id_class == null ? 0.0f : ((Float)this.id_class.id_throws[15]).floatValue();
    }

    public rhd_3 id_final() {
        return this.id_class;
    }

    public rdn_3 id_volatile() {
        return this.id_throws;
    }

    public boolean id_native() {
        return this.id_byte.id_throws();
    }
}

