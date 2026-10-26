/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.codecs.PrimitiveCodec
 */
package celestial;

import celestial.rTA;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.PrimitiveCodec;

public class rTn_1
implements PrimitiveCodec<String> {
    public String toString() {
        return "NamespacedString";
    }

    public <T> T id_class(DynamicOps<T> dynamicOps, String string) {
        return (T)dynamicOps.createString(string);
    }

    public /* synthetic */ Object write(DynamicOps dynamicOps, Object object) {
        return this.id_class(dynamicOps, (String)object);
    }

    public <T> DataResult<String> read(DynamicOps<T> dynamicOps, T t) {
        return dynamicOps.getStringValue(t).map(rTA::id_class);
    }
}

