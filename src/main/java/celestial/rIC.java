/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.types.templates.Hook$HookFunction
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 */
package celestial;

import celestial.rIn_1;
import com.mojang.datafixers.types.templates.Hook;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;

public class rIC
implements Hook.HookFunction {
    public <T> T apply(DynamicOps<T> dynamicOps, T t) {
        return rIn_1.id_class(new Dynamic(dynamicOps, t), rIn_1.id_byte, "ArmorStand");
    }
}

