/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 */
package celestial;

import celestial.rTC;
import celestial.rwW_2;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;

public class rwD_2
extends rwW_2 {
    public rwD_2(Schema schema, boolean bl) {
        super(schema, bl, "BlockEntityShulkerBoxColorFix", rTC.id_extends, "minecraft:shulker_box");
    }

    @Override
    protected Typed<?> id_class(Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), dynamic -> dynamic.remove("Color"));
    }
}

