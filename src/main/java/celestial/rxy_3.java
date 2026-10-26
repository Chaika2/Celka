/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.VD;
import celestial.eL_2;
import celestial.ev_3;
import celestial.rVL;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rdO_2;
import celestial.rdX_2;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rgP_2;
import celestial.rqO_2;
import celestial.rqs_3;
import java.util.List;

public class rxy_3
extends rdb_3 {
    public rxy_3(rdO_2 rdO_22) {
        super(rdO_22);
    }

    @Override
    public void id_class(rdn_3 rdn_32, rYB rYB2, List<rgP_2> list, VD vD) {
        super.id_class(rdn_32, rYB2, list, vD);
        rdn_3.id_class(list, rxy_3.id_protected(rdn_32));
    }

    public static void id_class(rdn_3 rdn_32, eL_2 eL_22) {
        rcy_3 rcy_32 = rxy_3.id_protected(rdn_32);
        boolean bl = true;
        rqO_2 rqO_22 = rVL.id_boolean.id_break(eL_22.id_class);
        for (int i = 0; i < rcy_32.size(); ++i) {
            rcd_3 rcd_32 = rcy_32.id_class(i);
            rqO_2 rqO_23 = rqO_2.id_break(rcd_32.id_native("id"));
            if (rqO_23 == null || !rqO_23.equals(rqO_22)) continue;
            if (rcd_32.id_private("lvl") < eL_22.id_break) {
                rcd_32.id_class("lvl", (short)eL_22.id_break);
            }
            bl = false;
            break;
        }
        if (bl) {
            rcd_3 rcd_33 = new rcd_3();
            rcd_33.id_class("id", String.valueOf(rqO_22));
            rcd_33.id_class("lvl", (short)eL_22.id_break);
            rcy_32.add(rcd_33);
        }
        rdn_32.id_int().id_class("StoredEnchantments", rcy_32);
    }

    public static rdn_3 id_class(eL_2 eL_22) {
        rdn_3 rdn_32 = new rdn_3(rdy_3.dm);
        rxy_3.id_class(rdn_32, eL_22);
        return rdn_32;
    }

    @Override
    public void id_class(rdX_2 rdX_22, rqs_3<rdn_3> rqs_32) {
        block4: {
            block3: {
                if (rdX_22 != rdX_2.id_catch) break block3;
                for (ev_3 ev_32 : rVL.id_boolean) {
                    if (ev_32.id_break == null) continue;
                    for (int i = ev_32.id_throws(); i <= ev_32.id_class(); ++i) {
                        rqs_32.add(rxy_3.id_class(new eL_2(ev_32, i)));
                    }
                }
                break block4;
            }
            if (rdX_22.id_final().length == 0) break block4;
            for (ev_3 ev_33 : rVL.id_boolean) {
                if (!rdX_22.id_class(ev_33.id_break)) continue;
                rqs_32.add(rxy_3.id_class(new eL_2(ev_33, ev_33.id_class())));
            }
        }
    }

    @Override
    public boolean id_class(rdn_3 rdn_32) {
        return false;
    }

    @Override
    public boolean id_throws(rdn_3 rdn_32) {
        return true;
    }

    public static rcy_3 id_protected(rdn_3 rdn_32) {
        rcd_3 rcd_32 = rdn_32.id_package();
        return rcd_32 != null ? rcd_32.id_protected("StoredEnchantments", 10) : new rcy_3();
    }
}

