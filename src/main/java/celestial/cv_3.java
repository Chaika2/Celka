/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package celestial;

import celestial.Ml_1;
import celestial.cA_2;
import celestial.cF_2;
import celestial.cL_2;
import celestial.cm_3;
import celestial.rgP_2;
import celestial.rgS_2;
import celestial.rpl_3;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.List;

public interface cv_3 {
    public static final cv_3 id_class = new cF_2();

    public int id_byte(Ml_1 var1, int var2, int var3, int var4, int var5);

    public static cv_3 id_class(cm_3 cm_32, rgS_2 rgS_22, int n) {
        return cv_3.id_class(cm_32, (List)cm_32.id_break(rgS_22, n).stream().map(rpl_32 -> new cA_2((rpl_3)rpl_32, cm_32.id_class((rpl_3)rpl_32))).collect(ImmutableList.toImmutableList()));
    }

    public int id_class();

    public static cv_3 id_class(cm_3 cm_32, rgS_2 rgS_22, int n, int n2) {
        return cv_3.id_class(cm_32, (List)cm_32.id_break(rgS_22, n).stream().limit(n2).map(rpl_32 -> new cA_2((rpl_3)rpl_32, cm_32.id_class((rpl_3)rpl_32))).collect(ImmutableList.toImmutableList()));
    }

    public static cv_3 id_class(cm_3 cm_32, rgP_2 ... rgP_2Array) {
        return cv_3.id_class(cm_32, (List)Arrays.stream(rgP_2Array).map(rgP_2::id_catch).map(rpl_32 -> new cA_2((rpl_3)rpl_32, cm_32.id_class((rpl_3)rpl_32))).collect(ImmutableList.toImmutableList()));
    }

    public static cv_3 id_class(cm_3 cm_32, List<cA_2> list) {
        return list.isEmpty() ? id_class : new cL_2(list, cm_32);
    }

    public int id_class(Ml_1 var1, int var2, int var3, int var4, int var5);

    public int id_class(Ml_1 var1, int var2, int var3);

    public int id_break(Ml_1 var1, int var2, int var3, int var4, int var5);
}

