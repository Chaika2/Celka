/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.VD;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rdH_2;
import celestial.rdO_2;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhd_3;
import celestial.rhx_3;
import celestial.rhy_3;
import celestial.rjU_2;
import celestial.rpm_3;
import celestial.rpr_3;
import celestial.rxg_3;
import celestial.ryZ_2;
import celestial.rym_3;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

public class rxj_3
extends rdb_3 {
    public rxj_3(rdO_2 rdO_22) {
        super(rdO_22);
    }

    @Override
    public void id_class(rdn_3 rdn_32, rYB rYB2, List<rgP_2> list, VD vD) {
        rcd_3 rcd_32 = rdn_32.id_break("Fireworks");
        if (rcd_32 != null) {
            rcy_3 rcy_32;
            if (rcd_32.id_byte("Flight", 99)) {
                list.add(new rgn_3("item.minecraft.firework_rocket.flight").id_break(" ").id_break(String.valueOf(rcd_32.id_case("Flight"))).id_class(rgF_2.GRAY));
            }
            if (!(rcy_32 = rcd_32.id_protected("Explosions", 10)).isEmpty()) {
                for (int i = 0; i < rcy_32.size(); ++i) {
                    rcd_3 rcd_33 = rcy_32.id_class(i);
                    ArrayList arrayList = Lists.newArrayList();
                    rxg_3.id_class(rcd_33, arrayList);
                    if (arrayList.isEmpty()) continue;
                    for (int j = 1; j < arrayList.size(); ++j) {
                        arrayList.set(j, new rgN_2("  ").id_class((rgP_2)arrayList.get(j)).id_class(rgF_2.GRAY));
                    }
                    list.addAll(arrayList);
                }
            }
        }
    }

    @Override
    public rym_3<rdn_3> id_class(rYB rYB2, rhd_3 rhd_32, rpm_3 rpm_32) {
        if (rhd_32.Sy()) {
            rdn_3 rdn_32 = rhd_32.id_protected(rpm_32);
            if (!rYB2.id_continue) {
                rYB2.a_(new rhy_3(rYB2, rdn_32, rhd_32));
                if (!((rhx_3)rhd_32.id_implements[18]).id_protected) {
                    rdn_32.id_catch(1);
                }
            }
            return rym_3.id_class(rhd_32.id_protected(rpm_32), rYB2.id_import());
        }
        return rym_3.id_byte(rhd_32.id_protected(rpm_32));
    }

    @Override
    public ryZ_2 id_class(rdH_2 rdH_22) {
        rYB rYB2 = rdH_22.id_int();
        if (!rYB2.id_continue) {
            rdn_3 rdn_32 = rdH_22.id_volatile();
            rjU_2 rjU_22 = rdH_22.id_extends();
            rpr_3 rpr_32 = rdH_22.id_finally();
            rhy_3 rhy_32 = new rhy_3(rYB2, rdH_22.id_final(), rjU_22.id_break + (double)rpr_32.id_implements() * 0.15, rjU_22.id_byte + (double)rpr_32.id_finally() * 5.0, rjU_22.id_protected + (double)rpr_32.id_extends() * 0.15, rdn_32);
            rYB2.a_(rhy_32);
            rdn_32.id_catch(1);
        }
        return ryZ_2.id_class(rYB2.id_continue);
    }
}

