/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rJY;
import celestial.rXk_1;
import celestial.rXu_1;
import celestial.rXv_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rhd_3;
import celestial.rhz_3;
import celestial.rkj_3;
import celestial.rqs_3;

public class rJS
extends rJY {
    private final rXk_1 id_class;
    private final rhd_3 id_break;
    private int id_catch;

    public rJS(rhd_3 rhd_32, rXk_1 rXk_12, rXu_1 rXu_12, int n, int n2, int n3) {
        super(rXu_12, n, n2, n3);
        this.id_break = rhd_32;
        this.id_class = rXk_12;
    }

    @Override
    public rdn_3 id_class(rhd_3 rhd_32, rdn_3 rdn_32) {
        this.b_(rdn_32);
        rqs_3<rdn_3> rqs_32 = ((rYB)rhd_32.id_throws[7]).id_implements().id_byte(rkj_3.id_class, this.id_class, (rYB)rhd_32.id_throws[7]);
        for (int i = 0; i < rqs_32.size(); ++i) {
            rdn_3 rdn_33 = this.id_class.id_extends(i);
            rdn_3 rdn_34 = rqs_32.get(i);
            if (!rdn_33.id_class()) {
                this.id_class.id_class(i, 1);
                rdn_33 = this.id_class.id_extends(i);
            }
            if (rdn_34.id_class()) continue;
            if (rdn_33.id_class()) {
                this.id_class.id_break(i, rdn_34);
                continue;
            }
            if (rdn_3.id_byte(rdn_33, rdn_34) && rdn_3.id_class(rdn_33, rdn_34)) {
                rdn_34.id_case(rdn_33.id_char());
                this.id_class.id_break(i, rdn_34);
                continue;
            }
            if (((rhz_3)this.id_break.id_implements[1]).id_throws(rdn_34)) continue;
            this.id_break.id_class(rdn_34, false);
        }
        return rdn_32;
    }

    @Override
    protected void id_class(rdn_3 rdn_32, int n) {
        this.id_catch += n;
        this.b_(rdn_32);
    }

    @Override
    public boolean id_class(rdn_3 rdn_32) {
        return false;
    }

    @Override
    public rdn_3 id_class(int n) {
        if (this.id_break()) {
            this.id_catch += Math.min(n, this.id_class().id_char());
        }
        return super.id_class(n);
    }

    @Override
    protected void id_break(int n) {
        this.id_catch += n;
    }

    @Override
    protected void b_(rdn_3 rdn_32) {
        if (this.id_catch > 0) {
            rdn_32.id_class((rYB)this.id_break.id_throws[7], this.id_break, this.id_catch);
        }
        if (this.id_byte instanceof rXv_1) {
            ((rXv_1)((Object)this.id_byte)).id_class(this.id_break);
        }
        this.id_catch = 0;
    }
}

