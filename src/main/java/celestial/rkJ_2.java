/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.rLR;
import celestial.rLY;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rdO_2;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rhd_3;
import celestial.rhx_3;

public class rkJ_2
extends rdb_3 {
    public rkJ_2(rdO_2 rdO_22) {
        super(rdO_22);
    }

    public static void id_class(rdn_3 rdn_32, rLR rLR2, int n) {
        rcd_3 rcd_32 = rdn_32.id_int();
        rcy_3 rcy_32 = rcd_32.id_protected("Effects", 9);
        rcd_3 rcd_33 = new rcd_3();
        rcd_33.id_class("EffectId", (byte)rLR.id_class(rLR2));
        rcd_33.id_break("EffectDuration", n);
        rcy_32.add(rcd_33);
        rcd_32.id_class("Effects", rcy_32);
    }

    @Override
    public rdn_3 id_class(rdn_3 rdn_32, rYB rYB2, iB_2 iB_22) {
        rdn_3 rdn_33 = super.id_class(rdn_32, rYB2, iB_22);
        rcd_3 rcd_32 = rdn_32.id_package();
        if (rcd_32 != null && rcd_32.id_byte("Effects", 9)) {
            rcy_3 rcy_32 = rcd_32.id_protected("Effects", 10);
            for (int i = 0; i < rcy_32.size(); ++i) {
                rLR rLR2;
                int n = 160;
                rcd_3 rcd_33 = rcy_32.id_class(i);
                if (rcd_33.id_byte("EffectDuration", 3)) {
                    n = rcd_33.id_private("EffectDuration");
                }
                if ((rLR2 = rLR.id_class(rcd_33.id_case("EffectId"))) == null) continue;
                iB_22.id_break(new rLY(rLR2, n));
            }
        }
        return iB_22 instanceof rhd_3 && ((rhx_3)((rhd_3)iB_22).id_implements[18]).id_protected ? rdn_33 : new rdn_3(rdy_3.OU);
    }
}

