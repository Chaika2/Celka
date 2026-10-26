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

public class rId_1
extends rwW_2 {
    public rId_1(Schema schema) {
        super(schema, false, "Villager Follow Range Fix", rTC.id_int, "minecraft:villager");
    }

    private static Dynamic<?> id_class(Dynamic<?> dynamic) {
        return dynamic.update("Attributes", dynamic3 -> dynamic.createList(dynamic3.asStream().map(dynamic -> dynamic.get("Name").asString("").equals("generic.follow_range") && dynamic.get("Base").asDouble(0.0) == 16.0 ? dynamic.set("Base", dynamic.createDouble(48.0)) : dynamic)));
    }

    @Override
    protected Typed<?> id_class(Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), rId_1::id_class);
    }
}

