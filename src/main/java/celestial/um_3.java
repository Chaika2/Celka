/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.IntSet
 *  it.unimi.dsi.fastutil.ints.IntSets
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.fN_2;
import celestial.uJ_2;
import celestial.uc_3;
import celestial.uv_3;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.IntSet;
import it.unimi.dsi.fastutil.ints.IntSets;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class um_3
implements uc_3 {
    public static final Logger id_class = LogManager.getLogger();
    private final fN_2 id_break;
    private final Int2ObjectMap<uv_3> id_byte;
    public boolean id_protected = false;
    public float id_throws = -1.0f;

    public float id_byte() {
        return this.id_throws;
    }

    public um_3(fN_2 fN_22, Int2ObjectMap<uv_3> int2ObjectMap) {
        this.id_break = fN_22;
        this.id_byte = int2ObjectMap;
    }

    @Override
    public IntSet id_class() {
        return IntSets.unmodifiable((IntSet)this.id_byte.keySet());
    }

    @Override
    public uJ_2 id_class(int n) {
        return (uJ_2)this.id_byte.get(n);
    }

    @Override
    public void close() {
        this.id_break.close();
    }

    public boolean id_break() {
        return this.id_protected;
    }
}

