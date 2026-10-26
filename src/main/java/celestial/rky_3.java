/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rWN;
import celestial.rXk_1;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rkf_3;
import celestial.rkg_3;
import celestial.rqO_2;

public class rky_3
extends rWN {
    private static final rkg_3 id_class = rkg_3.id_class(rdy_3.Xb);
    private static final rkg_3 id_break = rkg_3.id_class(rdy_3.hr);
    private static final rkg_3 id_byte = rkg_3.id_class(rdy_3.du);

    @Override
    public rdn_3 id_byte() {
        return new rdn_3(rdy_3.dc);
    }

    public rky_3(rqO_2 rqO_22) {
        super(rqO_22);
    }

    @Override
    public rdn_3 id_class(rXk_1 rXk_12) {
        rdn_3 rdn_32 = new rdn_3(rdy_3.dc, 3);
        rcd_3 rcd_32 = rdn_32.id_class("Fireworks");
        rcy_3 rcy_32 = new rcy_3();
        int n = 0;
        for (int i = 0; i < rXk_12.id_else(); ++i) {
            rcd_3 rcd_33;
            rdn_3 rdn_33 = rXk_12.id_extends(i);
            if (rdn_33.id_class()) continue;
            if (id_break.id_class(rdn_33)) {
                ++n;
                continue;
            }
            if (!id_byte.id_class(rdn_33) || (rcd_33 = rdn_33.id_break("Explosion")) == null) continue;
            rcy_32.add(rcd_33);
        }
        rcd_32.id_class("Flight", (byte)n);
        if (!rcy_32.isEmpty()) {
            rcd_32.id_class("Explosions", rcy_32);
        }
        return rdn_32;
    }

    @Override
    public boolean id_class(rXk_1 rXk_12, rYB rYB2) {
        boolean bl = false;
        int n = 0;
        for (int i = 0; i < rXk_12.id_else(); ++i) {
            rdn_3 rdn_32 = rXk_12.id_extends(i);
            if (rdn_32.id_class()) continue;
            if (id_class.id_class(rdn_32)) {
                if (bl) {
                    return false;
                }
                bl = true;
                continue;
            }
            if (!(id_break.id_class(rdn_32) ? ++n > 3 : !id_byte.id_class(rdn_32))) continue;
            return false;
        }
        return bl && n >= 1;
    }

    @Override
    public boolean id_class(int n, int n2) {
        return n * n2 >= 2;
    }

    @Override
    public rkf_3<?> W_() {
        return rkf_3.id_catch;
    }
}

