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

public class rwo_3
extends rwW_2 {
    public rwo_3(Schema schema, boolean bl) {
        super(schema, bl, "EntityShulkerColorFix", rTC.id_int, "minecraft:shulker");
    }

    public Dynamic<?> id_class(Dynamic<?> dynamic) {
        return !dynamic.get("Color").map(Dynamic::asNumber).result().isPresent() ? dynamic.set("Color", dynamic.createByte((byte)10)) : dynamic;
    }

    @Override
    protected Typed<?> id_class(Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), this::id_class);
    }
}

