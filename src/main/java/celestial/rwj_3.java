/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 */
package celestial;

import celestial.rTC;
import celestial.rwW_2;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class rwj_3
extends rwW_2 {
    public rwj_3(Schema schema, boolean bl) {
        super(schema, bl, "Remove Golem Gossip Fix", rTC.id_int, "minecraft:villager");
    }

    private static Dynamic<?> id_class(Dynamic<?> dynamic) {
        return dynamic.update("Gossips", dynamic3 -> dynamic.createList(dynamic3.asStream().filter(dynamic -> !dynamic.get("Type").asString("").equals("golem"))));
    }

    @Override
    protected Typed<?> id_class(Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), rwj_3::id_class);
    }
}

