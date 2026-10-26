/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.ImmutablePair
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial;

import celestial.rYB;
import celestial.rqM_2;
import celestial.rrbT_2;
import celestial.rrbb_3;
import celestial.rrzM_2;
import celestial.rrzX_2;
import celestial.rrzc_3;
import celestial.ruZ_2;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

public class rrbt_3 {
    private static rrbT_2[] id_class = null;
    private static int id_break = 0;

    private static Pair<rrbT_2[], Integer> id_byte() {
        String string;
        Integer[] integerArray;
        String string2 = "optifine/gui/loading/background";
        String string3 = ".png";
        String[] stringArray = rrzM_2.id_class(string2, string3);
        HashMap<Integer, Integer[]> hashMap = new HashMap<Integer, Integer[]>();
        for (int i = 0; i < stringArray.length; ++i) {
            integerArray = stringArray[i];
            string = rrzX_2.id_byte((String)integerArray, string2, string3);
            int n = rrbb_3.id_class(string, Integer.MIN_VALUE);
            if (n == Integer.MIN_VALUE) {
                rrbt_3.id_class("Invalid dimension ID: " + string + ", path: " + (String)integerArray);
                continue;
            }
            hashMap.put(n, integerArray);
        }
        Set set = hashMap.keySet();
        integerArray = set.toArray(new Integer[set.size()]);
        Arrays.sort((Object[])integerArray);
        if (integerArray.length <= 0) {
            return new ImmutablePair((Object)null, (Object)0);
        }
        string = "optifine/gui/loading/loading.properties";
        Properties properties = rrzM_2.id_break(string, "CustomLoadingScreens");
        int n = integerArray[0];
        int n2 = integerArray[integerArray.length - 1];
        int n3 = n2 - n + 1;
        rrbT_2[] rrbT_2Array = new rrbT_2[n3];
        for (int i = 0; i < integerArray.length; ++i) {
            Integer n4 = integerArray[i];
            String string4 = (String)hashMap.get(n4);
            rrbT_2Array[n4.intValue() - n] = rrbT_2.id_class(string4, n4, properties);
        }
        return new ImmutablePair((Object)rrbT_2Array, (Object)n);
    }

    public static void id_class(String string) {
        rrbb_3.id_protected("CustomLoadingScreen: " + string);
    }

    public static rrbT_2 id_class() {
        if (id_class == null) {
            return null;
        }
        rqM_2<rYB> rqM_22 = ruZ_2.id_class;
        if (rqM_22 == null) {
            return null;
        }
        int n = rrzc_3.id_class(rqM_22);
        int n2 = n - id_break;
        rrbT_2 rrbT_22 = null;
        if (n2 >= 0 && n2 < id_class.length) {
            rrbT_22 = id_class[n2];
        }
        return rrbT_22;
    }

    public static void id_break(String string) {
        rrbb_3.id_byte("CustomLoadingScreen: " + string);
    }

    public static void id_break() {
        id_class = null;
        id_break = 0;
        Pair<rrbT_2[], Integer> pair = rrbt_3.id_byte();
        id_class = (rrbT_2[])pair.getLeft();
        id_break = (Integer)pair.getRight();
    }
}

