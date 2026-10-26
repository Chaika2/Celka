/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 */
package celestial;

import celestial.roH_2;
import celestial.rrsj_3;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public final class rrsU_2
extends rrsj_3<rrsU_2> {
    public int id_break;
    public final Long2IntOpenHashMap id_byte;

    public rrsU_2(Long2ObjectOpenHashMap<roH_2> long2ObjectOpenHashMap, Long2IntOpenHashMap long2IntOpenHashMap, int n) {
        super(long2ObjectOpenHashMap);
        this.id_byte = long2IntOpenHashMap;
        long2IntOpenHashMap.defaultReturnValue(n);
        this.id_break = n;
    }

    public rrsU_2 id_class() {
        return new rrsU_2((Long2ObjectOpenHashMap<roH_2>)this.id_class.clone(), this.id_byte.clone(), this.id_break);
    }

    @Override
    public /* synthetic */ rrsj_3 id_break() {
        return this.id_class();
    }
}

