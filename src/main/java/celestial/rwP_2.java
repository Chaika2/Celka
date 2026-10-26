/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 */
package celestial;

import celestial.rTA;
import celestial.rTC;
import celestial.rTp_1;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;

public class rwP_2
extends rTp_1 {
    private Dynamic<?> id_byte(Dynamic<?> dynamic2) {
        return dynamic2.update("SkullOwner", dynamic -> rwP_2.id_class(dynamic, "Id", "Id").orElse((Dynamic<?>)dynamic));
    }

    public rwP_2(Schema schema) {
        super(schema, rTC.id_native);
    }

    private Dynamic<?> id_break(Dynamic<?> dynamic) {
        return dynamic.update("AttributeModifiers", dynamic3 -> dynamic.createList(dynamic3.asStream().map(dynamic -> rwP_2.id_byte(dynamic, "UUID", "UUID").orElse((Dynamic<?>)dynamic))));
    }

    public TypeRewriteRule makeRule() {
        OpticFinder opticFinder = DSL.fieldFinder((String)"id", (Type)DSL.named((String)rTC.id_continue.typeName(), rTA.id_class()));
        return this.fixTypeEverywhereTyped("ItemStackUUIDFix", this.getInputSchema().getType(this.id_break), typed -> {
            OpticFinder opticFinder2 = typed.getType().findField("tag");
            return typed.updateTyped(opticFinder2, typed2 -> typed2.update(DSL.remainderFinder(), dynamic -> {
                dynamic = this.id_break((Dynamic<?>)dynamic);
                if (typed.getOptional(opticFinder).map(pair -> "minecraft:player_head".equals(pair.getSecond())).orElse(false).booleanValue()) {
                    dynamic = this.id_byte((Dynamic<?>)dynamic);
                }
                return dynamic;
            }));
        });
    }
}

