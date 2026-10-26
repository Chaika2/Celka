/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rHR;
import celestial.rXu_1;
import celestial.rdn_3;
import celestial.rhd_3;

public class rHY
implements rXu_1 {
    public final /* synthetic */ rHR id_class;

    @Override
    public boolean id_byte(rhd_3 rhd_32) {
        if (this.id_class.id_extends.id_class(this.id_class.id_native) != this.id_class) {
            return false;
        }
        return rhd_32.id_class((double)this.id_class.id_native.b_() + 0.5, (double)this.id_class.id_native.c_() + 0.5, (double)this.id_class.id_native.d_() + 0.5) > 64.0 ? false : this.id_class.id_catch();
    }

    public rHY(rHR rHR2) {
        this.id_class = rHR2;
    }

    @Override
    public rdn_3 id_class(int n, int n2) {
        if (n == 0) {
            rdn_3 rdn_32 = this.id_class.id_byte.id_class(n2);
            if (this.id_class.id_byte.id_class()) {
                this.id_class.id_extends();
            }
            return rdn_32;
        }
        return rdn_3.id_break;
    }

    @Override
    public void id_break(int n, rdn_3 rdn_32) {
    }

    @Override
    public void id_break() {
        this.id_class.id_break();
    }

    @Override
    public rdn_3 id_extends(int n) {
        return n == 0 ? this.id_class.id_byte : rdn_3.id_break;
    }

    @Override
    public int ab_() {
        return 1;
    }

    @Override
    public int id_else() {
        return 1;
    }

    @Override
    public boolean id_return() {
        return this.id_class.id_byte.id_class();
    }

    @Override
    public void id_public() {
    }

    @Override
    public rdn_3 id_native(int n) {
        if (n == 0) {
            rdn_3 rdn_32 = this.id_class.id_byte;
            this.id_class.id_byte = rdn_3.id_break;
            this.id_class.id_extends();
            return rdn_32;
        }
        return rdn_3.id_break;
    }

    @Override
    public boolean a_(int n, rdn_3 rdn_32) {
        return false;
    }
}

