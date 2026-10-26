/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rXu_1;
import celestial.rdn_3;
import celestial.rhd_3;

public class rXW
implements rXu_1 {
    private final rXu_1 id_class;
    private final rXu_1 id_break;

    @Override
    public boolean id_byte(rhd_3 rhd_32) {
        return this.id_class.id_byte(rhd_32) && this.id_break.id_byte(rhd_32);
    }

    public rXW(rXu_1 rXu_12, rXu_1 rXu_13) {
        if (rXu_12 == null) {
            rXu_12 = rXu_13;
        }
        if (rXu_13 == null) {
            rXu_13 = rXu_12;
        }
        this.id_class = rXu_12;
        this.id_break = rXu_13;
    }

    @Override
    public rdn_3 id_class(int n, int n2) {
        return n >= this.id_class.id_else() ? this.id_break.id_class(n - this.id_class.id_else(), n2) : this.id_class.id_class(n, n2);
    }

    public boolean id_class(rXu_1 rXu_12) {
        return this.id_class == rXu_12 || this.id_break == rXu_12;
    }

    @Override
    public void id_break() {
        this.id_class.id_break();
        this.id_break.id_break();
    }

    @Override
    public void id_break(rhd_3 rhd_32) {
        this.id_class.id_break(rhd_32);
        this.id_break.id_break(rhd_32);
    }

    @Override
    public void id_break(int n, rdn_3 rdn_32) {
        if (n >= this.id_class.id_else()) {
            this.id_break.id_break(n - this.id_class.id_else(), rdn_32);
        } else {
            this.id_class.id_break(n, rdn_32);
        }
    }

    @Override
    public rdn_3 id_extends(int n) {
        return n >= this.id_class.id_else() ? this.id_break.id_extends(n - this.id_class.id_else()) : this.id_class.id_extends(n);
    }

    @Override
    public int ab_() {
        return this.id_class.ab_();
    }

    @Override
    public int id_else() {
        return this.id_class.id_else() + this.id_break.id_else();
    }

    @Override
    public boolean id_return() {
        return this.id_class.id_return() && this.id_break.id_return();
    }

    @Override
    public void id_public() {
        this.id_class.id_public();
        this.id_break.id_public();
    }

    @Override
    public rdn_3 id_native(int n) {
        return n >= this.id_class.id_else() ? this.id_break.id_native(n - this.id_class.id_else()) : this.id_class.id_native(n);
    }

    @Override
    public boolean a_(int n, rdn_3 rdn_32) {
        return n >= this.id_class.id_else() ? this.id_break.a_(n - this.id_class.id_else(), rdn_32) : this.id_class.a_(n, rdn_32);
    }

    @Override
    public void b_(rhd_3 rhd_32) {
        this.id_class.b_(rhd_32);
        this.id_break.b_(rhd_32);
    }
}

