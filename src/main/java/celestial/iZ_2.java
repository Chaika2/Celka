/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  org.apache.commons.lang3.mutable.MutableObject
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.iB_2;
import celestial.iC_2;
import celestial.iF_2;
import celestial.iL_2;
import celestial.il_3;
import celestial.in_3;
import celestial.iq_3;
import celestial.it_3;
import celestial.iv_3;
import celestial.rPZ;
import celestial.rPm_1;
import celestial.rYB;
import celestial.rrEm_1;
import celestial.rrP_2;
import celestial.rrr_3;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class iZ_2<E extends iB_2> {
    public static final Logger id_class = LogManager.getLogger();
    private final Supplier<Codec<iZ_2<E>>> id_break;
    private final Map<il_3<?>, Optional<? extends in_3<?>>> id_byte = Maps.newHashMap();
    private final Map<rrP_2<? extends rrr_3<? super E>>, rrr_3<? super E>> id_protected = Maps.newLinkedHashMap();
    private final Map<Integer, Map<iq_3, Set<rPm_1<? super E>>>> id_throws = Maps.newTreeMap();
    private it_3 id_case = it_3.id_class;
    private final Map<iq_3, Set<Pair<il_3<?>, iC_2>>> id_catch = Maps.newHashMap();
    private final Map<iq_3, Set<il_3<?>>> id_private = Maps.newHashMap();
    private Set<iq_3> id_implements = Sets.newHashSet();
    private final Set<iq_3> id_finally = Sets.newHashSet();
    private iq_3 id_extends = iq_3.id_break;
    private long id_native = -9999L;

    private void id_byte(rrEm_1 rrEm_12, E e) {
        for (rrr_3<E> rrr_32 : this.id_protected.values()) {
            rrr_32.id_break(rrEm_12, e);
        }
    }

    public <U> Optional<U> id_byte(il_3<U> il_32) {
        return this.id_byte.get(il_32).map(in_3::id_break);
    }

    public boolean id_byte(iq_3 iq_32) {
        return this.id_finally.contains(iq_32);
    }

    public void id_byte() {
        this.id_protected(this.id_extends);
    }

    public iZ_2(Collection<? extends il_3<?>> collection, Collection<? extends rrP_2<? extends rrr_3<? super E>>> collection2, ImmutableList<iL_2<?>> immutableList, Supplier<Codec<iZ_2<E>>> supplier) {
        this.id_break = supplier;
        for (il_3<?> il_32 : collection) {
            this.id_byte.put(il_32, Optional.empty());
        }
        for (rrP_2 rrP_22 : collection2) {
            this.id_protected.put(rrP_22, (rrr_3<E>)rrP_22.id_class());
        }
        for (rrr_3 rrr_32 : this.id_protected.values()) {
            for (il_3<?> il_33 : rrr_32.id_class()) {
                this.id_byte.put(il_33, Optional.empty());
            }
        }
        for (iL_2 iL_22 : immutableList) {
            iL_22.id_class(this);
        }
    }

    public void id_class(iq_3 iq_32, int n, ImmutableList<? extends rPm_1<? super E>> immutableList) {
        this.id_class(iq_32, this.id_class(n, immutableList));
    }

    public void id_class(iq_3 iq_32, int n, ImmutableList<? extends rPm_1<? super E>> immutableList, il_3<?> il_32) {
        ImmutableSet immutableSet = ImmutableSet.of((Object)Pair.of(il_32, (Object)((Object)iC_2.VALUE_PRESENT)));
        ImmutableSet immutableSet2 = ImmutableSet.of(il_32);
        this.id_class(iq_32, (ImmutableList<? extends Pair<Integer, ? extends rPm_1<? super E>>>)this.id_class(n, immutableList), (Set<Pair<il_3<?>, iC_2>>)immutableSet, (Set<il_3<?>>)immutableSet2);
    }

    public void id_class(iq_3 iq_32, ImmutableList<? extends Pair<Integer, ? extends rPm_1<? super E>>> immutableList) {
        this.id_class(iq_32, immutableList, (Set<Pair<il_3<?>, iC_2>>)ImmutableSet.of(), Sets.newHashSet());
    }

    public void id_class(iq_3 iq_32, ImmutableList<? extends Pair<Integer, ? extends rPm_1<? super E>>> immutableList, Set<Pair<il_3<?>, iC_2>> set) {
        this.id_class(iq_32, immutableList, set, Sets.newHashSet());
    }

    public void id_class(iq_3 iq_32) {
        if (this.id_case(iq_32)) {
            this.id_protected(iq_32);
        } else {
            this.id_byte();
        }
    }

    public void id_class(long l, long l2) {
        if (l2 - this.id_native > 20L) {
            this.id_native = l2;
            iq_3 iq_32 = this.id_class().id_class((int)(l % 24000L));
            if (!this.id_finally.contains(iq_32)) {
                this.id_class(iq_32);
            }
        }
    }

    public static <E extends iB_2> iF_2<E> id_class(Collection<? extends il_3<?>> collection, Collection<? extends rrP_2<? extends rrr_3<? super E>>> collection2) {
        return new iF_2(collection, collection2);
    }

    public void id_class(List<iq_3> list) {
        for (iq_3 iq_32 : list) {
            if (!this.id_case(iq_32)) continue;
            this.id_protected(iq_32);
            break;
        }
    }

    public void id_class(rrEm_1 rrEm_12, E e) {
        this.id_catch();
        this.id_byte(rrEm_12, e);
        this.id_protected(rrEm_12, e);
        this.id_throws(rrEm_12, e);
    }

    private boolean id_class(Object object) {
        return object instanceof Collection && ((Collection)object).isEmpty();
    }

    public ImmutableList<? extends Pair<Integer, ? extends rPm_1<? super E>>> id_class(int n, ImmutableList<? extends rPm_1<? super E>> immutableList) {
        int n2 = n;
        ImmutableList.Builder builder = ImmutableList.builder();
        for (rPm_1 rPm_12 : immutableList) {
            builder.add((Object)Pair.of((Object)n2++, (Object)rPm_12));
        }
        return builder.build();
    }

    private void id_class(iq_3 iq_33, ImmutableList<? extends Pair<Integer, ? extends rPm_1<? super E>>> immutableList, Set<Pair<il_3<?>, iC_2>> set, Set<il_3<?>> set2) {
        this.id_catch.put(iq_33, set);
        if (!set2.isEmpty()) {
            this.id_private.put(iq_33, set2);
        }
        for (Pair pair : immutableList) {
            this.id_throws.computeIfAbsent((Integer)pair.getFirst(), n -> Maps.newHashMap()).computeIfAbsent(iq_33, iq_32 -> Sets.newLinkedHashSet()).add((rPm_1)pair.getSecond());
        }
    }

    public void id_class(Set<iq_3> set) {
        this.id_implements = set;
    }

    public void id_class(it_3 it_32) {
        this.id_case = it_32;
    }

    public it_3 id_class() {
        return this.id_case;
    }

    public boolean id_class(il_3<?> il_32, iC_2 iC_22) {
        Optional<in_3<?>> optional = this.id_byte.get(il_32);
        if (optional == null) {
            return false;
        }
        return iC_22 == iC_2.REGISTERED || iC_22 == iC_2.VALUE_PRESENT && optional.isPresent() || iC_22 == iC_2.VALUE_ABSENT && !optional.isPresent();
    }

    public <U> void id_class(il_3<U> il_32, Optional<? extends U> optional) {
        this.id_break(il_32, optional.map(in_3::id_class));
    }

    public <U> void id_class(il_3<U> il_32, U u, long l) {
        this.id_break(il_32, Optional.of(in_3.id_class(u, l)));
    }

    public <T> DataResult<T> id_class(DynamicOps<T> dynamicOps) {
        return this.id_break.get().encodeStart(dynamicOps, (Object)this);
    }

    public boolean id_class(il_3<?> il_32) {
        return this.id_class(il_32, iC_2.VALUE_PRESENT);
    }

    public <U> void id_class(il_3<U> il_32, U u) {
        this.id_class(il_32, (U)Optional.ofNullable(u));
    }

    public <U> void id_break(il_3<U> il_32) {
        this.id_class(il_32, (U)Optional.empty());
    }

    public static <E extends iB_2> Codec<iZ_2<E>> id_break(Collection<? extends il_3<?>> collection, Collection<? extends rrP_2<? extends rrr_3<? super E>>> collection2) {
        MutableObject mutableObject = new MutableObject();
        mutableObject.setValue((Object)new iv_3(collection, collection2, mutableObject).fieldOf("memories").codec());
        return (Codec)mutableObject.getValue();
    }

    public void id_break(rrEm_1 rrEm_12, E e) {
        long l = ((rYB)((iB_2)e).id_throws[7]).r();
        for (rPm_1<E> rPm_12 : this.id_break()) {
            rPm_12.id_catch(rrEm_12, e, l);
        }
    }

    @Deprecated
    public List<rPm_1<? super E>> id_break() {
        ObjectArrayList objectArrayList = new ObjectArrayList();
        for (Map<iq_3, Set<rPm_1<E>>> map : this.id_throws.values()) {
            for (Set<rPm_1<E>> set : map.values()) {
                for (rPm_1<E> rPm_12 : set) {
                    if (rPm_12.id_class() != rPZ.RUNNING) continue;
                    objectArrayList.add(rPm_12);
                }
            }
        }
        return objectArrayList;
    }

    public <U> boolean id_break(il_3<U> il_32, U u) {
        return !this.id_class(il_32) ? false : this.id_byte(il_32).filter(object2 -> object2.equals(u)).isPresent();
    }

    public void id_break(iq_3 iq_32) {
        this.id_extends = iq_32;
    }

    public <U> void id_break(il_3<U> il_32, Optional<? extends in_3<?>> optional) {
        if (this.id_byte.containsKey(il_32)) {
            if (optional.isPresent() && this.id_class(optional.get().id_break())) {
                this.id_break(il_32);
            } else {
                this.id_byte.put(il_32, optional);
            }
        }
    }

    public iZ_2<E> id_throws() {
        iZ_2<E> iZ_22 = new iZ_2<E>(this.id_byte.keySet(), this.id_protected.keySet(), ImmutableList.of(), this.id_break);
        for (Map.Entry<il_3<?>, Optional<in_3<?>>> entry : this.id_byte.entrySet()) {
            il_3<?> il_32 = entry.getKey();
            if (!entry.getValue().isPresent()) continue;
            iZ_22.id_byte.put(il_32, entry.getValue());
        }
        return iZ_22;
    }

    private void id_throws(iq_3 iq_32) {
        for (iq_3 iq_33 : this.id_finally) {
            Set<il_3<?>> set;
            if (iq_33 == iq_32 || (set = this.id_private.get(iq_33)) == null) continue;
            for (il_3<?> il_32 : set) {
                this.id_break(il_32);
            }
        }
    }

    private void id_throws(rrEm_1 rrEm_12, E e) {
        long l = rrEm_12.r();
        for (rPm_1<E> rPm_12 : this.id_break()) {
            rPm_12.id_case(rrEm_12, e, l);
        }
    }

    private void id_catch() {
        for (Map.Entry<il_3<?>, Optional<in_3<?>>> entry : this.id_byte.entrySet()) {
            if (!entry.getValue().isPresent()) continue;
            in_3<?> in_32 = entry.getValue().get();
            in_32.id_class();
            if (!in_32.id_byte()) continue;
            this.id_break(entry.getKey());
        }
    }

    public Stream<iL_2<?>> id_case() {
        return this.id_byte.entrySet().stream().map(entry -> iL_2.id_class((il_3)entry.getKey(), (Optional)entry.getValue()));
    }

    private boolean id_case(iq_3 iq_32) {
        if (!this.id_catch.containsKey(iq_32)) {
            return false;
        }
        for (Pair<il_3<?>, iC_2> pair : this.id_catch.get(iq_32)) {
            iC_2 iC_22;
            il_3 il_32 = (il_3)pair.getFirst();
            if (this.id_class(il_32, iC_22 = (iC_2)((Object)pair.getSecond()))) continue;
            return false;
        }
        return true;
    }

    private void id_protected(iq_3 iq_32) {
        if (!this.id_byte(iq_32)) {
            this.id_throws(iq_32);
            this.id_finally.clear();
            this.id_finally.addAll(this.id_implements);
            this.id_finally.add(iq_32);
        }
    }

    public Optional<iq_3> id_protected() {
        for (iq_3 iq_32 : this.id_finally) {
            if (this.id_implements.contains(iq_32)) continue;
            return Optional.of(iq_32);
        }
        return Optional.empty();
    }

    private void id_protected(rrEm_1 rrEm_12, E e) {
        long l = rrEm_12.r();
        for (Map<iq_3, Set<rPm_1<E>>> map : this.id_throws.values()) {
            for (Map.Entry<iq_3, Set<rPm_1<E>>> entry : map.entrySet()) {
                iq_3 iq_32 = entry.getKey();
                if (!this.id_finally.contains(iq_32)) continue;
                for (rPm_1<E> rPm_12 : entry.getValue()) {
                    if (rPm_12.id_class() != rPZ.STOPPED) continue;
                    rPm_12.id_throws(rrEm_12, e, l);
                }
            }
        }
    }
}

