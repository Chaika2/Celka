/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.types.templates.TypeTemplate
 */
package celestial;

import celestial.rTA;
import celestial.rTC;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class rfu_3
extends rTA {
    public rfu_3(int n, Schema schema) {
        super(n, schema);
    }

    private static void id_class(Schema schema, Map<String, Supplier<TypeTemplate>> map, String string) {
        schema.register(map, string, () -> DSL.optionalFields((String)"Items", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_native.in(schema)), (String)"RecipesUsed", (TypeTemplate)DSL.compoundList((TypeTemplate)rTC.id_return.in(schema), (TypeTemplate)DSL.constType((Type)DSL.intType()))));
    }

    public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema schema) {
        Map map = super.registerBlockEntities(schema);
        rfu_3.id_class(schema, map, "minecraft:furnace");
        rfu_3.id_class(schema, map, "minecraft:smoker");
        rfu_3.id_class(schema, map, "minecraft:blast_furnace");
        return map;
    }
}

