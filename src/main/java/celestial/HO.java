/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.Oh_1;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class HO {
    private final List<Pattern> id_class;
    private final List<Pattern> id_break;
    private final List<Pattern> id_byte;

    public HO(List<Pattern> list, List<Pattern> list2, List<Pattern> list3) {
        this.id_class = list;
        this.id_break = list2;
        this.id_byte = list3;
    }

    private static String id_class(List<Pattern> list, String string) {
        ArrayList arrayList = Lists.newArrayList();
        for (Pattern pattern : list) {
            Matcher matcher = pattern.matcher(string);
            while (matcher.find()) {
                arrayList.add(matcher.group());
            }
        }
        return String.join((CharSequence)", ", arrayList);
    }

    public ImmutableMap<String, String> id_class() {
        String string;
        String string2;
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        String string3 = HO.id_class(this.id_class, Oh_1.id_byte());
        if (!string3.isEmpty()) {
            builder.put((Object)"renderer", (Object)string3);
        }
        if (!(string2 = HO.id_class(this.id_break, Oh_1.id_protected())).isEmpty()) {
            builder.put((Object)"version", (Object)string2);
        }
        if (!(string = HO.id_class(this.id_byte, Oh_1.id_class())).isEmpty()) {
            builder.put((Object)"vendor", (Object)string);
        }
        return builder.build();
    }
}

