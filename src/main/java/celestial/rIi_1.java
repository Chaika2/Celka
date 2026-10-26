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

public class rIi_1
extends rTA {
    public rIi_1(int n, Schema schema) {
        super(n, schema);
    }

    public Map<String, Supplier<TypeTemplate>> registerEntities(Schema schema) {
        Map map = super.registerEntities(schema);
        schema.registerSimple(map, "minecraft:egg");
        schema.registerSimple(map, "minecraft:ender_pearl");
        schema.registerSimple(map, "minecraft:fireball");
        schema.register(map, "minecraft:potion", string -> DSL.optionalFields((String)"Potion", (TypeTemplate)rTC.id_native.in(schema)));
        schema.registerSimple(map, "minecraft:small_fireball");
        schema.registerSimple(map, "minecraft:snowball");
        schema.registerSimple(map, "minecraft:wither_skull");
        schema.registerSimple(map, "minecraft:xp_bottle");
        schema.register(map, "minecraft:arrow", () -> DSL.optionalFields((String)"inBlockState", (TypeTemplate)rTC.id_volatile.in(schema)));
        schema.register(map, "minecraft:enderman", () -> DSL.optionalFields((String)"carriedBlockState", (TypeTemplate)rTC.id_volatile.in(schema), (TypeTemplate)rIl_1.id_class(schema)));
        schema.register(map, "minecraft:falling_block", () -> DSL.optionalFields((String)"BlockState", (TypeTemplate)rTC.id_volatile.in(schema), (String)"TileEntityData", (TypeTemplate)rTC.id_extends.in(schema)));
        schema.register(map, "minecraft:spectral_arrow", () -> DSL.optionalFields((String)"inBlockState", (TypeTemplate)rTC.id_volatile.in(schema)));
        schema.register(map, "minecraft:chest_minecart", () -> DSL.optionalFields((String)"DisplayState", (TypeTemplate)rTC.id_volatile.in(schema), (String)"Items", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_native.in(schema))));
        schema.register(map, "minecraft:commandblock_minecart", () -> DSL.optionalFields((String)"DisplayState", (TypeTemplate)rTC.id_volatile.in(schema)));
        schema.register(map, "minecraft:furnace_minecart", () -> DSL.optionalFields((String)"DisplayState", (TypeTemplate)rTC.id_volatile.in(schema)));
        schema.register(map, "minecraft:hopper_minecart", () -> DSL.optionalFields((String)"DisplayState", (TypeTemplate)rTC.id_volatile.in(schema), (String)"Items", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_native.in(schema))));
        schema.register(map, "minecraft:minecart", () -> DSL.optionalFields((String)"DisplayState", (TypeTemplate)rTC.id_volatile.in(schema)));
        schema.register(map, "minecraft:spawner_minecart", () -> DSL.optionalFields((String)"DisplayState", (TypeTemplate)rTC.id_volatile.in(schema), (TypeTemplate)rTC.id_super.in(schema)));
        schema.register(map, "minecraft:tnt_minecart", () -> DSL.optionalFields((String)"DisplayState", (TypeTemplate)rTC.id_volatile.in(schema)));
        return map;
    }
}

