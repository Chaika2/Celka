/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntSet
 */
package celestial;

import celestial.uJ_2;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.io.Closeable;

public interface uc_3
extends Closeable {
    default public uJ_2 id_class(int n) {
        return null;
    }

    public IntSet id_class();

    @Override
    default public void close() {
    }
}

