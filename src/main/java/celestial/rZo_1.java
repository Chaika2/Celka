/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 */
package celestial;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class rZo_1 {
    public static final Int2ObjectMap<rZo_1> id_class = new Int2ObjectOpenHashMap();
    public final int id_break;

    public rZo_1(int n) {
        this.id_break = n;
        id_class.put(n, (Object)this);
    }
}

