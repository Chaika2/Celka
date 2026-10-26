/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 */
package celestial;

import celestial.rTC;
import celestial.rTp_1;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class rTU
extends rTp_1 {
    private Dynamic<?> id_byte(Dynamic<?> dynamic) {
        return rTU.id_break(dynamic, "target_uuid", "Target").orElse(dynamic);
    }

    public rTU(Schema schema) {
        super(schema, rTC.id_extends);
    }

    private Dynamic<?> id_break(Dynamic<?> dynamic3) {
        return dynamic3.get("Owner").get().map(dynamic -> rTU.id_class(dynamic, "Id", "Id").orElse((Dynamic<?>)dynamic)).map(dynamic2 -> dynamic3.remove("Owner").set("SkullOwner", dynamic2)).result().orElse(dynamic3);
    }

    protected TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("BlockEntityUUIDFix", this.getInputSchema().getType(this.id_break), typed -> {
            typed = this.id_class((Typed<?>)typed, "minecraft:conduit", this::id_byte);
            return this.id_class((Typed<?>)typed, "minecraft:skull", this::id_break);
        });
    }
}

