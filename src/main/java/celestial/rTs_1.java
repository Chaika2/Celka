/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 */
package celestial;

import celestial.rTS;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;

public class rTs_1
implements Codec<rTS<E>> {
    public final /* synthetic */ Codec id_class;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public rTs_1(Codec codec) {
        this.id_class = codec;
    }

    public <T> DataResult<Pair<rTS<E>, T>> decode(DynamicOps<T> dynamicOps, T t) {
        Dynamic dynamic = new Dynamic(dynamicOps, t);
        return dynamic.get("data").flatMap(arg_0 -> ((Codec)this.id_class).parse(arg_0)).map(object -> new rTS<Object>(object, dynamic.get("weight").asInt(1))).map(rTS2 -> Pair.of((Object)rTS2, (Object)dynamicOps.empty()));
    }

    public /* synthetic */ DataResult encode(Object object, DynamicOps dynamicOps, Object object2) {
        return this.id_class((rTS)object, dynamicOps, object2);
    }

    public <T> DataResult<T> id_class(rTS<E> rTS2, DynamicOps<T> dynamicOps, T t) {
        return dynamicOps.mapBuilder().add("weight", dynamicOps.createInt(rTS2.id_break)).add("data", this.id_class.encodeStart(dynamicOps, rTS2.id_class)).build(t);
    }
}

