/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrbb_3;
import celestial.rrdD;
import celestial.rrkb_1;

public class rrdm_1 {
    public static boolean id_class(rrkb_1 rrkb_12, rrdD[] rrdDArray, boolean bl) {
        if (rrkb_12 == null) {
            return false;
        }
        if (rrdDArray == null) {
            return false;
        }
        String[] stringArray = rrkb_12.id_break();
        for (int i = 0; i < stringArray.length; ++i) {
            String string;
            String string2;
            String string3 = stringArray[i];
            rrdD rrdD2 = rrdm_1.id_class(string3, rrdDArray);
            if (rrdD2 == null || rrbb_3.id_class((Object)(string2 = bl ? rrdD2.id_throws() : rrdD2.id_protected()), (Object)(string = rrkb_12.id_class(string3)))) continue;
            return false;
        }
        return true;
    }

    public static rrkb_1 id_class(rrkb_1[] rrkb_1Array, rrdD[] rrdDArray, boolean bl) {
        if (rrkb_1Array == null) {
            return null;
        }
        for (int i = 0; i < rrkb_1Array.length; ++i) {
            rrkb_1 rrkb_12 = rrkb_1Array[i];
            if (!rrdm_1.id_class(rrkb_12, rrdDArray, bl)) continue;
            return rrkb_12;
        }
        return null;
    }

    public static rrdD id_class(String string, rrdD[] rrdDArray) {
        if (rrdDArray == null) {
            return null;
        }
        for (int i = 0; i < rrdDArray.length; ++i) {
            rrdD rrdD2 = rrdDArray[i];
            if (!rrdD2.id_class().equals(string)) continue;
            return rrdD2;
        }
        return null;
    }
}

