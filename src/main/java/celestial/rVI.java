/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.serialization.DataResult
 */
package celestial;

import celestial.rqM_2;
import com.google.common.collect.Maps;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.function.Supplier;

public final class rVI<E> {
    public final Map<rqM_2<E>, DataResult<Supplier<E>>> id_class = Maps.newIdentityHashMap();
}

