/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.ibm.icu.lang.UCharacter
 *  com.ibm.icu.text.ArabicShaping
 *  com.ibm.icu.text.Bidi
 *  com.ibm.icu.text.BidiRun
 */
package celestial;

import celestial.VV;
import celestial.rgS_2;
import celestial.rpl_3;
import com.google.common.collect.Lists;
import com.ibm.icu.lang.UCharacter;
import com.ibm.icu.text.ArabicShaping;
import com.ibm.icu.text.Bidi;
import com.ibm.icu.text.BidiRun;
import java.util.ArrayList;

public class Vg_1 {
    public static rpl_3 id_class(rgS_2 rgS_22, boolean bl) {
        VV vV = VV.id_class(rgS_22, UCharacter::getMirror, Vg_1::id_class);
        Bidi bidi = new Bidi(vV.id_class(), bl ? 127 : 126);
        bidi.setReorderingMode(0);
        ArrayList arrayList = Lists.newArrayList();
        int n = bidi.countRuns();
        for (int i = 0; i < n; ++i) {
            BidiRun bidiRun = bidi.getVisualRun(i);
            arrayList.addAll(vV.id_class(bidiRun.getStart(), bidiRun.getLength(), bidiRun.isOddRun()));
        }
        return rpl_3.id_class(arrayList);
    }

    private static String id_class(String string) {
        try {
            return new ArabicShaping(8).shape(string);
        }
        catch (Exception exception) {
            return string;
        }
    }
}

