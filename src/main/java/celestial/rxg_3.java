/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.VD;
import celestial.rVi_1;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rdO_2;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rxL_2;
import celestial.rxV_2;
import java.util.List;

public class rxg_3
extends rdb_3 {
    public rxg_3(rdO_2 rdO_22) {
        super(rdO_22);
    }

    private static rgP_2 id_class(int n) {
        rxL_2 rxL_22 = rxL_2.id_break(n);
        return rxL_22 == null ? new rgn_3("item.minecraft.firework_star.custom_color") : new rgn_3("item.minecraft.firework_star." + rxL_22.id_byte());
    }

    private static rgP_2 id_class(rVi_1 rVi_12, int[] nArray) {
        for (int i = 0; i < nArray.length; ++i) {
            if (i > 0) {
                rVi_12.id_break(", ");
            }
            rVi_12.id_class(rxg_3.id_class(nArray[i]));
        }
        return rVi_12;
    }

    public static void id_class(rcd_3 rcd_32, List<rgP_2> list) {
        int[] nArray;
        rxV_2 rxV_22 = rxV_2.id_class(rcd_32.id_case("Type"));
        list.add(new rgn_3("item.minecraft.firework_star.shape." + rxV_22.id_break()).id_class(rgF_2.GRAY));
        int[] nArray2 = rcd_32.id_final("Colors");
        if (nArray2.length > 0) {
            list.add(rxg_3.id_class(new rgN_2("").id_class(rgF_2.GRAY), nArray2));
        }
        if ((nArray = rcd_32.id_final("FadeColors")).length > 0) {
            list.add(rxg_3.id_class(new rgn_3("item.minecraft.firework_star.fade_to").id_break(" ").id_class(rgF_2.GRAY), nArray));
        }
        if (rcd_32.id_new("Trail")) {
            list.add(new rgn_3("item.minecraft.firework_star.trail").id_class(rgF_2.GRAY));
        }
        if (rcd_32.id_new("Flicker")) {
            list.add(new rgn_3("item.minecraft.firework_star.flicker").id_class(rgF_2.GRAY));
        }
    }

    @Override
    public void id_class(rdn_3 rdn_32, rYB rYB2, List<rgP_2> list, VD vD) {
        rcd_3 rcd_32 = rdn_32.id_break("Explosion");
        if (rcd_32 != null) {
            rxg_3.id_class(rcd_32, list);
        }
    }
}

