/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.jC_2;
import celestial.jV_2;
import celestial.jj_3;
import celestial.rAL;
import celestial.rgX_2;
import celestial.rrbb_3;
import com.google.common.collect.Lists;
import java.util.IllegalFormatException;

public class jI_2 {
    private static volatile rgX_2 id_class = rgX_2.id_byte();

    public static String id_class(rgX_2 rgX_22, String string, Object ... objectArray) {
        String string2 = rgX_22.id_class(string);
        try {
            return String.format(string2, objectArray);
        }
        catch (IllegalFormatException illegalFormatException) {
            return "Format error: " + string2;
        }
    }

    public static boolean id_class(String string) {
        return id_class.id_break(string);
    }

    public static String id_class(String string, String string2, Object ... objectArray) {
        rAL rAL2 = rrbb_3.x();
        jj_3 jj_32 = jV_2.id_class(rAL2.id_break()).getOrDefault(string, jV_2.id_class);
        jC_2 jC_22 = jC_2.id_class(rAL2, Lists.newArrayList((Object[])new jj_3[]{jj_32}));
        return jI_2.id_class(jC_22, string2, objectArray);
    }

    public static void id_class(rgX_2 rgX_22) {
        id_class = rgX_22;
    }

    public static String id_class(String string, Object ... objectArray) {
        return jI_2.id_class(id_class, string, objectArray);
    }
}

