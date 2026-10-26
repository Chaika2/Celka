/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.IJ;
import celestial.IR;
import celestial.rpr_3;
import celestial.rrbb_3;
import celestial.wK_2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class rrJT {
    private static final Random id_class = new Random(0L);

    public static wK_2 id_class(wK_2 wK_22) {
        return new wK_2((int[])wK_22.id_class().clone(), wK_22.id_byte(), wK_22.id_protected(), wK_22.id_case(), wK_22.id_throws());
    }

    public static List id_class(List<wK_2> list) {
        ArrayList<wK_2> arrayList = new ArrayList<wK_2>();
        for (wK_2 wK_22 : list) {
            wK_2 wK_23 = rrJT.id_class(wK_22);
            arrayList.add(wK_23);
        }
        return arrayList;
    }

    public static void id_class(int[] nArray, String string) {
        int n = nArray.length / 4;
        rrbb_3.id_byte(string + "Length: " + nArray.length + ", step: " + n);
        for (int i = 0; i < 4; ++i) {
            int n2 = i * n;
            float f = Float.intBitsToFloat(nArray[n2 + 0]);
            float f2 = Float.intBitsToFloat(nArray[n2 + 1]);
            float f3 = Float.intBitsToFloat(nArray[n2 + 2]);
            int n3 = nArray[n2 + 3];
            float f4 = Float.intBitsToFloat(nArray[n2 + 4]);
            float f5 = Float.intBitsToFloat(nArray[n2 + 5]);
            rrbb_3.id_byte(string + i + " xyz: " + f + "," + f2 + "," + f3 + " col: " + n3 + " u,v: " + f4 + "," + f5);
        }
    }

    private static void id_class(String string, List<wK_2> list, String string2) {
        for (wK_2 wK_22 : list) {
            rrJT.id_class(string, wK_22, string2);
        }
    }

    public static void id_class(String string, wK_2 wK_22, String string2) {
        rrbb_3.id_byte(string2 + "Quad: " + wK_22.getClass().getName() + ", type: " + string + ", face: " + wK_22.id_protected() + ", tint: " + wK_22.id_byte() + ", sprite: " + wK_22.id_case());
        rrJT.id_class(wK_22.id_class(), "  " + string2);
    }

    public static void id_class(IJ iJ) {
        if (iJ != null) {
            rrbb_3.id_byte("Model: " + iJ + ", ao: " + iJ.id_class() + ", gui3d: " + iJ.id_break() + ", builtIn: " + iJ.id_protected() + ", particle: " + iJ.id_throws());
            rpr_3[] rpr_3Array = rpr_3.VALUES;
            for (int i = 0; i < rpr_3Array.length; ++i) {
                rpr_3 rpr_32 = rpr_3Array[i];
                List<wK_2> list = iJ.id_class(null, rpr_32, id_class);
                rrJT.id_class(rpr_32.id_class(), list, "  ");
            }
            List<wK_2> list = iJ.id_class(null, null, id_class);
            rrJT.id_class("General", list, "  ");
        }
    }

    public static IJ id_break(IJ iJ) {
        List list = rrJT.id_class(iJ.id_class(null, null, id_class));
        rpr_3[] rpr_3Array = rpr_3.VALUES;
        HashMap<rpr_3, List<wK_2>> hashMap = new HashMap<rpr_3, List<wK_2>>();
        for (int i = 0; i < rpr_3Array.length; ++i) {
            rpr_3 rpr_32 = rpr_3Array[i];
            List<wK_2> list2 = iJ.id_class(null, rpr_32, id_class);
            List list3 = rrJT.id_class(list2);
            hashMap.put(rpr_32, list3);
        }
        return new IR(list, hashMap, iJ.id_class(), iJ.id_break(), true, iJ.id_throws(), iJ.id_case(), iJ.id_catch());
    }
}

