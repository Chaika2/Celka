/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LZ;
import celestial.Qw_1;
import celestial.cm_3;
import celestial.rgN_2;
import celestial.rgS_2;
import celestial.rgc_3;
import celestial.rrJd_1;
import celestial.rrba_3;
import celestial.rrbb_3;
import celestial.rrdD;
import celestial.rrkX;
import celestial.rrzX_2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class rrJk_1
extends rrJd_1 {
    private String[] id_class(int n, List<String> list) {
        cm_3 cm_32 = (cm_3)rrbb_3.X().id_class[15];
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i = 0; i < list.size(); ++i) {
            String string = list.get(i);
            if (string == null || string.length() <= 0) continue;
            rgN_2 rgN_22 = new rgN_2(string);
            for (rgS_2 rgS_22 : cm_32.id_break().id_break(rgN_22, n, rgc_3.id_class)) {
                arrayList.add(rgS_22.getString());
            }
        }
        return arrayList.toArray(new String[arrayList.size()]);
    }

    private String[] id_class(rrdD rrdD2, int n) {
        Object object;
        String string = rrdD2.id_volatile();
        String string2 = rrbb_3.id_private(rrdD2.id_byte()).trim();
        String[] stringArray = this.id_break(string2);
        Qw_1 qw_1 = rrbb_3.rE();
        String string3 = null;
        if (!string.equals(rrdD2.id_class()) && qw_1.id_int) {
            string3 = "\u00a78" + rrba_3.id_class("of.general.id") + ": " + rrdD2.id_class();
        }
        String string4 = null;
        if (rrdD2.id_implements() != null && qw_1.id_int) {
            string4 = "\u00a78" + rrba_3.id_class("of.general.from") + ": " + rrbb_3.id_class(rrdD2.id_implements());
        }
        String string5 = null;
        if (rrdD2.id_throws() != null && qw_1.id_int) {
            object = rrdD2.id_finally() ? rrdD2.id_protected(rrdD2.id_throws()) : rrba_3.id_class("of.general.ambiguous");
            string5 = "\u00a78" + rrba_3.id_case() + ": " + (String)object;
        }
        object = new ArrayList<String>();
        object.add(string);
        object.addAll(Arrays.asList(stringArray));
        if (string3 != null) {
            object.add(string3);
        }
        if (string4 != null) {
            object.add(string4);
        }
        if (string5 != null) {
            object.add(string5);
        }
        return this.id_class(n, (List<String>)object);
    }

    @Override
    public String[] id_class(LZ lZ, int n) {
        if (!(lZ instanceof rrkX)) {
            return null;
        }
        rrkX rrkX2 = (rrkX)lZ;
        rrdD rrdD2 = rrkX2.id_private();
        return this.id_class(rrdD2, n);
    }

    private String[] id_break(String string) {
        if (string.length() <= 0) {
            return new String[0];
        }
        string = rrzX_2.id_protected(string, "//");
        String[] stringArray = string.split("\\. ");
        for (int i = 0; i < stringArray.length; ++i) {
            stringArray[i] = "- " + stringArray[i].trim();
            stringArray[i] = rrzX_2.id_throws(stringArray[i], ".");
        }
        return stringArray;
    }
}

