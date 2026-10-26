/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.rcZ_2;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public interface YO {
    public int id_class(rcZ_2 var1);

    default public List<rcZ_2> id_class(List<rcZ_2> list) {
        return this.id_class(list, this::id_class);
    }

    default public List<rcZ_2> id_class(List<rcZ_2> list2, Supplier<rcZ_2> supplier) {
        return this.id_class(list2, (rcZ_2 rcZ_22, List<rcZ_2> list) -> this.id_class((rcZ_2)rcZ_22, supplier, (List<rcZ_2>)list));
    }

    default public List<rcZ_2> id_class(List<rcZ_2> list, BiConsumer<rcZ_2, List<rcZ_2>> biConsumer) {
        ArrayList arrayList = Lists.newArrayList();
        for (rcZ_2 rcZ_22 : list) {
            biConsumer.accept(rcZ_22, arrayList);
        }
        return arrayList;
    }

    public void id_class(rcZ_2 var1, List<rcZ_2> var2);

    public void id_class(rcZ_2 var1, Supplier<rcZ_2> var2, List<rcZ_2> var3);

    public rcZ_2 id_class();

    public int id_class(rcZ_2 var1, Supplier<rcZ_2> var2);
}

