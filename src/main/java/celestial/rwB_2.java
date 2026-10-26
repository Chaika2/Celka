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

public class rwB_2
extends rwW_2 {
    public rwB_2(Schema schema, boolean bl) {
        super(schema, bl, "JigsawPropertiesFix", rTC.id_extends, "minecraft:jigsaw");
    }

    private static Dynamic<?> id_class(Dynamic<?> dynamic) {
        String string = dynamic.get("attachement_type").asString("minecraft:empty");
        String string2 = dynamic.get("target_pool").asString("minecraft:empty");
        return dynamic.set("name", dynamic.createString(string)).set("target", dynamic.createString(string)).remove("attachement_type").set("pool", dynamic.createString(string2)).remove("target_pool");
    }

    @Override
    protected Typed<?> id_class(Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), rwB_2::id_class);
    }
}

