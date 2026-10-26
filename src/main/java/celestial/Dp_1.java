/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.mojang.datafixers.util.Pair
 */
package celestial;

import celestial.DS;
import celestial.Dd_1;
import celestial.Dt_1;
import celestial.Uz_1;
import celestial.rCZ;
import celestial.rqR_2;
import celestial.xd_3;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Stream;

public class Dp_1
implements Dt_1 {
    private final xd_3 id_class;
    private final List<DS> id_break;
    private final Set<rCZ<?>> id_byte = Sets.newHashSet();
    private final List<Dd_1> id_protected = Lists.newArrayList();

    private Dp_1(xd_3 xd_32, List<DS> list) {
        this.id_class = xd_32;
        this.id_break = list;
    }

    @Override
    public /* synthetic */ Object get() {
        return this.id_break();
    }

    public Dp_1 id_class(Dd_1 dd_1) {
        dd_1.id_break().forEach(rCZ2 -> {
            if (this.id_class.id_new().id_class(rCZ2.id_throws()) != rCZ2) {
                throw new IllegalStateException("Property " + rCZ2 + " is not defined for block " + this.id_class);
            }
            if (!this.id_byte.add((rCZ<?>)rCZ2)) {
                throw new IllegalStateException("Values of property " + rCZ2 + " already defined for block " + this.id_class);
            }
        });
        this.id_protected.add(dd_1);
        return this;
    }

    private static List<DS> id_class(List<DS> list, List<DS> list2) {
        ImmutableList.Builder builder = ImmutableList.builder();
        list.forEach(dS -> list2.forEach(dS2 -> builder.add((Object)DS.id_class(dS, dS2))));
        return builder.build();
    }

    @Override
    public xd_3 id_class() {
        return this.id_class;
    }

    public static Dp_1 id_class(xd_3 xd_32, DS ... dSArray) {
        return new Dp_1(xd_32, (List<DS>)ImmutableList.copyOf((Object[])dSArray));
    }

    public static Dp_1 id_class(xd_3 xd_32, DS dS) {
        return new Dp_1(xd_32, (List<DS>)ImmutableList.of((Object)dS));
    }

    public static Dp_1 id_class(xd_3 xd_32) {
        return new Dp_1(xd_32, (List<DS>)ImmutableList.of((Object)DS.id_class()));
    }

    public JsonElement id_break() {
        Dd_1 dd_12;
        Stream<Object> stream = Stream.of(Pair.of((Object)Uz_1.id_class(), this.id_break));
        for (Dd_1 dd_12 : this.id_protected) {
            Map<Uz_1, List<DS>> map = dd_12.id_class();
            stream = stream.flatMap(pair -> map.entrySet().stream().map(entry -> {
                Uz_1 uz_1 = ((Uz_1)pair.getFirst()).id_class((Uz_1)entry.getKey());
                List<DS> list = Dp_1.id_class((List)pair.getSecond(), (List)entry.getValue());
                return Pair.of((Object)uz_1, list);
            }));
        }
        TreeMap treeMap = new TreeMap();
        stream.forEach(pair -> {
            JsonElement jsonElement = treeMap.put(((Uz_1)pair.getFirst()).id_break(), DS.id_class((List)pair.getSecond()));
        });
        dd_12 = new JsonObject();
        dd_12.add("variants", (JsonElement)rqR_2.id_class(new JsonObject(), (T jsonObject) -> treeMap.forEach((arg_0, arg_1) -> ((JsonObject)jsonObject).add(arg_0, arg_1))));
        return dd_12;
    }
}

