/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 */
package celestial;

import celestial.rgD_2;
import celestial.rgK_2;
import celestial.rgo_3;
import celestial.rqR_2;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class rgY_2 {
    private final Map<UUID, rgK_2> id_class = Maps.newHashMap();

    private int id_class(rgD_2 rgD_22, int n, int n2) {
        int n3 = n + n2;
        return n3 > rgD_22.max ? Math.max(rgD_22.max, n) : n3;
    }

    private static int id_class(int n, int n2) {
        return Math.max(n, n2);
    }

    public void id_class(Dynamic<?> dynamic) {
        dynamic.asStream().map(rgo_3::id_class).flatMap(dataResult -> rqR_2.id_class(dataResult.result())).forEach(rgo_32 -> this.id_class((UUID)rgo_32.id_class).id_class.put((Object)rgo_32.id_break, rgo_32.id_byte));
    }

    public void id_class(rgY_2 rgY_22, Random random, int n) {
        Collection<rgo_3> collection = rgY_22.id_class(random, n);
        collection.forEach(rgo_32 -> {
            int n = rgo_32.id_byte - rgo_32.id_break.decayPerTransfer;
            if (n >= 2) {
                this.id_class((UUID)rgo_32.id_class).id_class.mergeInt((Object)rgo_32.id_break, n, rgY_2::id_class);
            }
        });
    }

    private rgK_2 id_class(UUID uUID2) {
        return this.id_class.computeIfAbsent(uUID2, uUID -> new rgK_2());
    }

    private Collection<rgo_3> id_class(Random random, int n) {
        List list = this.id_break().collect(Collectors.toList());
        if (list.isEmpty()) {
            return Collections.emptyList();
        }
        int[] nArray = new int[list.size()];
        int n2 = 0;
        for (int i = 0; i < list.size(); ++i) {
            rgo_3 rgo_32 = (rgo_3)list.get(i);
            nArray[i] = (n2 += Math.abs(rgo_32.id_class())) - 1;
        }
        Set set = Sets.newIdentityHashSet();
        for (int i = 0; i < n; ++i) {
            int n3 = random.nextInt(n2);
            int n4 = Arrays.binarySearch(nArray, n3);
            set.add((rgo_3)list.get(n4 < 0 ? -n4 - 1 : n4));
        }
        return set;
    }

    public void id_class() {
        Iterator<rgK_2> iterator = this.id_class.values().iterator();
        while (iterator.hasNext()) {
            rgK_2 rgK_22 = iterator.next();
            rgK_22.id_class();
            if (!rgK_22.id_break()) continue;
            iterator.remove();
        }
    }

    public <T> Dynamic<T> id_class(DynamicOps<T> dynamicOps) {
        return new Dynamic(dynamicOps, dynamicOps.createList(this.id_break().map(rgo_32 -> rgo_32.id_class(dynamicOps)).map(Dynamic::getValue)));
    }

    public void id_class(UUID uUID, rgD_2 rgD_22, int n3) {
        rgK_2 rgK_22 = this.id_class(uUID);
        rgK_22.id_class.mergeInt((Object)rgD_22, n3, (n, n2) -> this.id_class(rgD_22, (int)n, (int)n2));
        rgK_22.id_class(rgD_22);
        if (rgK_22.id_break()) {
            this.id_class.remove(uUID);
        }
    }

    public int id_class(UUID uUID, Predicate<rgD_2> predicate) {
        rgK_2 rgK_22 = this.id_class.get(uUID);
        return rgK_22 != null ? rgK_22.id_class(predicate) : 0;
    }

    private Stream<rgo_3> id_break() {
        return this.id_class.entrySet().stream().flatMap(entry -> ((rgK_2)entry.getValue()).id_class((UUID)entry.getKey()));
    }
}

