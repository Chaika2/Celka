/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rHq_1;
import celestial.rXA;
import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rdn_3;
import celestial.rhd_3;

public class rXz_1
extends rXA {
    private rHq_1 id_class;

    @Override
    public rcy_3 id_byte() {
        rcy_3 rcy_32 = new rcy_3();
        for (int i = 0; i < this.id_else(); ++i) {
            rdn_3 rdn_32 = this.id_extends(i);
            if (rdn_32.id_class()) continue;
            rcd_3 rcd_32 = new rcd_3();
            rcd_32.id_class("Slot", (byte)i);
            rdn_32.id_break(rcd_32);
            rcy_32.add(rcd_32);
        }
        return rcy_32;
    }

    @Override
    public boolean id_byte(rhd_3 rhd_32) {
        return this.id_class != null && !this.id_class.id_class(rhd_32) ? false : super.id_byte(rhd_32);
    }

    public rXz_1() {
        super(27);
    }

    @Override
    public void id_class(rcy_3 rcy_32) {
        int n;
        for (n = 0; n < this.id_else(); ++n) {
            this.id_break(n, rdn_3.id_break);
        }
        for (n = 0; n < rcy_32.size(); ++n) {
            rcd_3 rcd_32 = rcy_32.id_class(n);
            int n2 = rcd_32.id_case("Slot") & 0xFF;
            if (n2 < 0 || n2 >= this.id_else()) continue;
            this.id_break(n2, rdn_3.id_class(rcd_32));
        }
    }

    public void id_class(rHq_1 rHq_12) {
        this.id_class = rHq_12;
    }

    @Override
    public void id_break(rhd_3 rhd_32) {
        if (this.id_class != null) {
            this.id_class.id_private();
        }
        super.id_break(rhd_32);
        this.id_class = null;
    }

    @Override
    public void b_(rhd_3 rhd_32) {
        if (this.id_class != null) {
            this.id_class.id_catch();
        }
        super.b_(rhd_32);
    }
}

