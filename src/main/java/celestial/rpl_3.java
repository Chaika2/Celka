/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  it.unimi.dsi.fastutil.ints.Int2IntFunction
 */
package celestial;

import celestial.rgL_2;
import celestial.rgc_3;
import celestial.rpv_3;
import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.List;

@FunctionalInterface
public interface rpl_3 {
    public static final rpl_3 id_class = rpv_32 -> true;

    public static rpl_3 id_class(int n, rgc_3 rgc_32) {
        return rpv_32 -> rpv_32.accept(0, rgc_32, n);
    }

    public static rpl_3 id_class(String string, rgc_3 rgc_32) {
        return string.isEmpty() ? id_class : rpv_32 -> rgL_2.id_class(string, rgc_32, rpv_32);
    }

    public static rpl_3 id_class(String string, rgc_3 rgc_32, Int2IntFunction int2IntFunction) {
        return string.isEmpty() ? id_class : rpv_32 -> rgL_2.id_break(string, rgc_32, rpl_3.id_class(rpv_32, int2IntFunction));
    }

    public static rpv_3 id_class(rpv_3 rpv_32, Int2IntFunction int2IntFunction) {
        return (n, rgc_32, n2) -> rpv_32.accept(n, rgc_32, (Integer)int2IntFunction.apply((Object)n2));
    }

    public static rpl_3 id_class(rpl_3 rpl_32, rpl_3 rpl_33) {
        return rpl_3.id_break(rpl_32, rpl_33);
    }

    public static rpl_3 id_class(List<rpl_3> list) {
        int n = list.size();
        switch (n) {
            case 0: {
                return id_class;
            }
            case 1: {
                return list.get(0);
            }
            case 2: {
                return rpl_3.id_break(list.get(0), list.get(1));
            }
        }
        return rpl_3.id_break((List<rpl_3>)ImmutableList.copyOf(list));
    }

    public boolean accept(rpv_3 var1);

    public static rpl_3 id_break(rpl_3 rpl_32, rpl_3 rpl_33) {
        return rpv_32 -> rpl_32.accept(rpv_32) && rpl_33.accept(rpv_32);
    }

    public static rpl_3 id_break(List<rpl_3> list) {
        return rpv_32 -> {
            for (rpl_3 rpl_32 : list) {
                if (rpl_32.accept(rpv_32)) continue;
                return false;
            }
            return true;
        };
    }
}

