/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 */
package celestial;

import celestial.rTC;
import celestial.rTp_1;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;

public class rwY_2
extends rTp_1 {
    public rwY_2(Schema schema) {
        super(schema, rTC.id_private);
    }

    protected TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("SavedDataUUIDFix", this.getInputSchema().getType(this.id_break), typed2 -> typed2.updateTyped(typed2.getType().findField("data"), typed -> typed.update(DSL.remainderFinder(), dynamic -> dynamic.update("Raids", dynamic2 -> dynamic2.createList(dynamic2.asStream().map(dynamic -> dynamic.update("HeroesOfTheVillage", dynamic2 -> dynamic2.createList(dynamic2.asStream().map(dynamic -> rwY_2.id_protected(dynamic, "UUIDMost", "UUIDLeast").orElseGet(() -> {
            id_class.warn("HeroesOfTheVillage contained invalid UUIDs.");
            return dynamic;
        }))))))))));
    }
}

