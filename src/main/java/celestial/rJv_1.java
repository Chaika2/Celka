/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rJF;
import celestial.rJP;
import celestial.rJr_1;
import celestial.rXA;
import celestial.rXu_1;
import celestial.rdn_3;
import celestial.rhd_3;
import celestial.rhz_3;
import celestial.rpF_2;
import celestial.rpI_2;

public class rJv_1
extends rJr_1 {
    private final rXu_1 id_class;
    private final rpF_2 id_break;

    public rJv_1(int n) {
        this(n, new rXA(1), new rpI_2(1));
    }

    public rJv_1(int n, rXu_1 rXu_12, rpF_2 rpF_22) {
        super(rJP.id_new, n);
        rJv_1.id_class(rXu_12, 1);
        rJv_1.id_class(rpF_22, 1);
        this.id_class = rXu_12;
        this.id_break = rpF_22;
        this.id_break(new rJF(this, rXu_12, 0, 0, 0));
        this.id_class(rpF_22);
    }

    @Override
    public boolean id_class(rhd_3 rhd_32) {
        return this.id_class.id_byte(rhd_32);
    }

    public rdn_3 id_class() {
        return this.id_class.id_extends(0);
    }

    @Override
    public void id_class(int n, int n2) {
        super.id_class(n, n2);
        this.id_native();
    }

    @Override
    public boolean id_break(rhd_3 rhd_32, int n) {
        if (n >= 100) {
            int n2 = n - 100;
            this.id_class(0, n2);
            return true;
        }
        switch (n) {
            case 1: {
                int n3 = this.id_break.id_class(0);
                this.id_class(0, n3 - 1);
                return true;
            }
            case 2: {
                int n4 = this.id_break.id_class(0);
                this.id_class(0, n4 + 1);
                return true;
            }
            case 3: {
                if (!rhd_32.sD()) {
                    return false;
                }
                rdn_3 rdn_32 = this.id_class.id_native(0);
                this.id_class.id_break();
                if (!((rhz_3)rhd_32.id_implements[1]).id_throws(rdn_32)) {
                    rhd_32.id_class(rdn_32, false);
                }
                return true;
            }
        }
        return false;
    }

    public int id_break() {
        return this.id_break.id_class(0);
    }
}

