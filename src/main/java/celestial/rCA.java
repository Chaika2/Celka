/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.serialization.MapCodec
 */
package celestial;

import celestial.rCZ;
import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;

public interface rCA<O, S> {
    public S create(O var1, ImmutableMap<rCZ<?>, Comparable<?>> var2, MapCodec<S> var3);
}

