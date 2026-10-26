/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 */
package celestial;

import celestial.rgD_2;
import celestial.rqV_2;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.Map;
import java.util.UUID;

public class rgo_3 {
    public final UUID id_class;
    public final rgD_2 id_break;
    public final int id_byte;

    public rgo_3(UUID uUID, rgD_2 rgD_22, int n) {
        this.id_class = uUID;
        this.id_break = rgD_22;
        this.id_byte = n;
    }

    public String toString() {
        return "GossipEntry{target=" + this.id_class + ", type=" + this.id_break + ", value=" + this.id_byte + "}";
    }

    public int id_class() {
        return this.id_byte * this.id_break.weight;
    }

    public <T> Dynamic<T> id_class(DynamicOps<T> dynamicOps) {
        return new Dynamic(dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of((Object)dynamicOps.createString("Target"), rqV_2.id_class.encodeStart(dynamicOps, (Object)this.id_class).result().orElseThrow(RuntimeException::new), (Object)dynamicOps.createString("Type"), (Object)dynamicOps.createString(this.id_break.id), (Object)dynamicOps.createString("Value"), (Object)dynamicOps.createInt(this.id_byte))));
    }

    public static DataResult<rgo_3> id_class(Dynamic<?> dynamic) {
        return DataResult.unbox((App)DataResult.instance().group((App)dynamic.get("Target").read(rqV_2.id_class), (App)dynamic.get("Type").asString().map(rgD_2::id_class), (App)dynamic.get("Value").asNumber().map(Number::intValue)).apply((Applicative)DataResult.instance(), rgo_3::new));
    }
}

