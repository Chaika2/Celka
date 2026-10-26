/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.templates.TypeTemplate
 */
package celestial;

import celestial.rIl_1;
import celestial.rTA;
import celestial.rTC;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class rfQ_2
extends rTA {
    public rfQ_2(int n, Schema schema) {
        super(n, schema);
    }

    public Map<String, Supplier<TypeTemplate>> registerEntities(Schema schema) {
        Map map = super.registerEntities(schema);
        schema.register(map, "minecraft:wandering_trader", string -> DSL.optionalFields((String)"Inventory", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_native.in(schema)), (String)"Offers", (TypeTemplate)DSL.optionalFields((String)"Recipes", (TypeTemplate)DSL.list((TypeTemplate)DSL.optionalFields((String)"buy", (TypeTemplate)rTC.id_native.in(schema), (String)"buyB", (TypeTemplate)rTC.id_native.in(schema), (String)"sell", (TypeTemplate)rTC.id_native.in(schema)))), (TypeTemplate)rIl_1.id_class(schema)));
        schema.register(map, "minecraft:trader_llama", string -> DSL.optionalFields((String)"Items", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_native.in(schema)), (String)"SaddleItem", (TypeTemplate)rTC.id_native.in(schema), (String)"DecorItem", (TypeTemplate)rTC.id_native.in(schema), (TypeTemplate)rIl_1.id_class(schema)));
        return map;
    }
}

