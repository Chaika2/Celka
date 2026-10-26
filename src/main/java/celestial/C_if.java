/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.ints.Int2ObjectAVLTreeMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectSortedMap
 */
package celestial;

import celestial.iT_2;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.Int2ObjectAVLTreeMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectSortedMap;
import java.util.Collection;
import java.util.List;

public class C_if {
    private final List<iT_2> id_class = Lists.newArrayList();
    private int id_break;

    private static /* synthetic */ void id_class(Int2ObjectSortedMap int2ObjectSortedMap, iT_2 iT_22) {
        iT_2 iT_23 = (iT_2)int2ObjectSortedMap.put(iT_22.id_class(), (Object)iT_22);
    }

    public float id_class(int n) {
        iT_2 iT_22;
        if (this.id_class.size() <= 0) {
            return 0.0f;
        }
        iT_2 iT_23 = this.id_class.get(this.id_break);
        iT_2 iT_24 = this.id_class.get(this.id_class.size() - 1);
        boolean bl = n < iT_23.id_class();
        int n2 = bl ? 0 : this.id_break;
        float f = bl ? iT_24.id_break() : iT_23.id_break();
        int n3 = n2;
        while (n3 < this.id_class.size() && (iT_22 = this.id_class.get(n3)).id_class() <= n) {
            this.id_break = n3++;
            f = iT_22.id_break();
        }
        return f;
    }

    private void id_class() {
        Int2ObjectAVLTreeMap int2ObjectAVLTreeMap = new Int2ObjectAVLTreeMap();
        this.id_class.forEach(arg_0 -> C_if.id_class((Int2ObjectSortedMap)int2ObjectAVLTreeMap, arg_0));
        this.id_class.clear();
        this.id_class.addAll((Collection<iT_2>)int2ObjectAVLTreeMap.values());
        this.id_break = 0;
    }

    public C_if id_class(int n, float f) {
        this.id_class.add(new iT_2(n, f));
        this.id_class();
        return this;
    }
}

