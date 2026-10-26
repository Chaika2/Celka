/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.QY;
import celestial.Qw_1;
import celestial.cm_3;
import celestial.rgA_2;
import celestial.rgF_2;
import celestial.rgS_2;
import celestial.rgX_2;
import celestial.rgc_3;
import celestial.rpl_3;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class cf_3 {
    private static final rpl_3 id_class = rpl_3.id_class(32, rgc_3.id_class);

    private static String id_class(String string) {
        return ((Qw_1)QY.id_instanceof().id_class[20]).id_short ? string : rgF_2.id_class(string);
    }

    public static List<rpl_3> id_class(rgS_2 rgS_23, int n, cm_3 cm_32) {
        rgA_2 rgA_22 = new rgA_2();
        rgS_23.id_class((rgc_32, string) -> {
            rgA_22.id_class(rgS_2.id_class(cf_3.id_class(string), rgc_32));
            return Optional.empty();
        }, rgc_3.id_class);
        ArrayList arrayList = Lists.newArrayList();
        cm_32.id_break().id_class(rgA_22.id_break(), n, rgc_3.id_class, (rgS_22, bl) -> {
            rpl_3 rpl_32 = rgX_2.id_byte().id_class((rgS_2)rgS_22);
            arrayList.add(bl != false ? rpl_3.id_class(id_class, rpl_32) : rpl_32);
        });
        return arrayList.isEmpty() ? Lists.newArrayList((Object[])new rpl_3[]{rpl_3.id_class}) : arrayList;
    }
}

