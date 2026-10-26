/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.IF;
import celestial.IG;
import celestial.II;
import celestial.IJ;
import celestial.IM;
import celestial.IR;
import celestial.If_1;
import celestial.Ih_1;
import celestial.Ik_1;
import celestial.Ip_1;
import celestial.Jp_1;
import celestial.fJ_2;
import celestial.fj_3;
import celestial.rfH_2;
import celestial.rfl_3;
import celestial.rje_3;
import celestial.rpr_3;
import celestial.rqO_2;
import celestial.rrJT;
import celestial.rrJl_1;
import celestial.rrbb_3;
import celestial.wD_2;
import celestial.wK_2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class rrJy_1 {
    private static final float id_class = 1.0E-6f;
    private static final Random id_break = new Random(0L);

    private static void id_class(List<wK_2> list, fj_3 fj_32, fj_3 fj_33) {
        ArrayList<wK_2> arrayList = new ArrayList<wK_2>();
        for (wK_2 wK_22 : list) {
            if (wK_22.id_case() == fj_32) {
                wK_22 = new rrJl_1(wK_22, fj_33);
            }
            arrayList.add(wK_22);
        }
        list.clear();
        list.addAll(arrayList);
    }

    public static void id_class(rje_3 rje_32) {
        rje_32.id_break(rrJy_1.id_class(rje_32.id_class()), rrJy_1.id_class(rje_32.id_break()), rrJy_1.id_class(rje_32.id_byte()));
    }

    private static float id_class(float f) {
        if (f > -1.0E-6f && f < 1.0E-6f) {
            return 0.0f;
        }
        return f > 0.999999f && f < 1.000001f ? 1.0f : f;
    }

    public static rfl_3 id_class(rfl_3 rfl_32, Jp_1 jp_1, rfH_2 rfH_22) {
        int n = rfH_22.b_();
        int n2 = rfH_22.d_();
        long l = (long)(n * 3129871) ^ (long)n2 * 116129781L;
        l = l * l * 42317861L + l * 11L;
        double d = ((double)((float)(l >> 16 & 0xFL) / 15.0f) - 0.5) * 0.5;
        double d2 = ((double)((float)(l >> 24 & 0xFL) / 15.0f) - 0.5) * 0.5;
        double d3 = 0.0;
        if (jp_1 == Jp_1.XYZ) {
            d3 = ((double)((float)(l >> 20 & 0xFL) / 15.0f) - 1.0) * 0.2;
        }
        return rfl_32.id_protected(d, d3, d2);
    }

    public static IJ id_class(String string, fj_3 fj_32, fj_3 fj_33) {
        if (fj_32 != null && fj_33 != null) {
            Ip_1 ip_1 = rrbb_3.id_float();
            if (ip_1 == null) {
                return null;
            }
            II iI = new II(string, "");
            IJ iJ = ip_1.id_class(iI);
            if (iJ != null && iJ != ip_1.id_break()) {
                IJ iJ2 = rrJT.id_break(iJ);
                rpr_3[] rpr_3Array = rpr_3.VALUES;
                for (int i = 0; i < rpr_3Array.length; ++i) {
                    rpr_3 rpr_32 = rpr_3Array[i];
                    List<wK_2> list = iJ2.id_class(null, rpr_32, id_break);
                    rrJy_1.id_class(list, fj_32, fj_33);
                }
                List<wK_2> list = iJ2.id_class(null, null, id_break);
                rrJy_1.id_class(list, fj_32, fj_33);
                return iJ2;
            }
            return null;
        }
        return null;
    }

    public static IJ id_class(fj_3 fj_32, int n) {
        Object object;
        ArrayList<wK_2> arrayList = new ArrayList<wK_2>();
        rpr_3[] rpr_3Array = rpr_3.VALUES;
        HashMap<rpr_3, List<wK_2>> hashMap = new HashMap<rpr_3, List<wK_2>>();
        for (int i = 0; i < rpr_3Array.length; ++i) {
            object = rpr_3Array[i];
            ArrayList<wK_2> arrayList2 = new ArrayList<wK_2>();
            arrayList2.add(rrJy_1.id_class((rpr_3)object, fj_32, n));
            hashMap.put((rpr_3)object, arrayList2);
        }
        IF iF = IF.id_class;
        object = new IR(arrayList, hashMap, true, true, true, fj_32, Ik_1.id_class, iF);
        return object;
    }

    public static IJ id_class(IJ iJ, IJ iJ2) {
        Object object;
        int n;
        ArrayList<wK_2> arrayList = new ArrayList<wK_2>();
        arrayList.addAll(iJ.id_class(null, null, id_break));
        arrayList.addAll(iJ2.id_class(null, null, id_break));
        rpr_3[] rpr_3Array = rpr_3.VALUES;
        HashMap<rpr_3, List<wK_2>> hashMap = new HashMap<rpr_3, List<wK_2>>();
        for (n = 0; n < rpr_3Array.length; ++n) {
            rpr_3 rpr_32 = rpr_3Array[n];
            object = new ArrayList<wK_2>();
            object.addAll(iJ.id_class(null, rpr_32, id_break));
            object.addAll(iJ2.id_class(null, rpr_32, id_break));
            hashMap.put(rpr_32, (List<wK_2>)object);
        }
        n = iJ.id_class() ? 1 : 0;
        boolean bl = iJ.id_protected();
        object = iJ.id_throws();
        Ik_1 ik_1 = iJ.id_case();
        IF iF = iJ.id_catch();
        IR iR = new IR(arrayList, hashMap, n != 0, bl, true, (fj_3)object, ik_1, iF);
        return iR;
    }

    public static wK_2 id_class(rpr_3 rpr_32, fj_3 fj_32, int n) {
        rje_3 rje_32 = new rje_3(0.0f, 0.0f, 0.0f);
        rje_3 rje_33 = new rje_3(16.0f, 16.0f, 16.0f);
        wD_2 wD_22 = new wD_2(new float[]{0.0f, 0.0f, 16.0f, 16.0f}, 0);
        IG iG = new IG(rpr_32, n, "#" + rpr_32.id_class(), wD_22);
        If_1 if_1 = If_1.X0_Y0;
        IM iM = null;
        boolean bl = true;
        rqO_2 rqO_22 = fj_32.id_finally();
        Ih_1 ih_1 = new Ih_1();
        return ih_1.id_class(rje_32, rje_33, iG, fj_32, rpr_32, if_1, iM, bl, rqO_22);
    }

    public static IJ id_class(String string, String string2, String string3) {
        fJ_2 fJ_22 = rrbb_3.rF();
        fj_3 fj_32 = fJ_22.id_break(string2);
        fj_3 fj_33 = fJ_22.id_break(string3);
        return rrJy_1.id_class(string, fj_32, fj_33);
    }

    public static IJ id_class(String string, int n) {
        fj_3 fj_32 = rrbb_3.rF().id_break(string);
        return rrJy_1.id_class(fj_32, n);
    }
}

