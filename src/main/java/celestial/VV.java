/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.ints.Int2IntFunction
 */
package celestial;

import celestial.rgL_2;
import celestial.rgS_2;
import celestial.rgc_3;
import celestial.rpl_3;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class VV {
    private final String id_class;
    private final List<rgc_3> id_break;
    private final Int2IntFunction id_byte;

    private VV(String string, List<rgc_3> list, Int2IntFunction int2IntFunction) {
        this.id_class = string;
        this.id_break = ImmutableList.copyOf(list);
        this.id_byte = int2IntFunction;
    }

    public static VV id_class(rgS_2 rgS_22, Int2IntFunction int2IntFunction, UnaryOperator<String> unaryOperator) {
        StringBuilder stringBuilder = new StringBuilder();
        ArrayList arrayList = Lists.newArrayList();
        rgS_22.id_class((rgc_33, string) -> {
            rgL_2.id_byte(string, rgc_33, (n, rgc_32, n2) -> {
                stringBuilder.appendCodePoint(n2);
                int n3 = Character.charCount(n2);
                for (int i = 0; i < n3; ++i) {
                    arrayList.add(rgc_32);
                }
                return true;
            });
            return Optional.empty();
        }, rgc_3.id_class);
        return new VV((String)unaryOperator.apply(stringBuilder.toString()), arrayList, int2IntFunction);
    }

    public List<rpl_3> id_class(int n, int n2, boolean bl) {
        if (n2 == 0) {
            return ImmutableList.of();
        }
        ArrayList arrayList = Lists.newArrayList();
        rgc_3 rgc_32 = this.id_break.get(n);
        int n3 = n;
        for (int i = 1; i < n2; ++i) {
            int n4 = n + i;
            rgc_3 rgc_33 = this.id_break.get(n4);
            if (rgc_33.equals(rgc_32)) continue;
            String string = this.id_class.substring(n3, n4);
            arrayList.add(bl ? rpl_3.id_class(string, rgc_32, this.id_byte) : rpl_3.id_class(string, rgc_32));
            rgc_32 = rgc_33;
            n3 = n4;
        }
        if (n3 < n + n2) {
            String string = this.id_class.substring(n3, n + n2);
            arrayList.add(bl ? rpl_3.id_class(string, rgc_32, this.id_byte) : rpl_3.id_class(string, rgc_32));
        }
        return bl ? Lists.reverse((List)arrayList) : arrayList;
    }

    public String id_class() {
        return this.id_class;
    }
}

