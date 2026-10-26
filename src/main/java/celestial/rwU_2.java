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
import java.util.List;

public class rwU_2
extends rwW_2 {
    public rwU_2(Schema schema) {
        super(schema, false, "EntityShulkerRotationFix", rTC.id_int, "minecraft:shulker");
    }

    @Override
    protected Typed<?> id_class(Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), this::id_class);
    }

    public Dynamic<?> id_class(Dynamic<?> dynamic2) {
        List list = dynamic2.get("Rotation").asList(dynamic -> dynamic.asDouble(180.0));
        if (!list.isEmpty()) {
            list.set(0, (Double)list.get(0) - 180.0);
            return dynamic2.set("Rotation", dynamic2.createList(list.stream().map(arg_0 -> dynamic2.createDouble(arg_0))));
        }
        return dynamic2;
    }
}

