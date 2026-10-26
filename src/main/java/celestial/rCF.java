/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableSortedMap
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.UnmodifiableIterator
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.Decoder
 *  com.mojang.serialization.Encoder
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.MapDecoder
 *  com.mojang.serialization.MapEncoder
 */
package celestial;

import celestial.rCA;
import celestial.rCZ;
import celestial.rCn_1;
import celestial.rCv_1;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Decoder;
import com.mojang.serialization.Encoder;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.MapDecoder;
import com.mojang.serialization.MapEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class rCF<O, S extends rCn_1<O, S>> {
    public static final Pattern id_class = Pattern.compile("^[a-z0-9_]+$");
    private final O id_break;
    private final ImmutableSortedMap<String, rCZ<?>> id_byte;
    private final ImmutableList<S> id_protected;

    public O id_byte() {
        return this.id_break;
    }

    protected rCF(Function<O, S> function, O o, rCA<O, S> rCA2, Map<String, rCZ<?>> map) {
        Object object2;
        this.id_break = o;
        this.id_byte = ImmutableSortedMap.copyOf(map);
        Supplier<rCn_1> supplier = () -> (rCn_1)function.apply(o);
        MapCodec<rCn_1> mapCodec = MapCodec.of((MapEncoder)Encoder.empty(), (MapDecoder)Decoder.unit(supplier));
        for (Object object2 : this.id_byte.entrySet()) {
            mapCodec = rCF.id_class(mapCodec, supplier, (String)object2.getKey(), (rCZ)object2.getValue());
        }
        UnmodifiableIterator unmodifiableIterator = mapCodec;
        object2 = Maps.newLinkedHashMap();
        ArrayList arrayList = Lists.newArrayList();
        Stream<List<List<Object>>> stream = Stream.of(Collections.emptyList());
        for (Object object3 : this.id_byte.values()) {
            stream = stream.flatMap(arg_0 -> rCF.id_class((rCZ)object3, arg_0));
        }
        stream.forEach(arg_0 -> rCF.id_class(rCA2, o, (MapCodec)unmodifiableIterator, (Map)object2, arrayList, arg_0));
        for (Object object3 : arrayList) {
            ((rCn_1)object3).id_class(object2);
        }
        this.id_protected = ImmutableList.copyOf((Collection)arrayList);
    }

    public String toString() {
        return MoreObjects.toStringHelper((Object)this).add("block", this.id_break).add("properties", this.id_byte.values().stream().map(rCZ::id_throws).collect(Collectors.toList())).toString();
    }

    private static /* synthetic */ void id_class(rCA rCA2, Object object, MapCodec mapCodec, Map map, List list, List list2) {
        ImmutableMap immutableMap = (ImmutableMap)list2.stream().collect(ImmutableMap.toImmutableMap(Pair::getFirst, Pair::getSecond));
        rCn_1 rCn_12 = (rCn_1)rCA2.create(object, immutableMap, mapCodec);
        map.put(immutableMap, rCn_12);
        list.add(rCn_12);
    }

    private static /* synthetic */ Stream id_class(rCZ rCZ2, List list) {
        return rCZ2.id_class().stream().map(comparable -> {
            ArrayList arrayList = Lists.newArrayList((Iterable)list);
            arrayList.add(Pair.of((Object)rCZ2, (Object)comparable));
            return arrayList;
        });
    }

    public ImmutableList<S> id_class() {
        return this.id_protected;
    }

    private static <S extends rCn_1<?, S>, T extends Comparable<T>> MapCodec<S> id_class(MapCodec<S> mapCodec, Supplier<S> supplier, String string, rCZ<T> rCZ2) {
        return Codec.mapPair(mapCodec, (MapCodec)rCZ2.id_protected().fieldOf(string).setPartial(() -> rCZ2.id_class((rCn_1)supplier.get()))).xmap(pair -> (rCn_1)((rCn_1)pair.getFirst()).id_class(rCZ2, ((rCv_1)pair.getSecond()).id_break()), rCn_12 -> Pair.of((Object)rCn_12, rCZ2.id_class((rCn_1<?, ?>)rCn_12)));
    }

    public rCZ<?> id_class(String string) {
        return (rCZ)this.id_byte.get((Object)string);
    }

    public S id_break() {
        return (S)((rCn_1)this.id_protected.get(0));
    }

    public Collection<rCZ<?>> id_protected() {
        return this.id_byte.values();
    }
}

