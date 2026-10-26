/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package celestial;

import celestial.HU;
import celestial.IJ;
import celestial.rRp_1;
import celestial.rfH_2;
import celestial.rpr_3;
import celestial.rrGU;
import celestial.rrMX;
import celestial.rrMs_1;
import celestial.rrbO_2;
import celestial.rrbb_3;
import celestial.rrxA_2;
import celestial.rrxF_2;
import celestial.wK_2;
import celestial.xc_3;
import com.google.common.collect.ImmutableList;
import java.util.List;

public class rrJH {
    private static final List<wK_2> id_class = ImmutableList.of();

    private static HU id_class(HU hU) {
        return hU != null && hU != rrxA_2.id_class ? hU : rrxA_2.id_break;
    }

    private static wK_2[] id_class(wK_2 wK_22, rRp_1 rRp_12, xc_3 xc_32, rfH_2 rfH_22, rpr_3 rpr_32, long l, rrxF_2 rrxF_22) {
        wK_2[] wK_2Array;
        if (rrxF_22.id_class(wK_22)) {
            return rrxF_22.id_break(wK_22);
        }
        wK_2 wK_23 = wK_22;
        if (rrbb_3.a() && ((wK_2Array = rrbO_2.id_class(rRp_12, xc_32, rfH_22, wK_22, rrxF_22)).length != 1 || wK_2Array[0] != wK_22)) {
            return wK_2Array;
        }
        if (rrbb_3.i() && (wK_22 = rrMs_1.id_class(rfH_22, wK_22)) != wK_23) {
            return rrxF_22.id_break(wK_22);
        }
        return rrxF_22.id_break(wK_22);
    }

    public static IJ id_class(IJ iJ, xc_3 xc_32, rrxF_2 rrxF_22) {
        if (rrxF_22.id_volatile()) {
            iJ = rrMX.id_class(iJ, xc_32);
        }
        return iJ;
    }

    public static List<wK_2> id_class(List<wK_2> list, rRp_1 rRp_12, xc_3 xc_32, rfH_2 rfH_22, rpr_3 rpr_32, HU hU, long l, rrxF_2 rrxF_22) {
        if (rpr_32 != null) {
            if (rrxF_22.id_volatile() && rrMX.id_class(rRp_12.id_byte(rfH_22.id_break(rpr_32)), xc_32)) {
                return id_class;
            }
            if (!rrxF_22.id_class(list) && rrbb_3.c()) {
                list = rrGU.id_class(rRp_12, xc_32, rfH_22, rpr_32, list);
            }
        }
        List<wK_2> list2 = rrxF_22.id_final();
        list2.clear();
        for (int i = 0; i < list.size(); ++i) {
            wK_2 wK_22 = list.get(i);
            wK_2[] wK_2Array = rrJH.id_class(wK_22, rRp_12, xc_32, rfH_22, rpr_32, l, rrxF_22);
            if (i == 0 && list.size() == 1 && wK_2Array.length == 1 && wK_2Array[0] == wK_22 && wK_22.id_int() == null) {
                return list;
            }
            for (int j = 0; j < wK_2Array.length; ++j) {
                wK_2 wK_23 = wK_2Array[j];
                list2.add(wK_23);
                if (wK_23.id_int() == null) continue;
                rrxF_22.id_class(rrJH.id_class(hU)).id_class(wK_23.id_int(), xc_32);
                rrxF_22.id_class(true);
            }
        }
        return list2;
    }
}

