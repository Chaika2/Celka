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
import celestial.rTC;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class rIj_1
extends Schema {
    public rIj_1(int n, Schema schema) {
        super(n, schema);
    }

    public Map<String, Supplier<TypeTemplate>> registerEntities(Schema schema) {
        Map map = super.registerEntities(schema);
        map.remove("EntityHorse");
        schema.register(map, "Horse", () -> DSL.optionalFields((String)"ArmorItem", (TypeTemplate)rTC.id_native.in(schema), (String)"SaddleItem", (TypeTemplate)rTC.id_native.in(schema), (TypeTemplate)rIl_1.id_class(schema)));
        schema.register(map, "Donkey", () -> DSL.optionalFields((String)"Items", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_native.in(schema)), (String)"SaddleItem", (TypeTemplate)rTC.id_native.in(schema), (TypeTemplate)rIl_1.id_class(schema)));
        schema.register(map, "Mule", () -> DSL.optionalFields((String)"Items", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_native.in(schema)), (String)"SaddleItem", (TypeTemplate)rTC.id_native.in(schema), (TypeTemplate)rIl_1.id_class(schema)));
        schema.register(map, "ZombieHorse", () -> DSL.optionalFields((String)"SaddleItem", (TypeTemplate)rTC.id_native.in(schema), (TypeTemplate)rIl_1.id_class(schema)));
        schema.register(map, "SkeletonHorse", () -> DSL.optionalFields((String)"SaddleItem", (TypeTemplate)rTC.id_native.in(schema), (TypeTemplate)rIl_1.id_class(schema)));
        return map;
    }
}

