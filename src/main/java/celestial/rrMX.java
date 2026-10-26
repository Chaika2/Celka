/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.II;
import celestial.IJ;
import celestial.Ip_1;
import celestial.rpr_3;
import celestial.rqO_2;
import celestial.rrJT;
import celestial.rrbb_3;
import celestial.wK_2;
import celestial.xc_3;
import celestial.xd_3;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class rrMX {
    private static IJ id_class = null;
    private static IJ id_break = null;
    private static IJ id_byte = null;
    private static IJ id_protected = null;
    private static IJ id_throws = null;
    private static IJ id_case = null;
    private static List id_catch = null;
    private static List id_private = null;
    private static List id_implements = null;
    private static List id_finally = null;
    private static List id_extends = null;
    private static List id_native = null;
    private static IJ id_volatile = null;
    private static IJ id_final = null;
    private static IJ id_package = null;
    private static IJ id_int = null;
    private static IJ id_new = null;
    private static IJ id_continue = null;
    private static final Random id_super = new Random();

    private static List id_class(IJ iJ) {
        return iJ == null ? null : iJ.id_class(null, null, id_super);
    }

    public static IJ id_class(String string, List list) {
        Ip_1 ip_1 = rrbb_3.id_float();
        if (ip_1 == null) {
            return null;
        }
        rqO_2 rqO_22 = new rqO_2("blockstates/" + string + "_leaves.json");
        if (!rrbb_3.id_protected(rqO_22)) {
            return null;
        }
        rqO_2 rqO_23 = new rqO_2("models/block/" + string + "_leaves.json");
        if (!rrbb_3.id_protected(rqO_23)) {
            return null;
        }
        II iI = new II(string + "_leaves", "normal");
        IJ iJ = ip_1.id_class(iI);
        if (iJ != null && iJ != ip_1.id_break()) {
            List<wK_2> list2 = iJ.id_class(null, null, id_super);
            if (list2.size() == 0) {
                return iJ;
            }
            if (list2.size() != 6) {
                return null;
            }
            for (wK_2 wK_22 : list2) {
                List<wK_2> list3 = iJ.id_class(null, wK_22.id_protected(), id_super);
                if (list3.size() > 0) {
                    return null;
                }
                list3.add(wK_22);
            }
            list2.clear();
            list.add(string + "_leaves");
            return iJ;
        }
        return null;
    }

    public static IJ id_class(IJ iJ, xc_3 xc_32) {
        if (!rrbb_3.id_static()) {
            return iJ;
        }
        List<wK_2> list = iJ.id_class(xc_32, null, id_super);
        if (list == id_catch) {
            return id_volatile;
        }
        if (list == id_private) {
            return id_final;
        }
        if (list == id_implements) {
            return id_package;
        }
        if (list == id_finally) {
            return id_int;
        }
        if (list == id_extends) {
            return id_new;
        }
        return list == id_native ? id_continue : iJ;
    }

    public static void id_class() {
        ArrayList arrayList = new ArrayList();
        id_class = rrMX.id_class("acacia", arrayList);
        id_break = rrMX.id_class("birch", arrayList);
        id_byte = rrMX.id_class("dark_oak", arrayList);
        id_protected = rrMX.id_class("jungle", arrayList);
        id_throws = rrMX.id_class("oak", arrayList);
        id_case = rrMX.id_class("spruce", arrayList);
        id_catch = rrMX.id_class(id_class);
        id_private = rrMX.id_class(id_break);
        id_implements = rrMX.id_class(id_byte);
        id_finally = rrMX.id_class(id_protected);
        id_extends = rrMX.id_class(id_throws);
        id_native = rrMX.id_class(id_case);
        id_volatile = rrMX.id_break(id_class);
        id_final = rrMX.id_break(id_break);
        id_package = rrMX.id_break(id_byte);
        id_int = rrMX.id_break(id_protected);
        id_new = rrMX.id_break(id_throws);
        id_continue = rrMX.id_break(id_case);
        if (arrayList.size() > 0) {
            rrbb_3.id_byte("Enable face culling: " + rrbb_3.id_class(arrayList.toArray()));
        }
    }

    public static boolean id_class(xc_3 xc_32, xc_3 xc_33) {
        xd_3 xd_32;
        if (xc_32 == xc_33) {
            return true;
        }
        xd_3 xd_33 = xc_32.id_break();
        return xd_33 == (xd_32 = xc_33.id_break());
    }

    private static IJ id_break(IJ iJ) {
        List[] listArray;
        if (iJ == null) {
            return null;
        }
        if (iJ.id_class(null, null, id_super).size() > 0) {
            rrbb_3.id_protected("SmartLeaves: Model is not cube, general quads: " + iJ.id_class(null, null, id_super).size() + ", model: " + iJ);
            return iJ;
        }
        rpr_3[] rpr_3Array = rpr_3.VALUES;
        for (int i = 0; i < rpr_3Array.length; ++i) {
            listArray = rpr_3Array[i];
            List<wK_2> list = iJ.id_class(null, (rpr_3)listArray, id_super);
            if (list.size() == 1) continue;
            rrbb_3.id_protected("SmartLeaves: Model is not cube, side: " + (rpr_3)listArray + ", quads: " + list.size() + ", model: " + iJ);
            return iJ;
        }
        IJ iJ2 = rrJT.id_break(iJ);
        listArray = new List[rpr_3Array.length];
        for (int i = 0; i < rpr_3Array.length; ++i) {
            rpr_3 rpr_32 = rpr_3Array[i];
            List<wK_2> list = iJ2.id_class(null, rpr_32, id_super);
            wK_2 wK_22 = list.get(0);
            wK_2 wK_23 = new wK_2((int[])wK_22.id_class().clone(), wK_22.id_byte(), wK_22.id_protected(), wK_22.id_case(), wK_22.id_throws());
            int[] nArray = wK_23.id_class();
            int[] nArray2 = (int[])nArray.clone();
            int n = nArray.length / 4;
            System.arraycopy(nArray, 0 * n, nArray2, 3 * n, n);
            System.arraycopy(nArray, 1 * n, nArray2, 2 * n, n);
            System.arraycopy(nArray, 2 * n, nArray2, 1 * n, n);
            System.arraycopy(nArray, 3 * n, nArray2, 0 * n, n);
            System.arraycopy(nArray2, 0, nArray, 0, nArray2.length);
            list.add(wK_23);
        }
        return iJ2;
    }
}

