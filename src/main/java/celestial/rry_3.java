/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.datafixers.util.Pair
 */
package celestial;

import celestial.iB_2;
import celestial.iC_2;
import celestial.il_3;
import celestial.rPm_1;
import celestial.rra_3;
import celestial.rre_3;
import celestial.rri_3;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class rry_3<E extends iB_2>
extends rre_3<E> {
    public rry_3(List<Pair<rPm_1<? super E>, Integer>> list) {
        this((Map<il_3<?>, iC_2>)ImmutableMap.of(), list);
    }

    public rry_3(Map<il_3<?>, iC_2> map, List<Pair<rPm_1<? super E>, Integer>> list) {
        super(map, (Set<il_3<?>>)ImmutableSet.of(), rra_3.SHUFFLED, rri_3.RUN_ONE, list);
    }
}

