/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Dynamic
 */
package celestial;

import celestial.rTC;
import celestial.rwW_2;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Map;

public class rwx_3
extends rwW_2 {
    private Dynamic<?> id_byte(Dynamic<?> dynamic) {
        return dynamic.updateMapValues(this::id_class);
    }

    public rwx_3(Schema schema, String string) {
        super(schema, false, "Memory expiry data fix (" + string + ")", rTC.id_int, string);
    }

    @Override
    protected Typed<?> id_class(Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), this::id_class);
    }

    private Pair<Dynamic<?>, Dynamic<?>> id_class(Pair<Dynamic<?>, Dynamic<?>> pair) {
        return pair.mapSecond(this::id_protected);
    }

    public Dynamic<?> id_class(Dynamic<?> dynamic) {
        return dynamic.update("Brain", this::id_break);
    }

    private Dynamic<?> id_break(Dynamic<?> dynamic) {
        return dynamic.update("memories", this::id_byte);
    }

    private Dynamic<?> id_protected(Dynamic<?> dynamic) {
        return dynamic.createMap((Map)ImmutableMap.of((Object)dynamic.createString("value"), dynamic));
    }
}

