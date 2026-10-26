/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 */
package celestial;

import celestial.roH_2;
import celestial.rrsj_3;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public final class rrsp_3
extends rrsj_3<rrsp_3> {
    public rrsp_3(Long2ObjectOpenHashMap<roH_2> long2ObjectOpenHashMap) {
        super(long2ObjectOpenHashMap);
    }

    public rrsp_3 id_class() {
        return new rrsp_3((Long2ObjectOpenHashMap<roH_2>)this.id_class.clone());
    }

    @Override
    public /* synthetic */ rrsj_3 id_break() {
        return this.id_class();
    }
}

