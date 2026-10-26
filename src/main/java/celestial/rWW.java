/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rXu_1;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rkf_3;
import celestial.rkg_3;
import celestial.rkj_3;
import celestial.rkw_3;
import celestial.rqO_2;
import celestial.xu_3;

public class rWW
implements rkw_3<rXu_1> {
    public final rkg_3 id_class;
    public final rkg_3 id_break;
    public final rdn_3 id_byte;
    private final rqO_2 id_protected;

    @Override
    public rdn_3 id_byte() {
        return this.id_byte;
    }

    public rWW(rqO_2 rqO_22, rkg_3 rkg_32, rkg_3 rkg_33, rdn_3 rdn_32) {
        this.id_protected = rqO_22;
        this.id_class = rkg_32;
        this.id_break = rkg_33;
        this.id_byte = rdn_32;
    }

    public boolean id_class(rdn_3 rdn_32) {
        return this.id_break.id_class(rdn_32);
    }

    @Override
    public boolean id_class(int n, int n2) {
        return n * n2 >= 2;
    }

    @Override
    public rdn_3 id_class(rXu_1 rXu_12) {
        rdn_3 rdn_32 = this.id_byte.id_implements();
        rcd_3 rcd_32 = rXu_12.id_extends(0).id_package();
        if (rcd_32 != null) {
            rdn_32.id_byte(rcd_32.id_catch());
        }
        return rdn_32;
    }

    @Override
    public boolean id_class(rXu_1 rXu_12, rYB rYB2) {
        return this.id_class.id_class(rXu_12.id_extends(0)) && this.id_break.id_class(rXu_12.id_extends(1));
    }

    @Override
    public rkj_3<?> id_catch() {
        return rkj_3.id_catch;
    }

    @Override
    public rqO_2 id_case() {
        return this.id_protected;
    }

    @Override
    public rdn_3 id_private() {
        return new rdn_3(xu_3.XE);
    }

    @Override
    public rkf_3<?> W_() {
        return rkf_3.id_else;
    }
}

