/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 */
package celestial;

import celestial.rgD_2;
import celestial.rgo_3;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class rgK_2 {
    public final Object2IntMap<rgD_2> id_class = new Object2IntOpenHashMap();

    public void id_class(rgD_2 rgD_22) {
        int n = this.id_class.getInt((Object)rgD_22);
        if (n > rgD_22.max) {
            this.id_class.put((Object)rgD_22, rgD_22.max);
        }
        if (n < 2) {
            this.id_break(rgD_22);
        }
    }

    public Stream<rgo_3> id_class(UUID uUID) {
        return this.id_class.object2IntEntrySet().stream().map(entry -> new rgo_3(uUID, (rgD_2)((Object)((Object)entry.getKey())), entry.getIntValue()));
    }

    public int id_class(Predicate<rgD_2> predicate) {
        return this.id_class.object2IntEntrySet().stream().filter(entry -> predicate.test((rgD_2)((Object)((Object)entry.getKey())))).mapToInt(entry -> entry.getIntValue() * ((rgD_2)((Object)((Object)entry.getKey()))).weight).sum();
    }

    public void id_class() {
        ObjectIterator objectIterator = this.id_class.object2IntEntrySet().iterator();
        while (objectIterator.hasNext()) {
            Object2IntMap.Entry entry = (Object2IntMap.Entry)objectIterator.next();
            int n = entry.getIntValue() - ((rgD_2)((Object)entry.getKey())).decayPerDay;
            if (n < 2) {
                objectIterator.remove();
                continue;
            }
            entry.setValue(n);
        }
    }

    public void id_break(rgD_2 rgD_22) {
        this.id_class.removeInt((Object)rgD_22);
    }

    public boolean id_break() {
        return this.id_class.isEmpty();
    }
}

