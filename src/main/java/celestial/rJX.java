/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rHS;
import celestial.rJY;
import celestial.rXu_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rhd_3;

public class rJX
extends rJY {
    private final rhd_3 id_class;
    private int id_break;

    public rJX(rhd_3 rhd_32, rXu_1 rXu_12, int n, int n2, int n3) {
        super(rXu_12, n, n2, n3);
        this.id_class = rhd_32;
    }

    @Override
    protected void id_class(rdn_3 rdn_32, int n) {
        this.id_break += n;
        this.b_(rdn_32);
    }

    @Override
    public rdn_3 id_class(rhd_3 rhd_32, rdn_3 rdn_32) {
        this.b_(rdn_32);
        super.id_class(rhd_32, rdn_32);
        return rdn_32;
    }

    @Override
    public rdn_3 id_class(int n) {
        if (this.id_break()) {
            this.id_break += Math.min(n, this.id_class().id_char());
        }
        return super.id_class(n);
    }

    @Override
    public boolean id_class(rdn_3 rdn_32) {
        return false;
    }

    @Override
    protected void b_(rdn_3 rdn_32) {
        rdn_32.id_class((rYB)this.id_class.id_throws[7], this.id_class, this.id_break);
        if (!((rYB)this.id_class.id_throws[7]).id_continue && this.id_byte instanceof rHS) {
            ((rHS)this.id_byte).id_protected(this.id_class);
        }
        this.id_break = 0;
    }
}

