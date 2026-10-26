/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 */
package celestial;

import celestial.rTC;
import celestial.rTp_1;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class rwX_2
extends rTp_1 {
    private Dynamic<?> id_byte(Dynamic<?> dynamic2) {
        return dynamic2.update("DimensionData", dynamic -> dynamic.updateMapValues(pair -> pair.mapSecond(dynamic2 -> dynamic2.update("DragonFight", dynamic -> rwX_2.id_byte(dynamic, "DragonUUID", "Dragon").orElse((Dynamic<?>)dynamic)))));
    }

    public rwX_2(Schema schema) {
        super(schema, rTC.id_class);
    }

    private Dynamic<?> id_break(Dynamic<?> dynamic) {
        return rwX_2.id_class(dynamic, "WanderingTraderId", "WanderingTraderId").orElse(dynamic);
    }

    private Dynamic<?> id_protected(Dynamic<?> dynamic2) {
        return dynamic2.update("CustomBossEvents", dynamic -> dynamic.updateMapValues(pair -> pair.mapSecond(dynamic -> dynamic.update("Players", dynamic3 -> dynamic.createList(dynamic3.asStream().map(dynamic -> rwX_2.id_class(dynamic).orElseGet(() -> {
            id_class.warn("CustomBossEvents contains invalid UUIDs.");
            return dynamic;
        })))))));
    }

    protected TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("LevelUUIDFix", this.getInputSchema().getType(this.id_break), typed2 -> typed2.updateTyped(DSL.remainderFinder(), typed -> typed.update(DSL.remainderFinder(), dynamic -> {
            dynamic = this.id_protected((Dynamic<?>)dynamic);
            dynamic = this.id_byte((Dynamic<?>)dynamic);
            return this.id_break((Dynamic<?>)dynamic);
        })));
    }
}

