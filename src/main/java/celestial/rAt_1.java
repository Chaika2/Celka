/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Functions
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.rAC;
import celestial.rAm_1;
import celestial.rAp_1;
import celestial.rAq_1;
import com.google.common.base.Functions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class rAt_1
implements AutoCloseable {
    private final Set<rAm_1> id_class;
    private Map<String, rAp_1> id_break = ImmutableMap.of();
    private List<rAp_1> id_byte = ImmutableList.of();
    private final rAq_1 id_protected;

    public Collection<rAp_1> id_byte() {
        return this.id_break.values();
    }

    private Stream<rAp_1> id_byte(Collection<String> collection) {
        return collection.stream().map(this.id_break::get).filter(Objects::nonNull);
    }

    public rAt_1(rAq_1 rAq_12, rAm_1 ... rAm_1Array) {
        this.id_protected = rAq_12;
        this.id_class = ImmutableSet.copyOf((Object[])rAm_1Array);
    }

    public rAt_1(rAm_1 ... rAm_1Array) {
        this(rAp_1::new, rAm_1Array);
    }

    public void id_class() {
        List list = (List)this.id_byte.stream().map(rAp_1::id_throws).collect(ImmutableList.toImmutableList());
        this.close();
        this.id_break = this.id_catch();
        this.id_byte = this.id_break(list);
    }

    public rAp_1 id_class(String string) {
        return this.id_break.get(string);
    }

    public void id_class(Collection<String> collection) {
        this.id_byte = this.id_break(collection);
    }

    @Override
    public void close() {
        this.id_break.values().forEach(rAp_1::close);
    }

    public Collection<String> id_break() {
        return this.id_break.keySet();
    }

    public boolean id_break(String string) {
        return this.id_break.containsKey(string);
    }

    private List<rAp_1> id_break(Collection<String> collection) {
        List list = this.id_byte(collection).collect(Collectors.toList());
        for (rAp_1 rAp_12 : this.id_break.values()) {
            if (!rAp_12.id_case() || list.contains(rAp_12)) continue;
            rAp_12.id_private().id_class(list, rAp_12, Functions.identity(), false);
        }
        return ImmutableList.copyOf(list);
    }

    public Collection<rAp_1> id_throws() {
        return this.id_byte;
    }

    private Map<String, rAp_1> id_catch() {
        TreeMap treeMap = Maps.newTreeMap();
        for (rAm_1 rAm_12 : this.id_class) {
            rAm_12.id_class(rAp_12 -> {
                rAp_1 rAp_13 = treeMap.put(rAp_12.id_throws(), rAp_12);
            }, this.id_protected);
        }
        return ImmutableMap.copyOf((Map)treeMap);
    }

    public List<rAC> id_case() {
        return (List)this.id_byte.stream().map(rAp_1::id_protected).collect(ImmutableList.toImmutableList());
    }

    public Collection<String> id_protected() {
        return (Collection)this.id_byte.stream().map(rAp_1::id_throws).collect(ImmutableSet.toImmutableSet());
    }
}

