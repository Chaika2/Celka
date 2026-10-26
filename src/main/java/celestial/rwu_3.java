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
import java.util.Optional;

public class rwu_3
extends rwW_2 {
    public rwu_3(Schema schema, boolean bl) {
        super(schema, bl, "OminousBannerBlockEntityRenameFix", rTC.id_extends, "minecraft:banner");
    }

    @Override
    protected Typed<?> id_class(Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), this::id_class);
    }

    private Dynamic<?> id_class(Dynamic<?> dynamic) {
        Optional optional = dynamic.get("CustomName").asString().result();
        if (optional.isPresent()) {
            String string = (String)optional.get();
            string = string.replace("\"translate\":\"block.minecraft.illager_banner\"", "\"translate\":\"block.minecraft.ominous_banner\"");
            return dynamic.set("CustomName", dynamic.createString(string));
        }
        return dynamic;
    }
}

