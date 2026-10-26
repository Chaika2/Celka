/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial;

import celestial.module.combat.AutoSwap;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.util.MinecraftAccessor;
import java.util.Comparator;
import java.util.function.Predicate;
import org.apache.commons.lang3.tuple.Pair;

public interface rrCh_1
extends MinecraftAccessor {
    default public Comparator<Pair<rdn_3, Integer>> id_byte(AutoSwap autoSwap) {
        return null;
    }

    default public boolean id_class(AutoSwap autoSwap) {
        return false;
    }

    public rdb_3 id_class();

    public Predicate<rdn_3> id_break(AutoSwap var1);
}

