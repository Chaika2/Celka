/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Decoder
 *  com.mojang.serialization.DynamicOps
 */
package celestial;

import celestial.rAL;
import celestial.rVL;
import celestial.rVt_1;
import celestial.rqM_2;
import celestial.rqO_2;
import com.google.gson.JsonElement;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Decoder;
import com.mojang.serialization.DynamicOps;
import java.util.Collection;
import java.util.OptionalInt;

public interface rVT {
    public Collection<rqO_2> id_class(rqM_2<? extends rVL<?>> var1);

    public <E> DataResult<Pair<E, OptionalInt>> id_class(DynamicOps<JsonElement> var1, rqM_2<? extends rVL<E>> var2, rqM_2<E> var3, Decoder<E> var4);

    public static rVT id_class(rAL rAL2) {
        return new rVt_1(rAL2);
    }
}

