/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.util.Either
 *  it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.longs.LongCollection
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 */
package celestial;

import celestial.rfj_3;
import celestial.rrEx_1;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Either;
import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongCollection;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class rov_3<T> {
    public static final int id_class = rrEx_1.id_break + 2 + 32;
    private final List<Long2ObjectLinkedOpenHashMap<List<Optional<T>>>> id_break = IntStream.range(0, id_class).mapToObj(n -> new Long2ObjectLinkedOpenHashMap()).collect(Collectors.toList());
    private volatile int id_byte = id_class;
    private final String id_protected;
    private final LongSet id_throws = new LongOpenHashSet();
    private final int id_case;

    public rov_3(String string, int n2) {
        this.id_protected = string;
        this.id_case = n2;
    }

    public String toString() {
        return this.id_protected + " " + this.id_byte + "...";
    }

    protected void id_class(Optional<T> optional, long l2, int n) {
        ((List)this.id_break.get(n).computeIfAbsent(l2, l -> Lists.newArrayList())).add(optional);
        this.id_byte = Math.min(this.id_byte, n);
    }

    protected void id_class(int n, rfj_3 rfj_32, int n2) {
        if (n < id_class) {
            Long2ObjectLinkedOpenHashMap<List<Optional<T>>> long2ObjectLinkedOpenHashMap = this.id_break.get(n);
            List list = (List)long2ObjectLinkedOpenHashMap.remove(rfj_32.id_class());
            if (n == this.id_byte) {
                while (this.id_byte < id_class && this.id_break.get(this.id_byte).isEmpty()) {
                    ++this.id_byte;
                }
            }
            if (list != null && !list.isEmpty()) {
                ((List)this.id_break.get(n2).computeIfAbsent(rfj_32.id_class(), l -> Lists.newArrayList())).addAll(list);
                this.id_byte = Math.min(this.id_byte, n2);
            }
        }
    }

    private Runnable id_class(long l) {
        return () -> this.id_throws.add(l);
    }

    public Stream<Object> id_class() {
        if (this.id_throws.size() >= this.id_case) {
            return null;
        }
        if (this.id_byte >= id_class) {
            return null;
        }
        int n = this.id_byte;
        Long2ObjectLinkedOpenHashMap<List<Optional<T>>> long2ObjectLinkedOpenHashMap = this.id_break.get(n);
        long l = long2ObjectLinkedOpenHashMap.firstLongKey();
        List list = (List)long2ObjectLinkedOpenHashMap.removeFirst();
        while (this.id_byte < id_class && this.id_break.get(this.id_byte).isEmpty()) {
            ++this.id_byte;
        }
        return list.stream().map(optional -> optional.map(Either::left).orElseGet(() -> Either.right((Object)this.id_class(l))));
    }

    protected void id_class(long l, boolean bl) {
        for (Long2ObjectLinkedOpenHashMap<List<Optional<T>>> long2ObjectLinkedOpenHashMap : this.id_break) {
            List list = (List)long2ObjectLinkedOpenHashMap.get(l);
            if (list == null) continue;
            if (bl) {
                list.clear();
            } else {
                list.removeIf(optional -> !optional.isPresent());
            }
            if (!list.isEmpty()) continue;
            long2ObjectLinkedOpenHashMap.remove(l);
        }
        while (this.id_byte < id_class && this.id_break.get(this.id_byte).isEmpty()) {
            ++this.id_byte;
        }
        this.id_throws.remove(l);
    }

    public LongSet id_break() {
        return new LongOpenHashSet((LongCollection)this.id_throws);
    }
}

