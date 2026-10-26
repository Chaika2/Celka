/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rJr_1;
import celestial.rWr_1;
import celestial.rXC;
import celestial.rXZ;
import celestial.rXu_1;
import celestial.rdn_3;
import celestial.rhd_3;
import celestial.rqs_3;

public class rXk_1
implements rXZ,
rXu_1 {
    private final rqs_3<rdn_3> id_class;
    private final int id_break;
    private final int id_byte;
    private final rJr_1 id_protected;

    @Override
    public boolean id_byte(rhd_3 rhd_32) {
        return true;
    }

    public int id_byte() {
        return this.id_byte;
    }

    public rXk_1(rJr_1 rJr_12, int n, int n2) {
        this.id_class = rqs_3.id_class(n * n2, rdn_3.id_break);
        this.id_protected = rJr_12;
        this.id_break = n;
        this.id_byte = n2;
    }

    @Override
    public void id_class(rWr_1 rWr_12) {
        for (rdn_3 rdn_32 : this.id_class) {
            rWr_12.id_class(rdn_32);
        }
    }

    @Override
    public rdn_3 id_class(int n, int n2) {
        rdn_3 rdn_32 = rXC.id_class(this.id_class, n, n2);
        if (!rdn_32.id_class()) {
            this.id_protected.id_class(this);
        }
        return rdn_32;
    }

    @Override
    public void id_break() {
    }

    @Override
    public void id_break(int n, rdn_3 rdn_32) {
        this.id_class.set(n, rdn_32);
        this.id_protected.id_class(this);
    }

    @Override
    public rdn_3 id_extends(int n) {
        return n >= this.id_else() ? rdn_3.id_break : this.id_class.get(n);
    }

    @Override
    public int id_else() {
        return this.id_class.size();
    }

    @Override
    public boolean id_return() {
        for (rdn_3 rdn_32 : this.id_class) {
            if (rdn_32.id_class()) continue;
            return false;
        }
        return true;
    }

    @Override
    public void id_public() {
        this.id_class.clear();
    }

    public int id_protected() {
        return this.id_break;
    }

    @Override
    public rdn_3 id_native(int n) {
        return rXC.id_class(this.id_class, n);
    }
}

