/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.aH_2;
import celestial.aI_2;
import celestial.rYI;
import celestial.rYf_1;
import celestial.rYt_1;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class rYw_1 {
    private final Map<aH_2, List<rYf_1>> id_class = (Map)Stream.of(aH_2.values()).collect(ImmutableMap.toImmutableMap(aH_22 -> aH_22, aH_22 -> Lists.newArrayList()));
    private final Map<aI_2<?>, rYI> id_break = Maps.newLinkedHashMap();
    private float id_byte = 0.1f;
    private boolean id_protected;

    public rYw_1 id_class() {
        this.id_protected = true;
        return this;
    }

    public rYw_1 id_class(aH_2 aH_22, rYf_1 rYf_12) {
        this.id_class.get(aH_22).add(rYf_12);
        return this;
    }

    public rYw_1 id_class(aI_2<?> aI_22, double d, double d2) {
        this.id_break.put(aI_22, new rYI(d2, d));
        return this;
    }

    public rYw_1 id_class(float f) {
        this.id_byte = f;
        return this;
    }

    public rYt_1 id_break() {
        return new rYt_1(this.id_byte, (Map)this.id_class.entrySet().stream().collect(ImmutableMap.toImmutableMap(Map.Entry::getKey, entry -> ImmutableList.copyOf((Collection)((Collection)entry.getValue())))), (Map<aI_2<?>, rYI>)ImmutableMap.copyOf(this.id_break), this.id_protected);
    }
}

