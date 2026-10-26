/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rJY;
import celestial.rXl_1;
import celestial.rYB;
import celestial.rdI_2;
import celestial.rdn_3;
import celestial.rhd_3;
import celestial.rlB_2;
import celestial.rsA_2;

public class rJq_1
extends rJY {
    private final rXl_1 id_class;
    private final rhd_3 id_break;
    private int id_catch;
    private final rsA_2 id_private;

    public rJq_1(rhd_3 rhd_32, rsA_2 rsA_22, rXl_1 rXl_12, int n, int n2, int n3) {
        super(rXl_12, n, n2, n3);
        this.id_break = rhd_32;
        this.id_private = rsA_22;
        this.id_class = rXl_12;
    }

    @Override
    public rdn_3 id_class(rhd_3 rhd_32, rdn_3 rdn_32) {
        this.b_(rdn_32);
        rdI_2 rdI_22 = this.id_class.id_protected();
        if (rdI_22 != null) {
            rdn_3 rdn_33;
            rdn_3 rdn_34 = this.id_class.id_extends(0);
            if (rdI_22.id_break(rdn_34, rdn_33 = this.id_class.id_extends(1)) || rdI_22.id_break(rdn_33, rdn_34)) {
                this.id_private.id_class(rdI_22);
                rhd_32.id_break(rlB_2.id_double);
                this.id_class.id_break(0, rdn_34);
                this.id_class.id_break(1, rdn_33);
            }
            this.id_private.id_class(this.id_private.id_protected() + rdI_22.id_package());
        }
        return rdn_32;
    }

    @Override
    protected void id_class(rdn_3 rdn_32, int n) {
        this.id_catch += n;
        this.b_(rdn_32);
    }

    @Override
    public rdn_3 id_class(int n) {
        if (this.id_break()) {
            this.id_catch += Math.min(n, this.id_class().id_char());
        }
        return super.id_class(n);
    }

    @Override
    public boolean id_class(rdn_3 rdn_32) {
        return false;
    }

    @Override
    protected void b_(rdn_3 rdn_32) {
        rdn_32.id_class((rYB)this.id_break.id_throws[7], this.id_break, this.id_catch);
        this.id_catch = 0;
    }
}

