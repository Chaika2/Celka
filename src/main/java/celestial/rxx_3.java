/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rYB;
import celestial.rdH_2;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rhd_3;
import celestial.rjU_2;
import celestial.rpm_3;
import celestial.rpr_3;

public class rxx_3
extends rdH_2 {
    private final rfH_2 id_break;
    protected boolean id_class = true;

    public boolean id_byte() {
        return this.id_class;
    }

    protected rxx_3(rYB rYB2, rhd_3 rhd_32, rpm_3 rpm_32, rdn_3 rdn_32, rff_3 rff_32) {
        super(rYB2, rhd_32, rpm_32, rdn_32, rff_32);
        this.id_break = rff_32.id_class().id_break(rff_32.id_break());
        this.id_class = rYB2.id_byte(rff_32.id_class()).id_class(this);
    }

    public rxx_3(rdH_2 rdH_22) {
        this(rdH_22.id_int(), rdH_22.id_final(), rdH_22.id_package(), rdH_22.id_volatile(), rdH_22.id_implements());
    }

    public rxx_3(rhd_3 rhd_32, rpm_3 rpm_32, rdn_3 rdn_32, rff_3 rff_32) {
        this((rYB)rhd_32.id_throws[7], rhd_32, rpm_32, rdn_32, rff_32);
    }

    @Override
    public rfH_2 id_class() {
        return this.id_class ? super.id_class() : this.id_break;
    }

    public static rxx_3 id_class(rxx_3 rxx_32, rfH_2 rfH_22, rpr_3 rpr_32) {
        return new rxx_3(rxx_32.id_int(), rxx_32.id_final(), rxx_32.id_package(), rxx_32.id_volatile(), new rff_3(new rjU_2((double)rfH_22.b_() + 0.5 + (double)rpr_32.id_implements() * 0.5, (double)rfH_22.c_() + 0.5 + (double)rpr_32.id_finally() * 0.5, (double)rfH_22.d_() + 0.5 + (double)rpr_32.id_extends() * 0.5), rpr_32, rfH_22, false));
    }

    public boolean id_break() {
        return this.id_class || this.id_int().id_byte(this.id_class()).id_class(this);
    }

    public rpr_3[] id_throws() {
        int n;
        rpr_3[] rpr_3Array = rpr_3.id_class(this.id_final());
        if (this.id_class) {
            return rpr_3Array;
        }
        rpr_3 rpr_32 = this.id_finally();
        for (n = 0; n < rpr_3Array.length && rpr_3Array[n] != rpr_32.id_case(); ++n) {
        }
        if (n > 0) {
            System.arraycopy(rpr_3Array, 0, rpr_3Array, 1, n);
            rpr_3Array[0] = rpr_32.id_case();
        }
        return rpr_3Array;
    }

    public rpr_3 id_protected() {
        return rpr_3.id_class(this.id_final())[0];
    }
}

